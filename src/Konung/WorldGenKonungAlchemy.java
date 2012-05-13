package net.minecraft.src.Konung;
import net.minecraft.src.*;

import java.util.Random;

public class WorldGenKonungAlchemy extends WorldGenerator
{
    /** The ID of the plant block used in this plant generator. */
    private int plantBlockId;

    public WorldGenKonungAlchemy(int par1)
    {
        plantBlockId = par1;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        for (int i = 0; i < 64; i++)
        {
            int j = (par3 + par2Random.nextInt(8)) - par2Random.nextInt(8);
            int k = (par4 + par2Random.nextInt(4)) - par2Random.nextInt(4);
            int l = (par5 + par2Random.nextInt(8)) - par2Random.nextInt(8);

            if (par1World.isAirBlock(j, k, l) && ((BlockFlower)Block.blocksList[plantBlockId]).canBlockStay(par1World, j, k, l))
            {
                par1World.setBlock(j, k, l, plantBlockId);
            }
        }

        return true;
    }
}

