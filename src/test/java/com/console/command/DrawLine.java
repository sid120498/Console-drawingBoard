package com.console.command;
import com.console.drawingboard.commands.DrawLineCommand;
import org.junit.Test;
public class DrawLine {

    @Test
    public void testCreate() throws Exception{
        new DrawLineCommand("4", "10", "4", "15");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument1() throws Exception{
        new DrawLineCommand("4");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument2() throws Exception{
        new DrawLineCommand("4", "!", "4", "9");
    }
    // to test diagonal line
    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument3() throws Exception{
        new DrawLineCommand("1", "2","3","4");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument4() throws Exception{
        new DrawLineCommand("10", "1","5","1");
    }

}
