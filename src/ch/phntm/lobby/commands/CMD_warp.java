package ch.phntm.lobby.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ch.phntm.lobby.Lobby;

public class CMD_warp implements CommandExecutor {
	private Lobby plugin;
	
	 public CMD_warp(Lobby Lobby) {
		this.plugin = Lobby;
	}
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		Player p = (Player)s;
		
		if(this.plugin.getConfig().get(args[0]) != null) {
			
			Location loc = p.getLocation();
			loc.setX(this.plugin.getConfig().getDouble(args[0] + ".x"));
		    loc.setY(this.plugin.getConfig().getDouble(args[0] + ".y"));
		    loc.setZ(this.plugin.getConfig().getDouble(args[0] + ".z"));
		    World world = Bukkit.getServer().getWorld(this.plugin.getConfig().getString(args[0] + ".world"));
		    loc.setWorld(world);
		    loc.setYaw((float)this.plugin.getConfig().getLong(args[0] + ".yaw"));
		    loc.setPitch((float)this.plugin.getConfig().getLong(args[0] + ".pitch"));
		     if (!loc.getBlock().getChunk().isLoaded()) {
		        loc.getBlock().getChunk().load();
		      }
		     
		      p.teleport(loc);
		      
		      this.plugin.saveConfig();

			
		}
		return true;
	}

}
