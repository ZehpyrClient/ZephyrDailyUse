package com.zephyr.client.commands;

import java.util.List;

public final class ZCommand extends Command {
    public static final ZCommand INSTANCE = new ZCommand();

    private ZCommand() {
        super("z", "Zephyr Daily Use commands: .z kit <create|delete|edit|load|list|preview> <name>");
    }

    @Override
    public List<String> suggest(String[] args) {
        if (args.length == 0) return List.of("kit");
        if (args[0].equalsIgnoreCase("kit")) {
            return KitCommand.INSTANCE.suggest(java.util.Arrays.copyOfRange(args, 1, args.length));
        }
        return List.of("kit");
    }

    @Override
    public void execute(String[] args) {
        if (args.length == 0) {
            CommandManager.sendMessage("Usage: .z kit <create|delete|edit|load|list|preview> <name>");
            return;
        }
        if (args[0].equalsIgnoreCase("kit")) {
            KitCommand.INSTANCE.execute(java.util.Arrays.copyOfRange(args, 1, args.length));
            return;
        }
        CommandManager.sendMessage("Unknown command: " + args[0]);
    }
}
