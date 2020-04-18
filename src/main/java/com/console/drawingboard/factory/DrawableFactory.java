package com.console.drawingboard.factory;

import com.console.drawingboard.commands.Command;
import com.console.drawingboard.commands.DrawLineCommand;
import com.console.drawingboard.commands.DrawRectangleCommand;
import com.console.drawingboard.commands.FillColorCommand;
import com.console.drawingboard.shapes.Drawable;
import com.console.drawingboard.shapes.FillColor;
import com.console.drawingboard.shapes.Line;
import com.console.drawingboard.shapes.Rectangle;

public class DrawableFactory {

    public Drawable getShape(Command command) {

        if (command instanceof DrawLineCommand)
            return new Line((DrawLineCommand) command);

        else if (command instanceof DrawRectangleCommand)
            return new Rectangle((DrawRectangleCommand) command);

        else if (command instanceof FillColorCommand)
            return new FillColor((FillColorCommand) command);
        throw new IllegalArgumentException("This type of command cannot be applied");
    }
}
