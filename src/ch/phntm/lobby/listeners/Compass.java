package ch.phntm.lobby.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Compass implements Listener{ 
	
	@EventHandler
	public void onClick(PlayerInteractEvent event){
	  if (((event.getAction() == Action.RIGHT_CLICK_BLOCK ? 1 : 0) | (event.getAction() == Action.RIGHT_CLICK_AIR ? 1 : 0)) != 0)
	    try {
	      if (event.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Teleporter §7(Rechtsklick)")){
	    	  final Inventory inv = Bukkit.createInventory(null, 45, "§6Teleporter");
	    	  
	    	  
	    	  final ItemStack Spawn = new ItemStack(Material.NETHER_STAR);
	    	  ItemMeta SpawnMeta = Spawn.getItemMeta();
	    	  SpawnMeta.setDisplayName("§6Spawn");
	    	  Spawn.setItemMeta(SpawnMeta);
	    	  
	    	  
	    	  final ItemStack Community = new ItemStack(Material.DIAMOND_CHESTPLATE);
	    	  ItemMeta CommunityMeta = Community.getItemMeta();
	    	  CommunityMeta.setDisplayName("§cCommunity §7(Kommt Bald)");
	    	  Community.setItemMeta(CommunityMeta);
	    	  
	    	  final ItemStack Skywars = new ItemStack(Material.GRASS);
	    	  ItemMeta SkywarsMeta = Skywars.getItemMeta();
	    	  SkywarsMeta.setDisplayName("§aSkyWars");
	    	  Skywars.setItemMeta(SkywarsMeta);
	    	  
	    	  final ItemStack Bedwars = new ItemStack(Material.BED);
	    	  ItemMeta BedwarsMeta = Bedwars.getItemMeta();
	    	  BedwarsMeta.setDisplayName("§eBedWars");
	    	  Bedwars.setItemMeta(BedwarsMeta);
	    	  
	    	  final ItemStack KnockBack = new ItemStack(Material.STICK);
	    	  ItemMeta KnockBackMeta = KnockBack.getItemMeta();
	    	  KnockBackMeta.addEnchant(Enchantment.KNOCKBACK, 1, true);
	    	  KnockBackMeta.setLore(null);
	    	  KnockBackMeta.setDisplayName("§3KnockBack");
	    	  KnockBack.setItemMeta(KnockBackMeta);
	    	  
	    	  final ItemStack QSG = new ItemStack(Material.IRON_SWORD);
	    	  ItemMeta QSGMeta = QSG.getItemMeta();
	    	  QSGMeta.setDisplayName("§9QuickSurvivalGames");
	    	  QSG.setItemMeta(QSGMeta);
	    	  
	    	  final ItemStack Glas = new ItemStack(Material.STAINED_GLASS_PANE);
	    	  Glas.setDurability((short) 7);
	    	  ItemMeta GlasMeta = Glas.getItemMeta();  
	    	  GlasMeta.setDisplayName(" ");
	    	  Glas.setItemMeta(GlasMeta);
	    	  
	    	  final ItemStack Jump = new ItemStack(Material.LEATHER_BOOTS);
	    	  LeatherArmorMeta JumpMeta = (LeatherArmorMeta)Jump.getItemMeta();
	    	  JumpMeta.setColor(org.bukkit.Color.ORANGE);
	    	  JumpMeta.setDisplayName("§6Jump");
	    	  Jump.setItemMeta(JumpMeta);
	    	  
	    	  inv.setItem(4, Community);
	    	  inv.setItem(11, Skywars);
	    	  inv.setItem(15, Bedwars);
	    	  inv.setItem(29, KnockBack);
	    	  inv.setItem(33, QSG);
	    	  inv.setItem(40, Jump);
	    	  inv.setItem(22, Spawn);
	    	  
	    	  
	    	  
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
				inv.setItem(13, Glas);
				inv.setItem(14, Glas);
				inv.setItem(16, Glas);
				inv.setItem(17, Glas);
				inv.setItem(18, Glas);
				inv.setItem(19, Glas);
				inv.setItem(20, Glas);
				inv.setItem(21, Glas);
				inv.setItem(23, Glas);
				inv.setItem(24, Glas);
				inv.setItem(25, Glas);
				inv.setItem(26, Glas);
				inv.setItem(27, Glas);
				inv.setItem(28, Glas);
				inv.setItem(30, Glas);
				inv.setItem(31, Glas);
				inv.setItem(32, Glas);
				inv.setItem(34, Glas);
				inv.setItem(35, Glas);
				inv.setItem(36, Glas);
				inv.setItem(37, Glas);
				inv.setItem(38, Glas);
				inv.setItem(39, Glas);
				inv.setItem(41, Glas);
				inv.setItem(42, Glas);
				inv.setItem(43, Glas);
				inv.setItem(44, Glas);

	    	  
	    	  
	    	  event.getPlayer().openInventory(inv);
	    	  
	    	  event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
	    	  
	    	 
	    	  
	    	  
	    	  
	    }
	      
	    }catch (Exception localException) {
	    	
	    }
	  
	  }
	
	@EventHandler
	public void onInteract(InventoryClickEvent e) {
		Player p = (Player)e.getWhoClicked();
		
		if(e.getInventory().getName().equalsIgnoreCase("§6Telporter")) {
			e.setCancelled(true);
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Spawn")) {
				p.performCommand("warp Spawn");
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
			}
		} catch (Exception localException) {
			
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cCommunity §7(Kommt Bald)")) {
//				p.performCommand("warp Community");
//				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
			}
		} catch (Exception localException) {
			
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aSkyWars")) {
				p.performCommand("warp SkyWars");
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
			}
		} catch (Exception localException) {
			
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eBedWars")) {
				p.performCommand("warp BedWars");
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
			}
		} catch (Exception localException) {
			
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3KnockBack")) {
				p.performCommand("warp KnockBack");
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
			}
		} catch (Exception localException) {
			
		}
		
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9QuickSurvivalGames")) {
//				p.performCommand("warp Spawn");
//				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
			}
		} catch (Exception localException) {
			
		}
		
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Jump")) {
				p.performCommand("warp Jump");
				
			}
		} catch (Exception localException) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


