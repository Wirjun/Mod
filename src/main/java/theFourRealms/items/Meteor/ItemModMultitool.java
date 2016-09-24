package theFourRealms.items.Meteor;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import theFourRealms.Main;

public class ItemModMultitool extends ItemPickaxe {
	public ItemModMultitool(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabTheFourRealms);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

	@Override
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("pickaxe", "spade");
	}

	private static Set effectiveAgainst = Sets
			.newHashSet(new Block[] { Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer,
					Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium });

	@Override
	public boolean func_150897_b(Block block) {
		return effectiveAgainst.contains(block) ? true : super.func_150897_b(block);
	}

	@Override
	public float func_150893_a(ItemStack stack, Block block) {
		return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
	}
}
