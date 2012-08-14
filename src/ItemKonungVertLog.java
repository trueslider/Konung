package net.minecraft.src;

public class ItemKonungVertLog extends ItemBlock
{

	public ItemKonungVertLog(int i) 
	{
		super(i);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	public String[] blockNames = 
		{"Block Name", "Block Name 1", "Block Name 2", "Block Name 3"};
	
	public String getItemNameIS(ItemStack itemstack)
	{
		return(new StringBuilder()).append(super.getItemName()).append(".").append(blockNames[itemstack.getItemDamage()]).toString();
	}
	
	public int getMetadata(int i)
	{
		return i;
	}

}
