package clock;

import actions.Collision;
import game.Snake;
import gui.GameOver;

import java.awt.*;

public class GameClock extends Thread{
    public static boolean running = true;

    public void run(){
        while(running){
            try{
                sleep(125);//100
                Snake.move();
                Snake.waitToMove = false;
                Collision.collidePickUP();
                if(Collision.collideSelf()){
                    GameOver.create();
                    Snake.tails.clear();
                    Snake.score = 0;
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    sleep(1000000000);//1000
                }
                  if(Collision.collideWall()){
                    GameOver.create();
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    Snake.score = 0;
                    sleep(1000000000);//1000

                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
