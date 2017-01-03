package ch.phntm.lobby.listeners.boots;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class BOOTS_wasser implements Listener {
	  @EventHandler
	  public void onMove(PlayerMoveEvent e)
	  {
	    Player p = e.getPlayer();
	    try {
	      if (p.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase("§1WasserBoots")) {
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.WATERDRIP, 1);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.WATERDRIP, 1);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.WATERDRIP, 1);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.SPLASH, 1);

	        if (p.isSneaking()) {
	          p.getWorld().playEffect(p.getLocation().add(0.0D, 1.8D, 0.0D), Effect.SPLASH, 1);
	          p.getWorld().playEffect(p.getLocation().add(1.0D, 1.8D, 0.0D), Effect.SPLASH, 1);
	          p.getWorld().playEffect(p.getLocation().add(-1.0D, 1.8D, 0.0D), Effect.SPLASH, 1);
	          p.getWorld().playEffect(p.getLocation().add(0.0D, 1.8D, 1.0D), Effect.SPLASH, 1);
	          p.getWorld().playEffect(p.getLocation().add(0.0D, 1.8D, -1.0D), Effect.SPLASH, 1);

	          p.getWorld().playEffect(p.getLocation().add(0.0D, 1.8D, -0.5D), Effect.SPLASH, 1);
	          p.getWorld().playEffect(p.getLocation().add(0.0D, 1.8D, 0.5D), Effect.SPLASH, 1);
	          p.getWorld().playEffect(p.getLocation().add(0.5D, 1.8D, 0.0D), Effect.SPLASH, 1);
	          p.getWorld().playEffect(p.getLocation().add(-0.5D, 1.8D, 0.0D), Effect.SPLASH, 1);
	        }
	      }
	    }
	    catch (NullPointerException localNullPointerException)
	    {
	    }
	  }
	}
