public class Cell {
    private double width;
    private double height;
    //private int X;
    //private int Y;

    private String colour;

    public Cell(double x, double y){
        width = x;
        height = y;
        colour = "BLUE";
    }

    public double GetWidth(){
        return width;
    }

    public double GetHeight(){
        return height;
    }

    public String getColour(){
        return colour;
    }

    /*public void Update(GameArena arena){
        Rectangle rect = new Rectangle(height, height, width, height, colour)
    }*/
}
