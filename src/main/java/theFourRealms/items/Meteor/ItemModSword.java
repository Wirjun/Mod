package theFourRealms.items.Meteor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import theFourRealms.Main;
import theFourRealms.items.ModItems;

public class ItemModSword extends ItemSword {

	public ItemModSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabTheFourRealms);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}
}