package net.minecraft.src.Konung;
import net.minecraft.src.*;
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

        /**DELETED
         * Called whenever the block is added into the world. Args: world, x, y, z
         */
        /*public void onBlockAdded(World par1World, int par2, int par3, int par4)
        {
            super.onBlockAdded(par1World, par2, par3, par4);
            unifyAdjacentChests(par1World, par2, par3, par4);
            int i = par1World.getBlockId(par2, par3, par4 - 1);
            int j = par1World.getBlockId(par2, par3, par4 + 1);
            int k = par1World.getBlockId(par2 - 1, par3, par4);
            int l = par1World.getBlockId(par2 + 1, par3, par4);

            if (i == blockID)
            {
                unifyAdjacentChests(par1World, par2, par3, par4 - 1);
            }

            if (j == blockID)
            {
                unifyAdjacentChests(par1World, par2, par3, par4 + 1);
            }

            if (k == blockID)
            {
                unifyAdjacentChests(par1World, par2 - 1, par3, par4);
            }

            if (l == blockID)
            {
                unifyAdjacentChests(par1World, par2 + 1, par3, par4);
            }
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

       /**DELETED
         * Turns the adjacent chests to a double chest.
         */
        /*public void unifyAdjacentChests(World par1World, int par2, int par3, int par4)
        {
            if (par1World.isRemote)
            {
                return;
            }

            int i = par1World.getBlockId(par2, par3, par4 - 1);
            int j = par1World.getBlockId(par2, par3, par4 + 1);
            int k = par1World.getBlockId(par2 - 1, par3, par4);
            int l = par1World.getBlockId(par2 + 1, par3, par4);
            byte byte0 = 4;

            if (i == blockID || j == blockID)
            {
                int i1 = par1World.getBlockId(par2 - 1, par3, i != blockID ? par4 + 1 : par4 - 1);
                int k1 = par1World.getBlockId(par2 + 1, par3, i != blockID ? par4 + 1 : par4 - 1);
                byte0 = 5;
                int i2 = -1;

                if (i == blockID)
                {
                    i2 = par1World.getBlockMetadata(par2, par3, par4 - 1);
                }
                else
                {
                    i2 = par1World.getBlockMetadata(par2, par3, par4 + 1);
                }

                if (i2 == 4)
                {
                    byte0 = 4;
                }

                if ((Block.opaqueCubeLookup[k] || Block.opaqueCubeLookup[i1]) && !Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[k1])
                {
                    byte0 = 5;
                }

                if ((Block.opaqueCubeLookup[l] || Block.opaqueCubeLookup[k1]) && !Block.opaqueCubeLookup[k] && !Block.opaqueCubeLookup[i1])
                {
                    byte0 = 4;
                }
            }
            else if (k == blockID || l == blockID)
            {
                int j1 = par1World.getBlockId(k != blockID ? par2 + 1 : par2 - 1, par3, par4 - 1);
                int l1 = par1World.getBlockId(k != blockID ? par2 + 1 : par2 - 1, par3, par4 + 1);
                byte0 = 3;
                int j2 = -1;

                if (k == blockID)
                {
                    j2 = par1World.getBlockMetadata(par2 - 1, par3, par4);
                }
                else
                {
                    j2 = par1World.getBlockMetadata(par2 + 1, par3, par4);
                }

                if (j2 == 2)
                {
                    byte0 = 2;
                }

                if ((Block.opaqueCubeLookup[i] || Block.opaqueCubeLookup[j1]) && !Block.opaqueCubeLookup[j] && !Block.opaqueCubeLookup[l1])
                {
                    byte0 = 3;
                }

                if ((Block.opaqueCubeLookup[j] || Block.opaqueCubeLookup[l1]) && !Block.opaqueCubeLookup[i] && !Block.opaqueCubeLookup[j1])
                {
                    byte0 = 2;
                }
            }
            else
            {
                byte0 = 3;

                if (Block.opaqueCubeLookup[i] && !Block.opaqueCubeLookup[j])
                {
                    byte0 = 3;
                }

                if (Block.opaqueCubeLookup[j] && !Block.opaqueCubeLookup[i])
                {
                    byte0 = 2;
                }

                if (Block.opaqueCubeLookup[k] && !Block.opaqueCubeLookup[l])
                {
                    byte0 = 5;
                }

                if (Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[k])
                {
                    byte0 = 4;
                }
            }

            par1World.setBlockMetadataWithNotify(par2, par3, par4, byte0);
        }

        /**DELETED
         * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
         */
        /*public int getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
        {
            if (par5 == 1)
            {
                return blockIndexInTexture - 1;
            }

            if (par5 == 0)
            {
                return blockIndexInTexture - 1;
            }

            int i = par1IBlockAccess.getBlockId(par2, par3, par4 - 1);
            int j = par1IBlockAccess.getBlockId(par2, par3, par4 + 1);
            int k = par1IBlockAccess.getBlockId(par2 - 1, par3, par4);
            int l = par1IBlockAccess.getBlockId(par2 + 1, par3, par4);

            if (i == blockID || j == blockID)
            {
                if (par5 == 2 || par5 == 3)
                {
                    return blockIndexInTexture;
                }

                int i1 = 0;

                if (i == blockID)
                {
                    i1 = -1;
                }

                int k1 = par1IBlockAccess.getBlockId(par2 - 1, par3, i != blockID ? par4 + 1 : par4 - 1);
                int i2 = par1IBlockAccess.getBlockId(par2 + 1, par3, i != blockID ? par4 + 1 : par4 - 1);

                if (par5 == 4)
                {
                    i1 = -1 - i1;
                }

                byte byte1 = 5;

                if ((Block.opaqueCubeLookup[k] || Block.opaqueCubeLookup[k1]) && !Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[i2])
                {
                    byte1 = 5;
                }

                if ((Block.opaqueCubeLookup[l] || Block.opaqueCubeLookup[i2]) && !Block.opaqueCubeLookup[k] && !Block.opaqueCubeLookup[k1])
                {
                    byte1 = 4;
                }

                return (par5 != byte1 ? blockIndexInTexture + 32 : blockIndexInTexture + 16) + i1;
            }

            if (k == blockID || l == blockID)
            {
                if (par5 == 4 || par5 == 5)
                {
                    return blockIndexInTexture;
                }

                int j1 = 0;

                if (k == blockID)
                {
                    j1 = -1;
                }

                int l1 = par1IBlockAccess.getBlockId(k != blockID ? par2 + 1 : par2 - 1, par3, par4 - 1);
                int j2 = par1IBlockAccess.getBlockId(k != blockID ? par2 + 1 : par2 - 1, par3, par4 + 1);

                if (par5 == 3)
                {
                    j1 = -1 - j1;
                }

                byte byte2 = 3;

                if ((Block.opaqueCubeLookup[i] || Block.opaqueCubeLookup[l1]) && !Block.opaqueCubeLookup[j] && !Block.opaqueCubeLookup[j2])
                {
                    byte2 = 3;
                }

                if ((Block.opaqueCubeLookup[j] || Block.opaqueCubeLookup[j2]) && !Block.opaqueCubeLookup[i] && !Block.opaqueCubeLookup[l1])
                {
                    byte2 = 2;
                }

                return (par5 != byte2 ? blockIndexInTexture + 32 : blockIndexInTexture + 16) + j1;
            }

            byte byte0 = 3;

            if (Block.opaqueCubeLookup[i] && !Block.opaqueCubeLookup[j])
            {
                byte0 = 3;
            }

            if (Block.opaqueCubeLookup[j] && !Block.opaqueCubeLookup[i])
            {
                byte0 = 2;
            }

            if (Block.opaqueCubeLookup[k] && !Block.opaqueCubeLookup[l])
            {
                byte0 = 5;
            }

            if (Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[k])
            {
                byte0 = 4;
            }

            return par5 != byte0 ? blockIndexInTexture : blockIndexInTexture + 1;
        }

        /**DELETED
         * Returns the block texture based on the side being looked at.  Args: side
         */
      
        /*public int getBlockTextureFromSide(int par1)
        {
            if (par1 == 1)
            {
                return blockIndexInTexture - 1;
            }

            if (par1 == 0)
            {
                return blockIndexInTexture - 1;
            }

            if (par1 == 3)
            {
                return blockIndexInTexture + 1;
            }
            else
            {
                return blockIndexInTexture;
            }
        }

        /**DELETED
         * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
         */
        /*public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
        {
            int i = 0;

            if (par1World.getBlockId(par2 - 1, par3, par4) == blockID)
            {
                i++;
            }

            if (par1World.getBlockId(par2 + 1, par3, par4) == blockID)
            {
                i++;
            }

            if (par1World.getBlockId(par2, par3, par4 - 1) == blockID)
            {
                i++;
            }

            if (par1World.getBlockId(par2, par3, par4 + 1) == blockID)
            {
                i++;
            }

            if (i > 1)
            {
                return false;
            }

            if (isThereANeighborChest(par1World, par2 - 1, par3, par4))
            {
                return false;
            }

            if (isThereANeighborChest(par1World, par2 + 1, par3, par4))
            {
                return false;
            }

            if (isThereANeighborChest(par1World, par2, par3, par4 - 1))
            {
                return false;
            }

            return !isThereANeighborChest(par1World, par2, par3, par4 + 1);
        }

        /**DELETED
         * Checks the neighbor blocks to see if there is a chest there. Args: world, x, y, z
         */
        /*private boolean isThereANeighborChest(World par1World, int par2, int par3, int par4)
        {
            if (par1World.getBlockId(par2, par3, par4) != blockID)
            {
                return false;
            }

            if (par1World.getBlockId(par2 - 1, par3, par4) == blockID)
            {
                return true;
            }

            if (par1World.getBlockId(par2 + 1, par3, par4) == blockID)
            {
                return true;
            }

            if (par1World.getBlockId(par2, par3, par4 - 1) == blockID)
            {
                return true;
            }

            return par1World.getBlockId(par2, par3, par4 + 1) == blockID;
        }

        /**DELETED
         * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
         * their own) Args: x, y, z, neighbor blockID
         */
        /*public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
        {
            super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
            TileEntityKonungWoodBarrel TileEntityKonungWoodBarrel = (TileEntityKonungWoodBarrel)par1World.getBlockTileEntity(par2, par3, par4);

            if (TileEntityKonungWoodBarrel != null)
            {
                TileEntityKonungWoodBarrel.updateContainingBlockInfo();
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
            //Deleted
           /* if (par1World.getBlockId(par2 - 1, par3, par4) == blockID)
            {
                obj = new InventoryLargeChest("Large chest", (TileEntityKonungWoodBarrel)par1World.getBlockTileEntity(par2 - 1, par3, par4), ((IInventory)(obj)));
            }

            if (par1World.getBlockId(par2 + 1, par3, par4) == blockID)
            {
                obj = new InventoryLargeChest("Large chest", ((IInventory)(obj)), (TileEntityKonungWoodBarrel)par1World.getBlockTileEntity(par2 + 1, par3, par4));
            }

            if (par1World.getBlockId(par2, par3, par4 - 1) == blockID)
            {
                obj = new InventoryLargeChest("Large chest", (TileEntityKonungWoodBarrel)par1World.getBlockTileEntity(par2, par3, par4 - 1), ((IInventory)(obj)));
            }

            if (par1World.getBlockId(par2, par3, par4 + 1) == blockID)
            {
                obj = new InventoryLargeChest("Large chest", ((IInventory)(obj)), (TileEntityKonungWoodBarrel)par1World.getBlockTileEntity(par2, par3, par4 + 1));
            }*/
			//Deleted

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
        
        
       /* //��������� TileEntity ��� �����
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
        //��� ���������
        public int idDropped(int i, Random random, int j)
        {
                return mod_konungFurniture.itemWoodBarrel.shiftedIndex;
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
        }*/
       
}