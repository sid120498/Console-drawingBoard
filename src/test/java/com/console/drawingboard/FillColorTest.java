package com.console.drawingboard;
import com.console.drawingboard.commands.CreateCanvasCommand;
import com.console.drawingboard.commands.FillColorCommand;
import com.console.drawingboard.shapes.CanvasBoard;
import com.console.drawingboard.shapes.FillColor;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.Arrays;

public class FillColorTest {
    @Test
    public void testCreate() throws Exception{
        CanvasBoard cb = new CanvasBoard(new CreateCanvasCommand("3" ,"3" ));
        FillColor FillColor = new FillColor(new FillColorCommand("2","2","o"));
        FillColor.draw(cb);
        char[][] canvasMatrix = cb.getCanvasBoard();
        char[][] testMatrix = {
                {'-','-','-','-','-'},
                {'|','o','o','o','|'},
                {'|','o','o','o','|'},
                {'|','o','o','o','|'},
                {'-','-','-','-','-'}
        };
        assertTrue(Arrays.deepEquals(canvasMatrix,testMatrix));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithOutOfBounds() throws Exception{
        CanvasBoard cb = new CanvasBoard(new CreateCanvasCommand("3" ,"3" ));
        FillColor FillColor = new FillColor(new FillColorCommand("8","8"));
        FillColor.draw(cb);
    }

}
