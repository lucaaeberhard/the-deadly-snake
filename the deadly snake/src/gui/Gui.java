package gui;

import actions.KeyHandler;
import clock.GameClock;
import javax.swing.*;

public class Gui {

    public static int width = 800, height = 600;
    public static int xoff = 130, yoff = 20;



    public static void create(GameClock clock){

        JFrame jf;
        Draw d;


        jf = new JFrame("the deadly snake");
        jf.setSize(width,height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setResizable(false);
        KeyHandler keyHdl = new KeyHandler();
        keyHdl.setGameClock(clock);
        jf.addKeyListener(keyHdl);

        d = new Draw();
        d.setBounds(0, 0,width,height);
        d.setVisible(true);
        jf.add(d);

        jf.requestFocus();
        jf.setVisible(true);

    }
}