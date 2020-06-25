package nl.saproto.protomc.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandProto implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            ItemStack diamonds = new ItemStack(Material.DIAMOND);
            diamonds.setAmount(64);
            player.getInventory().addItem(diamonds);
            return true;
        }
        return false;
    }
}
