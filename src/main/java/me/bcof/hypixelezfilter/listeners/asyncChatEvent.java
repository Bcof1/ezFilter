package me.bcof.hypixelezfilter.listeners;

import me.bcof.hypixelezfilter.HypixelEzFilter;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.Random;

public class asyncChatEvent implements Listener {
    HypixelEzFilter main;

    public asyncChatEvent(HypixelEzFilter main) {
        this.main = main;
    }

    @EventHandler
    public void onChatEvent(AsyncPlayerChatEvent event){
        for (int i = 0; i < main.bannedWords.size() ; i++) {
            if(event.getMessage().contains(main.bannedWords.get(i))){
                int random = new Random().nextInt(main.phrases.size());
                event.setMessage(main.phrases.get(random));
                break;
            }

        }


    }
}
