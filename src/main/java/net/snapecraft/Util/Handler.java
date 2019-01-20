package net.snapecraft.Util.SQL;

import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.List;

public interface Handler {

    List<String> getFriends(ProxiedPlayer proxiedPlayer);

}
