package nl.saproto.protomc.events;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        Location blockLocation = block.getLocation();
        if(!(-10 <= blockLocation.getBlockX() && blockLocation.getBlockX() <= 10 && -10 <= blockLocation.getBlockZ() && blockLocation.getBlockZ() <= 10)) {
            event.setCancelled(true);
        }
    }

}
