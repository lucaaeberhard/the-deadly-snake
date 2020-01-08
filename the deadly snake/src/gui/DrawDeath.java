package gui;

import actions.Collision;
import actions.KeyHandler;

import javax.swing.*;

public class DrawDeath {
    JFrame jf;
    Draw d;

    public static int width = 800, height = 600;
    public static int xoff = 130, yoff = 20;

    public void create(){
        if(Collision.collideSelf() || Collision.collideWall()) {
            jf = new JFrame("Game Over");
            jf.setSize(width, height);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setLocationRelativeTo(null);
            jf.setLayout(null);
            jf.setResizable(false);
            jf.addKeyListener(new KeyHandler());

            d = new Draw();
            d.setBounds(0, 0, width, height);
            d.setVisible(true);
            jf.add(d);

            jf.requestFocus();
            jf.setVisible(true);

        }
    }
}