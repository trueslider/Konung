// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.Konung;

import java.util.Random;
import net.minecraft.src.*;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, Slot, SlotFurnace, InventoryPlayer, 
//            ICrafting, TileEntityFurnace, ItemStack, EntityPlayer

public class ContainerKonungWoodWorking extends Container
{
    private TileEntityKonungWoodWorking woodWork;
    private int workTime;
    private int woodWorkTime;
    private int itemWoodWorkTime;
		
    public ContainerKonungWoodWorking(InventoryPlayer inventoryplayer, TileEntityKonungWoodWorking tileentityfreezer)
    {
        workTime = 0;
        woodWorkTime = 0;
        itemWoodWorkTime = 0;
        woodWork = tileentityfreezer;
        addSlot(new Slot(tileentityfreezer, 0, 56, 17));
        addSlot(new Slot(tileentityfreezer, 1, 56, 53));
        addSlot(new SlotKonungWoodWorking(inventoryplayer.player, tileentityfreezer, 2, 116, 35));
        for(int i = 0; i < 3; i++)
        {
            for(int k = 0; k < 9; k++)
            {
                addSlot(new Slot(inventoryplayer, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }

        }

        for(int j = 0; j < 9; j++)
        {
            addSlot(new Slot(inventoryplayer, j, 8 + j * 18, 142));
        }

    }

    public void updateCraftingResults()
    {
        super.updateCraftingResults();
        for(int i = 0; i < inventorySlots.size(); i++)
        {
            ICrafting icrafting = (ICrafting)inventorySlots.get(i);
            if(workTime != woodWork.woodWorkTime2)
            {
                icrafting.updateCraftingInventoryInfo(this, 0, woodWork.woodWorkTime2);
            }
            if(woodWorkTime != woodWork.woodWorkTime1)
            {
                icrafting.updateCraftingInventoryInfo(this, 1, woodWork.woodWorkTime1);
            }
            if(itemWoodWorkTime != woodWork.currentItemWorkTime)
            {
                icrafting.updateCraftingInventoryInfo(this, 2, woodWork.currentItemWorkTime);
            }
        }

        workTime = woodWork.woodWorkTime2;
        woodWorkTime = woodWork.woodWorkTime1;
        itemWoodWorkTime = woodWork.currentItemWorkTime;
    }

    public void func_20112_a(int i, int j)
    {
        if(i == 0)
        {
            woodWork.woodWorkTime2 = j;
        }
        if(i == 1)
        {
            woodWork.woodWorkTime1 = j;
        }
        if(i == 2)
        {
            woodWork.currentItemWorkTime = j;
        }
    }

    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        return woodWork.isUseableByPlayer(entityplayer);
    }

    public ItemStack getStackInSlot(int i)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)inventorySlots.get(i);
        if(slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if(i == 2)
            {
                if(!mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }
            } else
            if(i >= 3 && i < 30)
            {
                if(!mergeItemStack(itemstack1, 30, 39, false))
                {
                    return null;
                }
            } else
            if(i >= 30 && i < 39)
            {
                if(!mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            } else
            if(!mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }
            if(itemstack1.stackSize == 0)
            {
                slot.putStack(null);
            } else
            {
                slot.onSlotChanged();
            }
            if(itemstack1.stackSize != itemstack.stackSize)
            {
                slot.onPickupFromSlot(itemstack1);
            } else
            {
                return null;
            }
        }
        return itemstack;
    }
}