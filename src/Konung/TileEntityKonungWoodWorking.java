// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.Konung;

import java.util.Random;
import net.minecraft.src.*;


// Referenced classes of package net.minecraft.src:
//            TileEntity, IInventory, ItemStack, NBTTagCompound, 
//            NBTTagList, World, Item, BlockFurnace, 
//            FurnaceRecipes, Block, Material, ModLoader, 
//            EntityPlayer

public class TileEntityKonungWoodWorking extends TileEntity implements IInventory
{
    private ItemStack woodWorkItemStacks[];
    public int woodWorkTime1;
    public int currentItemWorkTime;
    public int woodWorkTime2;

    public TileEntityKonungWoodWorking()
    {
        woodWorkItemStacks = new ItemStack[3];
        woodWorkTime1 = 0;
        currentItemWorkTime = 0;
        woodWorkTime2 = 0;
    }

    public int getSizeInventory()
    {
        return woodWorkItemStacks.length;
    }

    public ItemStack getStackInSlot(int i)
    {
        return woodWorkItemStacks[i];
    }

    public ItemStack decrStackSize(int i, int j)
    {
        if(woodWorkItemStacks[i] != null)
        {
            if(woodWorkItemStacks[i].stackSize <= j)
            {
                ItemStack itemstack = woodWorkItemStacks[i];
                woodWorkItemStacks[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = woodWorkItemStacks[i].splitStack(j);
            if(woodWorkItemStacks[i].stackSize == 0)
            {
            	woodWorkItemStacks[i] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public ItemStack getStackInSlotOnClosing(int par1)
    {
        if (woodWorkItemStacks[par1] != null)
        {
            ItemStack itemstack = woodWorkItemStacks[par1];
            woodWorkItemStacks[par1] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }
    
    public void setInventorySlotContents(int i, ItemStack itemstack)
    {
    	woodWorkItemStacks[i] = itemstack;
        if(itemstack != null && itemstack.stackSize > getInventoryStackLimit())
        {
            itemstack.stackSize = getInventoryStackLimit();
        }
    }

    public String getInvName()
    {
        return "Work";
    }

    public void readFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readFromNBT(nbttagcompound);
        NBTTagList nbttaglist = nbttagcompound.getTagList("Items");
        woodWorkItemStacks = new ItemStack[getSizeInventory()];
        for(int i = 0; i < nbttaglist.tagCount(); i++)
        {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
            byte byte0 = nbttagcompound1.getByte("SlotFreezer");
            if(byte0 >= 0 && byte0 < woodWorkItemStacks.length)
            {
            	woodWorkItemStacks[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        woodWorkTime1 = nbttagcompound.getShort("FreezeTime");
        woodWorkTime2 = nbttagcompound.getShort("CoolTime");
        currentItemWorkTime = getItemWorkTime(woodWorkItemStacks[1]);
    }

    public void writeToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setShort("FreezeTime", (short)woodWorkTime1);
        nbttagcompound.setShort("CoolTime", (short)woodWorkTime2);
        NBTTagList nbttaglist = new NBTTagList();
        for(int i = 0; i < woodWorkItemStacks.length; i++)
        {
            if(woodWorkItemStacks[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("SlotFreezer", (byte)i);
                woodWorkItemStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        nbttagcompound.setTag("Items", nbttaglist);
    }

    public int getInventoryStackLimit()
    {
        return 64;
    }

    public int getWorkProgressScaled(int i)
    {
        return (woodWorkTime2 * i) / 200;
    }

    public int getWorkTimeRemainingScaled(int i)
    {
        if(currentItemWorkTime == 0)
        {
            currentItemWorkTime = 200;
        }
        return (woodWorkTime1 * i) / currentItemWorkTime;
    }

    public boolean isWorking()
    {
        return woodWorkTime1 > 0;
    }

    public void updateEntity()
    {
        boolean flag = woodWorkTime1 > 0;
        boolean flag1 = false;
        if(woodWorkTime1 > 0)
        {
            woodWorkTime1--;
        }
        if(!worldObj.isRemote)
        {
            if(woodWorkTime1 == 0 && canSolidify())
            {
                currentItemWorkTime = woodWorkTime1 = getItemWorkTime(woodWorkItemStacks[1]);
                if(woodWorkTime1 > 0)
                {
                    flag1 = true;
                    if(woodWorkItemStacks[1] != null)
                    {
                        if(woodWorkItemStacks[1].getItem().hasContainerItem())
                        {
                        	woodWorkItemStacks[1] = new ItemStack(woodWorkItemStacks[1].getItem().getContainerItem());
                        } else
                        {
                        	woodWorkItemStacks[1].stackSize--;
                        }
                        if(woodWorkItemStacks[1].stackSize == 0)
                        {
                        	woodWorkItemStacks[1] = null;
                        }
                    }
                }
            }
            if(isWorking() && canSolidify())
            {
                woodWorkTime2++;
                if(woodWorkTime2 == 200)
                {
                    woodWorkTime2 = 0;
                    solidifyItem();
                    flag1 = true;
                }
            } else
            {
                woodWorkTime2 = 0;
            }
        }
        if(flag != (woodWorkTime1 > 0))
        {
            flag1 = true;
        }
        if(flag1)
        {
            onInventoryChanged();
        }
    }

    private boolean canSolidify()
    {
        if(woodWorkItemStacks[0] == null)
        {
            return false;
        }
        ItemStack itemstack = RecipesKonungWoodWorking.solidifying().getSolidifyingResult(woodWorkItemStacks[0].getItem().shiftedIndex);
        if(itemstack == null)
        {
            return false;
        }
        if(woodWorkItemStacks[2] == null)
        {
            return true;
        }
        if(!woodWorkItemStacks[2].isItemEqual(itemstack))
        {
            return false;
        }
        if(woodWorkItemStacks[2].stackSize < getInventoryStackLimit() && woodWorkItemStacks[2].stackSize < woodWorkItemStacks[2].getMaxStackSize())
        {
            return true;
        }
        return woodWorkItemStacks[2].stackSize < itemstack.getMaxStackSize();
    }

    public void solidifyItem()
    {
        if(!canSolidify())
        {
            return;
        }
        ItemStack itemstack = RecipesKonungWoodWorking.solidifying().getSolidifyingResult(woodWorkItemStacks[0].getItem().shiftedIndex);
        if(woodWorkItemStacks[2] == null)
        {
        	woodWorkItemStacks[2] = itemstack.copy();
        } else
        if(woodWorkItemStacks[2].itemID == itemstack.itemID)
        {
            woodWorkItemStacks[2].stackSize += itemstack.stackSize;
        }
        if(woodWorkItemStacks[0].getItem().hasContainerItem())
        {
            woodWorkItemStacks[0] = new ItemStack(woodWorkItemStacks[0].getItem().getContainerItem());
        } else
        {
            woodWorkItemStacks[0].stackSize--;
        }
        if(woodWorkItemStacks[0].stackSize <= 0)
        {
            woodWorkItemStacks[0] = null;
        }
    }

    private int getItemWorkTime(ItemStack itemstack)
    {
        if(itemstack == null)
        {
            return 0;
        }
        int i = itemstack.getItem().shiftedIndex;
        if (i == Item.axeSteel.shiftedIndex)
        {
                return 400;
        }
        else
        {
                return 0;
        }
    }
   
    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer)
    {
        if (worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) != this)
        {
            return false;
        }

        return par1EntityPlayer.getDistanceSq((double)xCoord + 0.5D, (double)yCoord + 0.5D, (double)zCoord + 0.5D) <= 64D;
    }
    
    public void openChest()
    {
    }

    public void closeChest()
    {
    }
   
}