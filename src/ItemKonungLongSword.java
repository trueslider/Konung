package net.minecraft.src;

public class ItemKonungLongSword extends Item
{
	public ItemKonungLongSword(int i)
	{
		super(i);
		maxStackSize = 1;		
	}
	
    public boolean isFull3D()
    {
        return true;
    }
}
