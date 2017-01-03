package ch.phntm.lobby.listeners.boots;

import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class BOOTS_Flame implements Listener {
	  @EventHandler
	  public void onMove(PlayerMoveEvent e)
	  {
	    Player p = e.getPlayer();
	    try {
	      if (p.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase("§6FlameBoots")) {
	        p.getWorld().playEffect(p.getLocation(), Effect.LAVA_POP, 1);

	        if (p.isSneaking()) {
	          p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
	          p.getWorld().playSound(p.getLocation(), Sound.FIRE, 1.0F, 1.0F);
	        }
	      }
	    }
	    catch (NullPointerException localNullPointerException)
	    {
	    }
	  }
	}
