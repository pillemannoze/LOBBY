package ch.phntm.lobby.listeners.boots;

import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class BOOTS_tnt implements Listener{
	
	  @EventHandler
	  public void onMove(PlayerMoveEvent e)
	  {
	    Player p = e.getPlayer();
	    try {
	      if (p.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase("�4T�cN�4T�7Boots"))
	      {
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.2D, 0.0D), Effect.EXPLOSION, 1);

	        if (p.isSneaking()) {
	          p.getWorld().playEffect(p.getLocation().add(0.0D, 0.3D, 0.0D), Effect.LAVA_POP, 1);
	          p.getWorld().playSound(p.getLocation().add(0.0D, 0.3D, 0.0D), Sound.EXPLODE, 1.0F, 1.0F);
	          p.getWorld().playEffect(p.getLocation().add(0.0D, 0.3D, 0.0D), Effect.SMOKE, 1);
	        }
	      }
	    }
	    catch (NullPointerException localNullPointerException)
	    {
	    }
	  }
	}
