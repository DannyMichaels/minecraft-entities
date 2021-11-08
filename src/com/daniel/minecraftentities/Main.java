package com.daniel.minecraftentities;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
//import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		useCommands();

		Entity zombieEntity = createEntity("zombie");
//		Zombie zombie = (Zombie) entity;
		zombieEntity.remove();
	}

	@EventHandler
	public void onEntityDeathEvent(EntityDeathEvent event) {
		System.out.println("Drops: " + event.getDrops());
	}

	public void onEntityDamageEvent(EntityDeathEvent event) {
		System.out.println("Entity damaged: " + event.getEntityType());
	}

	public void useCommands() {
		getCommand("print_entities").setExecutor(new PrintEntitiesCommand());
	}

	private static Entity createEntity(String entityName) {
		Location entityLocation = new Location(Bukkit.getWorld("world"), 0, 0, 0);

		// EntityType.ZOMBIE, EntityType.PIG, etc...
		return Bukkit.getWorld("world").spawnEntity(entityLocation, EntityType.valueOf(entityName.toUpperCase()));
	}

}
