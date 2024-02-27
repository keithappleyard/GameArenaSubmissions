public class Goodie{
    private double X;
    private double Y;
    private Rectangle rect[] = new Rectangle[8];
    private double xVelocity;
    private double yVelocity;
    private static final double maxVelocity = 6;
    private static final double brakingSpeed = 3;

    public Goodie(int x, int y){
        this.X = x;
        this.Y = y;

        rect[0] = new Rectangle(X, Y, 50, 100, "GREEN");
        rect[1] = new Rectangle(X+10, Y-25, 30, 30, "WHITE");
        rect[2] = new Rectangle(X+25, Y+15, 70, 15, "Green");
        rect[3] = new Rectangle(X-45, Y+15, 70, 15, "Green");
        rect[4] = new Rectangle(X+95, Y+15, 15, 15, "WHITE");
        rect[5] = new Rectangle(X-60, Y+15, 15, 15, "WHITE");
        rect[6] = new Rectangle(X-20, Y+95, 30, 15, "GREY");
        rect[7] = new Rectangle(X+40, Y+95, 30, 15, "GREY");

    }

    public void move(double x, double y){
        X += x;
        Y += y;

        for(int i = 0; i < rect.length; i++){
            rect[i].setXPosition(rect[i].getXPosition() + x);
            rect[i].setYPosition(rect[i].getYPosition() + y);
        }
    }

    public void addTo(GameArena arena){        
        for(int i = 0; i < rect.length; i++){
            arena.addRectangle(rect[i]);
        }
    }

    public double getX(){
        return X;
    }

    public double getY(){
        return Y;
    }

    public void accelerate(double x, double y){
        xVelocity += x;
        yVelocity += y;

        if(xVelocity > maxVelocity)
            xVelocity = maxVelocity;
        if(yVelocity < -maxVelocity)
            yVelocity = -maxVelocity;

        this.move(xVelocity, yVelocity);
    }

    public void decelerateX(){
        xVelocity -= brakingSpeed;
        if(xVelocity < 0)
            xVelocity = 0;
    }

    public void decelerateY(){
        yVelocity -= brakingSpeed;
        if(yVelocity < 0){
            yVelocity = 0;
        }
    }
}