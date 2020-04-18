package com.console.drawingboard;
import com.console.drawingboard.commands.CreateCanvasCommand;
import com.console.drawingboard.commands.DrawLineCommand;
import com.console.drawingboard.shapes.CanvasBoard;
import com.console.drawingboard.shapes.Line;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.Arrays;

public class LineTest {
    @Test
    public void testCreate() throws Exception{
        CanvasBoard cb = new CanvasBoard(new CreateCanvasCommand("3" ,"3" ));
        Line Line = new Line(new DrawLineCommand("1","1","3","1"));
        Line.draw(cb);
        char[][] canvasMatrix = cb.getCanvasBoard();
        char[][] testMatrix = {
                {'-','-','-','-','-'},
                {'|','x','x','x','|'},
                {'|',' ',' ',' ','|'},
                {'|',' ',' ',' ','|'},
                {'-','-','-','-','-'}
        };
        assertTrue(Arrays.deepEquals(canvasMatrix,testMatrix));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithOutOfBounds() throws Exception{
        CanvasBoard cb = new CanvasBoard(new CreateCanvasCommand("3" ,"3" ));
        Line Line = new Line(new DrawLineCommand("1","1","1","5"));
        Line.draw(cb);
    }


}
