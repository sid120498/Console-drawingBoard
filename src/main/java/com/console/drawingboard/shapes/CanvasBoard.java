package com.console.drawingboard.shapes;

import com.console.drawingboard.commands.Command;
import com.console.drawingboard.commands.CreateCanvasCommand;
import com.console.drawingboard.factory.DrawableFactory;

public class CanvasBoard implements Canvas {
    private static final char HORIZONTAL_CHARACTER = '-';
    private static final char VERTICAL_CHARACTER = '|';

    private int width;
    private int height;
    private char[][] canvasMatrix;
    public CanvasBoard(CreateCanvasCommand createCanvasCommand){
        width = createCanvasCommand.getWidth();
        height = createCanvasCommand.getHeight();
        canvasMatrix = new char[this.height+2][this.width+2];
        buildEmptyBoard();
        drawBoundary();
    }
    private void buildEmptyBoard(){
        for(int i = 0;i<=height+1;i++){
            for(int j = 0;j<=width+1;j++){
                canvasMatrix[i][j] = ' ';
            }
        }
    }
    private void drawBoundary(){
        // vertical
        for(int i = 0;i<=height+1;i++){
            canvasMatrix[i][0] = VERTICAL_CHARACTER;
            canvasMatrix[i][width+1] = VERTICAL_CHARACTER;
        }
        // horizontal
        for(int i = 0;i<=width+1;i++){
            canvasMatrix[0][i] = HORIZONTAL_CHARACTER;
            canvasMatrix[height+1][i] = HORIZONTAL_CHARACTER;
        }
    }
    @Override
    public void drawShape(Command command) {
        DrawableFactory drawableFactory = new DrawableFactory();
        Drawable drawable = drawableFactory.getShape(command);
        drawable.draw(this);
    }

    @Override
    public void render() {
        for(int i = 0;i<=height+1;i++){
            for(int j = 0;j<=width+1;j++){
                System.out.print(canvasMatrix[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public char[][] getCanvasBoard() {
        return canvasMatrix;
    }
}
