package com.playtika.automation.practice.cmd;

import java.nio.file.Files;
import java.nio.file.Path;

public class ChangeDirCommand implements ConsoleCommand {
    private final String dir;

    public ChangeDirCommand(String dir) {
        this.dir = dir;
    }

    @Override
    public void execute(CommandContext context) {
        Path currentPath = context.getPath();
        Path newPath  = currentPath.resolve(dir).normalize();
        if (Files.isDirectory(newPath)) {
            context.setPath(newPath);
        } else {
            System.out.println("Вы ввели неверную директорию: " + dir);
        }
    }
}
