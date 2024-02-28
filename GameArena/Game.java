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
        grid.UpdateDisplay(arena);

        Snake snake = new Snake(grid, 0, 0);
        //grid.getCell(0, 0).showEntity(arena);
        snake.updateGUI(arena);

        while(true){
            //snake.move(1,0);

            arena.pause();
        }
    }
}