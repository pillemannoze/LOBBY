package ch.phntm.lobby.listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Color;
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
import org.bukkit.inventory.meta.LeatherArmorMeta;


import ch.phntm.lobby.Lobby;
import ch.phntm.lobby.methodes.Items;
import net.krayze.system.coinsapi.CoinsAPI;

public class onGadgets implements Listener {
	
	@EventHandler
	public void on(PlayerInteractEvent e) {
		
		if (((e.getAction() == Action.RIGHT_CLICK_BLOCK ? 1 : 0) | (e.getAction() == Action.RIGHT_CLICK_AIR ? 1 : 0)) != 0)
			
			try{
		    if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aGadgets §7(Rechtsklick)")) {
		    final Player p = e.getPlayer();
		    e.setCancelled(true);
		    final Inventory inv = Bukkit.createInventory(null, 27, "§aGadgets");
		    
		    
		    final ItemStack Glas = new ItemStack(Material.STAINED_GLASS_PANE);
	  	  	Glas.setDurability((short) 7);
	  	  	ItemMeta GlasMeta = Glas.getItemMeta();  
	  	  	GlasMeta.setDisplayName(" ");
	  	  	Glas.setItemMeta(GlasMeta);
		    
		    inv.setItem(11, Items.createLeatherBoots("§6Schuhe", Color.ORANGE, ""));
		    inv.setItem(13, Items.createItem(Material.IRON_CHESTPLATE, 1, 0, "§eGarderobe"));
		    inv.setItem(15, Items.createItem(Material.EGG, 1, 0, "§2Haustiere"));
		    
		    		    
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
	}catch (Exception e2) {
				
		}
	}
	
	// GARDEROBE
	public void on1(InventoryClickEvent e) {
		Player p = (Player)e.getWhoClicked();
	
		if(e.getInventory().getName().equalsIgnoreCase("§aGadgets")) {
				e.setCancelled(true);
				try{
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eGarderobe")) {
					final Inventory inv1 = Bukkit.createInventory(null, 18, "§eGarderobe");
					

					
					
//					inv1.setItem(0, Items.createItem(Material.SKULL, 1, 0, "§6Heads"));
//					inv1.setItem(2, Items.createHeadItem("KerexHD", "§eKerexHD"));
//					inv1.setItem(3, Items.createHeadItem("dazzon", "§6dazzon"));
//					
//					
//					inv1.setItem(9, Items.createLeatherChest("§6Rüstung", Color.ORANGE, ""));
//					inv1.setItem(11, Items.createLeatherChest("§cRote-Rüstung", Color.RED, ""));
//					inv1.setItem(13, Items.createLeatherChest("§1Blaue-Rüstung", Color.BLUE, ""));
					
					
					p.openInventory(inv1);
				} else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§2Haustiere")) {
					
				}
				
			}catch (Exception exe) {
				// TODO: handle exception
			}
			}
		
		
	}
	// BOOTS
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@EventHandler
	public void on(InventoryClickEvent  e) {
		Player p = (Player)e.getWhoClicked();
		
		if(e.getInventory().getName().equalsIgnoreCase("§aGadgets")) {
			e.setCancelled(true);
			
			try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Schuhe")) {
					Inventory inv = Bukkit.createInventory(null, 18, "§6Boots §7- §eCoins §7» §a" + CoinsAPI.getCoins(p) );

				    ItemStack love = new ItemStack(Material.LEATHER_BOOTS);
				    LeatherArmorMeta lovemeta = (LeatherArmorMeta)love.getItemMeta();
				    lovemeta.setColor(Color.fromRGB(255, 0, 0));
				    lovemeta.setDisplayName("§cLoveBoots");
				    String l1 = "§6Coins §8»";
				    String l2 = "30";
				    
				    List lore = new ArrayList<>();
				    lore.add(l1);
				    lore.add(l2);
				    
				    lovemeta.setLore(lore);
				    
				    love.setItemMeta(lovemeta);

				    inv.setItem(2, love);

				    p.openInventory(inv);

				    ItemStack flame = new ItemStack(Material.LEATHER_BOOTS);
				    LeatherArmorMeta flamemeta = (LeatherArmorMeta)flame.getItemMeta();
				    flamemeta.setColor(Color.fromRGB(255, 205, 0));
				    flamemeta.setDisplayName("§6FlameBoots");
				    flame.setItemMeta(flamemeta);

				    inv.setItem(0, flame);

				    p.openInventory(inv);

				    ItemStack happy = new ItemStack(Material.LEATHER_BOOTS);
				    LeatherArmorMeta happymeta = (LeatherArmorMeta)happy.getItemMeta();
				    happymeta.setColor(Color.fromRGB(0, 255, 0));
				    happymeta.setDisplayName("§aHappyBoots");
				    happy.setItemMeta(happymeta);

				    inv.setItem(3, happy);

				    p.openInventory(inv);

				    ItemStack end = new ItemStack(Material.LEATHER_BOOTS);
				    LeatherArmorMeta endmeta = (LeatherArmorMeta)end.getItemMeta();
				    endmeta.setColor(Color.fromRGB(166, 166, 166));
				    endmeta.setDisplayName("§eNoteBoots");
				    end.setItemMeta(endmeta);

				    inv.setItem(6, end);

				    p.openInventory(inv);

				    ItemStack was = new ItemStack(Material.LEATHER_BOOTS);
				    LeatherArmorMeta wasmeta = (LeatherArmorMeta)was.getItemMeta();
				    wasmeta.setColor(Color.fromRGB(0, 0, 250));
				    wasmeta.setDisplayName("§1WasserBoots");
				    was.setItemMeta(wasmeta);

				    inv.setItem(8, was);

				    p.openInventory(inv);

				    ItemStack n = new ItemStack(Material.LEATHER_BOOTS);
				    LeatherArmorMeta nmeta = (LeatherArmorMeta)n.getItemMeta();
				    nmeta.setColor(Color.fromRGB(0, 0, 0));
				    nmeta.setDisplayName("§4Boots entfernen");
				    n.setItemMeta(nmeta);

				    inv.setItem(13, n);

				    p.openInventory(inv);

				    ItemStack e1 = new ItemStack(Material.LEATHER_BOOTS);
				    LeatherArmorMeta emeta = (LeatherArmorMeta)e1.getItemMeta();
				    emeta.setColor(Color.fromRGB(154, 50, 205));
				    emeta.setDisplayName("§dEndBoots");
				    e1.setItemMeta(emeta);

				    inv.setItem(1, e1);

				    p.openInventory(inv);

				    ItemStack i = new ItemStack(Material.LEATHER_BOOTS);
				    LeatherArmorMeta imeta = (LeatherArmorMeta)i.getItemMeta();
				    imeta.setColor(Color.fromRGB(255, 255, 255));
				    imeta.setDisplayName("§bCloudBoots");
				    i.setItemMeta(imeta);

				    inv.setItem(7, i);

				    p.openInventory(inv);

				    ItemStack g = new ItemStack(Material.LEATHER_BOOTS);
				    LeatherArmorMeta gmeta = (LeatherArmorMeta)g.getItemMeta();
				    gmeta.setColor(Color.fromRGB(100, 53, 0));
				    gmeta.setDisplayName("§fAngryBoots");
				    g.setItemMeta(gmeta);

				    inv.setItem(5, g);

				    p.openInventory(inv);

				    ItemStack ex = new ItemStack(Material.LEATHER_BOOTS);
				    LeatherArmorMeta exmeta = (LeatherArmorMeta)ex.getItemMeta();
				    emeta.setColor(Color.fromRGB(180, 4, 4));
				    exmeta.setDisplayName("§4T§cN§4T§7Boots");
				    ex.setItemMeta(exmeta);
				    
			    	  final ItemStack Glas = new ItemStack(Material.STAINED_GLASS_PANE);
			    	  Glas.setDurability((short) 7);
			    	  ItemMeta GlasMeta = Glas.getItemMeta();  
			    	  GlasMeta.setDisplayName(" ");
			    	  Glas.setItemMeta(GlasMeta);
			    	  
			    	  inv.setItem(9, Glas);
			    	  inv.setItem(10, Glas);
			    	  inv.setItem(11, Glas);
			    	  inv.setItem(12, Glas);
			    	  inv.setItem(14, Glas);
			    	  inv.setItem(15, Glas);
			    	  inv.setItem(16, Glas);

				    inv.setItem(4, ex);

				    p.openInventory(inv);
				    p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				    
				    
				    ItemStack stack = e.getCurrentItem();
				    int cost = Integer.valueOf((String)stack.getItemMeta().getLore().get(1)).intValue();
				    if (CoinsAPI.getCoins(p) >= cost)
				    {
				      List list = new ArrayList<>();
				      list.add("§aGekauft");
				      stack.getItemMeta().setLore(list);

				      p.getInventory().addItem(new ItemStack[] { stack });
				      CoinsAPI.removeCoins(p, cost);

				      p.closeInventory();
				      
				    }

				    
				    } else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eGarderobe")) {
				    	Inventory inv1 = Bukkit.createInventory(null, 18, "§eGarderobe §7- §eCoins §7» §a0");
				    	
				    	
				    	final ItemStack Glas = new ItemStack(Material.STAINED_GLASS_PANE);
				    	  Glas.setDurability((short) 7);
				    	  ItemMeta GlasMeta = Glas.getItemMeta();  
				    	  GlasMeta.setDisplayName(" ");
				    	  Glas.setItemMeta(GlasMeta);

				    	
				    	inv1.setItem(0, Items.createItem(Material.SKULL_ITEM, 1, 3, "§6Heads"));
				    	inv1.setItem(1, Glas);
						inv1.setItem(2, Items.createHeadItem("KerexHD", "§6KerexHD"));
						inv1.setItem(3, Items.createHeadItem("dazzon", "§6dazzon"));
						inv1.setItem(4, Items.createHeadItem("HerrKnackwurst", "§6HerrKnackwurst"));
						inv1.setItem(5, Items.createHeadItem("Sloggy_Whopper", "§6Burger"));
						inv1.setItem(6, Items.createHeadItem("LS_007", "§cSchweizer §7-§6 Schokolade"));

						inv1.setItem(7, Items.createHeadItem("LeftShark", "§6Hai"));
						inv1.setItem(8, Items.createItem(Material.BARRIER, 1, 0, "§cHead entfernen"));
						
						
						inv1.setItem(9, Items.createLeatherChest("§6Rüstung", Color.ORANGE, ""));
						inv1.setItem(10, Glas);
						inv1.setItem(11, Items.createLeatherChest("§cRote-Rüstung", Color.RED, ""));
						inv1.setItem(12, Items.createLeatherChest("§1Blaue-Rüstung", Color.BLUE, ""));
						inv1.setItem(13, Items.createLeatherChest("§aGrün-Rüstung", Color.GREEN, ""));
						inv1.setItem(14, Items.createLeatherChest("§dPinke-Rüstung", Color.PURPLE, ""));
						inv1.setItem(15, Items.createLeatherChest("§bTürkise-Rüstung", Color.AQUA, ""));

						inv1.setItem(16, Items.createLeatherChest("§fWeisse-Rüstung", Color.WHITE, ""));
						inv1.setItem(17, Items.createItem(Material.BARRIER, 1, 0, "§cRüstung entfernen"));
						
						p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				    	p.openInventory(inv1);
				    	
				    } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§2Haustiere")) {
				    	Inventory inv = Bukkit.createInventory(null, 18, "§2Haustiere §7- §eCoins §7» §a0");
				    	
				    	inv.setItem(0, Items.IDStack("§dMiss Piggy", 383, "", 1, 90));
				    	inv.setItem(1, Items.IDStack("§eOcelot", 383, "", 1, 98));
				    	inv.setItem(2, Items.IDStack("§fSchneehase", 383, "", 1, 101));
				    	inv.setItem(3, Items.IDStack("§7Brüchiges Skelett", 383, "", 1, 51));
				    	inv.setItem(1, Items.IDStack("§cSpinne an der Wand", 383, "", 1, 52));
				    }
				  }
				
				 catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	// BOOTS SELECT
	@EventHandler
	public void onI(InventoryClickEvent e) {
		Player p = (Player)e.getWhoClicked();
	
		if(e.getClickedInventory().getName().equalsIgnoreCase("§6Boots §7- §eCoins §7» §a0")) {
	    	try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cLoveBoots")){
					if(p.hasPermission("krayze.BOOTSlove")) {
						
					    ItemStack flame = new ItemStack(Material.LEATHER_BOOTS);
					    LeatherArmorMeta flamemeta = (LeatherArmorMeta)flame.getItemMeta();
					    flamemeta.setColor(Color.fromRGB(255, 0, 0));
					    flamemeta.setDisplayName("§cLoveBoots");
					    flame.setItemMeta(flamemeta);
					    
					p.getInventory().setBoots(flame);
					p.closeInventory();
					p.sendMessage(Lobby.prefix + "Du hast die §cLoveBoots §7ausgewählt.");
					p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 1.0F);
					} else {
						p.sendMessage(Lobby.noperm);
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
	    	
	    	try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4Boots entfernen")){
					if(p.hasPermission("krayze.BOOTS")) {
						
					    
					    
					p.getInventory().setBoots(null);
					p.closeInventory();
					p.sendMessage(Lobby.prefix + "Du hast die §4keine §7Boots ausgewählt.");
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
					} else {
						p.sendMessage(Lobby.noperm);
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
	    	
	    	try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6FlameBoots")){
					if(p.hasPermission("krayze.BOOTSflame")) {
						
					    ItemStack flame = new ItemStack(Material.LEATHER_BOOTS);
					    LeatherArmorMeta flamemeta = (LeatherArmorMeta)flame.getItemMeta();
					    flamemeta.setColor(Color.fromRGB(255, 205, 0));
					    flamemeta.setDisplayName("§6FlameBoots");
					    flame.setItemMeta(flamemeta);	
					    
					   
					p.getInventory().setBoots(flame);
					p.closeInventory();
					p.sendMessage(Lobby.prefix + "Du hast die §6FlameBoots§7 ausgewählt.");
					p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1.0F, 1.0F);
					} else {
						p.sendMessage(Lobby.noperm);
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
	    	
	    	try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aHappyBoots")){
					if(p.hasPermission("krayze.BOOTShappy")) {
						
					    ItemStack happy = new ItemStack(Material.LEATHER_BOOTS);
					    LeatherArmorMeta happymeta = (LeatherArmorMeta)happy.getItemMeta();
					    happymeta.setColor(Color.fromRGB(0, 255, 0));
					    happymeta.setDisplayName("§aHappyBoots");
					    happy.setItemMeta(happymeta);
					    
					   
					p.getInventory().setBoots(happy);
					p.closeInventory();
					p.sendMessage(Lobby.prefix + "Du hast die §aHappyBoots§7 ausgewählt.");
					p.playSound(p.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
					} else {
						p.sendMessage(Lobby.noperm);
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
	    	
	    	try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eNoteBoots")){
					if(p.hasPermission("krayze.BOOTSnote")) {
						

					    ItemStack end = new ItemStack(Material.LEATHER_BOOTS);
					    LeatherArmorMeta endmeta = (LeatherArmorMeta)end.getItemMeta();
					    endmeta.setColor(Color.fromRGB(166, 166, 166));
					    endmeta.setDisplayName("§eNoteBoots");
					    end.setItemMeta(endmeta);
					    
					   
					p.getInventory().setBoots(end);
					p.closeInventory();
					p.sendMessage(Lobby.prefix + "Du hast die §eNoteBoots§7 ausgewählt.");
					p.playSound(p.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
					} else {
						p.sendMessage(Lobby.noperm);
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
	    	
	    	try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§1WasserBoots")){
					if(p.hasPermission("krayze.BOOTSwasser")) {
						

					    ItemStack was = new ItemStack(Material.LEATHER_BOOTS);
					    LeatherArmorMeta wasmeta = (LeatherArmorMeta)was.getItemMeta();
					    wasmeta.setColor(Color.fromRGB(0, 0, 250));
					    wasmeta.setDisplayName("§1WasserBoots");
					    was.setItemMeta(wasmeta);
					    
					   
					p.getInventory().setBoots(was);
					p.closeInventory();
					p.sendMessage(Lobby.prefix + "Du hast die §1WasserBoots§7 ausgewählt.");
					p.playSound(p.getLocation(), Sound.WATER, 1.0F, 1.0F);
					} else {
						p.sendMessage(Lobby.noperm);
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
	    	
	    	try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§dEndBoots")){
					if(p.hasPermission("krayze.BOOTSend")) {
						

					    ItemStack e1 = new ItemStack(Material.LEATHER_BOOTS);
					    LeatherArmorMeta emeta = (LeatherArmorMeta)e1.getItemMeta();
					    emeta.setColor(Color.fromRGB(154, 50, 205));
					    emeta.setDisplayName("§dEndBoots");
					    e1.setItemMeta(emeta);
					    
					   
					p.getInventory().setBoots(e1);
					p.closeInventory();
					p.sendMessage(Lobby.prefix + "Du hast die §dEndBoots§7 ausgewählt.");
					p.playSound(p.getLocation(), Sound.ENDERDRAGON_GROWL, 1.0F, 1.0F);
					} else {
						p.sendMessage(Lobby.noperm);
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
	    	
	    	try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bCloudBoots")){
					if(p.hasPermission("krayze.BOOTSnote")) {
						

					    ItemStack i = new ItemStack(Material.LEATHER_BOOTS);
					    LeatherArmorMeta imeta = (LeatherArmorMeta)i.getItemMeta();
					    imeta.setColor(Color.fromRGB(255, 255, 255));
					    imeta.setDisplayName("§bCloudBoots");
					    i.setItemMeta(imeta);
					   
					p.getInventory().setBoots(i);
					p.closeInventory();
					p.sendMessage(Lobby.prefix + "Du hast die §bCloudBoots§7 ausgewählt.");
					p.playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
					} else {
						p.sendMessage(Lobby.noperm);
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
	    	
	    	try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fAngryBoots")){
					if(p.hasPermission("krayze.BOOTSangry")) {
						

					    ItemStack g = new ItemStack(Material.LEATHER_BOOTS);
					    LeatherArmorMeta gmeta = (LeatherArmorMeta)g.getItemMeta();
					    gmeta.setColor(Color.fromRGB(100, 53, 0));
					    gmeta.setDisplayName("§fAngryBoots");
					    g.setItemMeta(gmeta);
					  
					p.getInventory().setBoots(g);
					p.closeInventory();
					p.sendMessage(Lobby.prefix + "Du hast die §fAngryBoots§7 ausgewählt.");
					p.playSound(p.getLocation(), Sound.VILLAGER_HIT, 1.0F, 1.0F);
					} else {
						p.sendMessage(Lobby.noperm);
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
	    	
	    	try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4T§cN§4T§7Boots")){
					if(p.hasPermission("krayze.BOOTStnt")) {
						

					    ItemStack ex = new ItemStack(Material.LEATHER_BOOTS);
					    LeatherArmorMeta exmeta = (LeatherArmorMeta)ex.getItemMeta();
					    exmeta.setColor(Color.fromRGB(180, 4, 4));
					    exmeta.setDisplayName("§4T§cN§4T§7Boots");
					    ex.setItemMeta(exmeta);
					  
					p.getInventory().setBoots(ex);
					p.closeInventory();
					p.sendMessage(Lobby.prefix + "Du hast die §4T§cN§4T§7Boots§7 ausgewählt.");
					p.playSound(p.getLocation(), Sound.EXPLODE, 1.0F, 1.0F);
					} else {
						p.sendMessage(Lobby.noperm);
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		} else if(e.getClickedInventory().getName().equalsIgnoreCase("§eGarderobe §7- §eCoins §7» §a0")) {
			
//	    	inv1.setItem(0, Items.createItem(Material.SKULL_ITEM, 1, 3, "§6Heads"));
//	    	inv1.setItem(1, Glas);
//			inv1.setItem(2, Items.createHeadItem("KerexHD", "§6KerexHD"));
//			inv1.setItem(3, Items.createHeadItem("dazzon", "§6dazzon"));
//			inv1.setItem(4, Items.createHeadItem("HerrKnackwurst", "§6HerrKnackwurst"));
//			inv1.setItem(5, Items.createHeadItem("Sloggy_Whopper", "§6Burger"));
//			inv1.setItem(6, Items.createHeadItem("LS_007", "§cSchweizer §7-§6 Schokolade"));
//			inv1.setItem(7, Items.createHeadItem("ExtrayeaMC", "§6CommandBlock"));
//			inv1.setItem(8, Items.createHeadItem("LeftShark", "§6Hai"));
//			
//			
//			inv1.setItem(9, Items.createLeatherChest("§6Rüstung", Color.ORANGE, ""));
//			inv1.setItem(10, Glas);
//			inv1.setItem(11, Items.createLeatherChest("§cRote-Rüstung", Color.RED, ""));
//			inv1.setItem(12, Items.createLeatherChest("§1Blaue-Rüstung", Color.BLUE, ""));
//			inv1.setItem(13, Items.createLeatherChest("§aGrün-Rüstung", Color.GREEN, ""));
//			inv1.setItem(14, Items.createLeatherChest("§dPinke-Rüstung", Color.PURPLE, ""));
//			inv1.setItem(15, Items.createLeatherChest("§bTürkise-Rüstung", Color.AQUA, ""));
//			inv1.setItem(16, Items.createLeatherChest("§8Braune-Rüstung", Color.MAROON, ""));
//			inv1.setItem(17, Items.createLeatherChest("§fWeisse-Rüstung", Color.WHITE, ""));
			
			try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6KerexHD")){
					if(p.hasPermission("krayze.GARDEROBkerex")) {	   
					p.getInventory().setHelmet(Items.createHeadItem("KerexHD", "§6KerexHD"));
					p.closeInventory();
					p.sendMessage(Lobby.prefix + "Du hast den Kopf von §6KerexHD§7 ausgewählt.");
					p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
					} else {
						p.sendMessage(Lobby.noperm);
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			try {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6dazzon")){
					if(p.hasPermission("krayze.GARDEROBdazzon")) {	   
					p.getInventory().setHelmet(Items.createHeadItem("dazzon", "§6dazzon"));
					p.closeInventory();
					p.sendMessage(Lobby.prefix + "Du hast den Kopf von §6dazzon§7 ausgewählt.");
					p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
					} else {
						p.sendMessage(Lobby.noperm);
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6HerrKnackwurst")){
				if(p.hasPermission("krayze.GARDEROBknackwurst")) {	   
				p.getInventory().setHelmet(Items.createHeadItem("HerrKnackwurst", "§6HerrKnackwurst"));
				p.closeInventory();
				p.sendMessage(Lobby.prefix + "Du hast den Kopf von §6HerrKnackwurst§7 ausgewählt.");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				} else {
					p.sendMessage(Lobby.noperm);
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Burger")){
				if(p.hasPermission("krayze.GARDEROBknackwurst")) {	   
				p.getInventory().setHelmet(Items.createHeadItem("Sloggy_Whopper", "§6Burger"));
				p.closeInventory();
				p.sendMessage(Lobby.prefix + "Du bist nun ein §6Burger§7.");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				} else {
					p.sendMessage(Lobby.noperm);
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cSchweizer §7-§6 Schokolade")){
				if(p.hasPermission("krayze.GARDEROBknackwurst")) {	   
				p.getInventory().setHelmet(Items.createHeadItem("LS_007", "§cSchweizer §7-§6 Schokolade"));
				p.closeInventory();
				p.sendMessage(Lobby.prefix + "Du bist nun eine §cSchweizer §7-§6 Schokolade§7.");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				} else {
					p.sendMessage(Lobby.noperm);
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Hai")){
				if(p.hasPermission("krayze.GARDEROBknackwurst")) {	   
				p.getInventory().setHelmet(Items.createHeadItem("LeftShark", "§6Hai"));
				p.closeInventory();
				p.sendMessage(Lobby.prefix + "Du bist nun ein §6Hai§7.");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				} else {
					p.sendMessage(Lobby.noperm);
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cHead entfernen")){
				if(p.hasPermission("krayze.GARDEROBknackwurst")) {	   
				p.getInventory().setHelmet(null);
				p.closeInventory();
				p.sendMessage(Lobby.prefix + "Du bist nun §4keinen §7Head mehr.");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				} else {
					p.sendMessage(Lobby.noperm);
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
//		inv1.setItem(9, Items.createLeatherChest("§6Rüstung", Color.ORANGE, ""));
//		inv1.setItem(10, Glas);
//		inv1.setItem(11, Items.createLeatherChest("§cRote-Rüstung", Color.RED, ""));
//		inv1.setItem(12, Items.createLeatherChest("§1Blaue-Rüstung", Color.BLUE, ""));
//		inv1.setItem(13, Items.createLeatherChest("§aGrün-Rüstung", Color.GREEN, ""));
//		inv1.setItem(14, Items.createLeatherChest("§dPinke-Rüstung", Color.PURPLE, ""));
//		inv1.setItem(15, Items.createLeatherChest("§bTürkise-Rüstung", Color.AQUA, ""));
//		inv1.setItem(16, Items.createLeatherChest("§8Braune-Rüstung", Color.MAROON, ""));
//		inv1.setItem(17, Items.createLeatherChest("§fWeisse-Rüstung", Color.WHITE, ""));
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cRote-Rüstung")){
				if(p.hasPermission("krayze.GARDEROBknackwurst")) {	   
				p.getInventory().setChestplate(Items.createLeatherChest("§cRote-Rüstung", Color.RED, ""));
				p.getInventory().setLeggings(Items.createLeatherleggings("§cRote-Rüstung", Color.RED, ""));
				p.closeInventory();
				p.sendMessage(Lobby.prefix + "Du trägst jetzt die §cRote-Rüstung§7.");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				} else {
					p.sendMessage(Lobby.noperm);
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§1Blaue-Rüstung")){
				if(p.hasPermission("krayze.GARDEROBknackwurst")) {	   
				p.getInventory().setChestplate(Items.createLeatherChest("§1Blaue-Rüstung", Color.BLUE, ""));
				p.getInventory().setLeggings(Items.createLeatherleggings("§1Blaue-Rüstung", Color.BLUE, ""));
				p.closeInventory();
				p.sendMessage(Lobby.prefix + "Du trägst jetzt die §1Blaue-Rüstung§7.");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				} else {
					p.sendMessage(Lobby.noperm);
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aGrün-Rüstung")){
				if(p.hasPermission("krayze.GARDEROBknackwurst")) {	   
				p.getInventory().setChestplate(Items.createLeatherChest("§aGrün-Rüstung", Color.GREEN, ""));
				p.getInventory().setLeggings(Items.createLeatherleggings("§aGrün-Rüstung", Color.GREEN, ""));
				p.closeInventory();
				p.sendMessage(Lobby.prefix + "Du trägst jetzt die §aGrün-Rüstung§7.");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				} else {
					p.sendMessage(Lobby.noperm);
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§dPinke-Rüstung")){
				if(p.hasPermission("krayze.GARDEROBknackwurst")) {	   
				p.getInventory().setChestplate(Items.createLeatherChest("§dPinke-Rüstung", Color.PURPLE, ""));
				p.getInventory().setLeggings(Items.createLeatherleggings("§dPinke-Rüstung", Color.PURPLE, ""));
				p.closeInventory();
				p.sendMessage(Lobby.prefix + "Du trägst jetzt die §dPinke-Rüstung§7.");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				} else {
					p.sendMessage(Lobby.noperm);
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bTürkise-Rüstung")){
				if(p.hasPermission("krayze.GARDEROBknackwurst")) {	   
				p.getInventory().setChestplate(Items.createLeatherChest("§bTürkise-Rüstung", Color.AQUA, ""));
				p.getInventory().setLeggings(Items.createLeatherleggings("§bTürkise-Rüstung", Color.AQUA, ""));
				p.closeInventory();
				p.sendMessage(Lobby.prefix + "Du trägst jetzt die §bTürkise-Rüstung§7.");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				} else {
					p.sendMessage(Lobby.noperm);
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fWeisse-Rüstung")){
				if(p.hasPermission("krayze.GARDEROBknackwurst")) {	   
				p.getInventory().setChestplate(Items.createLeatherChest("§fWeisse-Rüstung", Color.WHITE, ""));
				p.getInventory().setLeggings(Items.createLeatherleggings("§fWeisse-Rüstung", Color.WHITE, ""));
				p.closeInventory();
				p.sendMessage(Lobby.prefix + "Du trägst jetzt die §fWeisse-Rüstung§7.");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				} else {
					p.sendMessage(Lobby.noperm);
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cRüstung entfernen")){
				if(p.hasPermission("krayze.GARDEROBknackwurst")) {	   
				p.getInventory().setChestplate(null);
				p.getInventory().setLeggings(null);
				p.closeInventory();
				p.sendMessage(Lobby.prefix + "Du trägst §ckeine §7Rüstung mehr.");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
				} else {
					p.sendMessage(Lobby.noperm);
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


