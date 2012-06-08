// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.Konung;

import java.util.Random;
import net.minecraft.src.*;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package net.minecraft.src:
//            Block, ItemStack, Item

public class RecipesKonungWoodWorking
{

    public static final RecipesKonungWoodWorking solidifying()
    {
        return solidifyingBase;
    }

    private RecipesKonungWoodWorking()
    {
        solidifyingList = new HashMap();
        //addSolidifying(Block.wood.blockID, new ItemStack(mod_konungLog.logDef));
        addSolidifying(new ItemStack(Block.wood,1,0), new ItemStack(mod_konungLog.logDef,1,0));
    }

    public void addSolidifying(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        solidifyingList.put(par1ItemStack, par2ItemStack);
    }

    public ItemStack getSolidifyingResult(int i)
    {
        return (ItemStack)solidifyingList.get(Integer.valueOf(i));
    }

    public Map getSolidifyingList()
    {
        return solidifyingList;
    }

    private static final RecipesKonungWoodWorking solidifyingBase = new RecipesKonungWoodWorking();
    private Map solidifyingList;

}