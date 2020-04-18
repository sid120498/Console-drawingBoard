package com.console.drawingboard.commands;
import static com.console.drawingboard.util.Casting.toWholeNumber;
public class DrawRectangleCommand implements Command {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public DrawRectangleCommand(String... params) {

        if (params.length < 4)
            throw new IllegalArgumentException("Draw Rectangle command needs four arguments");

        x1 = toWholeNumber(params[0]);
        y1 = toWholeNumber(params[1]);
        x2 = toWholeNumber(params[2]);
        y2 = toWholeNumber(params[3]);
        if(x1<1 || x2<1 || y1 < 1 || y2< 1)
            throw new IllegalArgumentException("Draw rectangle command needs all arguments to be greater than one");
        if(x2<x1 || y2<y1)
            throw new IllegalArgumentException("x1, y1 refers to top left corner and x2, y2 refers to bottom right corner of rectangle");

    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
