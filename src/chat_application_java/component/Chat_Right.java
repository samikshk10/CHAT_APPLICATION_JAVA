
package chat_application_java.component;

import java.awt.Color;
import javax.swing.Icon;

public class Chat_Right extends javax.swing.JLayeredPane {

    public Chat_Right() {
        initComponents();
        txt.setBackground(new Color(179, 233, 255));
    }
    
   public void setText(String text) {
        if(text.equals("")){
            txt.hideText();
        }else{
            txt.setText(text);
        }
        txt.seen();
     
    }
    
    public void setImage(Icon ...image){            
        txt.setImage(true, image);
    }
    
    public void setTime(){
           txt.setTime("10:30 PM");//Testing of the time
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new chat_application_java.component.Chat_Item();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chat_application_java.component.Chat_Item txt;
    // End of variables declaration//GEN-END:variables
}
