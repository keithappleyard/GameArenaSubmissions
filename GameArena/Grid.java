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
                Rectangle rect1 = new Rectangle(i * cells[i][j].GetWidth(), j * cells[i][j].GetHeight(), cells[i][j].GetWidth() - 3, cells[i][j].GetHeight() - 3, "WHITE");
                Rectangle rect2 = new Rectangle(i * cells[i][j].GetWidth(), j * cells[i][j].GetHeight(), cells[i][j].GetWidth(), cells[i][j].GetHeight(), cells[i][j].getColour());

                arena.addRectangle(rect2);
                arena.addRectangle(rect1);
            }
        }
    }
}
