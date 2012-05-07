package net.minecraft.src;

public class ItemKonungKnife extends Item
{
	public ItemKonungKnife(int i)
	{
		super(i);
		maxStackSize = 1;		
	}
	
    public boolean isFull3D()
    {
        return true;
    }
}
