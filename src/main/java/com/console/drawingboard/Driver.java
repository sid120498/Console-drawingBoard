package com.console.drawingboard;

import com.console.drawingboard.commands.Command;
import com.console.drawingboard.commands.CreateCanvasCommand;
import com.console.drawingboard.commands.QuitCommand;
import com.console.drawingboard.factory.CommandFactory;
import com.console.drawingboard.shapes.Canvas;
import com.console.drawingboard.shapes.CanvasBoard;

import java.util.Scanner;

import static java.util.Objects.isNull;

public class Driver {
    private static CommandFactory commandFactory;
    private static Scanner scanner;
    private static Canvas canvas;
    public static void main(String[] args) {
	// write your code here
        buildCanvas();
    }
    public static void buildCanvas(){
        scanner = new Scanner(System.in);
        commandFactory = new CommandFactory();
        System.out.println("Enter command:");
        canvas = null;
        while (true) {
            process(scanner.nextLine());
            System.out.println("Enter command:");
        }
    }
    public static void process(String commandString){
        Command command = null;
        try{
            command = commandFactory.getCommand(commandString);
        }catch (IllegalArgumentException e){
            System.out.println("Command not correct " + e.getMessage());
            return;
        }
        if(command instanceof QuitCommand){
            System.out.println("Exiting...");
            System.exit(0);
        }
        else if(command instanceof CreateCanvasCommand){
            try{
                canvas = new CanvasBoard((CreateCanvasCommand) command);
                canvas.render();
            }catch(IllegalArgumentException e){
                System.out.println("Command not correct" + e.getMessage());
            }

        }
        else{
            if(isNull(canvas)){
                System.out.println("Please build canvas first");
            }else{
                try{
                    System.out.println("test");
                    canvas.drawShape(command);
                    canvas.render();
                }catch (IllegalArgumentException e){
                    System.out.println("Command not correct " + e.getMessage());
                }
            }

        }
    }
}
