import java.awt.event.KeyEvent;

public class Game
    {
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(1000, 600);
        //Ball b = new Ball(250, 150, 20, "GREEN");
        //arena.addBall(b);
        /*Goodie g = new Goodie(250, 450);
        //Baddie b = new Baddie(100, 450);
        //b.addTo(arena);
        g.addTo(arena);
        while(true)
        {
            if(arena.leftPressed()){
                g.accelerate(-2, 0);
            }
            else{
                g.decelerateX();
            }
            if(arena.rightPressed()){
                g.accelerate(2,0);
            }
            else{
                g.decelerateX();
            }
            arena.pause();
        }*/

        Grid grid = new Grid(arena, 8, 8);
        Snake snake = new Snake(grid, 0, 0);
        int gameSpeed = 30;
        int xDirection = 1;
        int yDirection = 0;
        int updateTick = 0;
        grid.UpdateDisplay(arena);

        while(true){
            if(arena.leftPressed()){
                xDirection = -1;
                yDirection = 0;
            }
            if(arena.rightPressed()){
                xDirection = 1;
                yDirection = 0;
            }
            if(arena.upPressed()){
                xDirection = 0;
                yDirection = -1;
            }
            if(arena.downPressed()){
                xDirection = 0;
                yDirection = 1;
            }

            if(updateTick >= gameSpeed){
                snake.move(arena, xDirection, yDirection);
                grid.UpdateDisplay(arena);
                updateTick = 0;
            }
            else{
                updateTick++;
            }
            arena.pause();
        }
    }
}