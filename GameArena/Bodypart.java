public class Bodypart extends Entity {
    public Bodypart(double SizeX, double SizeY, int x, int y){
        super(SizeX, SizeY, x, y);
        rects = new Rectangle[1];
    }

    public void move(int x, int y){
        X = x;
        Y = y;
    }

    public void show(GameArena arena){
        Rectangle rect = new Rectangle(X * sizeX, Y * sizeY, sizeX, sizeY, "DARKGREY");
        for(int i = 0; i < rects.length; i++){
            rects[0] = rect;
            arena.addRectangle(rect);
        }
    }
}
