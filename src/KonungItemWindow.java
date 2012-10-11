package net.minecraft.src;

public class KonungItemWindow extends ItemBlock
{	
	public KonungItemWindow(int par1, Block block)
	{
		super(par1);
		setHasSubtypes(true);
	}
		
	public int getMetadata(int par1)
	{
		return par1;
	}		

}
