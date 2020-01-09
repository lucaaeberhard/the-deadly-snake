package clock;

import actions.Collision;
import game.Snake;
import gui.GameOver;

import java.awt.*;

public  class GameClock extends Thread{
    public boolean running = true;

    public void run(){
        while(running){
            try{
                sleep(125);//100
                Snake.move();
                Snake.waitToMove = false;
                Collision.collidePickUP();
                if(Collision.collideSelf()){
                    running=false;
                    GameOver.createDeath(this);
                    Snake.tails.clear();
                    Snake.score = 0;
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                }
                  if(Collision.collideWall()){
                      running=false;
                      GameOver.createDeath(this);
                      Snake.tails.clear();
                      Snake.head.setX(7);
                      Snake.head.setY(7);
                      Snake.score = 0;
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
