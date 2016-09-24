package theFourRealms.items.Meteor;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import theFourRealms.Main;

public class ItemModPickaxe extends ItemPickaxe {

	public ItemModPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabTheFourRealms);
		this.setUnlocalizedName(unlocalizedName);
		// TODO Auto-generated constructor stub
	}



}
