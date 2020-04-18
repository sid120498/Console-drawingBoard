package com.console.drawingboard.shapes;

import com.console.drawingboard.commands.Command;

public interface Canvas {
    void drawShape(Command command);
    int getHeight();
    int getWidth();
    void render();
    char[][] getCanvasBoard();
}
