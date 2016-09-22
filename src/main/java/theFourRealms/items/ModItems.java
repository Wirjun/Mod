package theFourRealms.items;

import com.sun.org.apache.xml.internal.security.Init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import theFourRealms.Main;

// class for Items

public final class ModItems {

	public static Item PlatinIngot;
	public static Item MeteorIngot;
	public static Item TitaniumIngot;
	public static Item InfinityIngot;

	// These methods are created in a way that we can place them after each
	// other.
	public static final void init() {
		PlatinIngot = new Item().setUnlocalizedName("PlatinIngot").setCreativeTab(Main.tabTheFourRealms)
				.setTextureName(Main.MODID + ":PlatinIngot");
		// important to register the item
		GameRegistry.registerItem(PlatinIngot, "PlatinIngot");
		
		MeteorIngot = new Item().setUnlocalizedName("MeteorIngot").setCreativeTab(Main.tabTheFourRealms)
				.setTextureName(Main.MODID + ":MeteorIngot");
		// important to register the item
		GameRegistry.registerItem(MeteorIngot, "MeteorIngot");
		
		TitaniumIngot = new Item().setUnlocalizedName("TitaniumIngot").setCreativeTab(Main.tabTheFourRealms)
				.setTextureName(Main.MODID + ":TitaniumIngot");
		// important to register the item
		GameRegistry.registerItem(TitaniumIngot, "TitaniumIngot");
		
		InfinityIngot = new Item().setUnlocalizedName("InfinityIngot").setCreativeTab(Main.tabTheFourRealms)
				.setTextureName(Main.MODID + ":InfinityIngot");
		// important to register the item
		GameRegistry.registerItem(InfinityIngot, "InfinityIngot");
		
		
	}

	
}