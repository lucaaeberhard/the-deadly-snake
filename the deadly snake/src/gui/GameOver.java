package gui;

import actions.Collision;
import actions.KeyHandler;
import clock.GameClock;


import javax.swing.*;

public class GameOver {
    JFrame jf;
    Draw d;

    public static int width = 800, height = 600;
    public static int xoff = 130, yoff = 20;

    public static void createDeath(GameClock clock){

        int answer = JOptionPane.showConfirmDialog(null, "GAME OVER! NEUSTARTEN?");
        if (answer == JOptionPane.YES_OPTION) {
            clock.running = true;


        } else if (answer == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
    }


    public static void setPause(GameClock clock) {
        clock.isPaused = !clock.isPaused;

    }
}





