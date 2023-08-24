
package chat_application_java.form;

import chat_application_java.component.Item_People;
import chat_application_java.swing.ScrollBar;
import net.miginfocom.swing.MigLayout;


public class Menu_Left extends javax.swing.JPanel {

    public Menu_Left() {
        initComponents();
        init(); 
    }
    
    private void init() {
        sp.setVerticalScrollBar(new ScrollBar());
        menuList.setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
        showPeople(); 
    }
    
    private void showPeople() {
        // testing
        menuList.removeAll();
        for(int i = 0; i<20; i++){
            menuList.add(new Item_People("People " + i), "wrap");
        }
        refreshMenuList(); 
    }
    
    private void showGroup() {
        // testing
        menuList.removeAll();
        for(int i = 0; i<5; i++){
            menuList.add(new Item_People("Group " + i), "wrap");
        }
        refreshMenuList(); 
    }
    
    private void showBox() {
        // testing
        menuList.removeAll();
        for(int i = 0; i<10; i++){
            menuList.add(new Item_People("Box " + i), "wrap");
        }
        refreshMenuList(); 
    }
    
    private void refreshMenuList() {
        menuList.repaint(); 
        menuList.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLayeredPane();
        menuMessage = new chat_application_java.component.MenuButton();
        menuGroup = new chat_application_java.component.MenuButton();
        menuBox = new chat_application_java.component.MenuButton();
        sp = new javax.swing.JScrollPane();
        menuList = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(249, 249, 249));

        menu.setOpaque(true);
        menu.setLayout(new java.awt.GridLayout(1, 3));

        menuMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/message_selected.png"))); // NOI18N
        menuMessage.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/message.png"))); // NOI18N
        menuMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuMessage.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/message.png"))); // NOI18N
        menuMessage.setSelected(true);
        menuMessage.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/message_selected.png"))); // NOI18N
        menuMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMessageActionPerformed(evt);
            }
        });
        menu.add(menuMessage);

        menuGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/group.png"))); // NOI18N
        menuGroup.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/group.png"))); // NOI18N
        menuGroup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuGroup.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/group.png"))); // NOI18N
        menuGroup.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/group_selected.png"))); // NOI18N
        menuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupActionPerformed(evt);
            }
        });
        menu.add(menuGroup);

        menuBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/box.png"))); // NOI18N
        menuBox.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/box.png"))); // NOI18N
        menuBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuBox.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/box.png"))); // NOI18N
        menuBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/box_selected.png"))); // NOI18N
        menuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBoxActionPerformed(evt);
            }
        });
        menu.add(menuBox);

        sp.setBackground(new java.awt.Color(242, 242, 242));
        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setOpaque(false);

        menuList.setOpaque(true);

        javax.swing.GroupLayout menuListLayout = new javax.swing.GroupLayout(menuList);
        menuList.setLayout(menuListLayout);
        menuListLayout.setHorizontalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menuListLayout.setVerticalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        sp.setViewportView(menuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(menu)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sp))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMessageActionPerformed
        // TODO add your handling code here:
        if(!menuMessage.isSelected()){
        menuMessage.setSelected(true);
        menuGroup.setSelected(false);
        menuBox.setSelected(false);
        showPeople();
        }
    }//GEN-LAST:event_menuMessageActionPerformed

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupActionPerformed
        // TODO add your handling code here:
        if(!menuGroup.isSelected()){  
        menuMessage.setSelected(false);
        menuGroup.setSelected(true);
        menuBox.setSelected(false);
        showGroup(); 
        }
    }//GEN-LAST:event_menuGroupActionPerformed

    private void menuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBoxActionPerformed
        // TODO add your handling code here:
        if(!menuBox.isSelected()){
        menuMessage.setSelected(false);
        menuGroup.setSelected(false);
        menuBox.setSelected(true);
        showBox();
        }
    }//GEN-LAST:event_menuBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane menu;
    private chat_application_java.component.MenuButton menuBox;
    private chat_application_java.component.MenuButton menuGroup;
    private javax.swing.JLayeredPane menuList;
    private chat_application_java.component.MenuButton menuMessage;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
