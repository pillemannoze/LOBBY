package ch.phntm.lobby.listeners.boots;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class BOOTS_Love implements Listener {

	  @EventHandler
	  public void onMove(PlayerMoveEvent e)
	  {
	    Player p = e.getPlayer();
	    try {
	      if (p.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase("§cLoveBoots")) {
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.HEART, 1);
	        if (p.isSneaking())
	          p.getWorld().playEffect(p.getLocation().add(0.0D, 2.0D, 0.0D), Effect.HEART, 1);
	      }
	    }
	    catch (NullPointerException localNullPointerException)
	    {
	    }
	  }
	}