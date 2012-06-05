package net.minecraft.src;

import java.util.Random;

public class BlockKonungWoodTableJungle extends BlockContainer
{
        private Class TableEntityClass;
        public BlockKonungWoodTableJungle(int i, Class class1)
        {
                super(i, Material.wood);
                TableEntityClass = class1;
        }
        //”казывает TileEntity дл€ блока
        public TileEntity getBlockEntity()
        {
                try
                {
                        return (TileEntity)TableEntityClass.newInstance();
                }
                catch (Exception exception)
                {
                        throw new RuntimeException(exception);
                }
        }
        //„то дропаетс€
        public int idDropped(int i, Random random, int j)
        {
                return mod_konungFurniture.itemWoodTableJungle.shiftedIndex;
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
}