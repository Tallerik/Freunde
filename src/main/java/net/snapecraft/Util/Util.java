package net.snapecraft;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;

public class Util {
    public static void printHelp(CommandSender sender) {
        sender.sendMessage(new TextComponent("§cArguments missing!"));
    }
}
