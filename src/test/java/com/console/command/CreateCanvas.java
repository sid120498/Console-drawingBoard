package com.console.command;
import com.console.drawingboard.commands.CreateCanvasCommand;
import org.junit.Test;
public class CreateCanvas {

    @Test
    public void testCreate() throws Exception{
        new CreateCanvasCommand("4", "10");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument1() throws Exception{
        new CreateCanvasCommand("4");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument2() throws Exception{
        new CreateCanvasCommand("4", "!");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument3() throws Exception{
        new CreateCanvasCommand("0", "5");
        new CreateCanvasCommand("5","0");
    }
}
