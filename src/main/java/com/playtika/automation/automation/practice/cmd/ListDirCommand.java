package com.playtika.automation.practice.cmd;

import java.io.File;
import java.nio.file.Path;
import java.util.Date;

public class ListDirCommand implements ConsoleCommand {
    @Override
    public void execute(CommandContext context) {
        Path path = context.getPath();
        File file = path.toFile();
        file.listFiles();
        File[] files = file.listFiles();
        for (File f : file.listFiles()) {
            System.out.printf("\t\t%s\t%s%n", new Date(f.lastModified()), f.getName());
        }

    }
}