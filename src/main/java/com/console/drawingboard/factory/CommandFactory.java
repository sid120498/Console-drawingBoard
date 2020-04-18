package com.console.drawingboard.factory;
import com.console.drawingboard.commands.*;
import com.console.drawingboard.commands.Command;
import com.console.drawingboard.shapes.FillColor;

import java.util.Arrays;

public class CommandFactory {
    static final String QUIT     = "Q";
    static final String CREATE_CANVAS   = "C";
    static final String DRAW_LINE   = "L";
    static final String DRAW_RECTANGLE   = "R";
    static final String FILL_COLOR  = "B";
    public Command getCommand(String input) {

        input = input.trim().replaceAll(" {2}", " ");

        String[] split   = input.split(" ");
        String   commandChar = split[0].toUpperCase();
        // copying only arguments from input
        String[] params  = Arrays.copyOfRange(split, 1, split.length);

        if (QUIT.equals(commandChar)) {
            return new QuitCommand();
        } else if (CREATE_CANVAS.equals(commandChar)) {
            return new CreateCanvasCommand(params);
        } else if (DRAW_LINE.equals(commandChar)) {
            return new DrawLineCommand(params);
        } else if (DRAW_RECTANGLE.equals(commandChar)) {
            return new DrawRectangleCommand(params);
        } else if (FILL_COLOR.equals(commandChar)) {
            return new FillColorCommand(params);
        }
        throw new IllegalArgumentException(String.format("Invalid command %s", commandChar));

    }
}
