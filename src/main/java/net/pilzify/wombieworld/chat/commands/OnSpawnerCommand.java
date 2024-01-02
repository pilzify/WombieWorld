package net.pilzify.wombieworld.chat.commands;

import net.pilzify.wombieworld.items.CustomItem;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OnSpawnerCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player player = (Player) sender;
        if (!cmd.getName().equalsIgnoreCase("spawner")) return true;
        for (String arg : args){
            //if (Spawners.getAllSpawners().contains(arg)){send message and return}
            //player.getInventory().addItem(Spawners.getSpawner(arg));
        }
        player.getInventory().addItem(CustomItem.DEFAULT_SPAWNER);
        return true;
    }
}
