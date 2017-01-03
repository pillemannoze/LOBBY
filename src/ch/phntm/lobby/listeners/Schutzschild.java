package ch.phntm.lobby.listeners;

import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import ch.phntm.lobby.Lobby;

public class Schutzschild implements Listener {
	
	@EventHandler
	public void on(PlayerInteractEvent e) {
	  if (((e.getAction() == Action.RIGHT_CLICK_BLOCK ? 1 : 0) | (e.getAction() == Action.RIGHT_CLICK_AIR ? 1 : 0)) != 0)
		    try
		    {
		      if (e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§2Schutzschild §7(Rechtsklick)"))
		      {
		        final Player p = e.getPlayer();
		        if (p.hasPermission("krayze.youtuber"))
		        {
		          e.setCancelled(true);
		          if (!Lobby.s.contains(p.getName()))
		          {
		            Lobby.s.add(p.getName());

		            p.sendMessage(Lobby.prefix + "§7Du hast das §2Schutzschild §7aktiviert.");
		            p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
		            Lobby.SS.put(p.getName(), new BukkitRunnable()
		            {
		              public void run()
		              {
		                p.getWorld().playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 1);
		                for (Entity en : p.getNearbyEntities(5.0D, 3.0D, 5.0D))
		                  if ((en instanceof Player))
		                  {
		                    Player target = (Player)en;

		                    double ax = p.getLocation().getX();
		                    double ay = p.getLocation().getY();
		                    double az = p.getLocation().getZ();

		                    double bx = target.getLocation().getX();
		                    double by = target.getLocation().getY();
		                    double bz = target.getLocation().getZ();

		                    double x = bx - ax;
		                    double y = by - ay;
		                    double z = bz - az;

		                    Vector v = new Vector(x, y, z).normalize().multiply(2.0D).setY(1.0D);
		                    if (!target.hasPermission("krayze.youtuber"))
		                      target.setVelocity(v);
		                  }
		              }
		            });
		            ((BukkitRunnable)Lobby.SS.get(p.getName())).runTaskTimer(Lobby.plugin, 0L, 2L);

		            return;
		          }
		          if (Lobby.s.contains(p.getName()))
		          {
		            Lobby.s.remove(p.getName());
		            p.sendMessage(Lobby.prefix + "§7Du hast das §2Schutzschild §7deaktiviert.");
		            p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);

		            Lobby.SS.get(p.getName());
		            ((BukkitRunnable)Lobby.SS.get(p.getName())).cancel();
		            Lobby.SS.remove(p.getName());
		          }
		        }
		        else
		        {
		          p.sendMessage(Lobby.noperm);
		        }
		      }
		    }
		    catch (Exception localException)
		    {
		    }
		}
		}
