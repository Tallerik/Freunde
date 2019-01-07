package net.snapecraft;

import net.md_5.bungee.api.plugin.Plugin;
import net.snapecraft.Commands.FriendCMD;

public class Freunde extends Plugin {

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerCommand(this, new FriendCMD("friend"));
    }
}
