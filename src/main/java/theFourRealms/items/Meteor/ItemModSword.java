package theFourRealms.items.Meteor;

import net.minecraft.item.ItemSword;
import theFourRealms.Main;

public class ItemModSword extends ItemSword {

	public ItemModSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabTheFourRealms);
		this.setUnlocalizedName(unlocalizedName);
		// TODO Auto-generated constructor stub
	}
}