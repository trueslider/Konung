//Комментарий
package net.minecraft.src;

import java.util.Random;

public class BlockKonungLogBirch extends Block
{	
		
        public BlockKonungLogBirch(int i, int j)
        {
            super(i, j, Material.wood);
            blockIndexInTexture = j;

        }
        
        public int idDropped(int i, Random random, int j)
        {
            return mod_konungLog.logBirch.blockID;
        }
        
        public int quantityDropped(Random random)
        {
            return 1;
        }
                
        public int getBlockTextureFromSideAndMetadata(int i, int j)
        {
    		int side_x = mod_konungLog.LogXBirch;
    		int side_y = mod_konungLog.LogYBirch;
    		int front = mod_konungLog.LogTop;
					
            if(j == 0 && (i == 0 || i == 1))
            {
                    return side_y;
            }
            if(j == 1 && (i == 0 || i == 1))
            {
                    return side_x;
            }
            if(j == 2 && (i == 0 || i == 1))
            {
                    return side_y;
            }
            if(j == 3 && (i == 0 || i == 1))
            {
                    return side_x;
            }
							
            if(j == 2 && (i == 2 || i == 3))
            {
                    return front;
            }
			if(j == 3 && (i == 4 || i == 5))
            {
                    return front;
            }
            if(j == 0 && (i == 2 || i == 3))
            {
                    return front;
            }
            if(j == 1 && (i == 4 || i == 5))
            {
                    return front;
            } else
			{
			return side_x;
			}

        }
		
		public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
        {
            int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 2.5D) & 3;
            world.setBlockMetadataWithNotify(i, j, k, l);
        }
}