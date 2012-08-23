package net.minecraft.src;

import java.util.List;

public class KonungBlockRefinedPlanks extends Block
{
    /** The type of tree this block came from. */
    public static final String[] woodType = new String[] {"oak", "spruce", "birch", "jungle"};

    public KonungBlockRefinedPlanks(int par1)
    {
        super(par1, 4, Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
    	int oak = mod_konungRefinedPlanks.oakRefinedPlanksTexture;
    	int spruce = mod_konungRefinedPlanks.spruceRefinedPlanksTexture;
    	int birch = mod_konungRefinedPlanks.birchRefinedPlanksTexture;
    	int jungle = mod_konungRefinedPlanks.jungleRefinedPlanksTexture;
    	
        switch (par2)
        {
            case 1:
                return spruce;

            case 2:
                return birch;

            case 3:
                return jungle;

            default:
                return oak;
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    protected int damageDropped(int par1)
    {
        return par1;
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
}
