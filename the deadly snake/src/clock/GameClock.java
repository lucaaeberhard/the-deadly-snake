package clock;

import actions.Collision;
import game.Snake;

public class GameClock extends Thread{
    public static boolean running = true;

    public void run(){
        while(running){
            try{
                sleep(1);
                Snake.move();
                Snake.waitToMove = false;
                Collision.collidePickUP();
                if(Collision.collideSelf()){
                    Snake.tails.clear();
                    //Score
                }
                if(Collision.collideWall()){
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    //Score
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
