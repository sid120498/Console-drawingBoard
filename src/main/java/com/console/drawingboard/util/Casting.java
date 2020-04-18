package com.console.drawingboard.util;
import java.lang.Math;
public class Casting {
    // private constructor so that class cannot be instantiated
    private Casting() {
    }
    public static int toWholeNumber(String number) {
        try{
            return Math.abs(Integer.parseInt(number));
        }catch(NumberFormatException e) {
            throw new IllegalArgumentException("Given argument cannot be cast into integer");
        }
    }
}
