package gui;

import actions.Collision;
import actions.KeyHandler;


import javax.swing.*;

public class GameOver {

    public static int width = 800, height = 600;
    public static int xoff = 130, yoff = 20;


    public static void create() {

        if (Collision.collideSelf() || Collision.collideWall()) {
                JFrame newFrame = new JFrame();
                newFrame.setVisible(true);
        }
    }
}






