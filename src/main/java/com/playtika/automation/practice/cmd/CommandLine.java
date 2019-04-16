package com.playtika.automation.practice.cmd;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CommandLine {
    private static Pattern SPLITER = Pattern.compile("\\s");
    private CommandContext commandContext;
    private CommandFactory commandFactory;


    public CommandLine(){
        commandContext = new CommandContext();
        commandFactory = new CommandFactory();
    }

    public void run() {
        Scanner console = new Scanner(System.in);
        while (commandContext.isWorking()) {
            System.out.printf("$%s-> ", commandContext.getPath());
            String line = console.nextLine();
            String[] command = SPLITER.split(line);
            ConsoleCommand consoleCommand = commandFactory.createCommand(command);
            if (consoleCommand == null) {
                System.out.println("Некорректная комманда: " + line);
            } else {
                consoleCommand.execute(commandContext);
            }
        }
    }

    public static void main(String[] args) {
        new CommandLine().run();
    }
}
