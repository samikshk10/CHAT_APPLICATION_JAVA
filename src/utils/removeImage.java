package utils;

import javax.swing.*;
import Main.Main;

public class removeImage {
    public static  void RemoveImage(int x,JLabel[] labels){
        //System.out.println("Remove Image at "+ String.valueOf(x));
                if (x >= 1 && x <= 100) {
                    int index = x - 1; // Adjust x to 0-based index
                    labels[index].setVisible(false);
            }
                Main main = new Main();
        main.PositionCheck(x);
    }
}
