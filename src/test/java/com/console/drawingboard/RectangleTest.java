package com.console.drawingboard;
import com.console.drawingboard.commands.CreateCanvasCommand;
import com.console.drawingboard.commands.DrawRectangleCommand;
import com.console.drawingboard.shapes.CanvasBoard;
import com.console.drawingboard.shapes.Rectangle;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.Arrays;

public class RectangleTest {
    @Test
    public void testCreate() throws Exception{
        CanvasBoard cb = new CanvasBoard(new CreateCanvasCommand("3" ,"3" ));
        Rectangle rectangle = new Rectangle(new DrawRectangleCommand("1","1","3","3"));
        rectangle.draw(cb);
        char[][] canvasMatrix = cb.getCanvasBoard();
        char[][] testMatrix = {
                {'-','-','-','-','-'},
                {'|','x','x','x','|'},
                {'|','x',' ','x','|'},
                {'|','x','x','x','|'},
                {'-','-','-','-','-'}
        };
        assertTrue(Arrays.deepEquals(canvasMatrix,testMatrix));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithOutOfBounds() throws Exception{
        CanvasBoard cb = new CanvasBoard(new CreateCanvasCommand("3" ,"3" ));
        Rectangle rectangle = new Rectangle(new DrawRectangleCommand("1","1","10","10"));
        rectangle.draw(cb);
    }

}
