package net.minecraft.src.Konung;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import net.minecraft.src.*;
public class ItemKonungStockade extends ItemBlock
{	
    public ItemKonungStockade(int i, String pItemMatName)
    {
        super(i);		
		itemMatName = pItemMatName;
        setMaxDamage(0);
        setHasSubtypes(true);
    }    

    public int getMetadata(int i)
    {
        return i;
    }	
	
    public String getItemNameIS(ItemStack itemstack)
    {			
		return (new StringBuilder()).append("Kaev").append(itemMatName).append("Slopes").append(Kaevator_Materials[itemstack.getItemDamage()]).toString();		
    }

	public static final String Kaevator_Materials[] = {
        "QuadriCornerDown", "QuadriCornerDown", "QuadriCornerDown", "QuadriCornerDown",
		"QuadriCornerUp", "QuadriCornerUp", "QuadriCornerUp", "QuadriCornerUp", 
		"TriCornerDown", "TriCornerDown", "TriCornerDown", "TriCornerDown", 
		"TriCornerUp", "TriCornerUp", "TriCornerUp", "TriCornerUp"
    };	
	
	private String itemMatName;
}
