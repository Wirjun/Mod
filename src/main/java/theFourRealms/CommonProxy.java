package theFourRealms;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import theFourRealms.block.ModBlocks;
import theFourRealms.items.ModItems;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.init();
		ModBlocks.init();
	}

	public void init(FMLInitializationEvent e) {
		
		// Receipe for smelting ... Ore to Ingot
		GameRegistry.addSmelting(ModBlocks.PlatinOre, new ItemStack(ModItems.PlatinIngot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.MeteorOre, new ItemStack(ModItems.MeteorIngot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.TitaniumOre, new ItemStack(ModItems.TitaniumIngot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.InfinityOre, new ItemStack(ModItems.InfinityIngot), 1.0F);
		
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}