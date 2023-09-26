package Main;

import java.awt.*;

public class GameStart {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GameMenu menu = new GameMenu();
                    menu.GameMenu();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
