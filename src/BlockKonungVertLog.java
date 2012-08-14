package net.minecraft.src;

import java.util.Random;

public class BlockKonungVertLog extends Block
{	
		
        public BlockKonungVertLog(int i, int j)
        {
            super(i, j, Material.wood);
            blockIndexInTexture = j;

        }
        
        public int idDropped(int i, Random random, int j)
        {
            return mod_konungLog.logVert.blockID;
        }
        
        public int quantityDropped(Random random)
        {
            return 1;
        }
                
        public int getBlockTextureFromSideAndMetadata(int i, int j)
        {
    		int side_def = mod_konungLog.LogY;
    		int side_pine = mod_konungLog.LogYPine;
    		int side_birch = mod_konungLog.LogYBirch;
    		int side_jungle = mod_konungLog.LogYJungle;
    		int front = mod_konungLog.LogTop;
					
    		if(i == 1)
                return front;
            if(i == 0)
                return front;
            
            if(j==0)
            	return side_def;
            if(j==1)
            	return side_pine;
            if(j==2)
            {	
            	return side_birch;
            } else
			{
			return side_jungle;
			}

        }
}