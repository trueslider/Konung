// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.Konung;

import java.util.Random;
import net.minecraft.src.*;


// Referenced classes of package net.minecraft.src:
//            Slot, EntityPlayer, ItemStack, Item, 
//            AchievementList, ModLoader, IInventory

public class SlotKonungWoodWorking extends Slot
{

    public SlotKonungWoodWorking(EntityPlayer entityplayer, IInventory iinventory, int i, int j, int k)
    {
        super(iinventory, i, j, k);
    }

    public boolean isItemValid(ItemStack itemstack)
    {
        return false;
    }

    public void onPickupFromSlot(ItemStack itemstack)
    {
        super.onPickupFromSlot(itemstack);
    }
}