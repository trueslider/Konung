package net.minecraft.src;

import java.util.Random;

public class KonungBlockWindow extends BlockContainer
{
        private Class BenchEntityClass;
        public KonungBlockWindow(int i, Class class1)
        {
                super(i, Material.wood);
                BenchEntityClass = class1;
        }
        //РЈРєР°Р·С‹РІР°РµС‚ TileEntity РґР»СЏ Р±Р»РѕРєР°
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
        //Р§С‚Рѕ РґСЂРѕРїР°РµС‚СЃСЏ
        public int idDropped(int i, Random random, int j)
        {
                return mod_konungFurniture.itemWindow.shiftedIndex;
        }
        //РљРѕР»РёС‡РµСЃС‚РІРѕ РґСЂРѕРїР°
        public int quantityDropped(Random random)
        {
                return 1;
        }
        //РўРёРї СЂРµРЅРґРµСЂР° РґР»СЏ Р±Р»РѕРєР°
        public int getRenderType()
        {
                return -1;
        }
        //False Р·РЅР°С‡РёС‚ С‡С‚Рѕ Р±Р»РѕРє РЅРµ РїСЂРѕР·СЂР°С‡РЅС‹Р№
        public boolean isOpaqueCube()
        {
                return false;
        }
        //False Р·РЅР°С‡РёС‚ С‡С‚Рѕ Р±Р»РѕРє РЅРµ РѕР±С‹С‡РЅС‹Р№ РїСЂРёРјРµСЂ С‚Р°Р±Р»РёС‡РєРё, СЃС‚СѓРїРµРЅСЊРєРё Рё С‚.Рґ
        public boolean renderAsNormalBlock()
        {
                return false;
        }
        
       public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
        {
                int p = MathHelper.floor_double((double)((par5EntityLiving.rotationYaw * 4F) / 360F) + 0.5D) & 3; //РїРѕРІРѕСЂРѕС‚ РІ СЃС‚РѕСЂРѕРЅСѓ РёРіСЂРѕРєР°
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
	@Override
	public TileEntity createNewTileEntity(World var1) {

		return new KonungTileEntityWindow();
	}
       
}