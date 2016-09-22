package theFourRealms.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

    public static Block PlatinOre;
    public static Block MeteorOre;
    public static Block TitaniumOre;
    public static Block InfinityOre;
    public static final void init() {
    	GameRegistry.registerBlock(PlatinOre = new BasicBlock("PlatinOre", Material.iron), "PlatinOre");
    	GameRegistry.registerBlock(MeteorOre = new HardBlock("MeteorOre", Material.iron), "MeteorOre");  
    	GameRegistry.registerBlock(TitaniumOre = new HardBlock("TitaniumOre", Material.iron), "TitaniumOre");  
    	GameRegistry.registerBlock(InfinityOre = new HardBlock("InfinityOre", Material.iron), "InfinityOre");  
    }

}