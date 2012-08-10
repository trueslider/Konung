//Комментарий
package net.minecraft.src;

import java.util.Random;

public class mod_konungLog extends BaseMod
{
	public static final Block logDef 	= new BlockKonungLog(144, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logDef");
	public static final Block logPine 	= new BlockKonungLogPine(145, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logPine");
	public static final Block logBirch 	= new BlockKonungLogBirch(146, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logBirch");
	public static final Block logJungle = new BlockKonungLogJungle(147, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logJungle");
	
	public static final Block logVert 	= new BlockKonungVertLog(148, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logVert");
	
	public static int LogTop;
	public static int LogX;
	public static int LogXPine;
	public static int LogXBirch;
	public static int LogXJungle;
	public static int LogY;
	public static int LogYPine;
	public static int LogYBirch;
	public static int LogYJungle;
	
       
	public String getVersion()
	{
       return "mod for 1.3.1";
	}

	public void load()
	{	
		ModLoader.registerBlock(logDef);
      	ModLoader.registerBlock(logPine);
      	ModLoader.registerBlock(logBirch);
      	ModLoader.registerBlock(logJungle);
      	
		ModLoader.registerBlock(logVert);
		ModLoader.registerBlock(logVert, net.minecraft.src.ItemKonungVertLog.class);

    	LogTop 		= ModLoader.addOverride("/terrain.png", "/textures/konung/log_top.png");
    	LogX 		= ModLoader.addOverride("/terrain.png", "/textures/konung/log_x.png");
    	LogXPine 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_pine.png");
    	LogXBirch 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_birch.png");
    	LogXJungle 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_jungle.png");
    	LogY 		= ModLoader.addOverride("/terrain.png", "/textures/konung/log_y.png");
    	LogYPine 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_y_pine.png");
    	LogYBirch 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_y_birch.png");
    	LogYJungle	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_y_jungle.png");
      
      	//add name
   	   	ModLoader.addName(logDef, "Refined Wood");
      	ModLoader.addName(logPine, "Refined Wood");
      	ModLoader.addName(logBirch, "Refined Wood");
      	ModLoader.addName(logJungle, "Refined Woodd");
      	
      	
    	ModLoader.addName(new ItemStack(logVert,1,0), "Refined Wood");
    	ModLoader.addName(new ItemStack(logVert,1,1), "Refined Wood");
    	ModLoader.addName(new ItemStack(logVert,1,2), "Refined Wood");
    	ModLoader.addName(new ItemStack(logVert,1,3), "Refined Wood");
    	
    	//recipe
 	   	//create horizontal clear wood from wood
 	   	ModLoader.addRecipe(new ItemStack(logDef, 3), 	new Object[]{ "###", Character.valueOf('#'), new ItemStack(Block.wood,1,0)});
 	   	ModLoader.addRecipe(new ItemStack(logPine, 3), 	new Object[]{ "###", Character.valueOf('#'), new ItemStack(Block.wood,1,1)});
 	   	ModLoader.addRecipe(new ItemStack(logBirch, 3),	new Object[]{ "###", Character.valueOf('#'), new ItemStack(Block.wood,1,2)});
 	   	ModLoader.addRecipe(new ItemStack(logJungle, 3),new Object[]{ "###", Character.valueOf('#'), new ItemStack(Block.wood,1,3)});
 	   	//create vertical clear wood from wood
 	   	ModLoader.addRecipe(new ItemStack(mod_konungLog.logVert,3,0), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(Block.wood,1,0)});
 	   	ModLoader.addRecipe(new ItemStack(mod_konungLog.logVert,3,1), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(Block.wood,1,1)});
 	   	ModLoader.addRecipe(new ItemStack(mod_konungLog.logVert,3,2), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(Block.wood,1,2)});
 	   	ModLoader.addRecipe(new ItemStack(mod_konungLog.logVert,3,3), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(Block.wood,1,3)});
	  	//create horizontal clear wood from vertical clear wood
 	   	ModLoader.addRecipe(new ItemStack(logDef, 3), 	new Object[]{ "###", Character.valueOf('#'), new ItemStack(mod_konungLog.logVert,1,0)});
 	   	ModLoader.addRecipe(new ItemStack(logPine, 3), 	new Object[]{ "###", Character.valueOf('#'), new ItemStack(mod_konungLog.logVert,1,1)});
 	   	ModLoader.addRecipe(new ItemStack(logBirch, 3),	new Object[]{ "###", Character.valueOf('#'), new ItemStack(mod_konungLog.logVert,1,2)});
 	   	ModLoader.addRecipe(new ItemStack(logJungle, 3), new Object[]{ "###", Character.valueOf('#'), new ItemStack(mod_konungLog.logVert,1,3)});
 	   	//create vertical clear wood from horizontal clear wood
 	   	ModLoader.addRecipe(new ItemStack(mod_konungLog.logVert,3,0), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logDef,1)});
 	   	ModLoader.addRecipe(new ItemStack(mod_konungLog.logVert,3,1), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logPine,1)});
 	   	ModLoader.addRecipe(new ItemStack(mod_konungLog.logVert,3,2), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logBirch,1)});
 	   	ModLoader.addRecipe(new ItemStack(mod_konungLog.logVert,3,3), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logJungle,1)});
 	   	//create planks from horizontal clear wood
 	   	ModLoader.addRecipe(new ItemStack(Block.planks,4,0), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logDef,1)});
	   	ModLoader.addRecipe(new ItemStack(Block.planks,4,1), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logPine,1)});
	   	ModLoader.addRecipe(new ItemStack(Block.planks,4,2), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logBirch,1)});
	   	ModLoader.addRecipe(new ItemStack(Block.planks,4,3), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logJungle,1)});
	   	//create planks from vertical clear wood
 	   	ModLoader.addRecipe(new ItemStack(Block.planks,4,0), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logVert,1,0)});
	   	ModLoader.addRecipe(new ItemStack(Block.planks,4,1), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logVert,1,1)});
	   	ModLoader.addRecipe(new ItemStack(Block.planks,4,2), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logVert,1,2)});
	   	ModLoader.addRecipe(new ItemStack(Block.planks,4,3), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logVert,1,3)});
	   	//recipe for furnace
	   	ModLoader.addSmelting(mod_konungLog.logDef.blockID, new ItemStack(Item.coal, 1, 1), 10);
	   	ModLoader.addSmelting(mod_konungLog.logPine.blockID, new ItemStack(Item.coal, 1, 1), 10);
	   	ModLoader.addSmelting(mod_konungLog.logBirch.blockID, new ItemStack(Item.coal, 1, 1), 10);
	   	ModLoader.addSmelting(mod_konungLog.logJungle.blockID, new ItemStack(Item.coal, 1, 1), 10);
	   	ModLoader.addSmelting(mod_konungLog.logVert.blockID, new ItemStack(Item.coal, 1, 1), 10);
	}
}		