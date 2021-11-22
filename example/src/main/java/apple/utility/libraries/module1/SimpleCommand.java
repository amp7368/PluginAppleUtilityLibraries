package apple.utility.libraries.module1;

import apple.utility.libraries.VoltskiyaPluginExample;
import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import org.bukkit.command.CommandSender;

@CommandAlias("pingExample")
public class SimpleCommand extends BaseCommand {
    public SimpleCommand() {
        // easy access to registering commands
        VoltskiyaPluginExample.getInstance().registerCommand(this);
    }

    @Default
    public void ping(CommandSender sender) {
        sender.sendMessage("pong");
    }
}
