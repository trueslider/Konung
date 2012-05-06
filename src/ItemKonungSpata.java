package net.minecraft.src;

public class ItemKonungSpata extends Item
{
	public ItemKonungSpata(int i)
	{
		super(i);
		maxStackSize = 1;		
	}
	
    public boolean isFull3D()
    {
        return true;
    }
}
