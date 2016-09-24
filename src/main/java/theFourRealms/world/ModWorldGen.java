package theFourRealms.world;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import theFourRealms.block.ModBlocks;

public class ModWorldGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0: // Overworld
			this.runGenerator(this.gen_Meteorore, world, random, chunkX, chunkZ, 20, 0, 64);
	        
			break;
		case -1: // Nether

			break;
		case 1: // End

			break;
		}
	}

	private WorldGenerator gen_Meteorore; //Generates Tutorial Ore (used in Overworld)

	public ModWorldGen() {
	    this.gen_Meteorore = new WorldGenMinable(ModBlocks.MeteorOre, 8);
	   
	}
	    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	        int heightDiff = maxHeight - minHeight + 1;
	        for (int i = 0; i < chancesToSpawn; i ++) {
	            int x = chunk_X * 16 + rand.nextInt(16);
	            int y = minHeight + rand.nextInt(heightDiff);
	            int z = chunk_Z * 16 + rand.nextInt(16);
	            generator.generate(world, rand, x, y, z);
	        }}}