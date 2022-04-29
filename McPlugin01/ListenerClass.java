package com._Itzel;


import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class ListenerClass implements Listener {

    @EventHandler

    public void PonerBloque(BlockPlaceEvent e){
           System.out.println(e.getBlock().getX() + "" + e.getBlock().getY());
           if(e.getBlock().getType().equals(Material.OBSIDIAN)) {
               Player player = e.getPlayer();
               player.sendMessage("Colocaste Obsidiana");


           }







    }
}
