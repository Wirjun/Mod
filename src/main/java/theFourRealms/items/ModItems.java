package theFourRealms.items;

import com.sun.org.apache.xml.internal.security.Init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import theFourRealms.Main;
import theFourRealms.items.Meteor.ItemModAxe;
import theFourRealms.items.Meteor.ItemModPickaxe;
import theFourRealms.items.Meteor.ItemModSpade;
import theFourRealms.items.Meteor.ItemModSword;
import theFourRealms.items.Meteor.ItemModeHoe;

// class for Items

public final class ModItems {

	public static Item PlatinIngot;
	public static Item MeteorIngot;
	public static Item TitaniumIngot;
	public static Item InfinityIngot;
	public static Item ObsidianIngot;

	// These methods are created in a way that we can place them after each other.

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
		
		ObsidianIngot = new Item().setUnlocalizedName("ObsidianIngot").setCreativeTab(Main.tabTheFourRealms)
				.setTextureName(Main.MODID + ":ObsidianIngot");
		// important to register the item
				GameRegistry.registerItem(ObsidianIngot, "ObsidianIngot");
		
				
				
			//Tools Created with Meteor Ingots !! Harder than Diamond !!
			ItemModPickaxe MeteorPickaxe;
			GameRegistry.registerItem(MeteorPickaxe = new ItemModPickaxe("Meteorpickaxe", Meteor), "Meteorpickaxe");
			
			ItemModAxe MeteorAxe;
			GameRegistry.registerItem(MeteorAxe = new ItemModAxe("Meteoraxe", Meteor), "Meteoraxe");
			ItemModSpade MeteorSpade;
			GameRegistry.registerItem(MeteorSpade = new ItemModSpade("Meteorspade", Meteor), "Meteorspade");
			ItemModeHoe MeteorHoe;
			GameRegistry.registerItem(MeteorHoe = new ItemModeHoe("Meteorhoe", Meteor), "Meteorhoe");
			ItemModSword MeteorSword;
			GameRegistry.registerItem(MeteorSword = new ItemModSword("Meteorsword", Meteor), "Meteorsword");
	}
	public static ToolMaterial Meteor = EnumHelper.addToolMaterial("Meteor", 4, 1000, 19.0F, 4.0F, 30);

}