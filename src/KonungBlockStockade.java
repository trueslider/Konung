package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;
public class KonungBlockStockade extends Block
{	
    public KonungBlockStockade(int i, int j, Material material)
    {
        super(i, j, material);
		setLightOpacity(mod_konungStockade.SlopesOpacity);
    }    

	public int getRenderType()
    {
        return mod_konungStockade.CornersRenderID;
    } 
	
	public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {        
        return true;        
    }
	
	public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4)%8;
        
        	this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
            this.setBlockBounds(0.35F, 0.5F, 0.35F, 0.65F, 1.0F, 0.65F);
            super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
       
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
    }

    public static int func_21034_c(int i)
    {       
		return i;
    }

    public static int func_21035_d(int i)
    {        
		return i;
    }
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        par5Entity.attackEntityFrom(DamageSource.cactus, 1);
    }
}
