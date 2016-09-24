package theFourRealms.items.Meteor;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import theFourRealms.Main;
import net.minecraft.item.ItemAxe;

public class ItemModAxe extends ItemAxe {

	public ItemModAxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabTheFourRealms);
		this.setUnlocalizedName(unlocalizedName);
		// TODO Auto-generated constructor stub
	}
}
