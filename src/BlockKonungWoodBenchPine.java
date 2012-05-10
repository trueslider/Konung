package net.minecraft.src;
import java.util.ArrayList;
import java.util.Random;

public class BlockKonungWoodBenchPine extends BlockContainer
{
        private Class BenchEntityClass;
        public BlockKonungWoodBenchPine(int i, Class class1)
        {
                super(i, Material.wood);
                BenchEntityClass = class1;
        }
        //”казывает TileEntity дл€ блока
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
        //„то дропаетс€
        public int idDropped(int i, Random random, int j)
        {
                return mod_konungFurniture.itemWoodBenchPine.shiftedIndex;
        }
        // оличество дропа
        public int quantityDropped(Random random)
        {
                return 1;
        }
        //“ип рендера дл€ блока
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
        public void getCollidingBoundingBoxes(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, ArrayList par6ArrayList)
        {
          	setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
          	super.getCollidingBoundingBoxes(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList);
        }
        
        /* вз€то из Seatable Chairs 1.3 by ITOS*/
        
        public boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer)
        {
        	if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().getItem() instanceof ItemSign)
        	{
        		return false;
        	} 
        	else 
        	{
        		return BlockKonungMountable.blockActivated(world, i, j, k, entityplayer, 0.25F, 0.5F, 0.5F, 0, 1, 2, 3);
        	}
        }

        public void onBlockPlacedBy1(World world, int i, int j, int k, EntityLiving entityliving)
        {
            int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
            if (l == 0)
            {
                world.setBlockMetadataWithNotify(i, j, k, 2);
            }
            if (l == 1)
            {
                world.setBlockMetadataWithNotify(i, j, k, 1);
            }
            if (l == 2)
            {
                world.setBlockMetadataWithNotify(i, j, k, 3);
            }
            if (l == 3)
            {
                world.setBlockMetadataWithNotify(i, j, k, 0);
            }
        }
}