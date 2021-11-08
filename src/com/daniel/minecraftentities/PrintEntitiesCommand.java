package com.daniel.minecraftentities;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class PrintEntitiesCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Boolean isPlayer = sender instanceof Player;

		for (EntityType type : EntityType.values()) {
			if (isPlayer) {
				sender.sendMessage(type + "");
			} else {
				System.out.println(type);
			}
		}

		return false;
	}

}