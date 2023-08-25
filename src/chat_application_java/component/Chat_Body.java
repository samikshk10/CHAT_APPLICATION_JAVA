
package chat_application_java.component;

import chat_application_java.swing.ScrollBar;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;

public class Chat_Body extends javax.swing.JPanel {

    public Chat_Body() {
        initComponents();
        init(); 
        addItemLeft("rohan","Rohan");
        addItemRight("false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()");
    
        addItemLeft("rohan", "rohan");
        addItemRight("false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()");
    
        addItemLeft("rohan", "Rohan");
        addItemRight("false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()");
    
        addItemLeft("rohan","Rohan");
        addItemRight("false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()");
    
        addItemLeft("roshan", "Rohan");
        addItemRight("false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()");
    
        addItemLeft("rohan", "Rohan");
        addItemLeft("false, the lines will be wrapped at character boundaries. false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord() By default this property is false. Parameters: word word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()", "Rohan");
        addItemRight("false, the lines will be wrapped at character boundaries. By default this property is false. Parameters: word - indicates if word boundaries should be used for line wrapping See Also: getWrapStyleWord()");
    
    }
    
    private void init(){
        body.setLayout(new MigLayout("fillx", "", "6[]6"));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }
    
    public void addItemLeft(String text, String user) {
        Chat_Left_With_Profile item = new Chat_Left_With_Profile(); 
        item.setText(text); 
        item.setUserProfile(user); 
        body.add(item, "wrap, w ::80%");
        // w::80% setting max width to 80%;
        body.repaint(); 
        body.revalidate(); 
    }
    public void addItemRight(String text) {
        Chat_Right item = new Chat_Right(); 
        item.setText(text); 
        body.add(item, "wrap, al right, w ::80%");
        // w::80% setting max width to 80%;
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
