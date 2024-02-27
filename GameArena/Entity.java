public class Entity {
    private double sizeX;
    private double sizeY;
    protected int X;
    protected int Y;

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

    public void show(){
        Rectangle rect = new Rectangle(sizeX, sizeY, Y, X, "GREEN");
    }
}
