package theFourRealms;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import theFourRealms.items.ModItems;
import theFourRealms.items.Meteor.ItemModAxe;
import theFourRealms.items.Meteor.ItemModeHoe;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

	// !!! crat it otherwise Forge creat its own........,...
	public static final String MODID = "TheFourRealms";
	public static final String MODNAME = "TheFourRealms Mod";
	public static final String VERSION = "1.0.0";

	// Tab for custom generated Tab
	public static final CreativeTabs tabTheFourRealms = new CreativeTabs("TheFourRealms") {
		@Override
		public Item getTabIconItem() {
			return ModItems.InfinityIngot;

		}
	};

	@SidedProxy(clientSide = "theFourRealms.ClientProxy", serverSide = "theFourRealms.ServerProxy")
	public static CommonProxy proxy;
	// Class =Instance (new)
	@Instance
	public static Main instance = new Main();

	// The preInit Handler is called at the very beginning of the startup
	// routine. In this method we should read your config file, create Blocks,
	// Items, etc. and register them with the GameRegistry.
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	// The init Handler is called after the preInit Handler. In this method we
	// can build up data structures, add Crafting Recipes and register new
	// handler.
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	// communicate with other mods
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}