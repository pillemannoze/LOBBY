package ch.phntm.lobby.listeners.boots;

import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class BOOTS_angry implements Listener {
	  @EventHandler
	  public void onMove(PlayerMoveEvent e)
	  {
	    Player p = e.getPlayer();
	    try {
	      if (p.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase("§fAngryBoots")) {
	        p.getWorld().playEffect(p.getLocation().add(0.0D, 0.1D, 0.0D), Effect.VILLAGER_THUNDERCLOUD, 1);
	        if (p.isSneaking())
	          p.getWorld().playSound(p.getLocation().add(0.0D, 0.0D, 0.0D), Sound.VILLAGER_NO, 1.0F, 1.0F);
	      }
	    }
	    catch (NullPointerException localNullPointerException)
	    {
	    }
	  }
	}
