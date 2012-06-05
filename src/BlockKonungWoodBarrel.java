package net.minecraft.src;

import java.util.*;

public class BlockKonungWoodBarrel extends BlockContainer
{		
		private Random randombarrel;
        private Class WoodEntityClass;
        
        public BlockKonungWoodBarrel(int i, Class class1)
        {
                super(i, Material.wood);
                randombarrel = new Random();
                WoodEntityClass = class1;
        }
        
        /**
         * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
         * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
         */
        public boolean isOpaqueCube()
        {
            return false;
        }

        /**
         * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
         */
        public boolean renderAsNormalBlock()
        {
            return false;
        }

        /**
         * The type of render function that is called for this block
         */
        public int getRenderType()
        {
            return 22;
        }
        //дроп бочки
        public int idDropped(int i, Random random, int j)
        {
                return mod_konungFurniture.itemWoodBarrel.shiftedIndex;
        }

       

        /**
         * Called when the block is placed in the world.
         */
        public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
        {
            int i = par1World.getBlockId(par2, par3, par4 - 1);
            int j = par1World.getBlockId(par2, par3, par4 + 1);
            int k = par1World.getBlockId(par2 - 1, par3, par4);
            int l = par1World.getBlockId(par2 + 1, par3, par4);
            byte byte0 = 0;
            int i1 = MathHelper.floor_double((double)((par5EntityLiving.rotationYaw * 4F) / 360F) + 0.5D) & 3;

            if (i1 == 0)
            {
                byte0 = 2;
            }

            if (i1 == 1)
            {
                byte0 = 5;
            }

            if (i1 == 2)
            {
                byte0 = 3;
            }

            if (i1 == 3)
            {
                byte0 = 4;
            }
            
            if (i != blockID && j != blockID && k != blockID && l != blockID)
            {
                par1World.setBlockMetadataWithNotify(par2, par3, par4, byte0);
            }
            else
            {
                if ((i == blockID || j == blockID) && (byte0 == 4 || byte0 == 5))
                {
                    if (i == blockID)
                    {
                        par1World.setBlockMetadataWithNotify(par2, par3, par4 - 1, byte0);
                    }
                    else
                    {
                        par1World.setBlockMetadataWithNotify(par2, par3, par4 + 1, byte0);
                    }

                    par1World.setBlockMetadataWithNotify(par2, par3, par4, byte0);
                }

                if ((k == blockID || l == blockID) && (byte0 == 2 || byte0 == 3))
                {
                    if (k == blockID)
                    {
                        par1World.setBlockMetadataWithNotify(par2 - 1, par3, par4, byte0);
                    }
                    else
                    {
                        par1World.setBlockMetadataWithNotify(par2 + 1, par3, par4, byte0);
                    }

                    par1World.setBlockMetadataWithNotify(par2, par3, par4, byte0);
                }
            }
        }


        /**
         * Called whenever the block is removed.
         */
        public void onBlockRemoval(World par1World, int par2, int par3, int par4)
        {
            TileEntityKonungWoodBarrel tileentitykonungwoodbarrel = (TileEntityKonungWoodBarrel)par1World.getBlockTileEntity(par2, par3, par4);

            if (tileentitykonungwoodbarrel != null)
            {
                for (int i = 0; i < tileentitykonungwoodbarrel.getSizeInventory(); i++)
                {
                    ItemStack itemstack = tileentitykonungwoodbarrel.getStackInSlot(i);

                    if (itemstack == null)
                    {
                        continue;
                    }

                    float f0 = randombarrel.nextFloat() * 0.8F + 0.1F;
                    float f1 = randombarrel.nextFloat() * 0.8F + 0.1F;
                    float f2 = randombarrel.nextFloat() * 0.8F + 0.1F;

                    while (itemstack.stackSize > 0)
                    {
                        int j = randombarrel.nextInt(21) + 10;

                        if (j > itemstack.stackSize)
                        {
                            j = itemstack.stackSize;
                        }

                        itemstack.stackSize -= j;
                        EntityItem entitybarrelitem = new EntityItem(par1World, (float)par2 + f0, (float)par3 + f1, (float)par4 + f2, new ItemStack(itemstack.itemID, j, itemstack.getItemDamage()));
                        float f3 = 0.05F;
                        entitybarrelitem.motionX = (float)randombarrel.nextGaussian() * f3;
                        entitybarrelitem.motionY = (float)randombarrel.nextGaussian() * f3 + 0.2F;
                        entitybarrelitem.motionZ = (float)randombarrel.nextGaussian() * f3;

                        if (itemstack.hasTagCompound())
                        {
                            entitybarrelitem.item.setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                        }

                        par1World.spawnEntityInWorld(entitybarrelitem);
                    }
                }
            }

            super.onBlockRemoval(par1World, par2, par3, par4);
        }

        /**
         * Called upon block activation (left or right click on the block.). The three integers represent x,y,z of the
         * block.
         */
        public boolean blockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
        {
            Object obj = (TileEntityKonungWoodBarrel)par1World.getBlockTileEntity(par2, par3, par4);

            if (obj == null)
            {
                return true;
            }

            if (par1World.isBlockNormalCube(par2, par3 + 1, par4))
            {
                return true;
            }

            if (func_50075_j(par1World, par2, par3, par4))
            {
                return true;
            }

            if (par1World.getBlockId(par2 - 1, par3, par4) == blockID && (par1World.isBlockNormalCube(par2 - 1, par3 + 1, par4) || func_50075_j(par1World, par2 - 1, par3, par4)))
            {
                return true;
            }

            if (par1World.getBlockId(par2 + 1, par3, par4) == blockID && (par1World.isBlockNormalCube(par2 + 1, par3 + 1, par4) || func_50075_j(par1World, par2 + 1, par3, par4)))
            {
                return true;
            }

            if (par1World.getBlockId(par2, par3, par4 - 1) == blockID && (par1World.isBlockNormalCube(par2, par3 + 1, par4 - 1) || func_50075_j(par1World, par2, par3, par4 - 1)))
            {
                return true;
            }

            if (par1World.getBlockId(par2, par3, par4 + 1) == blockID && (par1World.isBlockNormalCube(par2, par3 + 1, par4 + 1) || func_50075_j(par1World, par2, par3, par4 + 1)))
            {
                return true;
            }

            if (par1World.isRemote)
            {
                return true;
            }
            else
            {
                par5EntityPlayer.displayGUIChest(((IInventory)(obj)));
                return true;
            }
        }

        /**
         * Returns the TileEntity used by this block.
         */
       public TileEntity getBlockEntity()
        {
            return new TileEntityKonungWoodBarrel();
        }

        private static boolean func_50075_j(World par0World, int par1, int par2, int par3)
        {
            for (Iterator iterator = par0World.getEntitiesWithinAABB(net.minecraft.src.EntityOcelot.class, AxisAlignedBB.getBoundingBoxFromPool(par1, par2 + 1, par3, par1 + 1, par2 + 2, par3 + 1)).iterator(); iterator.hasNext();)
            {
                Entity entity = (Entity)iterator.next();
                EntityOcelot entityocelot = (EntityOcelot)entity;

                if (entityocelot.isSitting())
                {
                    return true;
                }
            }

            return false;
        }
        
        
       /* //”казывает TileEntity дл€ блока
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
                return mod_konungFurniture.itemWoodBarrel.shiftedIndex;
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
        }*/
       
}