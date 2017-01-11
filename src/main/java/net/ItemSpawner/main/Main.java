package net.ItemSpawner.main;

import net.ItemSpawner.main.Handlers.ItemHandler;
import net.ItemSpawner.main.utils.Utils;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

	public void onEnable(){
		saveConfig();
		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
		if (!getConfig().contains("World")) {
			console.sendMessage(Utils.color("&8&l[&e&lItemSpawner&8&l] &aWORLD ADDED TO CONFIG!"));
			getConfig().set("World", "world");
        }
		if (!getConfig().contains("Prefix")) {
			console.sendMessage(Utils.color("&8&l[&e&lItemSpawner&8&l] &aPREFIX ADDED TO CONFIG!"));
			getConfig().set("Prefix", "&8&l[&e&lPREFIX&8&l]");
        }
		if (!getConfig().contains("Message-Colors")) {
			console.sendMessage(Utils.color("&8&l[&e&lItemSpawner&8&l] &aPREFIX ADDED TO CONFIG!"));
			getConfig().set("Message-Colors.infocolor", "&b&l");
			getConfig().set("Message-Colors.messagecolor", "&7");
        }
		if (!getConfig().contains("TimeBeforeNextItemInSeconds")) {
			console.sendMessage(Utils.color("&8&l[&e&lItemSpawner&8&l] &aTIME ADDED TO CONFIG!"));
			getConfig().set("TimeBeforeNextItemInSeconds", 5);
        }
		if (!getConfig().contains("Location")) {
			console.sendMessage(Utils.color("&8&l[&e&lItemSpawner&8&l] &aLOCATION ADDED TO CONFIG!"));
			getConfig().set("Location.X", 123.5);
			getConfig().set("Location.Y", 30);
			getConfig().set("Location.Z", 199.5);
        }
		if (!getConfig().contains("Items")) {
			console.sendMessage(Utils.color("&8&l[&e&lItemSpawner&8&l] &aITEMS ADDED TO CONFIG!"));
			getConfig().set("Items.item1", "");
			getConfig().set("Items.item1.itemID", 2);
			getConfig().set("Items.item1.meta", 0);
			getConfig().set("Items.item1.amount", 1);
			getConfig().set("Items.item1.name", "test");
			getConfig().set("Items.item2", "");
			getConfig().set("Items.item2.itemID", 2);
			getConfig().set("Items.item2.meta", 0);
			getConfig().set("Items.item2.amount", 1);
			getConfig().set("Items.item2.name", "test");
			getConfig().set("Items.item3", "");
			getConfig().set("Items.item3.itemID", 2);
			getConfig().set("Items.item3.meta", 0);
			getConfig().set("Items.item3.amount", 1);
			getConfig().set("Items.item3.name", "test");
			getConfig().set("Items.item4", "");
			getConfig().set("Items.item4.itemID", 2);
			getConfig().set("Items.item4.meta", 0);
			getConfig().set("Items.item4.amount", 1);
			getConfig().set("Items.item4.name", "test");
			getConfig().set("Items.item5", "");
			getConfig().set("Items.item5.itemID", 2);
			getConfig().set("Items.item5.meta", 0);
			getConfig().set("Items.item5.amount", 1);
			getConfig().set("Items.item5.name", "test");
			getConfig().set("Items.item6", "");
			getConfig().set("Items.item6.itemID", 2);
			getConfig().set("Items.item6.meta", 0);
			getConfig().set("Items.item6.amount", 1);
			getConfig().set("Items.item6.name", "test");
			getConfig().set("Items.item7", "");
			getConfig().set("Items.item7.itemID", 2);
			getConfig().set("Items.item7.meta", 0);
			getConfig().set("Items.item7.amount", 1);
			getConfig().set("Items.item7.name", "test");
			getConfig().set("Items.item8", "");
			getConfig().set("Items.item8.itemID", 2);
			getConfig().set("Items.item8.meta", 0);
			getConfig().set("Items.item8.amount", 1);
			getConfig().set("Items.item8.name", "test");
			getConfig().set("Items.item9", "");
			getConfig().set("Items.item9.itemID", 2);
			getConfig().set("Items.item9.meta", 0);
			getConfig().set("Items.item9.amount", 1);
			getConfig().set("Items.item9.name", "test");
			getConfig().set("Items.item10", "");
			getConfig().set("Items.item10.itemID", 2);
			getConfig().set("Items.item10.meta", 0);
			getConfig().set("Items.item10.amount", 1);
			getConfig().set("Items.item10.name", "test");
        }
		Listeners();
		saveConfig();
        console.sendMessage(Utils.color("&8&l[&e&lItemSpawner&8&l] &aPlugin Enabled"));
		saveConfig();
	}
	
	public void onDisable(){
		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(Utils.color("&8&l[&e&lItemSpawner&8&l] &cPlugin Disabled"));
	}
	
	public void Listeners(){
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new Utils(this), this);
		pm.registerEvents(new ItemHandler(this), this);
	}
	
}
