public class Cell {
    private double width;
    private double height;
    private Entity entity;
    private String colour;

    public Cell(double x, double y){
        width = x;
        height = y;
        colour = "GREY";
        entity = null;
    }

    public double GetWidth(){
        return width;
    }

    public double GetHeight(){
        return height;
    }

    public void setColour(String col){
        colour = col;
    }

    public String getColour(){
        return colour;
    }

    public void updateItem(Entity item){
        entity = item;
    }

    public void update(){
        if(entity == null){
            return;
        }
        entity.show();
    }
}
