package theFourRealms.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import theFourRealms.items.ModItems;

public final class ModBlocks {

    public static Block PlatinOre;
    public static Block MeteorOre;
    public static Block TitaniumOre;
    public static Block InfinityOre;
    public static final void init() {
    	GameRegistry.registerBlock(PlatinOre = new HardBlock("PlatinOre", Material.iron, null, 0, 0, 0), "PlatinOre");
    	GameRegistry.registerBlock(MeteorOre = new BasicBlock("MeteorOre", Material.iron), "MeteorOre");  
    	GameRegistry.registerBlock(TitaniumOre = new HardBlock("TitaniumOre", Material.iron, null, 0, 0, 0), "TitaniumOre");  
    	GameRegistry.registerBlock(InfinityOre = new HardBlock("InfinityOre", Material.iron, null, 0, 0, 0), "InfinityOre");  
    }

}