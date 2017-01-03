package ch.phntm.lobby.listeners.boots;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class BOOTS_cloud implements Listener{
	
	  @EventHandler
	  public void onMove(PlayerMoveEvent e)
	  {
	    Player p = e.getPlayer();
	    try {
	      if (p.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase("žbCloudBoots")) {
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.INSTANT_SPELL, 1);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.INSTANT_SPELL, 1);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.INSTANT_SPELL, 1);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.INSTANT_SPELL, 1);
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.INSTANT_SPELL, 1);
	        if (p.isSneaking()) {
	          p.getWorld().playEffect(p.getLocation().add(0.0D, 1.5D, 0.0D), Effect.SMOKE, 1);

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
