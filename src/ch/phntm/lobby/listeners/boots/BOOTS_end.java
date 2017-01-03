package ch.phntm.lobby.listeners.boots;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class BOOTS_end implements Listener {
	  @EventHandler
	  public void onMove(PlayerMoveEvent e)
	  {
	    Player p = e.getPlayer();
	    try {
	      if (p.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase("§dEndBoots")) {
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.PORTAL, 5);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.PORTAL, 5);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.PORTAL, 5);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.PORTAL, 5);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.PORTAL, 5);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.PORTAL, 5);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.PORTAL, 5);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.PORTAL, 5);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.PORTAL, 5);

	        if (p.isSneaking())
	          p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.ENDER_SIGNAL, 5);
	      }
	    }
	    catch (NullPointerException localNullPointerException)
	    {
	    }
	  }
	}