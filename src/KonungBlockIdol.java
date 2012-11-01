package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KonungBlockIdol extends BlockContainer
{

        public KonungBlockIdol(int par1, int par2, Class class1)
        {
        	super(par1, par2, Material.wood);
        	this.setCreativeTab(CreativeTabs.tabBlock);
        	this.setRequiresSelfNotify();
        }

        public TileEntity getBlockEntity()
        {
        	return new KonungTileEntityIdol();
        }
        
        public int idDropped(int i, Random random, int j)
        {
                return mod_konungDecorations.itemIdol.shiftedIndex;
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
                return mod_konungDecorations.modelIdolID;
        }

        public boolean isOpaqueCube()
        {
                return false;
        }

        public boolean renderAsNormalBlock()
        {
                return false;
        }
        
        protected int damageDropped(int par1)
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
       
       public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
       {
    	   this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F);
           super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
       }
       
       public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
       {
           {
               boolean var5 = (par1IBlockAccess.getBlockMetadata(par2, par3, par4) & 8) != 0;

               if (var5)
               {
                   this.setBlockBounds(0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F);
               }
               else
               {
                   this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F);
               }
           }
       }
       
       public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
       {
           if (par5Random.nextInt(100) == 0)
           {
               par1World.playSound((double)par2 + 0.5D, (double)par3 + 0.5D, (double)par4 + 0.5D, "portal.portal", 0.5F, par5Random.nextFloat() * 0.4F + 0.8F);
           }

           for (int var6 = 0; var6 < 4; ++var6)
           {
               double var7 = (double)((float)par2 + par5Random.nextFloat());
               double var9 = (double)((float)par3 + par5Random.nextFloat());
               double var11 = (double)((float)par4 + par5Random.nextFloat());
               double var13 = 0.0D;
               double var15 = 0.0D;
               double var17 = 0.0D;
               int var19 = par5Random.nextInt(2) * 2 - 1;
               var13 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
               var15 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
               var17 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;

               if (par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && par1World.getBlockId(par2 + 1, par3, par4) != this.blockID)
               {
                   var7 = (double)par2 + 0.5D + 0.25D * (double)var19;
                   var13 = (double)(par5Random.nextFloat() * 2.0F * (float)var19);
               }
               else
               {
                   var11 = (double)par4 + 0.5D + 0.25D * (double)var19;
                   var17 = (double)(par5Random.nextFloat() * 2.0F * (float)var19);
               }

               par1World.spawnParticle("portal", var7, var9, var11, var13, var15, var17);
           }
       }

	public TileEntity createNewTileEntity(World var1) 
	{

		return new KonungTileEntityIdol();
	}
       
}