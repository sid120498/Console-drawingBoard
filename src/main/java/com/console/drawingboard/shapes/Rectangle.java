package com.console.drawingboard.shapes;

import com.console.drawingboard.commands.DrawRectangleCommand;
import static com.console.drawingboard.util.Validate.checkOutOfBounds;
public class Rectangle implements Drawable {
    private int x1,y1,x2,y2;
    private char RECTANGLE_CHARACTER = 'x';
    public Rectangle(DrawRectangleCommand command){
        x1 = command.getX1();
        x2 = command.getX2();
        y1 = command.getY1();
        y2 = command.getY2();
    }

    @Override
    public void draw(Canvas canvas) {
        checkOutOfBounds(canvas.getHeight(),canvas.getWidth(), x1,y1,x2,y2);
        char[][] canvasBoard = canvas.getCanvasBoard();
        // horizontal
        for(int i = x1;i<=x2;i++){
            canvasBoard[y1][i] = RECTANGLE_CHARACTER;
            canvasBoard[y2][i] = RECTANGLE_CHARACTER;
        }
        // vertical
        for(int i = y1;i<=y2;i++){
            canvasBoard[i][x1] = RECTANGLE_CHARACTER;
            canvasBoard[i][x2] = RECTANGLE_CHARACTER;
        }
    }
}