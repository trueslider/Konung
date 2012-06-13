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
       	    
       	    for (int x = 0; x <= 3; x++)
            {
                for (int z = 5; z <= 13; z++)
                {
                	world.setBlockAndMetadataWithNotify(i + x + 3, j + x + 5, k + z, wall, 0);
    				world.setBlockAndMetadataWithNotify(i + 10 - x, j + 5 + x, k + z, wall, 0);
                }
            }
       	    
       	    //Наполнение крыши
        	for(int x = 1; x <= 12; x++)
        	{
        		for(int z = 1; z <= 7; z++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + 5, k + z, roof, 0);
        		}
        		for(int z = 2; z <= 6; z++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + 6, k + z, roof, 0);
        		}
        		for(int z = 3; z <= 5; z++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + 7, k + z, roof, 0);
        		}
        		for(int z = 4; z <= 4; z++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + 8, k + z, roof, 0);
        		}
        	}
        	
        	for(int z = 7; z <= 12; z++)
        	{
        		for(int x = 4; x <= 9; x++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + 5, k + z, roof, 1);
        		}
        		for(int x = 5; x <= 8; x++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + 6, k + z, roof, 1);
        		}
        		for(int x = 6; x <= 7; x++)
        		{
        			world.setBlockAndMetadataWithNotify(i + x, j + 7, k + z, roof, 1);
        		}
        	}
        	
        	//Окна
        	world.setBlockAndMetadataWithNotify(i + 4, j + 2, k + 1, window, 0);
        	world.setBlockAndMetadataWithNotify(i + 5, j + 2, k + 1, window, 0);
        	world.setBlockAndMetadataWithNotify(i + 4, j + 3, k + 1, window, 0);
        	world.setBlockAndMetadataWithNotify(i + 5, j + 3, k + 1, window, 0);
        	
        	world.setBlockAndMetadataWithNotify(i + 8, j + 2, k + 1, window, 0);
        	world.setBlockAndMetadataWithNotify(i + 9, j + 2, k + 1, window, 0);
        	world.setBlockAndMetadataWithNotify(i + 8, j + 3, k + 1, window, 0);
        	world.setBlockAndMetadataWithNotify(i + 9, j + 3, k + 1, window, 0);
        	
        	world.setBlockAndMetadataWithNotify(i + 4, j + 2, k + 9, window, 1);
        	world.setBlockAndMetadataWithNotify(i + 4, j + 2, k + 10, window, 1);
        	world.setBlockAndMetadataWithNotify(i + 4, j + 3, k + 9, window, 1);
        	world.setBlockAndMetadataWithNotify(i + 4, j + 3, k + 10, window, 1);
        	
        	world.setBlockAndMetadataWithNotify(i + 9, j + 2, k + 9, window, 1);
        	world.setBlockAndMetadataWithNotify(i + 9, j + 2, k + 10, window, 1);
        	world.setBlockAndMetadataWithNotify(i + 9, j + 3, k + 9, window, 1);
        	world.setBlockAndMetadataWithNotify(i + 9, j + 3, k + 10, window, 1);
        	
        	world.setBlockAndMetadataWithNotify(i + 6, j + 2, k + 12, window, 0);
        	world.setBlockAndMetadataWithNotify(i + 7, j + 2, k + 12, window, 0);
        	world.setBlockAndMetadataWithNotify(i + 6, j + 3, k + 12, window, 0);
        	world.setBlockAndMetadataWithNotify(i + 7, j + 3, k + 12, window, 0);
        	
			//Дверь
        	ItemDoor.placeDoorBlock(world, i + 1, j + 1, k + 4, 0, Block.doorWood);

        	
                return true;
        }
 
}