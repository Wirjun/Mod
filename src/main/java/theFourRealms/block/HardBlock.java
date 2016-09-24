package theFourRealms.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import theFourRealms.Main;


	public class HardBlock extends Block{
		private Item drop;
		private int meta;
		private int least_quantity;
		private int most_quantity;
		
		protected HardBlock(String unlocalizedName, Material mat, Item drop, int meta, int least_quantity,int most_quantity) {
	        super(mat);
	        this.drop = drop;
	        this.meta = meta;
	        this.least_quantity = least_quantity;
	        this.most_quantity = most_quantity;
	        this.setBlockName(unlocalizedName);
	        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
	        this.setCreativeTab(Main.tabTheFourRealms);
	        this.setHardness(20.0F);
	        this.setResistance(20.0F);
	        this.setLightLevel(20.0F);
	        this.setHarvestLevel("pickaxe", 4);
	        this.setStepSound(soundTypeMetal);
		
		}
		}

	
