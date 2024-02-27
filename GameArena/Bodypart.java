public class Bodypart extends Entity {
    public Bodypart(double SizeX, double SizeY, int x, int y){
        super(SizeX, SizeY, x, y);
    }

    public void move(int x, int y){
        X = x;
        Y = y;
    }
}
