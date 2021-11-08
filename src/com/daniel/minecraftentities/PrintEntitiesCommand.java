package com.daniel.minecraftentities;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class PrintEntitiesCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// console only cmd
		if (sender instanceof Player) {
			return false;
		}

		printEntityTypes();

		return false;

	}

	private static void printEntityTypes() {
		for (EntityType type : EntityType.values()) {
			System.out.println(type);
		}
	}
}