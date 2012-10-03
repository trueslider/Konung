package net.minecraft.src;

public class mod_konungFurniture extends BaseMod
	{
	public static final Block woodTable = (new KonungBlockWoodTable(150, KonungTileEntityWoodTable.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodTable");
	public static final Block woodTablePine = (new KonungBlockWoodTablePine(151, KonungTileEntityWoodTablePine.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodTablePine");
	public static final Block woodTableBirch = (new KonungBlockWoodTableBirch(152, KonungTileEntityWoodTableBirch.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodTableBirch");
	public static final Block woodTableJungle = (new KonungBlockWoodTableJungle(153, KonungTileEntityWoodTableJungle.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodTableJungle");
	public static final Block woodBench = (new KonungBlockWoodBench(154, KonungTileEntityWoodBench.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodBench");
	public static final Block woodBenchPine = (new KonungBlockWoodBenchPine(155, KonungTileEntityWoodBenchPine.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodBenchPine");
	public static final Block woodBenchBirch = (new KonungBlockWoodBenchBirch(156, KonungTileEntityWoodBenchBirch.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodBenchBirch");
	public static final Block woodBenchJungle = (new KonungBlockWoodBenchJungle(157, KonungTileEntityWoodBenchJungle.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodBenchJungle");
	public static final Block woodBarrel = (new KonungBlockWoodBarrel(158, KonungTileEntityWoodBarrel.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodBarrel");
	public static final Block leatherBanner = (new KonungBlockLeatherBanner(159, KonungTileEntityLeatherBanner.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("leatherBanner");
	public static final Block window = (new KonungBlockWindow(160, KonungTileEntityWindow.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("window");
	//public static final Block hay = (new KonungBlockHay(161,0)).setHardness(0.5F).setStepSound(Block.soundGrassFootstep).setBlockName("hay");
	//public static final Block hayStairs = (new KonungBlockStairs(162,0)).setHardness(0.5F).setStepSound(Block.soundGrassFootstep).setBlockName("hayStairs");
	//public static final Block hayCornerStairs = (new KonungBlockCornerStairs(163,0)).setHardness(0.5F).setStepSound(Block.soundGrassFootstep).setBlockName("hayCornerStairs");
	public static final Block woodIdol = (new KonungBlockWoodIdol(164, KonungTileEntityWoodIdol.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodIdol");
	
	public static final Item itemWoodTable = (new ItemReed(6000, woodTable)).setItemName("itemWoodTable");
	public static final Item itemWoodTablePine = (new ItemReed(6001, woodTablePine)).setItemName("itemWoodTablePine");
	public static final Item itemWoodTableBirch = (new ItemReed(6002, woodTableBirch)).setItemName("itemWoodTableBirch");
	public static final Item itemWoodTableJungle = (new ItemReed(6003, woodTableJungle)).setItemName("itemWoodTableJungle");
	public static final Item itemWoodBench = (new ItemReed(6004, woodBench)).setItemName("itemWoodBench");
	public static final Item itemWoodBenchPine = (new ItemReed(6005, woodBenchPine)).setItemName("itemWoodBenchPine");
	public static final Item itemWoodBenchBirch = (new ItemReed(6006, woodBenchBirch)).setItemName("itemWoodBenchBirch");
	public static final Item itemWoodBenchJungle = (new ItemReed(6007, woodBenchJungle)).setItemName("itemWoodBenchJungle");
	public static final Item itemWoodBarrel = (new ItemReed(6008, woodBarrel)).setItemName("itemWoodBarrel");
	public static final Item itemLeatherBanner = (new ItemReed(6009, leatherBanner)).setItemName("itemLeathernBanner");
	public static final Item itemWindow = (new ItemReed(6010, window)).setItemName("itemWindow");
	public static final Item itemWoodIdol = (new ItemReed(6011, woodIdol)).setItemName("itemWoodIdol");
	
	
	public mod_konungFurniture()
	{	
		//РґРµСЂРµРІСЏРЅРЅС‹Р№ СЃС‚РѕР»
		KonungRenderWoodTable renderwoodtable = new KonungRenderWoodTable();
		KonungRenderWoodTablePine renderwoodtablepine = new KonungRenderWoodTablePine();
		KonungRenderWoodTableBirch renderwoodtablebirch = new KonungRenderWoodTableBirch();
		KonungRenderWoodTableJungle renderwoodtablejungle = new KonungRenderWoodTableJungle();
		
		ModLoader.registerTileEntity(KonungTileEntityWoodTable.class, "WoodTableTileEntity", renderwoodtable);
		ModLoader.registerTileEntity(KonungTileEntityWoodTablePine.class, "WoodTablePineTileEntity", renderwoodtablepine);
		ModLoader.registerTileEntity(KonungTileEntityWoodTableBirch.class, "WoodTableBirchTileEntity", renderwoodtablebirch);
		ModLoader.registerTileEntity(KonungTileEntityWoodTableJungle.class, "WoodTableJungleTileEntity", renderwoodtablejungle);
		
		ModLoader.addName(itemWoodTable, (new StringBuilder()).append("Wooden Table").toString());
		ModLoader.addName(itemWoodTablePine, (new StringBuilder()).append("Wooden Table").toString());
		ModLoader.addName(itemWoodTableBirch, (new StringBuilder()).append("Wooden Table").toString());
		ModLoader.addName(itemWoodTableJungle, (new StringBuilder()).append("Wooden Table").toString());
		
		itemWoodTable.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/icontable.png");
		itemWoodTablePine.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/icontablepine.png");
		itemWoodTableBirch.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/icontablebirch.png");
		itemWoodTableJungle.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/icontablejungle.png");
		
		ModLoader.addRecipe(new ItemStack(itemWoodTable, 1), new Object[] { "XXX", "X#X", "X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,0)});
		ModLoader.addRecipe(new ItemStack(itemWoodTablePine, 1), new Object[] { "XXX", "X#X","X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,1)});
		ModLoader.addRecipe(new ItemStack(itemWoodTableBirch, 1), new Object[] { "XXX", "X#X","X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,2)});
		ModLoader.addRecipe(new ItemStack(itemWoodTableJungle, 1), new Object[] { "XXX", "X#X","X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,3)});
		
		//Р”РµСЂРµРІСЏРЅРЅР°СЏ Р»Р°РІРєР°
		KonungRenderWoodBench renderwoodbench = new KonungRenderWoodBench();
		KonungRenderWoodBenchPine renderwoodbenchpine = new KonungRenderWoodBenchPine();
		KonungRenderWoodBenchBirch renderwoodbenchbirch = new KonungRenderWoodBenchBirch();
		KonungRenderWoodBenchJungle renderwoodbenchjungle = new KonungRenderWoodBenchJungle();
		
		ModLoader.registerTileEntity(KonungTileEntityWoodBench.class, "WoodBenchTileEntity", renderwoodbench);
		ModLoader.registerTileEntity(KonungTileEntityWoodBenchPine.class, "WoodBenchPineTileEntity", renderwoodbenchpine);
		ModLoader.registerTileEntity(KonungTileEntityWoodBenchBirch.class, "WoodBenchBirchTileEntity", renderwoodbenchbirch);
		ModLoader.registerTileEntity(KonungTileEntityWoodBenchJungle.class, "WoodBenchJungleTileEntity", renderwoodbenchjungle);
		
		ModLoader.addName(itemWoodBench, (new StringBuilder()).append("Wooden Bench").toString());
		ModLoader.addName(itemWoodBenchPine, (new StringBuilder()).append("Wooden Bench").toString());
		ModLoader.addName(itemWoodBenchBirch, (new StringBuilder()).append("Wooden Bench").toString());
		ModLoader.addName(itemWoodBenchJungle, (new StringBuilder()).append("Wooden Bench").toString());
		
		itemWoodBench.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconbench.png");
		itemWoodBenchPine.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconbenchpine.png");
		itemWoodBenchBirch.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconbenchbirch.png");
		itemWoodBenchJungle.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconbenchjungle.png");
		
		ModLoader.addRecipe(new ItemStack(itemWoodBench, 1), new Object[] { "###", "XXX", "X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,0)});
		ModLoader.addRecipe(new ItemStack(itemWoodBenchPine, 1), new Object[] { "###", "XXX", "X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,1)});
		ModLoader.addRecipe(new ItemStack(itemWoodBenchBirch, 1), new Object[] { "###", "XXX", "X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,2)});
		ModLoader.addRecipe(new ItemStack(itemWoodBenchJungle, 1), new Object[] { "###", "XXX", "X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,3)});
		
		//Р”РµСЂРµРІСЏРЅРЅР°СЏ Р±РѕС‡РєР°
		KonungRenderWoodBarrel renderwoodbarrel = new KonungRenderWoodBarrel();
		ModLoader.registerTileEntity(KonungTileEntityWoodBarrel.class, "WoodBarrelTileEntity", renderwoodbarrel);
		ModLoader.addName(itemWoodBarrel, (new StringBuilder()).append("Wooden Barrel").toString());
		itemWoodBarrel.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconbarrel.png");
		ModLoader.addRecipe(new ItemStack(itemWoodBarrel, 1), new Object[] { "#X#", "X#X", "#X#", Character.valueOf('X'), Block.planks});
		
		//Р Р°СЃРїСЏС‚СЊРµ РєРѕР¶Рё
		KonungRenderLeatherBanner renderleatherbanner = new KonungRenderLeatherBanner();
		ModLoader.registerTileEntity(KonungTileEntityLeatherBanner.class, "LeatherBannerTileEntity", renderleatherbanner);
		ModLoader.addName(itemLeatherBanner, (new StringBuilder()).append("Crucified Leather").toString());
		itemLeatherBanner.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconleatherbanner.png");
		ModLoader.addRecipe(new ItemStack(itemLeatherBanner, 1), new Object[] { "#X#", "#Y#", "X#X", Character.valueOf('X'), new ItemStack(Item.stick,1),Character.valueOf('Y'), new ItemStack(Item.leather,1)});
		
		//РћРєРЅРѕ
		KonungRenderWindow renderwindow = new KonungRenderWindow();
		ModLoader.registerTileEntity(KonungTileEntityWindow.class, "WindowTileEntity", renderwindow);
		ModLoader.addName(itemWindow, (new StringBuilder()).append("Window").toString());
		itemWindow.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconwindow.png");
		ModLoader.addRecipe(new ItemStack(itemWindow, 1), new Object[] { "#X#", "XYX", "#X#", Character.valueOf('X'), Block.planks ,Character.valueOf('Y'), Block.thinGlass});
		
		//Р‘Р»РѕРє СЃРµРЅР°
		//ModLoader.registerBlock(hay);
		//ModLoader.registerBlock(hayStairs);
		//ModLoader.registerBlock(hayCornerStairs);
		//hay.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/hay.png");
		//hayStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/hay.png");
		//hayCornerStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/hay.png");
		
		//ModLoader.addName(hay, "Haystack");
		//ModLoader.addName(hayStairs, "Hay Stairs");
		//ModLoader.addName(hayCornerStairs, "Hay Stairs");
		
		//ModLoader.addRecipe(new ItemStack(hay, 3), 	new Object[]{ "XXX","XXX","XXX",Character.valueOf('X'), new ItemStack(Item.wheat,1)});
		//ModLoader.addRecipe(new ItemStack(hayStairs, 3), 	new Object[]{ "X##","XX#","XXX",Character.valueOf('X'), new ItemStack(Item.wheat,1)});
		//ModLoader.addRecipe(new ItemStack(hayCornerStairs, 3), 	new Object[]{ "X##","X##","XXX",Character.valueOf('X'), new ItemStack(Item.wheat,1)});
		
		//Р”РµСЂРµРІСЏРЅРЅС‹Р№ РёРґРѕР»
		KonungRenderWoodIdol renderwoodidol = new KonungRenderWoodIdol();
		ModLoader.registerTileEntity(KonungTileEntityWoodIdol.class, "WoodIdolTileEntity", renderwoodidol);
		ModLoader.addName(itemWoodIdol, (new StringBuilder()).append("Wooden Idol").toString());
		itemWoodIdol.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconwoodidol.png");
		//ModLoader.addRecipe(new ItemStack(itemWoodIdol, 1), new Object[] { "#X#", "#X#", "#X#", Character.valueOf('X'), mod_konungLog.logVert});
	}
	
	public void load(){};
	public String getVersion(){return "1.3.1";}
}