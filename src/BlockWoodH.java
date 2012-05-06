package net.minecraft.src;

public class BlockWoodH extends Block
{
	public BlockWoodH(int i, int j)
	{
		super(i, Material.wood);
	}

	public int getBlockTextureFromSideAndMetadata(int i, int j)
    {

            int front = mod_konung.woodHCut;
            int side_V = mod_konung.woodHBark_V;
            int side_H = mod_konung.woodHBark_H;


            if(j == 0 && (i == 0 || i == 1))
            {
                    return side_V;
            }
            if(j == 1 && (i == 0 || i == 1))
            {
                    return side_H;
            }
            if(j == 2 && (i == 0 || i == 1))
            {
                    return side_V;
            }
            if(j == 3 && (i == 0 || i == 1))
            {
                    return side_H;
            }
            
            if(j == 2 && (i == 2 || i == 3))
            	return front;
            if(j == 3 && (i == 4 || i == 5))
            	return front;
            if(j == 0 && (i == 2 || i == 3))
            	return front;
            if(j == 1 && (i == 4 || i == 5))
            	return front;
            else
            	return side_H;


    }

	   public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
       {
               int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 2.5D) & 3;
               world.setBlockMetadataWithNotify(i, j, k, l);
       }
	
	
}
