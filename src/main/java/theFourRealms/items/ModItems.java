package theFourRealms.items;

import com.sun.org.apache.xml.internal.security.Init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import scala.reflect.internal.Trees.This;
import theFourRealms.Main;
import theFourRealms.items.Meteor.ItemModAxe;
import theFourRealms.items.Meteor.ItemModMultitool;
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
	// Tools
	public static Item MeteorSword;
	public static Item MeteorMultitool;
	public static Item MeteorAxe;
	public static Item MeteorHoe;
	public static Item MeteorPickaxe;
	public static Item MeteorSpade;
	
	/*
	 * creates new material for tools/weapons
	 * The values I chose for my tutorial ToolMaterial are:
	 *	A harvest level of 3 (Like diamond)
	 *	A durability of 1000 (Between iron and diamond)
	 *  A mining speed of 15.0F (Better than gold)
	 *	A damage of 4.0F (Better than diamond, a sword will add 8 damage)
	 *	A enchantability of 30 (Better than everything else) Integer.MAX_VALUE
	 * 
	 */
	
	public static ToolMaterial Meteor = EnumHelper.addToolMaterial("Meteor", 4, 1000, 19.0F, 4.0F, 30);
	public static ToolMaterial Platin = EnumHelper.addToolMaterial("Platin", 4, 1000, 19.0F, 4.0F, 30);

	
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
			
			GameRegistry.registerItem(MeteorPickaxe = new ItemModPickaxe("Meteorpickaxe", Meteor), "Meteorpickaxe");
			
			GameRegistry.registerItem(MeteorAxe = new ItemModAxe("Meteoraxe", Meteor), "Meteoraxe");
			
			GameRegistry.registerItem(MeteorSpade = new ItemModSpade("Meteorspade", Meteor), "Meteorspade");
			
			GameRegistry.registerItem(MeteorHoe = new ItemModeHoe("Meteorhoe", Meteor), "Meteorhoe");
		
			GameRegistry.registerItem(MeteorSword = new ItemModSword("Meteorsword", Meteor), "Meteorsword");
			GameRegistry.registerItem(MeteorMultitool =new ItemModMultitool("MeteorMultitool", Meteor), "MeteorMultitool");
	}

}