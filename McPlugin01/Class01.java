package com._Itzel;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Class01 extends JavaPlugin {

 public void onEnable(){


  System.out.println("prendiendo");

  ListenerClass LISTENER = new ListenerClass();

  Bukkit.getPluginManager().registerEvents(LISTENER, this);




 }

 public void onDisable(){
    System.out.println("apagando");
 }

 public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args){




      if(cmd.getName().equals("salud")){
       if(sender instanceof Player){
        Player player = (Player) sender;
        player.setHealth(20.0);
        player.sendMessage("Salud Restaurada");

        }else{System.out.println("Este comando no puede ser ejecutado por consola");}
       }




  return false;
 }
}
