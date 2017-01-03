package ch.phntm.lobby.listeners;


import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import ch.phntm.lobby.Lobby;
import ch.phntm.lobby.methodes.Items;

public class onNick implements Listener {
	
	@EventHandler
	public void on(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eNick §7(Rechtsklick)")) {
			p.sendMessage(Lobby.prefix + "§cERROR §7» §cNick.java§7:§c23");
			p.sendMessage(Lobby.prefix + "§7Bitte Kontaktiere §6Phntm §7in Skype.");
			p.getInventory().remove(e.getItem());
			p.playSound(p.getLocation(), Sound.WITHER_HURT, 1.0F, 1.0F);
			p.getInventory().setItem(3, Items.createItem(Material.BARRIER, 1, 0, "§cError"));
		}
	}

}
