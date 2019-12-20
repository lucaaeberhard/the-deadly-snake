package clock;

import actions.Collision;
import game.Snake;

public class GameClock extends Thread{
    public static boolean running = true;

    public void run(){
        while(running){
            try{
                sleep(100);
                Snake.move();
                Snake.waitToMove = false;
                Collision.collidePickUP();
                if(Collision.collideSelf()){
                    Snake.tails.clear();
                    Snake.score = 0;
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    sleep(1000);
                }
                if(Collision.collideWall()){
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    Snake.score = 0;
                    sleep(1000);
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
