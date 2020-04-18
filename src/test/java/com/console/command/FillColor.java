package com.console.command;
import com.console.drawingboard.commands.FillColorCommand;
import org.junit.Test;
public class FillColor {

    @Test
    public void testCreate() throws Exception{
        new FillColorCommand("4", "10","o");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument1() throws Exception{
        new FillColorCommand("4");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument2() throws Exception{
        new FillColorCommand("4", "!");
    }

}
