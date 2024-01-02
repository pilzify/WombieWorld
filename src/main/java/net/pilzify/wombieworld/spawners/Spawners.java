package net.pilzify.wombieworld.spawners;

import net.pilzify.wombieworld.entities.DefaultZombie;
import net.pilzify.wombieworld.entities.Spawnable;
import net.pilzify.wombieworld.items.CustomItem;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.ArrayList;

public class Spawners implements Listener {
    private static ArrayList<DefaultSpawner> defaultSpawners = new ArrayList<>();

    public static void addDefaultSpawner(Spawnable entity, Location location){
        defaultSpawners.add(new DefaultSpawner(entity, location));
    }
    @EventHandler
    public static void onSpawnerPlace(PlayerInteractEvent event){
        System.out.println("playerinteractevent");
        Player player = event.getPlayer();
        if (event.getItem() == null) return;
        if (!event.getAction().equals(Action.RIGHT_CLICK_BLOCK))return;
        if (event.getItem().equals(CustomItem.DEFAULT_SPAWNER)){
            Block block = event.getClickedBlock();
            Location location;
            if (block.isPassable()){
                location = block.getLocation().add(0.5,0,0.5);
            }else {
                location = event.getBlockFace().getDirection().toLocation(player.getWorld())
                        .add(event.getBlockFace().getDirection().normalize());
            }
            addDefaultSpawner(new DefaultZombie(), location);
        }
        event.setCancelled(true);
        WaveManager.waveOne();
    }
    public static ArrayList<DefaultSpawner> getDefaultSpawners(){
        return defaultSpawners;
    }
}
