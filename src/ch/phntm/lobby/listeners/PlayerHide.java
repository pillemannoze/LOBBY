package ch.phntm.lobby.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import ch.phntm.lobby.Lobby;
import ch.phntm.lobby.methodes.Items;

public class PlayerHide implements Listener{
	
	@EventHandler
	public void on(PlayerInteractEvent e){
		
		if (((e.getAction() == Action.RIGHT_CLICK_BLOCK ? 1 : 0) | (e.getAction() == Action.RIGHT_CLICK_AIR ? 1 : 0)) != 0)
			
		try{
	    if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cSichtbarkeit §7(Rechtsklick)")) {
	    final Player p = e.getPlayer();
	    e.setCancelled(true);
	    final Inventory inv = Bukkit.createInventory(null, 27, "§6Spieler-Sichtbarkeit");
	    
	    final ItemStack Glas = new ItemStack(Material.STAINED_GLASS_PANE);
  	  	Glas.setDurability((short) 7);
  	  	ItemMeta GlasMeta = Glas.getItemMeta();  
  	  	GlasMeta.setDisplayName(" ");
  	  	Glas.setItemMeta(GlasMeta);
  	  	
  	  	
	    
	    inv.setItem(11, Items.IDStack("§aAlle Spieler", 351, "§7Lasse §aalle §7Spieler anzeigen", 1, 10));
	    inv.setItem(13, Items.IDStack("§cKeine Spieler", 351, "§7Lasse §ckeine §7Spieler anzeigen", 1, 1));
	    inv.setItem(15, Items.IDStack("§5YouTuber §7& §cTeammitglieder", 351, "§7Lasse nur §5YouTuber §7& §cTeammitglieder §7anzeigen", 1, 5));
	    
	    
	    inv.setItem(0, Glas);
		inv.setItem(1, Glas);
		inv.setItem(2, Glas);
		inv.setItem(3, Glas);
		inv.setItem(5, Glas);
		inv.setItem(6, Glas);
		inv.setItem(7, Glas);
		inv.setItem(8, Glas);
		inv.setItem(9, Glas);
		inv.setItem(10, Glas);
		inv.setItem(12, Glas);
		inv.setItem(14, Glas);
		inv.setItem(16, Glas);
		inv.setItem(17, Glas);
		inv.setItem(18, Glas);
		inv.setItem(19, Glas);
		inv.setItem(20, Glas);
		inv.setItem(21, Glas);
		inv.setItem(22, Glas);
		inv.setItem(23, Glas);
		inv.setItem(24, Glas);
		inv.setItem(25, Glas);
		inv.setItem(26, Glas);
		
		p.openInventory(inv);
		p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
	    
	  }
	  
	} catch (Exception e2) {
		
	}
}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player)e.getWhoClicked();
		if(e.getInventory().getName().equalsIgnoreCase("§6Spieler-Sichtbarkeit")) {
			e.setCancelled(true);
			
			ItemStack item1 = e.getCurrentItem();
			if(item1.getItemMeta().getDisplayName().equalsIgnoreCase("§aAlle Spieler")) {
				p.closeInventory();
				
				for (Player all : Bukkit.getOnlinePlayers()) {
					p.showPlayer(all);
				}
					
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
				p.sendMessage(Lobby.prefix + "Du kannst nun §aalle §7Spieler sehen.");
			}
			
			if(item1.getItemMeta().getDisplayName().equalsIgnoreCase("§cKeine Spieler")) {
				for (Player all : Bukkit.getOnlinePlayers()) {
					p.hidePlayer(all);
				}
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
				p.sendMessage(Lobby.prefix + "Du kannst nun §ckeine §7Spieler sehen.");
			}
			
			if(item1.getItemMeta().getDisplayName().equalsIgnoreCase("§5YouTuber §7& §cTeammitglieder")) {
				
				for (Player all : Bukkit.getOnlinePlayers()) {
					if(!all.hasPermission("krayze.youtuber")) {
						p.hidePlayer(all);
					}
				}
				
				for (Player all : Bukkit.getOnlinePlayers()) {
					if(all.hasPermission("krayze.youtuber")) {
						p.showPlayer(all);
					}
				}
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
				p.sendMessage(Lobby.prefix + "Du kannst nun nur §5Youtuber §7& §cTeammitglieder§7 sehen.");
			}
		}
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
