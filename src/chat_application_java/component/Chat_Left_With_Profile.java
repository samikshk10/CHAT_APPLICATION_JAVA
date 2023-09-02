
package chat_application_java.component;

import java.awt.Color;
import javax.swing.Icon;

public class Chat_Left_With_Profile extends javax.swing.JLayeredPane {

    public Chat_Left_With_Profile() {
        initComponents();
        txt.setBackground(new Color(242, 242, 242));
    }
    
    public void setUserProfile(String user) {
        txt.setUserProfile(user);
    }
    
    public void setImageProfile(Icon image){
        Iaimage.setImage(image);
        
    }
    public void setText(String text) {
        if(text.equals("")){
            txt.hideText();
        }else{
            txt.setText(text);
        }
     
    }
    
    public void setImage(Icon ...image){            
        txt.setImage(false, image);
    }
        public void setImage(String ...image){            
        txt.setImage(false, image);
    }
        
        public void setFile(String fileName, String fileSize){
            txt.setFile(fileName,fileSize);
        }
                
    
    public void setTime(){
           txt.setTime("10:30 PM");//Testing of the time
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        Iaimage = new chat_application_java.swing.ImageAvatar();
        txt = new chat_application_java.component.Chat_Item();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jLayeredPane2.setPreferredSize(new java.awt.Dimension(31, 31));
        jLayeredPane2.setLayout(new javax.swing.BoxLayout(jLayeredPane2, javax.swing.BoxLayout.LINE_AXIS));

        Iaimage.setBorderSize(0);
        Iaimage.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/testing/dog.jpg"))); // NOI18N
        Iaimage.setMaximumSize(new java.awt.Dimension(28, 28));
        Iaimage.setMinimumSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout IaimageLayout = new javax.swing.GroupLayout(Iaimage);
        Iaimage.setLayout(IaimageLayout);
        IaimageLayout.setHorizontalGroup(
            IaimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        IaimageLayout.setVerticalGroup(
            IaimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jLayeredPane2.add(Iaimage);

        add(jLayeredPane2);
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chat_application_java.swing.ImageAvatar Iaimage;
    private javax.swing.JLayeredPane jLayeredPane2;
    private chat_application_java.component.Chat_Item txt;
    // End of variables declaration//GEN-END:variables
}
