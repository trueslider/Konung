package net.minecraft.src;
import java.util.Random;

public class mod_konungLog extends BaseMod
{
		
	public static Block woodDef 	= new BlockKonungWood(140, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("woodDef");
	public static Block woodPine 	= new BlockKonungWoodPine(141, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("woodPine");
	public static Block woodBirch 	= new BlockKonungWoodBirch(142, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("woodBirch");
	public static Block woodJungle 	= new BlockKonungWoodJungle(143, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("woodJungle");

	public static Block logDef 		= new BlockKonungLog(144, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logDef");
	public static Block logPine 	= new BlockKonungLogPine(145, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logPine");
	public static Block logBirch 	= new BlockKonungLogBirch(146, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logBirch");
	public static Block logJungle 	= new BlockKonungLogJungle(147, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logJungle");
	
	public static Block logVert 	= new BlockKonungVertLog(148, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logVert");
	//public static Block logVPine 	= new BlockVerLogPine(149, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logVPine");
	//public static Block logVBirch 	= new BlockVerLogBirch(150, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logVBirch");
	//public static Block logVJungle 	= new BlockVerLogJungle(151, 0).setHardness(2.0F).setResistance(5.0F).setBlockName("logVJungle");
	
	public static int WoodTop;
	public static int WoodX;
	public static int WoodXPine;
	public static int WoodXBirch;
	public static int WoodXJungle;
	public static int WoodY;
	public static int WoodYPine;
	public static int WoodYBirch;
	public static int WoodYJungle;
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
       return "mod_log for 1.2.5";
	}

	public void load()
	{	
	//nameBlock [] = {woodDef, "woodPine", "woodBirch", "woodJungle", "logDef", "logPine", "logBirch", "logJungle"};
		//��������� �����
		ModLoader.registerBlock(woodDef);
		ModLoader.registerBlock(woodPine);
		ModLoader.registerBlock(woodBirch);
		ModLoader.registerBlock(woodJungle);
       
		ModLoader.registerBlock(logDef);
      	ModLoader.registerBlock(logPine);
      	ModLoader.registerBlock(logBirch);
      	ModLoader.registerBlock(logJungle);
      	
		ModLoader.registerBlock(logVert);
		ModLoader.registerBlock(logVert, net.minecraft.src.ItemKonungVertLog.class);
            
      	woodDef.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/terrain.png");
      	woodPine.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/terrain.png");
      	woodBirch.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/terrain.png");
      	woodJungle.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/terrain.png");
       
      	logDef.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/terrain.png");
      	logPine.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/terrain.png");
      	logBirch.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/terrain.png");
      	logJungle.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/terrain.png");
      
      	logVert.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/terrain.png");
      	
      	//��������� ��������
      	WoodTop 	= ModLoader.addOverride("/terrain.png", "/textures/konung/wood_top.png");
    	WoodX 		= ModLoader.addOverride("/terrain.png", "/textures/konung/wood_x.png");
    	WoodXPine	= ModLoader.addOverride("/terrain.png", "/textures/konung/wood_x_pine.png");
    	WoodXBirch 	= ModLoader.addOverride("/terrain.png", "/textures/konung/wood_x_birch.png");
    	WoodXJungle = ModLoader.addOverride("/terrain.png", "/textures/konung/wood_x_jungle.png");
    	WoodY 		= ModLoader.addOverride("/terrain.png", "/textures/konung/wood_y.png");
    	WoodYPine 	= ModLoader.addOverride("/terrain.png", "/textures/konung/wood_y_pine.png");
    	WoodYBirch	= ModLoader.addOverride("/terrain.png", "/textures/konung/wood_y_birch.png");
    	WoodYJungle	= ModLoader.addOverride("/terrain.png", "/textures/konung/wood_y_jungle.png");
    	LogTop 		= ModLoader.addOverride("/terrain.png", "/textures/konung/log_top.png");
    	LogX 		= ModLoader.addOverride("/terrain.png", "/textures/konung/log_x.png");
    	LogXPine 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_pine.png");
    	LogXBirch 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_birch.png");
    	LogXJungle 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_jungle.png");
    	LogY 		= ModLoader.addOverride("/terrain.png", "/textures/konung/log_y.png");
    	LogYPine 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_y_pine.png");
    	LogYBirch 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_y_birch.png");
    	LogYJungle	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_y_jungle.png");
      
      	//������ ��������
      	ModLoader.addName(woodDef, "Horizontal Wood");
      	ModLoader.addName(woodPine, "Horizontal Wood");
      	ModLoader.addName(woodBirch, "Horizontal Wood");
      	ModLoader.addName(woodJungle, "Horizontal Wood");
      	
      	ModLoader.addName(logDef, "Horizontal Wood");
      	ModLoader.addName(logPine, "Horizontal Wood");
      	ModLoader.addName(logBirch, "Horizontal Wood");
      	ModLoader.addName(logJungle, "Horizontal Wood");
      	
      	
    	ModLoader.addName(new ItemStack(logVert,1,0), "Wood");
    	ModLoader.addName(new ItemStack(logVert,1,1), "Wood");
    	ModLoader.addName(new ItemStack(logVert,1,2), "Wood");
    	ModLoader.addName(new ItemStack(logVert,1,3), "Wood");
			
	   //������� ������ (����� �������������� ������ �� ������������)
	   ModLoader.addRecipe(new ItemStack(woodDef, 3), 	new Object[]{ "###", Character.valueOf('#'), new ItemStack(Block.wood,1,0)});
	   ModLoader.addRecipe(new ItemStack(woodPine, 3), 	new Object[]{ "###", Character.valueOf('#'), new ItemStack(Block.wood,1,1)});
	   ModLoader.addRecipe(new ItemStack(woodBirch, 3),	new Object[]{ "###", Character.valueOf('#'), new ItemStack(Block.wood,1,2)});
	   ModLoader.addRecipe(new ItemStack(woodJungle, 3), new Object[]{ "###", Character.valueOf('#'), new ItemStack(Block.wood,1,3)});
	   //�������� ������� (����� ������������ ������ �� ��������������)
	   ModLoader.addRecipe(new ItemStack(Block.wood,3,0), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.woodDef,1)});
	   ModLoader.addRecipe(new ItemStack(Block.wood,3,1), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.woodPine,1)});
	   ModLoader.addRecipe(new ItemStack(Block.wood,3,2), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.woodBirch,1)});
	   ModLoader.addRecipe(new ItemStack(Block.wood,3,3), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.woodJungle,1)});
	   //������� ������ ��������� ������ ������������ Item.axeWood, Item.axeStone, Item.axeSteel, Item.axeDiamond, Item.axeGold
	   ModLoader.addRecipe(new ItemStack(logVert,4,0), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,0), Character.valueOf('B'), new ItemStack(Item.axeWood,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,4,1), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,1), Character.valueOf('B'), new ItemStack(Item.axeWood,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,4,2), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,2), Character.valueOf('B'), new ItemStack(Item.axeWood,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,4,3), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,3), Character.valueOf('B'), new ItemStack(Item.axeWood,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,8,0), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,0), Character.valueOf('B'), new ItemStack(Item.axeStone,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,8,1), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,1), Character.valueOf('B'), new ItemStack(Item.axeStone,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,8,2), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,2), Character.valueOf('B'), new ItemStack(Item.axeStone,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,8,3),	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,3), Character.valueOf('B'), new ItemStack(Item.axeStone,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,16,0), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,0), Character.valueOf('B'), new ItemStack(Item.axeSteel,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,16,1), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,1), Character.valueOf('B'), new ItemStack(Item.axeSteel,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,16,2), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,2), Character.valueOf('B'), new ItemStack(Item.axeSteel,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,16,3), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,3), Character.valueOf('B'), new ItemStack(Item.axeSteel,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,32,0), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,0), Character.valueOf('B'), new ItemStack(Item.axeGold,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,32,1), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,1), Character.valueOf('B'), new ItemStack(Item.axeGold,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,32,2), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,2), Character.valueOf('B'), new ItemStack(Item.axeGold,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,32,3), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,3), Character.valueOf('B'), new ItemStack(Item.axeGold,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,64,0), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,0), Character.valueOf('B'), new ItemStack(Item.axeDiamond,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,64,1), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,1), Character.valueOf('B'), new ItemStack(Item.axeDiamond,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,64,2), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,2), Character.valueOf('B'), new ItemStack(Item.axeDiamond,1)});
	   ModLoader.addRecipe(new ItemStack(logVert,64,3), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(Block.wood,1,3), Character.valueOf('B'), new ItemStack(Item.axeDiamond,1)});
	   //������� ������ ��������� ������ ��������������
	   ModLoader.addRecipe(new ItemStack(logDef,4),		new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodDef,1), Character.valueOf('B'), Item.axeWood});
	   ModLoader.addRecipe(new ItemStack(logPine,4),	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodPine,1), Character.valueOf('B'), Item.axeWood});
	   ModLoader.addRecipe(new ItemStack(logBirch,4),	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodBirch,1), Character.valueOf('B'), new ItemStack(Item.axeWood,1)});
	   ModLoader.addRecipe(new ItemStack(logJungle,4),	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodJungle,1), Character.valueOf('B'), new ItemStack(Item.axeWood,1)});
	   ModLoader.addRecipe(new ItemStack(logDef,8), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodDef,1), Character.valueOf('B'), new ItemStack(Item.axeStone,1)});
	   ModLoader.addRecipe(new ItemStack(logPine,8), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodPine,1), Character.valueOf('B'), new ItemStack(Item.axeStone,1)});
	   ModLoader.addRecipe(new ItemStack(logBirch,8), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodBirch,1), Character.valueOf('B'), new ItemStack(Item.axeStone,1)});
	   ModLoader.addRecipe(new ItemStack(logJungle,8), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodJungle,1), Character.valueOf('B'), new ItemStack(Item.axeStone,1)});
	   ModLoader.addRecipe(new ItemStack(logDef,16), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodDef,1), Character.valueOf('B'), new ItemStack(Item.axeSteel,1)});
	   ModLoader.addRecipe(new ItemStack(logPine,16), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodPine,1), Character.valueOf('B'), new ItemStack(Item.axeSteel,1)});
	   ModLoader.addRecipe(new ItemStack(logBirch,16), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodBirch,1), Character.valueOf('B'), new ItemStack(Item.axeSteel,1)});
	   ModLoader.addRecipe(new ItemStack(logJungle,16), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodJungle,1), Character.valueOf('B'), new ItemStack(Item.axeSteel,1)});
	   ModLoader.addRecipe(new ItemStack(logDef,32), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodDef,1), Character.valueOf('B'), new ItemStack(Item.axeGold,1)});
	   ModLoader.addRecipe(new ItemStack(logPine,32), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodPine,1), Character.valueOf('B'), new ItemStack(Item.axeGold,1)});
	   ModLoader.addRecipe(new ItemStack(logBirch,32), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodBirch,1), Character.valueOf('B'), new ItemStack(Item.axeGold,1)});
	   ModLoader.addRecipe(new ItemStack(logJungle,32), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodJungle,1), Character.valueOf('B'), new ItemStack(Item.axeGold,1)});
	   ModLoader.addRecipe(new ItemStack(logDef,64), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodDef,1), Character.valueOf('B'), new ItemStack(Item.axeDiamond,1)});
	   ModLoader.addRecipe(new ItemStack(logPine,64), 	new Object[]{ "AB",	Character.valueOf('A'), new ItemStack(mod_konungLog.woodPine,1), Character.valueOf('B'), new ItemStack(Item.axeDiamond,1)});
	   ModLoader.addRecipe(new ItemStack(logBirch,64), 	new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodBirch,1), Character.valueOf('B'), new ItemStack(Item.axeDiamond,1)});
	   ModLoader.addRecipe(new ItemStack(logJungle,64), new Object[]{ "AB", Character.valueOf('A'), new ItemStack(mod_konungLog.woodJungle,1), Character.valueOf('B'), new ItemStack(Item.axeDiamond,1)});
	   //������� ������ ��������� ������������� ��������� ������ �� ������������ ���������
	   ModLoader.addRecipe(new ItemStack(logDef, 3), 	new Object[]{ "###", Character.valueOf('#'), new ItemStack(mod_konungLog.logVert,1,0)});
	   ModLoader.addRecipe(new ItemStack(logPine, 3), 	new Object[]{ "###", Character.valueOf('#'), new ItemStack(mod_konungLog.logVert,1,1)});
	   ModLoader.addRecipe(new ItemStack(logBirch, 3),	new Object[]{ "###", Character.valueOf('#'), new ItemStack(mod_konungLog.logVert,1,2)});
	   ModLoader.addRecipe(new ItemStack(logJungle, 3), new Object[]{ "###", Character.valueOf('#'), new ItemStack(mod_konungLog.logVert,1,3)});
	   //������� ������ ��������� ������������ ��������� ������ �� �������������� ���������
	   ModLoader.addRecipe(new ItemStack(mod_konungLog.logVert,3,0), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logDef,1)});
	   ModLoader.addRecipe(new ItemStack(mod_konungLog.logVert,3,1), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logPine,1)});
	   ModLoader.addRecipe(new ItemStack(mod_konungLog.logVert,3,2), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logBirch,1)});
	   ModLoader.addRecipe(new ItemStack(mod_konungLog.logVert,3,3), new Object[]{ "#", "#", "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logJungle,1)});
	   //(����� ����� �������������� ������)
	   ModLoader.addRecipe(new ItemStack(Block.planks,4,0), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logDef,1)});
	   ModLoader.addRecipe(new ItemStack(Block.planks,4,1), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logPine,1)});
	   ModLoader.addRecipe(new ItemStack(Block.planks,4,2), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logBirch,1)});
	   ModLoader.addRecipe(new ItemStack(Block.planks,4,3), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungLog.logJungle,1)});
	   //������� ��� �����
	   ModLoader.addSmelting(mod_konungLog.logDef.blockID, new ItemStack(Item.coal, 1, 1));
	   ModLoader.addSmelting(mod_konungLog.logPine.blockID, new ItemStack(Item.coal, 1, 1));
	   ModLoader.addSmelting(mod_konungLog.logBirch.blockID, new ItemStack(Item.coal, 1, 1));
	   ModLoader.addSmelting(mod_konungLog.logJungle.blockID, new ItemStack(Item.coal, 1, 1));
	}
}