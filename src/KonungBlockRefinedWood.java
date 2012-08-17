package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class KonungBlockRefinedWood extends Block
{
    /** The type of tree this log came from. */
    public static final String[] woodType = new String[] {"oak", "spruce", "birch", "jungle"};
    
    protected KonungBlockRefinedWood(int par1)
    {
        super(par1, Material.wood);
        this.blockIndexInTexture = 20;
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 31;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Block.wood.blockID;
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        byte var7 = 4;
        int var8 = var7 + 1;

        if (par1World.checkChunksExist(par2 - var8, par3 - var8, par4 - var8, par2 + var8, par3 + var8, par4 + var8))
        {
            for (int var9 = -var7; var9 <= var7; ++var9)
            {
                for (int var10 = -var7; var10 <= var7; ++var10)
                {
                    for (int var11 = -var7; var11 <= var7; ++var11)
                    {
                        int var12 = par1World.getBlockId(par2 + var9, par3 + var10, par4 + var11);

                        if (var12 == Block.leaves.blockID)
                        {
                            int var13 = par1World.getBlockMetadata(par2 + var9, par3 + var10, par4 + var11);

                            if ((var13 & 8) == 0)
                            {
                                par1World.setBlockMetadata(par2 + var9, par3 + var10, par4 + var11, var13 | 8);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
    {
        int var6 = par1World.getBlockMetadata(par2, par3, par4) & 3;
        int var7 = BlockPistonBase.determineOrientation(par1World, par2, par3, par4, (EntityPlayer)par5EntityLiving);
        byte var8 = 0;

        switch (var7)
        {
            case 0:
            case 1:
                var8 = 0;
                break;

            case 2:
            case 3:
                var8 = 8;
                break;

            case 4:
            case 5:
                var8 = 4;
        }

        par1World.setBlockMetadataWithNotify(par2, par3, par4, var6 | var8);
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
    	int top = mod_konungRefinedWood.topRefinedWoodTexture;
    	int oak = mod_konungRefinedWood.oakRefinedWoodTexture;
    	int spruce = mod_konungRefinedWood.spruceRefinedWoodTexture;
    	int birch = mod_konungRefinedWood.birchRefinedWoodTexture;
    	int jungle = mod_konungRefinedWood.jungleRefinedWoodTexture;
    	
        int var3 = par2 & 12;
        int var4 = par2 & 3;
        return var3 == 0 && (par1 == 1 || par1 == 0) ? top : (var3 == 4 && (par1 == 5 || par1 == 4) ? top : (var3 == 8 && (par1 == 2 || par1 == 3) ? top : (var4 == 1 ? spruce : (var4 == 2 ? birch : (var4 == 3 ? jungle : oak)))));
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    protected int damageDropped(int par1)
    {
        return par1 & 3;
    }

    /**
     * returns a number between 0 and 3
     */
    public static int limitToValidMetadata(int par0)
    {
        return par0 & 3;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
        par3List.add(new ItemStack(par1, 1, 3));
    }

    /**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     */
    protected ItemStack createStackedBlock(int par1)
    {
        return new ItemStack(this.blockID, 1, limitToValidMetadata(par1));
    }
}
