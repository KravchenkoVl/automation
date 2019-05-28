package com.playtika.automation.practice.cmd;

public class CommandFactory {
    public ConsoleCommand createCommand(String[] command) {
        String commandName = command[0];
        switch (commandName) {
            case "cd":
                return new ChangeDirCommand(command[1]);
            case "ls":
                return new ListDirCommand();
            case "exit":
                return new ExitCommand();
        }
        return null;
    }
}
