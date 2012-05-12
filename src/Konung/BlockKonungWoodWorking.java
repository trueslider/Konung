// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.Konung;
import net.minecraft.src.*;
import java.util.Random;


// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, Block, World, 
//            IBlockAccess, TileEntityFurnace, EntityPlayer, TileEntity, 
//            EntityLiving, MathHelper, IInventory, ItemStack, 
//            EntityItem

public class BlockKonungWoodWorking extends BlockContainer
{
    private Random woodWorkRand;
    private final boolean isActive;
    private static boolean keepWoodWorkInventory = false;
    
    public BlockKonungWoodWorking(int i, boolean flag)
    {
        super(i, Material.wood);
        woodWorkRand = new Random();
        isActive = flag;
    }
        public int idDropped(int i, Random random)
    {
        return mod_konungWoodWorking.woodWorking.blockID;
    }

    public void onBlockAdded(World world, int i, int j, int k)
    {
        super.onBlockAdded(world, i, j, k);
        setDefaultDirection(world, i, j, k);
    }

    private void setDefaultDirection(World world, int i, int j, int k)
    {
        if(world.isRemote)
        {
            return;
        }
        int l = world.getBlockId(i, j, k - 1);
        int i1 = world.getBlockId(i, j, k + 1);
        int j1 = world.getBlockId(i - 1, j, k);
        int k1 = world.getBlockId(i + 1, j, k);
        byte byte0 = 3;
        if(Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[i1])
        {
            byte0 = 3;
        }
        if(Block.opaqueCubeLookup[i1] && !Block.opaqueCubeLookup[l])
        {
            byte0 = 2;
        }
        if(Block.opaqueCubeLookup[j1] && !Block.opaqueCubeLookup[k1])
        {
            byte0 = 5;
        }
        if(Block.opaqueCubeLookup[k1] && !Block.opaqueCubeLookup[j1])
        {
            byte0 = 4;
        }
        world.setBlockMetadataWithNotify(i, j, k, byte0);
    }
    
    public int getBlockTexture(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        if(l == 1)
        {
            return mod_konungWoodWorking.side1;
        }
        if(l == 0)
        {
            return mod_konungWoodWorking.side1;
        }
        int i1 = iblockaccess.getBlockMetadata(i, j, k);
        if(l != i1)
        {
            return mod_konungWoodWorking.side1;
        }
        else
        {
            return mod_konungWoodWorking.side2;
        }
    }

    public int getBlockTextureFromSide(int side)
    {
              if (side == 3)
              {
            	  return mod_konungWoodWorking.side2;
              }
              else
              {
            	  return mod_konungWoodWorking.side1;
              }
    }

    public boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        if(world.isRemote)
        {
            return true;
        } else
        {
            TileEntityKonungWoodWorking tileentitywoodworking = (TileEntityKonungWoodWorking)world.getBlockTileEntity(i, j, k);
            ModLoader.openGUI(entityplayer, new GuiKonungWoodWorking(entityplayer.inventory, tileentitywoodworking));
            return true;
        }
    }
    public TileEntity getBlockEntity()
    {
        return new TileEntityKonungWoodWorking();
    }

    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
    {
        int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        if(l == 0)
        {
            world.setBlockMetadataWithNotify(i, j, k, 2);
        }
        if(l == 1)
        {
            world.setBlockMetadataWithNotify(i, j, k, 5);
        }
        if(l == 2)
        {
            world.setBlockMetadataWithNotify(i, j, k, 3);
        }
        if(l == 3)
        {
            world.setBlockMetadataWithNotify(i, j, k, 4);
        }
    }

    public void onBlockRemoval(World world, int i, int j, int k)
    {
        if(!keepWoodWorkInventory)
        {
        	TileEntityKonungWoodWorking tileentityfreezer = (TileEntityKonungWoodWorking)world.getBlockTileEntity(i, j, k);
label0:
            for(int l = 0; l < tileentityfreezer.getSizeInventory(); l++)
            {
                ItemStack itemstack = tileentityfreezer.getStackInSlot(l);
                if(itemstack == null)
                {
                    continue;
                }
                float f = woodWorkRand.nextFloat() * 0.8F + 0.1F;
                float f1 = woodWorkRand.nextFloat() * 0.8F + 0.1F;
                float f2 = woodWorkRand.nextFloat() * 0.8F + 0.1F;
                do
                {
                    if(itemstack.stackSize <= 0)
                    {
                        continue label0;
                    }
                    int i1 = woodWorkRand.nextInt(21) + 10;
                    if(i1 > itemstack.stackSize)
                    {
                        i1 = itemstack.stackSize;
                    }
                    itemstack.stackSize -= i1;
                    EntityItem entityitem = new EntityItem(world, (float)i + f, (float)j + f1, (float)k + f2, new ItemStack(itemstack.itemID, i1, itemstack.getItemDamage()));
                    float f3 = 0.05F;
                    entityitem.motionX = (float)woodWorkRand.nextGaussian() * f3;
                    entityitem.motionY = (float)woodWorkRand.nextGaussian() * f3 + 0.2F;
                    entityitem.motionZ = (float)woodWorkRand.nextGaussian() * f3;
                    world.spawnEntityInWorld(entityitem);
                } while(true);
            }

        }
        super.onBlockRemoval(world, i, j, k);
    }



}