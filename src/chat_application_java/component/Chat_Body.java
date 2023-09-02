
package chat_application_java.component;

import chat_application_java.Chat_Date;
import chat_application_java.swing.ScrollBar;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;

public class Chat_Body extends javax.swing.JPanel {

    public Chat_Body() {
        initComponents();
        init(); 
        addItemLeft("rohan","Rohan",new ImageIcon(getClass().getResource("/icon/testing/dog.jpg")),new ImageIcon(getClass().getResource("/icon/testing/pic.jpg")));
        addItemRight("false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()",new ImageIcon(getClass().getResource("/icon/testing/dog.jpg")),new ImageIcon(getClass().getResource("/icon/testing/pic.jpg")));
    
        addItemLeft("rohan", "rohan",new ImageIcon(getClass().getResource("/icon/testing/pic.jpg")));
        addItemRight("false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()",new ImageIcon(getClass().getResource("/icon/testing/dog.jpg")));
    
        addDate("05/05/2021");
        
           String img[] = {"LRMj,K-:?G9G_JIon}WqD~ITRPs,", "LCGlO@00.R~o.9DOO[%L02?aJ7D*"};
        addItemLeft("rohan", "Rohan",img);
        addItemRight("false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()",new ImageIcon(getClass().getResource("/icon/testing/dog.jpg")));
    
                addDate("05/05/2021");

        addItemLeft("rohan","Rohan", new ImageIcon(getClass().getResource("/icon/testing/pic.jpg")));
        addItemRight("false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()",new ImageIcon(getClass().getResource("/icon/testing/dog.jpg")));
    
        addItemLeft("roshan", "Rohan",new ImageIcon(getClass().getResource("/icon/testing/dog.jpg")));
        addItemRight("false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()",new ImageIcon(getClass().getResource("/icon/testing/dog.jpg")));
    
        addItemLeft("rohan", "Rohan",new ImageIcon(getClass().getResource("/icon/testing/dog.jpg")));
        addItemLeft("false, the lines will be wrapped at character boundaries. false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord() By default this property is false. Parameters: word word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()", "Rohan",new ImageIcon(getClass().getResource("/icon/testing/dog.jpg")));
        addItemRight("false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()",new ImageIcon(getClass().getResource("/icon/testing/dog.jpg")));
    
    }
    
    private void init(){
        body.setLayout(new MigLayout("fillx", "", "6[]6"));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }
    
    public void addItemLeft(String text, String user,Icon ...image) {
        Chat_Left_With_Profile item = new Chat_Left_With_Profile(); 
        item.setText(text); 
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user); 
        body.add(item, "wrap, w 100::80%");
        // w::80% setting max width to 80%;
        body.repaint(); 
        body.revalidate(); 
    }
    
        public void addItemLeft(String text, String user,String[] image) {
        Chat_Left_With_Profile item = new Chat_Left_With_Profile(); 
        item.setText(text); 
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user); 
        body.add(item, "wrap, w 100::80%");
        // w::80% setting max width to 80%;
        body.repaint(); 
        body.revalidate(); 
    }
    public void addItemRight(String text,Icon ...image) {
        Chat_Right item = new Chat_Right(); 
        item.setText(text); 
        item.setImage(image);
    
        body.add(item, "wrap, al right, w 100::80%");
        // w::80% setting max width to 80%;
        body.repaint(); 
        body.revalidate(); 
    }

    public void addDate(String date)
    {
        Chat_Date item = new Chat_Date();
        
        item.setDate(date);
        body.add(item,"wrap,al center");
           body.repaint(); 
        body.revalidate(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        sp.setBorder(null);

        body.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
