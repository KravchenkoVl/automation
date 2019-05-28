package com.playtika.automation.practice.cmd;

public class ExitCommand implements ConsoleCommand {
    @Override
    public void execute(CommandContext context) {
        context.setWorking(false);
    }
}
