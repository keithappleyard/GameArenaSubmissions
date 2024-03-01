public class Snake{
    private Bodypart body[];
    private int X;
    private int Y;
    private double cellSizeX;
    private double cellSizeY;
    private int currentSize;
    private Grid grid;

    public Snake(Grid g, int x, int y){
        X = x;
        Y = y;
        grid = g;
        cellSizeX = grid.getCellSizeX();
        cellSizeY = grid.getCellSizeY();
        currentSize = 1;
        body = new Bodypart[grid.getGridSize()];

        //add Bodypart item to cell at the front
        body[0] = new Bodypart(cellSizeX, cellSizeY, x, y);
        grid.getCell(x, y).updateItem(body[0]);
    }

    public void eat(){
        //increase size
        if(currentSize >= body.length){
            System.out.println("ERROR: Snake exceeded max size");
            return;
        }
        body[currentSize] = new Bodypart(cellSizeX, cellSizeX, body[body.length].getX(), body[body.length].getY());
        currentSize++;
    }

    public void move(int x, int y){
        for(int i = currentSize; i > 0; i--){
            //update coordinates
            if(body[i-1].getX() == X && body[i-1].getY() == Y){
                continue;
            }
            grid.getCell(body[i].getX(), body[i].getY()).updateItem(null);;
            body[i].move(body[i-1].getX(), body[i-1].getY());
            
            //update grid
            grid.getCell(body[i].getX(), body[i].getY()).updateItem(body[i]);;
        }
        body[0].move(X + x,Y + y);
        grid.getCell(body[0].getX(), body[0].getY()).updateItem(body[0]);;
        X += x;
        Y += y;
    }
}
