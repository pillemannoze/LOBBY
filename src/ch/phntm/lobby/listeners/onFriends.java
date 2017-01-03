package ch.phntm.lobby.listeners;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import ch.phntm.lobby.methodes.TitlesAPI;

public class onFriends implements Listener{ 
	
	@EventHandler
	public void on(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		if (((e.getAction() == Action.RIGHT_CLICK_BLOCK ? 1 : 0) | (e.getAction() == Action.RIGHT_CLICK_AIR ? 1 : 0)) != 0)
			
			try{
		    if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Freunde §7(Kommt Bald)")) {
		    	TitlesAPI.sendActionBar(p, "§cFunktion in Arbeit!");
		    	p.playSound(p.getLocation(), Sound.ANVIL_USE, 1.0F, 1.0F);
		    	
		    }
	}catch (Exception e2) {
		// TODO: handle exception
		}
	
	}
}
