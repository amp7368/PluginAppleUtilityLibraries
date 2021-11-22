package apple.utility.libraries.module2;

import plugin.util.plugin.plugin.util.plugin.PluginManagedModule;

public class PluginModule2 extends PluginManagedModule {

    /**
     * this is the most useful method. Called when enabling a module
     */
    @Override
    public void enable() {

    }

    /**
     * #getDataFolder() returns the folder under the main plugin with this name
     *
     * @return the name to identifies this module
     */
    @Override
    public String getName() {
        return "Module2";
    }

    /**
     * called before #enable()
     */
    @Override
    public void init() {
    }

    @Override
    public void onDisable() {
    }

    /**
     * @return false if the module shouldn't be loaded, otherwise don't override this.
     * The default return value is true
     */
    @Override
    public boolean shouldEnable() {
        return false; // this module won't be enabled because of this being false.
    }
}
