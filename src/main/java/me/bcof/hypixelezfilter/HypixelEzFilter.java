package me.bcof.hypixelezfilter;

import me.bcof.hypixelezfilter.listeners.asyncChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class HypixelEzFilter extends JavaPlugin {

    public List<String> bannedWords = getConfig().getStringList("filtered-words");
    public List<String> phrases = getConfig().getStringList("phrases");



    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new asyncChatEvent(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
