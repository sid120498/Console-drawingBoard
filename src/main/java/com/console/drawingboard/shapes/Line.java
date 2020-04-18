package com.console.drawingboard.shapes;
import com.console.drawingboard.commands.DrawLineCommand;

import static com.console.drawingboard.util.Validate.checkOutOfBounds;

public class Line implements Drawable {
    private int x1,y1,x2,y2;
    private char LINE_CHARACTER = 'x';
    public Line(DrawLineCommand command){
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
            canvasBoard[y1][i] = LINE_CHARACTER;
            canvasBoard[y2][i] = LINE_CHARACTER;
        }
        // vertical
        for(int i = y1;i<=y2;i++){
            canvasBoard[i][x1] = LINE_CHARACTER;
            canvasBoard[i][x2] = LINE_CHARACTER;
        }
    }
}
