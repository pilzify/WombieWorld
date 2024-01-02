package net.pilzify.wombieworld.chat;

import net.pilzify.wombieworld.WombieWorld;
import net.pilzify.wombieworld.chat.commands.OnSpawnerCommand;
import org.bukkit.command.CommandExecutor;

public class Commands {
    private static final WombieWorld plugin = WombieWorld.getInstance();
    public static void init(){
        try{
            plugin.getCommand("spawner").setExecutor(new OnSpawnerCommand());
        }catch (NullPointerException e){
            System.out.println("Executor(s) not set properly: " +  e.getMessage());
        }
    }
}
