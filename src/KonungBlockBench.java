package net.minecraft.src;

import java.util.Random;
import java.util.List;

public class KonungBlockBench extends BlockContainer
{

        public KonungBlockBench(int par1, int par2, Class class1)
        {
        	super(par1, par2, Material.wood);
        	this.setCreativeTab(CreativeTabs.tabBlock);
        	this.setRequiresSelfNotify();
        }
        
        /**
         * Updates the blocks bounds based on its current state. Args: world, x, y, z
         */
        public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
        {
            {
                boolean var5 = (par1IBlockAccess.getBlockMetadata(par2, par3, par4) & 8) != 0;

                if (var5)
                {
                    this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
                }
                else
                {
                    this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
                }
            }
        }

        public TileEntity getBlockEntity()
        {
        	return new KonungTileEntityBench();
        }
        
        public int idDropped(int i, Random random, int j)
        {
                return mod_konungDecorations.itemBench.iconIndex;
        }

        public int quantityDropped(Random random)
        {
                return 1;
        }
        
        /*
         * Устанавливаем тип рендера.
         */
        public int getRenderType()
        {
                return mod_konungDecorations.modelBenchID;
        }

        public boolean isOpaqueCube()
        {
                return false;
        }

        public boolean renderAsNormalBlock()
        {
                return false;
        }
        
        public int damageDropped(int par1)
        {
        	return par1;
        }
        
       public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
        {
                int p = MathHelper.floor_double((double)((par5EntityLiving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
                byte byte0 = 3;
                
                
                                if (p == 0)
                                {
                                                byte0 = 4;
                                }
                                if (p == 1)
                                {
                                                byte0 = 3;
                                }
                                if (p == 2)
                                {
                                                byte0 = 2;
                                }
                                if (p == 3)
                                {
                                                byte0 = 1;
                                }
                                par1World.setBlockMetadataWithNotify(par2, par3, par4, byte0);
                                
        }

	public TileEntity createNewTileEntity(World var1) 
	{

		return new KonungTileEntityBench();
	}
       
}