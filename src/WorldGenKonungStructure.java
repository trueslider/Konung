package net.minecraft.src;

import java.util.Random;

public class WorldGenKonungStructure extends WorldGenerator
{	
	public WorldGenKonungStructure()
        {
        }

        public boolean generate(World world, Random random, int i, int j, int k)
        {
        	int bottom = mod_konungLog.logBirch.blockID;
        	int wall = mod_konungLog.logPine.blockID;
        	int window = mod_konungFurniture.window.blockID;
        	int roof = mod_konungLog.logJungle.blockID;
               
                //if(world.getBlockId(i, j, k)!= Block.sand.blockID || world.getBlockId(i, j + 1, k)!= 0)
                //{
                //   return false;
                //}
                
        	
        	//Пол
        	for(int x = 2; x <= 11; x++)
        	{
        		for(int z = 2; z <= 6; z++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j, k + z, bottom, 0);
        		}
        	}
        	
        	for(int x = 5; x <= 8; x++)
        	{
        		for(int z = 7; z <= 11; z++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j, k + z, bottom, 1);
        		}
        	}
        	
        	//Потолок
        	for(int x = 2; x <= 11; x++)
        	{
        		for(int z = 2; z <= 6; z++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + 5, k + z, bottom, 0);
        		}
        	}
        	
        	for(int x = 5; x <= 8; x++)
        	{
        		for(int z = 7; z <= 11; z++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + 5, k + z, bottom, 1);
        		}
        	}
        	
        	//Высота
        	for (int h = 0; h <= 4; h++)
        	{
        		//Стены
        		for(int z = 0; z <= 8; z++)
        		{
        			world.setBlockAndMetadataWithNotify(i + 1, j + h, k + z, wall, 0);
        		}
        		
        		for(int z = 0; z <= 8; z++)
        		{
        			world.setBlockAndMetadataWithNotify(i + 12, j + h, k + z, wall, 0);
        		}
        		
        		for(int x = 0; x <= 13; x++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + h, k + 1, wall, 1);
        		}
        		
        		for(int x = 0; x <= 3; x++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + h, k + 7, wall, 1);
        		}
        		
        		for(int x = 10; x <= 13; x++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + h, k + 7, wall, 1);
        		}
        		
        		for(int z = 7; z <= 13; z++)
        		{
        			world.setBlockAndMetadataWithNotify(i + 4, j + h, k + z, wall, 0);
        		}
        		
        		for(int z = 7; z <= 13; z++)
        		{
        			world.setBlockAndMetadataWithNotify(i + 9, j + h, k + z, wall, 0);
        		}
        		
        		for(int x = 3; x <= 10; x++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + h, k + 12, wall, 1);
        		}
        	}
        	
        	//Крыша
       	    for (int z = 0; z <= 4; z++)
            {
                for (int x = 0; x <= 13; x++)
                {
                	world.setBlockAndMetadataWithNotify(i + x, j + z + 5, k + z, wall, 1);
    				world.setBlockAndMetadataWithNotify(i + x, j + 5 + z, k + 8 - z, wall, 1);
                }
            }
       	    
       	    for (int z = 0; z <= 13; z++)
            {
                for (int x = 0; x <= 4; x++)
                {
                	world.setBlockAndMetadataWithNotify(i + x, j + z + 5, k + z, wall, 1);
    				world.setBlockAndMetadataWithNotify(i + 8 - x, j + 5 + z, k + z, wall, 1);
                }
            }

        	
                return true;
        }
 
}