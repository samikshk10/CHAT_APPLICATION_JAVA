
package chat_application_java.component;

import java.awt.Color;

public class Chat_Left_With_Profile extends javax.swing.JLayeredPane {

    public Chat_Left_With_Profile() {
        initComponents();
        txt.setBackground(new Color(242, 242, 242));
    }
    
    public void setUserProfile(String user) {
        txt.setUserProfile(user);
    }
    
    public void setText(String text) {
        txt.setText(text);
        txt.setTime("10:30 PM");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        imageAvatar1 = new chat_application_java.swing.ImageAvatar();
        txt = new chat_application_java.component.Chat_Item();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jLayeredPane2.setPreferredSize(new java.awt.Dimension(31, 31));
        jLayeredPane2.setLayout(new javax.swing.BoxLayout(jLayeredPane2, javax.swing.BoxLayout.LINE_AXIS));

        imageAvatar1.setBorderSize(0);
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/testing/dog.jpg"))); // NOI18N
        imageAvatar1.setMaximumSize(new java.awt.Dimension(28, 28));
        imageAvatar1.setMinimumSize(new java.awt.Dimension(28, 28));
        imageAvatar1.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout imageAvatar1Layout = new javax.swing.GroupLayout(imageAvatar1);
        imageAvatar1.setLayout(imageAvatar1Layout);
        imageAvatar1Layout.setHorizontalGroup(
            imageAvatar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        imageAvatar1Layout.setVerticalGroup(
            imageAvatar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jLayeredPane2.add(imageAvatar1);

        add(jLayeredPane2);
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chat_application_java.swing.ImageAvatar imageAvatar1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private chat_application_java.component.Chat_Item txt;
    // End of variables declaration//GEN-END:variables
}
