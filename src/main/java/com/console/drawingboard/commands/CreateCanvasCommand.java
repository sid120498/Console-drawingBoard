package com.console.drawingboard.commands;
import static com.console.drawingboard.util.Casting.toWholeNumber;
public class CreateCanvasCommand implements Command {
    private int height;
    private int width;

    public CreateCanvasCommand(String... params) {
        if(params.length < 2){
            throw new IllegalArgumentException("Canvas command needs 2 arguments");
            // checking and casting to int
        }
        height = toWholeNumber(params[0]);
        width = toWholeNumber(params[1]);
        if(height<1 || width < 1){
            throw new IllegalArgumentException("Canvas Area can not be zero");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
