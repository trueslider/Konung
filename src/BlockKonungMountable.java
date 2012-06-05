package net.minecraft.src;

/* взято из Seatable Chairs 1.3 by ITOS */
import java.util.List;

public class BlockKonungMountable extends Block
{
	
	//This constructor just pass thing on.
	public BlockKonungMountable(int x, Material material)
	{
		super(x, material);
	}
	
	//This constructor just pass thing on.
	public BlockKonungMountable(int x, int y, Material material)
	{
		super(x, y, material);
	}
	
	//This method use the main blockActivated with the default mounting position.
	public boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
		return blockActivated(world, i, j, k, entityplayer, 0.5F, 1.0F, 0.5F, 0, 0, 0, 0);
    }
	
	//This method use the main blockActivated with a custom mounting height.
	public static boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, float y)
    {
		return blockActivated(world, i, j, k, entityplayer, 0.5F, y, 0.5F, 0, 0, 0, 0);
    }
    
	//This is the main blockActivated method that specifies what happens when a player interact with the block.
	public static boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, float x, float y, float z, int north, int south, int east, int west)
    {
		if (!world.isRemote)
		{
			//Looks for EMBs up to 1 block away from the activated block. Hopefully you didn't set the mounting position further away than this.
			List<EntityKonungMountableBlock> list = world.getEntitiesWithinAABB(EntityKonungMountableBlock.class, AxisAlignedBB.getBoundingBoxFromPool(i, j, k, i + 1.0D, j + 1.0D, k + 1.0D).expand(1D, 1D, 1D));
	    	for (EntityKonungMountableBlock entitytocheck : list)
	    	{
	    		//Looks for an EMB created by this block.
	    		if (entitytocheck.orgBlockPosX == i && entitytocheck.orgBlockPosY == j && entitytocheck.orgBlockPosZ == k)
	    		{
	    			//Player wants to get off the block.
	    			if (entitytocheck.riddenByEntity == entityplayer)
	    			{
	    				entitytocheck.interact(entityplayer);
	    				return true;
	    			}
	    			//EMB is used by someone else.
	    			if (entitytocheck.riddenByEntity != entityplayer && entitytocheck.riddenByEntity != null)
	    			{
	    				return true;
	    			}
	    			//EMB exist but no-one is sitting on it (bug).
	    			entitytocheck.setDead();
	    			break;
	    		}
	    	}
			//Sets coordinates for mounting a north oriented block.
			float mountingX = i + x + 0.25F;
			float mountingY = j + y - 0.1F;
			float mountingZ = k + z;
			//Changes coordinates for mounting to compensate for none-north block orientation.
			if(north != south) 
			{
				int md = world.getBlockMetadata(i, j, k);
				if (md == east) 
				{
					mountingX = i - z + 1; 
					mountingZ = k + x + 0.25F; 
				}
				else if (md == south) 
				{
					mountingX = i - x + 0.75F; 
					mountingZ = k - z + 1; 
				}
				else if (md == west) 
				{
					mountingX = i + z; 
					mountingZ = k - x + 0.75F; 
				}
			}
	    	//Creates a new EMB if none had been created already or if the old one was bugged.
	    	EntityKonungMountableBlock nemb = new EntityKonungMountableBlock(world, entityplayer, i, j, k, mountingX, mountingY, mountingZ); 
	    	world.spawnEntityInWorld(nemb);
	    	nemb.interact(entityplayer);
	    	return true;
		}
		return true;
    }
	
}