package com.console.drawingboard.util;

public class Validate {
    private Validate(){

    }
    public static void checkOutOfBounds(int height, int width, int x1, int y1, int x2, int y2){
        if(x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0 && y1 <= height && y2 <= height && x1 <= width && x2 <= width)
            return;
        throw new IllegalArgumentException("Given command do not lie inside the canvas boundary");
    }
    public static void checkOutOfBounds(int height, int width, int x, int y){
        if(x>0 && y>0 && x<=width && y<height )
            return;
        throw new IllegalArgumentException("Given point for filling does not line inside canvas");
    }
}
