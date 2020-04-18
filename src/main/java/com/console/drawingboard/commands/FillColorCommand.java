package com.console.drawingboard.commands;
import static com.console.drawingboard.util.Casting.toWholeNumber;
public class FillColorCommand implements Command {
    private int x;
    private int y;
    private char color;

    public FillColorCommand(String... params) {

        if (params.length < 3)
            throw new IllegalArgumentException("Bucket fill needs three argument");

        if (params[2].length() != 1)
            throw new IllegalArgumentException("Color needs to single character");

        x = toWholeNumber(params[0]);
        y = toWholeNumber(params[1]);

        if(x<1 || y<1)
            throw new IllegalArgumentException("Fill color command needs all arguments to be greater than one");
        color = params[2].charAt(0);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}
