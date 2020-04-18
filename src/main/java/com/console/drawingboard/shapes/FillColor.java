package com.console.drawingboard.shapes;

import static com.console.drawingboard.util.Validate.checkOutOfBounds;

import com.console.drawingboard.commands.FillColorCommand;

public class FillColor implements Drawable {
    private int x, y;
    char color;
    char[][] canvasBoard;
    int[][] dirs = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0},
            {1, 1},
            {-1, 1},
            {1, -1},
            {-1, -1}
    };

    public FillColor(FillColorCommand command) {
        x = command.getX();
        y = command.getY();
        color = command.getColor();

    }
    @Override
    public void draw(Canvas canvas) {
        checkOutOfBounds(canvas.getHeight(), canvas.getWidth(), x, y);
        canvasBoard = canvas.getCanvasBoard();
        dfs(x, y);
    }
    private boolean isValidDfsPoint(int x,int y){
        int n = canvasBoard.length;
        int m = canvasBoard[0].length;
        if(x>0 && y>0 && x<=n && y<=m && canvasBoard[x][y]==' ')
            return true;
        return false;
    }
    private void dfs(int x, int y) {
        int newX, newY;
        if(canvasBoard[x][y]!=' ')
            return;
        canvasBoard[x][y] = color;
        for(int i = 0;i<dirs.length;i++){
            newX = x+dirs[i][0];
            newY = y + dirs[i][1];
            if(isValidDfsPoint(newX,newY)){
                dfs(newX,newY);
            }
        }
    }
}
