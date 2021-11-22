package apple.utility.libraries;

import apple.utility.libraries.module1.PluginModule1;
import apple.utility.libraries.module2.PluginModule2;
import plugin.util.plugin.plugin.util.plugin.PluginManaged;
import plugin.util.plugin.plugin.util.plugin.PluginManagedModule;

import java.util.Collection;
import java.util.List;

public class VoltskiyaPluginExample extends PluginManaged {
    private static VoltskiyaPluginExample instance;

    public VoltskiyaPluginExample() {
        instance = this;
    }

    public static VoltskiyaPluginExample getInstance() {
        return instance;
    }

    /**
     * @return a collection of modules to be loaded
     */
    @Override
    public Collection<PluginManagedModule> getModules() {
        return List.of(
                new PluginModule1(),
                new PluginModule2()
        );
    }

    /**
     * none of these empty methods are not necessary.
     * You can use them if you need something
     * to happen at that stage of loading/enabling/disabling the plugin
     */
    @Override
    public void onLoadPre() {
    }

    @Override
    public void onLoadPost() {
    }

    @Override
    public void onEnablePreInit() {
    }

    @Override
    public void onEnablePre() {
    }

    @Override
    public void initialize() {
    }

    @Override
    public void onEnablePost() {
    }

    @Override
    public void onDisablePre() {
    }

    @Override
    public void onDisablePost() {
    }
}
