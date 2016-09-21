package theFourRealms.block;

import net.minecraft.block.Block;
	import net.minecraft.block.material.Material;
	import net.minecraft.creativetab.CreativeTabs;
	import theFourRealms.Main;


	public class HardBlock extends Block{

		protected HardBlock(String unlocalizedName, Material material) {
	        super(material);
	        this.setBlockName(unlocalizedName);
	        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
	        this.setCreativeTab(CreativeTabs.tabAllSearch);
	        this.setHardness(10.0F);
	        this.setResistance(10.0F);
	        this.setLightLevel(10.0F);
	        this.setHarvestLevel("pickaxe", 3);
	        this.setStepSound(soundTypeMetal);
		}

	}
