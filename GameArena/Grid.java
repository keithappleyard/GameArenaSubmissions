public class Grid {
    private int rows;
    private int columns;
    private Cell cells[][];

    public Grid(GameArena arena, int x, int y){
        cells = new Cell[x][y];
        rows = x;
        columns = y;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                cells[i][j] = new Cell(arena.getArenaWidth() / rows, arena.getArenaHeight() / columns);
            }
        }
    }

    public Cell getCell(int x, int y){
        return cells[x][y];
    }

    public void UpdateDisplay(GameArena arena){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                //initialize grid
                Rectangle rect1 = new Rectangle(i * cells[i][j].GetWidth(), j * cells[i][j].GetHeight(), cells[i][j].GetWidth() - 3, cells[i][j].GetHeight() - 3, cells[i][j].getColour());
                Rectangle rect2 = new Rectangle(i * cells[i][j].GetWidth(), j * cells[i][j].GetHeight(), cells[i][j].GetWidth(), cells[i][j].GetHeight(), "BLACK");

                arena.addRectangle(rect2);
                arena.addRectangle(rect1);

                cells[i][j].showEntity(arena);
            }
        }
    }

    public double getGridSizeX(){
        return cells[0][0].GetWidth();
    }

    public double getGridSizeY(){
        return cells[0][0].GetHeight();
    }

    public int getGridSize(){
        return rows*columns;
    }
}
