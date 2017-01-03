package ch.phntm.lobby.commands;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ch.phntm.lobby.Lobby;

public class CMD_setwarp implements CommandExecutor {
	
	private Lobby plugin;
	
	public CMD_setwarp(Lobby Lobby) {
		this.plugin = Lobby;
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player)sender;
		
		
		
		
		if(p.hasPermission("krayze.admin")) {
			if(args.length == 1) { // /setwarp <name>
				
				Location loc = p.getLocation();
				
				this.plugin.getConfig().set(args[0] + ".x", Double.valueOf(loc.getX()));
				this.plugin.getConfig().set(args[0] + ".y", Double.valueOf(loc.getY()));
				this.plugin.getConfig().set(args[0] + ".z", Double.valueOf(loc.getZ()));
				this.plugin.getConfig().set(args[0] + ".world", loc.getWorld().getName());
				this.plugin.getConfig().set(args[0] + ".yaw", Float.valueOf(loc.getYaw()));
				this.plugin.getConfig().set(args[0] + ".pitch", Float.valueOf(loc.getPitch()));
				p.sendMessage(Lobby.prefix + "§7Du hast den Warp §6" + args[0] +" §7gesetzt!");				
				p.playSound(p.getLocation(), Sound.ANVIL_USE, 1.0F, 1.0F);
				

			}
		}
		return true;
	}

}
