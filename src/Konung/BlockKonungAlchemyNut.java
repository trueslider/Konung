package net.minecraft.src.Konung;
import net.minecraft.src.*;

import java.util.Random;

public class BlockKonungAlchemyNut extends BlockFlower
{
	public BlockKonungAlchemyNut(int i, int j)
	{
		super(i, j);
		float f = 0.2F;
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		setTickRandomly(true);
	}
	
	public int idDropped(int i, Random random)
	{
		if(blockID == mod_konungAlchemy.KonungNut.blockID)
		{
			return mod_konungAlchemy.KonungNut.blockID;
		}
		else
		{
			return blockID;
		}
	}
	
	public int quantityDropped(Random random)
	{
		return 1;
	}
	
	public void updateTick(World world, int i, int j, int k, Random random)
	{
		if(random.nextInt(100) == 0)
		{
			int l = (i + random.nextInt(3)) - 1;
			int i1 = (j + random.nextInt(2)) - random.nextInt(2);
			int j1 = (k + random.nextInt(3)) - 1;
			if(world.isAirBlock(l, i1, j1) && canBlockStay(world, l, i1, j1))
			{
				world.setBlockWithNotify(l, i1, j1, blockID);
			}
		}
	}
	
    protected boolean canThisPlantGrowOnThisBlockID(int i)
    {
        return i == Block.grass.blockID || i == Block.dirt.blockID || i == Block.tilledField.blockID;
    }
	
    public boolean canBlockStay(World world, int i, int j, int k)
    {
    	if(j < 0 || j >= 128)
    	{
    		return false;
    	}else
    	{
    	return (world.getFullBlockLightValue(i, j, k) >= 8 || world.canBlockSeeTheSky(i, j, k)) && canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
    	}
    }
	
}
