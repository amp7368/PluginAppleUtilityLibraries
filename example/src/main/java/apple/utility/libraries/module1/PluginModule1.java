package apple.utility.libraries.module1;

import plugin.util.plugin.plugin.util.plugin.PluginManagedModule;

public class PluginModule1 extends PluginManagedModule {
    private static PluginModule1 instance;

    public PluginModule1() {
        instance = this;
    }

    public static PluginModule1 getInstance() {
        return instance;
    }


    @Override
    public void enable() {
        new SimpleCommand();
    }

    @Override
    public String getName() {
        return "Module1";
    }
}
