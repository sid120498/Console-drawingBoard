package com.console.command;
import com.console.drawingboard.commands.DrawRectangleCommand;
import org.junit.Test;
public class DrawRectangle {

    @Test
    public void testCreate() throws Exception{
        new DrawRectangleCommand("4", "10", "10", "15");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument1() throws Exception{
        new DrawRectangleCommand("4");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument2() throws Exception{
        new DrawRectangleCommand("4", "!","5","6");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument3() throws Exception{
        new DrawRectangleCommand("10", "15","4","10");
    }

}
