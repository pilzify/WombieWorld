package net.pilzify.wombieworld;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.RayTraceResult;

import java.util.ArrayList;
import java.util.List;

public class Raycast {

    // is using an ArrayList just for the heck of it. Can be used for different projects later on. For a single event raycast an instance of a player would suffice.

    private List<Player> playersList = new ArrayList<Player>(); // list of players who are able to use raycasting

    public void addPlayer(Player player) {  // add players that will look

        playersList.add(player);

    }

    public void removePLayer(Player player) { // removes players that will look
        playersList.remove(player);
    }

    public List<Player> getPlayersList(){ //returns the List of players using raycast
        return  playersList;
    }

    public boolean hasRaycast(){ // returns whether there are players using raycasting or not
        return !playersList.isEmpty();

    }

    public Entity raycastOnEntity(Player player, long rayCastLength){ //casts a ray from player for the Length rayCastLength
        if (!playersList.contains(player)) return null;
        Location playerLocation = player.getLocation();
        RayTraceResult rayTraceResult = playerLocation.getWorld().rayTraceEntities(playerLocation,playerLocation.getDirection(),rayCastLength);
        if(rayTraceResult == null) return null;
        return rayTraceResult.getHitEntity();
    }
}
