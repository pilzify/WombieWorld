package net.pilzify.wombieworld.spawners;

import net.pilzify.wombieworld.entities.SpawnerUtil;
import net.pilzify.wombieworld.utils.Ticks;

public class WaveManager {
    public static void waveOne(){
        for (DefaultSpawner spawner : Spawners.getDefaultSpawners()){
            new SpawnerUtil().spawnEntities(spawner.getLocation(), spawner.getEntity(),10,10* Ticks.SECOND);
        }
    }
}
