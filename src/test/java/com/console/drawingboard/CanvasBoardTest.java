package com.console.drawingboard;
import com.console.drawingboard.commands.CreateCanvasCommand;
import static org.junit.Assert.assertTrue;

import com.console.drawingboard.shapes.CanvasBoard;
import org.junit.Test;

import java.util.Arrays;

public class CanvasBoardTest {
    @Test
    public void testCreate() throws Exception{
        CanvasBoard cb = new CanvasBoard(new CreateCanvasCommand("3" ,"3" ));
        char[][] canvasMatrix = cb.getCanvasBoard();
        char[][] testMatrix = {
                {'-','-','-','-','-'},
                {'|',' ',' ',' ','|'},
                {'|',' ',' ',' ','|'},
                {'|',' ',' ',' ','|'},
                {'-','-','-','-','-'}
        };
        assertTrue(Arrays.deepEquals(canvasMatrix,testMatrix));
    }
}
