public class Entity {
    protected double sizeX;
    protected double sizeY;
    protected int X;
    protected int Y;
    protected Rectangle rects[];

    public Entity(double SizeX, double SizeY, int x, int y){
        sizeX = SizeX;
        sizeY = SizeY;
        X = x;
        Y = y;
    }

    public double getSizeX(){
        return sizeX;
    }

    public double getSizeY(){
        return sizeY;
    }

    public int getX(){
        return X;
    }

    public int getY(){
        return Y;
    }

    public void show(GameArena arena){
        //Rectangle rect = new Rectangle(sizeX, sizeY, Y, X, "GREEN");
        //arena.addRectangle(rect);
    }

    public void remove(GameArena arena){
        for(int i = 0; i < rects.length; i++){
            arena.removeRectangle(rects[i]);
        }
    }

    public Rectangle[] getRects(){
        return rects;
    }
}
