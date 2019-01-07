package net.snapecraft.Commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import net.snapecraft.Util;

public class FriendCMD extends Command {
    public FriendCMD(String name) {
        super(name);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        if(args.length == 0) {
            Util.printHelp(sender);
        }
    }
}
