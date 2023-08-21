
package chat_application_java.component;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.Icon;

public class MenuButton extends JButton{

    /**
     * @return the disabledIcon
     */
    @Override
    public Icon getDisabledIcon() {
        return disabledIcon;
    }

    /**
     * @param disabledIcon the disabledIcon to set
     */
    @Override
    public void setDisabledIcon(Icon disabledIcon) {
        this.disabledIcon = disabledIcon;
    }

    /**
     * @return the iconSelected
     */
    public Icon getIconSelected() {
        return iconSelected;
    }

    /**
     * @param iconSelected the iconSelected to set
     */
    public void setIconSelected(Icon iconSelected) {
        this.iconSelected = iconSelected;
    }
    
    private Icon disabledIcon; 
    private Icon iconSelected;
    
    public MenuButton() {
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    } 
    @Override 
    public void setSelected(boolean bln) {
        super.setSelected(bln);
        if(bln) {
            setIcon(iconSelected);
        } else {
            setIcon(disabledIcon);
        }
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if(isSelected()){
            graphics.setColor(new Color(110, 213, 255));
            graphics.fillRect(0, getHeight() - 3, getWidth(), getHeight());
        }
    }
}
