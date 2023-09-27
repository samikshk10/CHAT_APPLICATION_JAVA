package Main;

import DBConnection.DBConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameHistory {
    public List<Map<String, Object>> retrieveGameData() {
        Connection dbconn = DBConnection.connectDB();
        List<Map<String, Object>> gameDataList = new ArrayList<>();

        if (dbconn != null) {
            try {
                PreparedStatement st = dbconn.prepareStatement(
                        "SELECT gh.*, gd.* " +
                                "FROM gamehistory AS gh " +
                                "INNER JOIN gamedata AS gd ON gh.id = gd.game_history_id"
                );

                ResultSet resultSet = st.executeQuery();

                while (resultSet.next()) {
                    // Retrieve data from the result set and store it in a HashMap
                    Map<String, Object> gameData = new HashMap<>();
                    gameData.put("gameId", resultSet.getInt("gh.id"));
                    gameData.put("player1Name", resultSet.getString("gh.player1_name"));
                    gameData.put("player2Name", resultSet.getString("gh.player2_name"));
                    gameData.put("player1GameStatus", resultSet.getString("gh.player1_gamestatus"));
                    gameData.put("player2GameStatus", resultSet.getString("gh.player2_gamestatus"));
                    gameData.put("gameDataId", resultSet.getInt("gd.id"));
                    gameData.put("gameHistoryId", resultSet.getInt("gd.game_history_id"));
                    gameData.put("startedAt", resultSet.getString("gd.started_at"));
                    gameData.put("endedAt", resultSet.getString("gd.ended_at"));

                    // Add the HashMap to the list
                    gameDataList.add(gameData);


                    System.out.println("this is game data list"+gameDataList);
                }

                resultSet.close();
            } catch (Exception ex) {
                System.out.println(ex);
            } finally {
                try {
                    dbconn.close();
                } catch (SQLException ex) {
                    System.out.println("Error closing database connection: " + ex.getMessage());
                }
            }
        } else {
            System.out.println("Database connection is not established");
        }

        return gameDataList;
    }

        public GameHistory(){
        System.out.println(retrieveGameData());
            JFrame frame = new JFrame("Data Table Example");
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null); // Center the frame on the screen

            // Create a DefaultTableModel with data and column names
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Name");
            model.addColumn("Age");
            model.addRow(new Object[]{"John", 25});
            model.addRow(new Object[]{"Alice", 30});
            model.addRow(new Object[]{"Bob", 22});
            model.addRow(new Object[]{""}); // Add an empty row
            model.addRow(new Object[]{"John", 25});
            model.addRow(new Object[]{"Alice", 30});
            model.addRow(new Object[]{"Bob", 22});
            model.addRow(new Object[]{""}); // Add an empty row


            // Create a JTable and set the model
            JTable table = new JTable(model) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Disable cell editing
                }

                @Override
                public void paintComponent(Graphics g) {
                    g.setColor(new Color(240, 240, 240)); // Set background color
                    g.fillRect(0, 0, getWidth(), getHeight());
                    super.paintComponent(g);
                }

                @Override
                public void setGridColor(Color gridColor) {
                    super.setGridColor(Color.WHITE); // Set grid color to match the background
                }

                @Override
                public void setShowGrid(boolean showGrid) {
                    super.setShowGrid(false); // Hide grid lines
                }
            };
            table.setFont(new Font("Arial", Font.PLAIN, 14));
            table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            table.setRowHeight(30);
            table.setShowHorizontalLines(false);
            table.setShowVerticalLines(false);

            // Customize table header
            JTableHeader header = table.getTableHeader();
            header.setFont(new Font("Arial", Font.BOLD, 14));
            header.setBackground(Color.DARK_GRAY);
            header.setForeground(Color.WHITE);

            // Customize row selection color
            table.setSelectionBackground(new Color(72, 121, 186));
            table.setSelectionForeground(Color.WHITE);

            // Add a mouse listener to handle row selection
            table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        String name = (String) table.getValueAt(selectedRow, 0);
                        int age = (int) table.getValueAt(selectedRow, 1);
                        JOptionPane.showMessageDialog(frame, "Selected: Name = " + name + ", Age = " + age);
                    }
                }
            });

            // Add the table to a JScrollPane
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setBorder(null); // Remove the JScrollPane border

            // Remove borders from the JScrollPane's viewport
            scrollPane.getViewport().setBorder(null);
            scrollPane.getViewport().setOpaque(false);

            // Add the JScrollPane to the frame
            frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

            // Make the frame visible
            frame.setVisible(true);
        }

}
