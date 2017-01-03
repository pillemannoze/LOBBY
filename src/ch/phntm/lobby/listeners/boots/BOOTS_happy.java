package ch.phntm.lobby.listeners.boots;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class BOOTS_happy implements Listener {
	  @EventHandler
	  public void onMove(PlayerMoveEvent e)
	  {
	    Player p = e.getPlayer();
	    try {
	      if (p.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase("§aHappyBoots")) {
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.4D, 0.0D), Effect.HAPPY_VILLAGER, 1);

	        if (p.isSneaking()) {
	          p.getWorld().playEffect(p.getLocation().add(0.0D, 0.3D, 0.0D), Effect.FOOTSTEP, 1);

	          Vector v = p.getLocation().getDirection().multiply(0.7D).setY(0.2D);
	          p.setVelocity(v);
	        }
	      }
	    }
	    catch (NullPointerException localNullPointerException)
	    {
	    }
	  }
	}
