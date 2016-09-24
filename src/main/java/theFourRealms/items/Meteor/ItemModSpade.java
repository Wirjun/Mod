package theFourRealms.items.Meteor;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import theFourRealms.Main;
import net.minecraft.item.ItemSpade;

public class ItemModSpade extends ItemSpade {

	public ItemModSpade(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabTheFourRealms);
		this.setUnlocalizedName(unlocalizedName);
		// TODO Auto-generated constructor stub
	}

}
