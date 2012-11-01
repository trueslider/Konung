package net.minecraft.src;

import java.util.*;


public class KonungBlockBarrel extends BlockContainer
{		
		private Random random;
        
        public KonungBlockBarrel(int par1, int par2, Class class1)
        {
                super(par1, par2, Material.wood);
            	this.setCreativeTab(CreativeTabs.tabBlock);
            	this.setRequiresSelfNotify();
                random = new Random();
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
            return mod_konungDecorations.modelBarrelID;
        }
        
        /** 
         * Дроп бочки
         */
        public int idDropped(int i, Random random, int j)
        {
                return mod_konungDecorations.itemBarrel.shiftedIndex;
        }

       

        /**
         * Called when the block is placed in the world.
         */
        public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
        {
            int var6 = par1World.getBlockId(par2, par3, par4 - 1);
            int var7 = par1World.getBlockId(par2, par3, par4 + 1);
            int var8 = par1World.getBlockId(par2 - 1, par3, par4);
            int var9 = par1World.getBlockId(par2 + 1, par3, par4);
            byte var10 = 0;
            int var11 = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

            if (var11 == 0)
            {
                var10 = 2;
            }

            if (var11 == 1)
            {
                var10 = 5;
            }

            if (var11 == 2)
            {
                var10 = 3;
            }

            if (var11 == 3)
            {
                var10 = 4;
            }

            if (var6 != this.blockID && var7 != this.blockID && var8 != this.blockID && var9 != this.blockID)
            {
                par1World.setBlockMetadataWithNotify(par2, par3, par4, var10);
            }
            else
            {
                if ((var6 == this.blockID || var7 == this.blockID) && (var10 == 4 || var10 == 5))
                {
                    if (var6 == this.blockID)
                    {
                        par1World.setBlockMetadataWithNotify(par2, par3, par4 - 1, var10);
                    }
                    else
                    {
                        par1World.setBlockMetadataWithNotify(par2, par3, par4 + 1, var10);
                    }

                    par1World.setBlockMetadataWithNotify(par2, par3, par4, var10);
                }

                if ((var8 == this.blockID || var9 == this.blockID) && (var10 == 2 || var10 == 3))
                {
                    if (var8 == this.blockID)
                    {
                        par1World.setBlockMetadataWithNotify(par2 - 1, par3, par4, var10);
                    }
                    else
                    {
                        par1World.setBlockMetadataWithNotify(par2 + 1, par3, par4, var10);
                    }

                    par1World.setBlockMetadataWithNotify(par2, par3, par4, var10);
                }
            }
        }
        /**
         * ejects contained items into the world, and notifies neighbours of an update, as appropriate
         */
        public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
        {
            KonungTileEntityBarrel var7 = (KonungTileEntityBarrel)par1World.getBlockTileEntity(par2, par3, par4);

            if (var7 != null)
            {
                for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8)
                {
                    ItemStack var9 = var7.getStackInSlot(var8);

                    if (var9 != null)
                    {
                        float var10 = this.random.nextFloat() * 0.8F + 0.1F;
                        float var11 = this.random.nextFloat() * 0.8F + 0.1F;
                        EntityItem var14;

                        for (float var12 = this.random.nextFloat() * 0.8F + 0.1F; var9.stackSize > 0; par1World.spawnEntityInWorld(var14))
                        {
                            int var13 = this.random.nextInt(21) + 10;

                            if (var13 > var9.stackSize)
                            {
                                var13 = var9.stackSize;
                            }

                            var9.stackSize -= var13;
                            var14 = new EntityItem(par1World, (double)((float)par2 + var10), (double)((float)par3 + var11), (double)((float)par4 + var12), new ItemStack(var9.itemID, var13, var9.getItemDamage()));
                            float var15 = 0.05F;
                            var14.motionX = (double)((float)this.random.nextGaussian() * var15);
                            var14.motionY = (double)((float)this.random.nextGaussian() * var15 + 0.2F);
                            var14.motionZ = (double)((float)this.random.nextGaussian() * var15);

                            if (var9.hasTagCompound())
                            {
                                var14.item.setTagCompound((NBTTagCompound)var9.getTagCompound().copy());
                            }
                        }
                    }
                }
            }

            super.breakBlock(par1World, par2, par3, par4, par5, par6);
        }
        /**
         * Called upon block activation (right click on the block.)
         */
        public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
        {
            Object var10 = (KonungTileEntityBarrel)par1World.getBlockTileEntity(par2, par3, par4);

            if (var10 == null)
            {
                return true;
            }
            else if (par1World.isBlockNormalCube(par2, par3 + 1, par4))
            {
                return true;
            }
            else if (isOcelotBlockingChest(par1World, par2, par3, par4))
            {
                return true;
            }
            else if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && (par1World.isBlockNormalCube(par2 - 1, par3 + 1, par4) || isOcelotBlockingChest(par1World, par2 - 1, par3, par4)))
            {
                return true;
            }
            else if (par1World.getBlockId(par2 + 1, par3, par4) == this.blockID && (par1World.isBlockNormalCube(par2 + 1, par3 + 1, par4) || isOcelotBlockingChest(par1World, par2 + 1, par3, par4)))
            {
                return true;
            }
            else if (par1World.getBlockId(par2, par3, par4 - 1) == this.blockID && (par1World.isBlockNormalCube(par2, par3 + 1, par4 - 1) || isOcelotBlockingChest(par1World, par2, par3, par4 - 1)))
            {
                return true;
            }
            else if (par1World.getBlockId(par2, par3, par4 + 1) == this.blockID && (par1World.isBlockNormalCube(par2, par3 + 1, par4 + 1) || isOcelotBlockingChest(par1World, par2, par3, par4 + 1)))
            {
                return true;
            }
            else
            {
                if (par1World.isRemote)
                {
                    return true;
                }
                else
                {
                    par5EntityPlayer.displayGUIChest((IInventory)var10);
                    return true;
                }
            }
        }
        
        /**
         * each class overrdies this to return a new <className>
         */
        public TileEntity createNewTileEntity(World par1World)
        {
            return new KonungTileEntityBarrel();
        }
        
        /**
         * Looks for a sitting ocelot within certain bounds. Such an ocelot is considered to be blocking access to the
         * chest.
         */
        private static boolean isOcelotBlockingChest(World par0World, int par1, int par2, int par3)
        {
            Iterator var4 = par0World.getEntitiesWithinAABB(EntityOcelot.class, AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)par1, (double)(par2 + 1), (double)par3, (double)(par1 + 1), (double)(par2 + 2), (double)(par3 + 1))).iterator();
            EntityOcelot var6;

            do
            {
                if (!var4.hasNext())
                {
                    return false;
                }

                EntityOcelot var5 = (EntityOcelot)var4.next();
                var6 = (EntityOcelot)var5;
            }
            while (!var6.isSitting());

            return true;
        }

        /**
         * Returns the TileEntity used by this block.
         */
       public TileEntity getBlockEntity()
        {
            return new KonungTileEntityBarrel();
        }

        private static boolean func_50075_j(World par0World, int par1, int par2, int par3)
        {
            for (Iterator iterator = par0World.getEntitiesWithinAABB(net.minecraft.src.EntityOcelot.class, AxisAlignedBB.getBoundingBox(par1, par2 + 1, par3, par1 + 1, par2 + 2, par3 + 1)).iterator(); iterator.hasNext();)
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

}