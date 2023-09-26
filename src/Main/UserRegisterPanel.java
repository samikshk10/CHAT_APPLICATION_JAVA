package Main;

import DBConnection.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRegisterPanel extends JFrame implements ActionListener {
    private JTextField player1_username;
    private JTextField player2_username;

    private JButton startButton;

    private JButton cancelButton;

    private JLabel noteLabel;


    JLabel label = new JLabel();

    void userRegisterPanel() {
        setTitle("User Panel");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 32, 600, 500);
        mainPanel.setLayout(null);
        JLabel titleLabel = new JLabel("User Register");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setBounds(150, 20, 400, 50);
        mainPanel.add(titleLabel);
        JLabel player1label = new JLabel("Player1 Username");
        player1label.setFont(new Font("Arial", Font.BOLD, 20));
        player1label.setBounds(20, 100, 400, 50);
        mainPanel.add(player1label);

        JLabel player2label = new JLabel("Player2 Username");
        player2label.setFont(new Font("Arial", Font.BOLD, 20));
        player2label.setBounds(20, 180, 400, 50);
        mainPanel.add(player2label);
        player1_username = new JTextField();
        player1_username.setForeground(Color.BLACK);
        player1_username.setFont(new Font("Arial", Font.BOLD, 15));
        player1_username.setBounds(200, 100, 200, 50);
        player1_username.addActionListener(this);
        mainPanel.add(player1_username);

        player2_username = new JTextField();
        player2_username.setForeground(Color.BLACK);
        player2_username.setFont(new Font("Arial", Font.BOLD, 15));
        player2_username.setBounds(200, 180, 200, 50);
        player2_username.addActionListener(this);
        mainPanel.add(player2_username);

        startButton = new JButton("Start");
        startButton.setBackground(Color.BLUE);
        startButton.setForeground(Color.WHITE);
        startButton.setFont(new Font("Arial",Font.BOLD,15));
        startButton.setBounds(20,250,200,50);
        mainPanel.add(startButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(240,250,200,50);
        mainPanel.add(cancelButton);

         noteLabel = new JLabel("Note: If you have register before you can enter previous username... \nelse new user will be created");
        noteLabel.setFont(new Font("Arial", Font.BOLD, 14));
        noteLabel.setBounds(20, 350, 550, 50);
        mainPanel.add(noteLabel);

        startButton.addActionListener(this);
        cancelButton.addActionListener(this);


        label.setBounds(500, 25, this.getWidth(), this.getHeight());
        mainPanel.add(label);
        getContentPane().add(mainPanel);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            System.out.println("this is inside the user register functuion");
            Connection dbconn = DBConnection.connectDB();
            System.out.println(dbconn);
            if(dbconn!=null)
            {
                try
                {
                    System.out.println("this is inside try");
                    if(player1_username.getText().trim().isEmpty() || player2_username.getText().trim().isEmpty())
                    {
                        JOptionPane.showMessageDialog(this, "the field cant be empty","Error",JOptionPane.ERROR_MESSAGE);
                        throw new Exception("the field cant be empty");
                    }

                    PreparedStatement st=  dbconn.prepareStatement("INSERT INTO user(username) VALUES (?)");

                    st.setString(1, player1_username.getText());
                    int res = st.executeUpdate();
                    st.setString(1, player2_username.getText());
                    int res1 = st.executeUpdate();

                    System.out.println("this is after set string");
                    if (res > 0 && res1> 0) {
                        JOptionPane.showMessageDialog(this, "User has been Registered", "Success", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("User has been registered");
                        Main menu = new Main(player1_username.getText(), player2_username.getText());
                        menu.setVisible(true);
                        this.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "User registration failed","Error",JOptionPane.ERROR_MESSAGE);
                        GameMenu menu = new GameMenu();
                        menu.GameMenu();
                        this.dispose();
                    }
                    //JOptionPane.showMessageDialog(this, "User has been Registered","Success",JOptionPane.INFORMATION_MESSAGE);


                }
                catch(Exception ex)
                {
                    System.out.println(ex);
                }
                finally{
                    try {
                        dbconn.close(); // Close the database connection
                    } catch (SQLException ex) {
                        System.out.println("Error closing database connection: " + ex.getMessage());
                    }
                }
            }
            else
            {
                System.out.println("database here is not connected");
            }

            System.out.println("this is inside the start button");

        }
        else if(e.getSource()==cancelButton)
        {
            GameMenu menu = new GameMenu();
            menu.GameMenu();
            this.dispose();
}


    }
}
