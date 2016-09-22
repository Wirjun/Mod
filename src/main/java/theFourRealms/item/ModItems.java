package theFourRealms.item;

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

	// These methods are created in a way that we can place them after each
	// other.
	public static final void init() {
		PlatinIngot = new Item().setUnlocalizedName("PlatinIngot").setCreativeTab(tabTheFourRealms)
				.setTextureName(Main.MODID + ":PlatinIngot");
  Public static Item MeteorIngot;
MeteorIngot = new Item().setUnlocalizedName (" MeteorIngot").setCreativTab(tabTheFourRealms).setTextureName(Main.MODID + ":MeteorIngot");
		// important to register the item
		GameRegistry.registerItem(PlatinIngot, "PlatinIngot");
		
	}

	public static final CreativeTabs tabTheFourRealms = new CreativeTabs("TheFourRealms") {
		@Override
		public Item getTabIconItem() {
			return PlatinIngot; 
                        return MeteorIngot;
		
			
		}

	};
}
