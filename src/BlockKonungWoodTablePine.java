package net.minecraft.src;

import java.util.Random;

public class BlockKonungWoodTablePine extends BlockContainer
{
        private Class TablePineEntityClass;
        public BlockKonungWoodTablePine(int i, Class class1)
        {
                super(i, Material.wood);
                TablePineEntityClass = class1;
        }
        //��������� TileEntity ��� �����
        public TileEntity getBlockEntity()
        {
                try
                {
                        return (TileEntity)TablePineEntityClass.newInstance();
                }
                catch (Exception exception)
                {
                        throw new RuntimeException(exception);
                }
        }
        //��� ���������
        public int idDropped(int i, Random random, int j)
        {
                return mod_konungFurniture.itemWoodTablePine.shiftedIndex;
        }
        //���������� �����
        public int quantityDropped(Random random)
        {
                return 1;
        }
        //��� ������� ��� �����
        public int getRenderType()
        {
                return -1;
        }
        //False ������ ��� ���� �� ����������
        public boolean isOpaqueCube()
        {
                return false;
        }
        //False ������ ��� ���� �� ������� ������ ��������, ��������� � �.�
        public boolean renderAsNormalBlock()
        {
                return false;
        }
        
       public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
        {
                int p = MathHelper.floor_double((double)((par5EntityLiving.rotationYaw * 4F) / 360F) + 0.5D) & 3; //������� � ������� ������
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