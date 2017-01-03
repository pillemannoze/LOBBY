package ch.phntm.lobby.listeners;

import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import ch.phntm.lobby.Lobby;
import ch.phntm.lobby.methodes.Items;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;



public class onJoin implements Listener {	
	private Lobby plugin;
	public onJoin(Lobby Lobby) {
		this.plugin = Lobby;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		final Player p = e.getPlayer();
		String name = p.getName();
		
		if(name.length() > 14) {
			  name = name.substring(0, 14);
		  }
		  
		  if(p.hasPermission("krayze.PREFIXowner")) {
			  p.setPlayerListName("§4Owner §8» §4" + name);
		  }else if(p.hasPermission("krayze.PREFIXadmin")) { 
			  p.setPlayerListName("§4Admin §8» §4" + name);  
		  }else if(p.hasPermission("krayze.PREFIXdeveloper")) { 
			  p.setPlayerListName("§bDev §8» §b" + name);  
		  }else if(p.hasPermission("krayze.PREFIXmoderator")) {
			  p.setPlayerListName("§cMod §8» §c" + name);
		  }else if(p.hasPermission("krayze.PREFIXsupporter")) {
			  p.setPlayerListName("§2Supp §8» §2" + name);
		  }else if(p.hasPermission("krayze.PREFIXyoutuber")) {
			  p.setPlayerListName("§5" + name);
		  }else if(p.hasPermission("krayze.PREFIXpremium")) {
			  p.setPlayerListName("§6" + name);
		  }else if(p.hasPermission("krayze.PREFIXbuild")) {
			  p.setPlayerListName("§eBuilder §8» §e" + name);
		  }else {
			  p.setPlayerListName("§7" + name);
		  }
		  
		  e.setJoinMessage("§2+ §7" + p.getDisplayName());
		  p.performCommand("warp Spawn");
		  p.setMaxHealth(1.0D);
		  p.setHealth(1.0D);
		  p.setFoodLevel(20);
		  p.getInventory().setArmorContents(null);
		  p.getInventory().clear();
		  p.performCommand("warp Spawn");
		  p.getInventory().setItem(0, Items.createItem(Material.COMPASS, 1, 0, "§6Teleporter §7(Rechtsklick)"));
		  p.getInventory().setItem(1, Items.createItem(Material.COAL, 1, 0, "§cSichtbarkeit §7(Rechtsklick)"));
		  p.getInventory().setItem(7, Items.createItem(Material.CHEST, 1, 0, "§aGadgets §7(Rechtsklick)"));
		  p.getInventory().setItem(8, Items.createHeadItem(p.getName(), "§6Freunde §7(Kommt Bald)"));
		  
		  sendTitle(p, "§7Willkommen", "§7auf §6Krayze§7.§6net");
		
		  if(p.hasPermission("krayze.youtuber"))  {
			  p.getInventory().setItem(0, Items.createItem(Material.COMPASS, 1, 0, "§6Teleporter §7(Rechtsklick)"));
			  p.getInventory().setItem(1, Items.createItem(Material.COAL, 1, 0, "§cSichtbarkeit §7(Rechtsklick)"));
			  p.getInventory().setItem(3, Items.createItem(Material.NAME_TAG, 1, 0, "§eNick §7(Rechtsklick)"));
			  p.getInventory().setItem(4, Items.createItem(Material.TNT, 1, 0, "§5Silent-Hub §7(Rechtsklick)"));
			  p.getInventory().setItem(5, Items.createItem(Material.EYE_OF_ENDER, 1, 0, "§2Schutzschild §7(Rechtsklick)"));
			  p.getInventory().setItem(7, Items.createItem(Material.CHEST, 1, 0, "§aGadgets §7(Rechtsklick)"));
			  p.getInventory().setItem(8, Items.createHeadItem(p.getName(), "§6Freunde §7(Kommt Bald)"));
			  
		  }
	}
	
	public void sendTitle(Player p, String text, String subtext)
	{
	  IChatBaseComponent chatTitle = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + text + "\"}");
	  IChatBaseComponent subTitle = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + subtext + "\"}");
	  PacketPlayOutTitle title = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, chatTitle);
	  PacketPlayOutTitle subtitle = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE, subTitle);
	  ((CraftPlayer)p).getHandle().playerConnection.sendPacket(title);
	  ((CraftPlayer)p).getHandle().playerConnection.sendPacket(subtitle);
	}

}
