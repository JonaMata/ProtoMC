package nl.saproto.protomc.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventPlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("ProtoMC welcomes you, " + event.getPlayer().getName() + "!");
        Bukkit.broadcastMessage(event.getPlayer().getName() + " just joined the server!");
    }
}
