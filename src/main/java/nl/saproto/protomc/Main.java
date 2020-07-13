package nl.saproto.protomc;

import nl.saproto.protomc.commands.CommandProto;
import nl.saproto.protomc.events.BlockBreak;
import nl.saproto.protomc.events.EventPlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("proto").setExecutor(new CommandProto());
        this.getServer().getPluginManager().registerEvents(new EventPlayerJoin(), this);
        this.getServer().getPluginManager().registerEvents(new BlockBreak(), this);
    }

    @Override
    public void onDisable() {

    }
}
