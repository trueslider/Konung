package net.minecraft.src;

public class ItemKonungGladius extends Item
{
	public ItemKonungGladius(int i)
	{
		super(i);
		maxStackSize = 1;		
	}
	
    public boolean isFull3D()
    {
        return true;
    }
}
