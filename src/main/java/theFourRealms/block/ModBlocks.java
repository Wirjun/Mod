package theFourRealms.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

    public static Block PlatinOre;
    public static Block MeteorOre;
    public static final void init() {
    	GameRegistry.registerBlock(PlatinOre = new BasicBlock("PlatinOre", Material.iron), "PlatinOre");
    	GameRegistry.registerBlock(MeteorOre = new HardBlock("MeteorOre", Material.iron), "MeteorOre");  
    }

}