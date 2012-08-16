package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KonungBlockLeatherBanner extends BlockContainer
{
        private Class BenchEntityClass;
        public KonungBlockLeatherBanner(int i, Class class1)
        {
                super(i, Material.wood);
                BenchEntityClass = class1;
        }
        //Указывает TileEntity для блока
        public TileEntity getBlockEntity()
        {
                try
                {
                        return (TileEntity)BenchEntityClass.newInstance();
                }
                catch (Exception exception)
                {
                        throw new RuntimeException(exception);
                }
        }
        //Что дропается
        public int idDropped(int i, Random random, int j)
        {
                return mod_konungFurniture.itemLeatherBanner.shiftedIndex;
        }
        //Количество дропа
        public int quantityDropped(Random random)
        {
                return 1;
        }
        //Тип рендера для блока
        public int getRenderType()
        {
                return -1;
        }
        //False значит что блок не прозрачный
        public boolean isOpaqueCube()
        {
                return false;
        }
        //False значит что блок не обычный пример таблички, ступеньки и т.д
        public boolean renderAsNormalBlock()
        {
                return false;
        }
        
       public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
        {
                int p = MathHelper.floor_double((double)((par5EntityLiving.rotationYaw * 4F) / 360F) + 0.5D) & 3; //поворот в сторону игрока
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
       //задание коллизии
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
	@Override
	public TileEntity createNewTileEntity(World var1) {

		return new KonungTileEntityLeatherBanner();
	}
}