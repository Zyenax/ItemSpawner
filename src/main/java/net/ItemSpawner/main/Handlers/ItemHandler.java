package net.ItemSpawner.main.Handlers;

import net.ItemSpawner.main.Main;
import net.ItemSpawner.main.utils.Utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.event.Listener;

public class ItemHandler implements Listener{
	
	private static Main plugin;

	public ItemHandler(Main hub) {
		ItemHandler.plugin = hub;
		SpawnItem(Bukkit.getWorld("world"));
	}
	
	public void SpawnItem(final World world){
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
		@SuppressWarnings("deprecation")
		public void run() {
			Location loc = new Location(Bukkit.getWorld(plugin.getConfig().getString("World")), plugin.getConfig().getDouble("Location.X"), plugin.getConfig().getDouble("Location.Y"), plugin.getConfig().getDouble("Location.Z"));
			int num = Utils.randomNum(1, 10);
			if(num == 1){
				Bukkit.broadcastMessage(Utils.color(plugin.getConfig().getString("Prefix") + " " + plugin.getConfig().getString("Message-Colors.infocolor") + plugin.getConfig().getString("Items.item" + num + ".amount") + plugin.getConfig().getString("Message-Colors.messagecolor") + " of " + plugin.getConfig().getString("Message-Colors.infocolor") + Material.getMaterial(plugin.getConfig().getInt("Items.item" + num + ".itemID")).toString() + plugin.getConfig().getString("Message-Colors.messagecolor") + " has been spawned at /spawn!"));
				world.dropItem(loc, Utils.createItem(Material.getMaterial(plugin.getConfig().getInt("Items.item1.itemID")), plugin.getConfig().getInt("Items.item1.amount"), plugin.getConfig().getInt("Items.item1.meta"), Utils.color(plugin.getConfig().getString("Items.item1.name")).toString(), null));
			}else if(num == 2){
				Bukkit.broadcastMessage(Utils.color(plugin.getConfig().getString("Prefix") + " " + plugin.getConfig().getString("Message-Colors.infocolor") + plugin.getConfig().getString("Items.item" + num + ".amount") + plugin.getConfig().getString("Message-Colors.messagecolor") + " of " + plugin.getConfig().getString("Message-Colors.infocolor") + Material.getMaterial(plugin.getConfig().getInt("Items.item" + num + ".itemID")).toString() + plugin.getConfig().getString("Message-Colors.messagecolor") + " has been spawned at /spawn!"));
				world.dropItem(loc, Utils.createItem(Material.getMaterial(plugin.getConfig().getInt("Items.item2.itemID")), plugin.getConfig().getInt("Items.item2.amount"), plugin.getConfig().getInt("Items.item2.meta"), Utils.color(plugin.getConfig().getString("Items.item2.name")).toString(), null));
			}else if(num == 3){
				Bukkit.broadcastMessage(Utils.color(plugin.getConfig().getString("Prefix") + " " + plugin.getConfig().getString("Message-Colors.infocolor") + plugin.getConfig().getString("Items.item" + num + ".amount") + plugin.getConfig().getString("Message-Colors.messagecolor") + " of " + plugin.getConfig().getString("Message-Colors.infocolor") + Material.getMaterial(plugin.getConfig().getInt("Items.item" + num + ".itemID")).toString() + plugin.getConfig().getString("Message-Colors.messagecolor") + " has been spawned at /spawn!"));
				world.dropItem(loc, Utils.createItem(Material.getMaterial(plugin.getConfig().getInt("Items.item3.itemID")), plugin.getConfig().getInt("Items.item3.amount"), plugin.getConfig().getInt("Items.item3.meta"), Utils.color(plugin.getConfig().getString("Items.item3.name")).toString(), null));
			}else if(num == 4){
				Bukkit.broadcastMessage(Utils.color(plugin.getConfig().getString("Prefix") + " " + plugin.getConfig().getString("Message-Colors.infocolor") + plugin.getConfig().getString("Items.item" + num + ".amount") + plugin.getConfig().getString("Message-Colors.messagecolor") + " of " + plugin.getConfig().getString("Message-Colors.infocolor") + Material.getMaterial(plugin.getConfig().getInt("Items.item" + num + ".itemID")).toString() + plugin.getConfig().getString("Message-Colors.messagecolor") + " has been spawned at /spawn!"));
				world.dropItem(loc, Utils.createItem(Material.getMaterial(plugin.getConfig().getInt("Items.item4.itemID")), plugin.getConfig().getInt("Items.item4.amount"), plugin.getConfig().getInt("Items.item4.meta"), Utils.color(plugin.getConfig().getString("Items.item4.name")).toString(), null));
			}else if(num == 5){
				Bukkit.broadcastMessage(Utils.color(plugin.getConfig().getString("Prefix") + " " + plugin.getConfig().getString("Message-Colors.infocolor") + plugin.getConfig().getString("Items.item" + num + ".amount") + plugin.getConfig().getString("Message-Colors.messagecolor") + " of " + plugin.getConfig().getString("Message-Colors.infocolor") + Material.getMaterial(plugin.getConfig().getInt("Items.item" + num + ".itemID")).toString() + plugin.getConfig().getString("Message-Colors.messagecolor") + " has been spawned at /spawn!"));
				world.dropItem(loc, Utils.createItem(Material.getMaterial(plugin.getConfig().getInt("Items.item5.itemID")), plugin.getConfig().getInt("Items.item5.amount"), plugin.getConfig().getInt("Items.item5.meta"), Utils.color(plugin.getConfig().getString("Items.item5.name")).toString(), null));
			}else if(num == 6){
				Bukkit.broadcastMessage(Utils.color(plugin.getConfig().getString("Prefix") + " " + plugin.getConfig().getString("Message-Colors.infocolor") + plugin.getConfig().getString("Items.item" + num + ".amount") + plugin.getConfig().getString("Message-Colors.messagecolor") + " of " + plugin.getConfig().getString("Message-Colors.infocolor") + Material.getMaterial(plugin.getConfig().getInt("Items.item" + num + ".itemID")).toString() + plugin.getConfig().getString("Message-Colors.messagecolor") + " has been spawned at /spawn!"));
				world.dropItem(loc, Utils.createItem(Material.getMaterial(plugin.getConfig().getInt("Items.item6.itemID")), plugin.getConfig().getInt("Items.item6.amount"), plugin.getConfig().getInt("Items.item6.meta"), Utils.color(plugin.getConfig().getString("Items.item6.name")).toString(), null));
			}else if(num == 7){
				Bukkit.broadcastMessage(Utils.color(plugin.getConfig().getString("Prefix") + " " + plugin.getConfig().getString("Message-Colors.infocolor") + plugin.getConfig().getString("Items.item" + num + ".amount") + plugin.getConfig().getString("Message-Colors.messagecolor") + " of " + plugin.getConfig().getString("Message-Colors.infocolor") + Material.getMaterial(plugin.getConfig().getInt("Items.item" + num + ".itemID")).toString() + plugin.getConfig().getString("Message-Colors.messagecolor") + " has been spawned at /spawn!"));
				world.dropItem(loc, Utils.createItem(Material.getMaterial(plugin.getConfig().getInt("Items.item7.itemID")), plugin.getConfig().getInt("Items.item7.amount"), plugin.getConfig().getInt("Items.item7.meta"), Utils.color(plugin.getConfig().getString("Items.item7.name")).toString(), null));
			}else if(num == 8){
				Bukkit.broadcastMessage(Utils.color(plugin.getConfig().getString("Prefix") + " " + plugin.getConfig().getString("Message-Colors.infocolor") + plugin.getConfig().getString("Items.item" + num + ".amount") + plugin.getConfig().getString("Message-Colors.messagecolor") + " of " + plugin.getConfig().getString("Message-Colors.infocolor") + Material.getMaterial(plugin.getConfig().getInt("Items.item" + num + ".itemID")).toString() + plugin.getConfig().getString("Message-Colors.messagecolor") + " has been spawned at /spawn!"));
				world.dropItem(loc, Utils.createItem(Material.getMaterial(plugin.getConfig().getInt("Items.item8.itemID")), plugin.getConfig().getInt("Items.item8.amount"), plugin.getConfig().getInt("Items.item8.meta"), Utils.color(plugin.getConfig().getString("Items.item8.name")).toString(), null));
			}else if(num == 9){
				Bukkit.broadcastMessage(Utils.color(plugin.getConfig().getString("Prefix") + " " + plugin.getConfig().getString("Message-Colors.infocolor") + plugin.getConfig().getString("Items.item" + num + ".amount") + plugin.getConfig().getString("Message-Colors.messagecolor") + " of " + plugin.getConfig().getString("Message-Colors.infocolor") + Material.getMaterial(plugin.getConfig().getInt("Items.item" + num + ".itemID")).toString() + plugin.getConfig().getString("Message-Colors.messagecolor") + " has been spawned at /spawn!"));
				world.dropItem(loc, Utils.createItem(Material.getMaterial(plugin.getConfig().getInt("Items.item9.itemID")), plugin.getConfig().getInt("Items.item9.amount"), plugin.getConfig().getInt("Items.item9.meta"), Utils.color(plugin.getConfig().getString("Items.item9.name")).toString(), null));
			}else if(num == 10){
				Bukkit.broadcastMessage(Utils.color(plugin.getConfig().getString("Prefix") + " " + plugin.getConfig().getString("Message-Colors.infocolor") + plugin.getConfig().getString("Items.item" + num + ".amount") + plugin.getConfig().getString("Message-Colors.messagecolor") + " of " + plugin.getConfig().getString("Message-Colors.infocolor") + Material.getMaterial(plugin.getConfig().getInt("Items.item" + num + ".itemID")).toString() + plugin.getConfig().getString("Message-Colors.messagecolor") + " has been spawned at /spawn!"));
				world.dropItem(loc, Utils.createItem(Material.getMaterial(plugin.getConfig().getInt("Items.item10.itemID")), plugin.getConfig().getInt("Items.item10.amount"), plugin.getConfig().getInt("Items.item10.meta"), Utils.color(plugin.getConfig().getString("Items.item10.name")).toString(), null));
			}
		}
		}, 0, plugin.getConfig().getInt("TimeBeforeNextItemInSeconds") * 20);
	}

}
