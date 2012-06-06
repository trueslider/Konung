package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class BiomeGenForestLand extends BiomeGenBase
{

        public BiomeGenForestLand(int par1)
        {
                super(par1);
                spawnableCreatureList.clear();
                topBlock = (byte)Block.sand.blockID;
                fillerBlock = (byte)Block.dirt.blockID;
                
                biomeDecorator.treesPerChunk = 0;
                biomeDecorator.flowersPerChunk = 100;
                biomeDecorator.grassPerChunk = 0;
                minHeight = 0.0F;
                maxHeight = 0.0F;
        }
        
        public void decorate(World par1World, Random par2Random, int par3, int par4)
        {
        	super.decorate(par1World, par2Random, par3, par4);

            if (par2Random.nextInt(10) == 0)
            {
                int i = par3 + par2Random.nextInt(16) + 16;
                int j = par4 + par2Random.nextInt(16) + 16;
                WorldGenKonungStructure worldgenkonungstructure = new WorldGenKonungStructure();
                worldgenkonungstructure.generate(par1World, par2Random, i, par1World.getHeightValue(i, j), j);
            }
        }
        
        
}