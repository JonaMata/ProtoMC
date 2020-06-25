package nl.saproto.protomc;

import nl.saproto.protomc.commands.CommandProto;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("proto").setExecutor(new CommandProto());
    }

    @Override
    public void onDisable() {

    }
}
