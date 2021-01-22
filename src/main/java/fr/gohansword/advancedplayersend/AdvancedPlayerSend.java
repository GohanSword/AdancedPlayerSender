package fr.gohansword.advancedplayersend;

import Commands.GFind;
import net.md_5.bungee.api.plugin.Plugin;

public final class AdvancedPlayerSend extends Plugin {

    private static AdvancedPlayerSend instance;
    public static AdvancedPlayerSend getInstance(){
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        getProxy().getConsole().sendMessage("§aAdvancedPlayerSender as loaded");
        getProxy().getPluginManager().registerCommand(this,new GFind());
    }

    @Override
    public void onDisable() {
        getProxy().getConsole().sendMessage("§cAdvancedPlayerSender as unloaded");
    }
}
