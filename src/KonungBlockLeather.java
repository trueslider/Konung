package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KonungBlockLeather extends BlockContainer
{
        public KonungBlockLeather(int par1, int par2, Class class1)
        {
        	super(par1, par2, Material.wood);
        	this.setCreativeTab(CreativeTabs.tabBlock);
        	this.setRequiresSelfNotify();
        }

        public TileEntity getBlockEntity()
        {
        	return new KonungTileEntityLeather();
        }
        
        public int idDropped(int i, Random random, int j)
        {
                return mod_konungDecorations.itemLeather.iconIndex;
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
                return mod_konungDecorations.modelLeatherID;
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
       
       public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
       {
           int i = par1World.getBlockMetadata(par2, par3, par4);
           int j = i & 3;
           float f = 0.0F;
           float f1 = 0.5F;
           float f2 = 0.5F;
           float f3 = 1.0F;



           this.setBlockBounds(0.0F, f, 0.0F, 1.0F, f1, 1.0F);
           super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);

           if (j == 1)
           {
        	   this.setBlockBounds(0.5F, f2, 0.0F, 1.0F, f3, 1.0F);
               super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
           }
           else if (j == 3)
           {
        	   this.setBlockBounds(0.0F, f2, 0.0F, 0.5F, f3, 1.0F);
               super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
           }
           else if (j == 0)
           {
        	   this.setBlockBounds(0.0F, f2, 0.5F, 1.0F, f3, 1.0F);
               super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
           }
           else if (j == 2)
           {
        	   this.setBlockBounds(0.0F, f2, 0.0F, 1.0F, f3, 0.5F);
               super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
           }

           this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
       }

	public TileEntity createNewTileEntity(World var1) 
	{

		return new KonungTileEntityLeather();
	}
       
}