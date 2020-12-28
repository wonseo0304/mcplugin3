package click.click;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.Bukkit;

import org.bukkit.Material;

import org.bukkit.entity.Fireball;

import org.bukkit.entity.Player;

import org.bukkit.event.EventHandler;

import org.bukkit.event.Listener;

import org.bukkit.event.block.Action;

import org.bukkit.event.player.PlayerInteractEvent;


public class Click extends JavaPlugin implements Listener  {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage( ChatColor.GREEN + "시작 동무들");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void rightClick1 (PlayerInteractEvent e){

        Player p = e.getPlayer();

        Action a = e.getAction();

        if(a == Action.RIGHT_CLICK_AIR)

        {

            if(p.getItemInHand().getType() == Material.DIAMOND_SWORD)
            {

                Fireball fb = p.launchProjectile(Fireball.class);

                fb.setVelocity(p.getLocation().getDirection().multiply(5));

            }
        }


    }
}
