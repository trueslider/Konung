package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;

public class BlockKonungPlanks extends Block
{

	public BlockKonungPlanks(int i, int j)
	{
		super(i, j, Material.wood);
	}
          
	/**
	 * Called when the block is placed in the world.
	 */
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
	{
		int i = MathHelper.floor_double((double)((par5EntityLiving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
		int j = par1World.getBlockMetadata(par2, par3, par4) & 4;

		if (i == 0)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 2 | j);
		}

		if (i == 1)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 1 | j);
		}

		if (i == 2)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3 | j);
		}

		if (i == 3)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 0 | j);
		}
	}

	/**
	 * Called when a block is placed using an item. Used often for taking the facing and figuring out how to position
	 * the item. Args: x, y, z, facing
	 */
	public void onBlockPlaced(World par1World, int par2, int par3, int par4, int par5)
	{
		if (par5 == 0)
		{
			int i = par1World.getBlockMetadata(par2, par3, par4);
			par1World.setBlockMetadataWithNotify(par2, par3, par4, i | 4);
		}
	}
          
	public void setBlockBoundsBasedOnState(IBlockAccess iblockaccess, int i, int j, int k)
	{
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}         
	public boolean isOpaqueCube()
	{
		return false;
	}
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	public int getRenderType()
	{
		return 10;
	}
}