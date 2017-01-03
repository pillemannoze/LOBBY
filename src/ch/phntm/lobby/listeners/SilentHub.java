package ch.phntm.lobby.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import ch.phntm.lobby.Lobby;

public class SilentHub implements Listener {
	
	@EventHandler
	public void on(PlayerInteractEvent e) {
		Player p = e.getPlayer();
	
		if (((e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (e.getAction().equals(Action.RIGHT_CLICK_AIR))) && 
			    (p.getItemInHand().getItemMeta().getDisplayName().equals("§5Silent-Hub §7(Rechtsklick)"))) {
			e.setCancelled(true);
			if(!Lobby.SL.contains(p.getName())){
				Lobby.SL.add(p.getName());
				for (Player all : Bukkit.getOnlinePlayers()) {
					all.hidePlayer(p);
					p.hidePlayer(all);
				}
				
				p.sendMessage(Lobby.prefix + "Du hast die §6Silent-Hub §7betreten.");
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
				p.closeInventory();
			} else if(Lobby.SL.contains(p.getName())) {
				
				Lobby.SL.remove(p.getName());
				for (Player all : Bukkit.getOnlinePlayers()) {
					all.showPlayer(p);
					p.showPlayer(all);
				}
				
				p.sendMessage(Lobby.prefix + "Du hast die §6Silent-Hub §7verlassen.");
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
				p.closeInventory();
			}
		}
	
	}
}
