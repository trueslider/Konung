package net.minecraft.src;

public class KonungItemTable extends ItemBlock
{	
	public KonungItemTable(int par1, Block block)
	{
		super(par1);
		setHasSubtypes(true);
	}
		
	public int getMetadata(int par1)
	{
		return par1;
	}		

}
