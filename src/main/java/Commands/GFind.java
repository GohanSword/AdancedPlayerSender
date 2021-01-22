package Commands;

import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class GFind extends Command {

        public GFind() {
            super("GFind");
        }

        @Override
        public void execute(CommandSender sender, String[] args) {
            if(args.length != 1){
                sender.sendMessage("§cVeuillez spécifier le pseudo d'un joueur !");
                return;
            }

            ProxiedPlayer target = BungeeCord.getInstance().getPlayer(args[0]);

            if(target == null){
                sender.sendMessage("§cCe joueur n'est pas en ligne !");
                return;
            }

            sender.sendMessage("§eLe joueur §a" + target.getName() + " §ese trouve sur le serveur: §a" + target.getServer().getInfo().getName());
        }
    }