package net.minecraft.src;
public class mod_konungFurniture extends BaseMod
	{
	public static final Block woodTable = (new BlockKonungWoodTable(150, TileEntityKonungWoodTable.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodTable");
	public static final Block woodTablePine = (new BlockKonungWoodTablePine(151, TileEntityKonungWoodTablePine.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodTablePine");
	public static final Block woodTableBirch = (new BlockKonungWoodTableBirch(152, TileEntityKonungWoodTableBirch.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodTableBirch");
	public static final Block woodTableJungle = (new BlockKonungWoodTableJungle(153, TileEntityKonungWoodTableJungle.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodTableJungle");
	public static final Block woodBench = (new BlockKonungWoodBench(154, TileEntityKonungWoodBench.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodBench");
	public static final Block woodBenchPine = (new BlockKonungWoodBenchPine(155, TileEntityKonungWoodBenchPine.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodBenchPine");
	public static final Block woodBenchBirch = (new BlockKonungWoodBenchBirch(156, TileEntityKonungWoodBenchBirch.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodBenchBirch");
	public static final Block woodBenchJungle = (new BlockKonungWoodBenchJungle(157, TileEntityKonungWoodBenchJungle.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodBenchJungle");
	public static final Block woodBarrel = (new BlockKonungWoodBarrel(158, TileEntityKonungWoodBarrel.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodBarrel");
	public static final Block leatherBanner = (new BlockKonungLeatherBanner(159, TileEntityKonungLeatherBanner.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("leatherBanner");
	public static final Block window = (new BlockKonungWindow(160, TileEntityKonungWindow.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("window");
	public static final Block hay = (new BlockKonungHay(161,0)).setHardness(0.5F).setStepSound(Block.soundGrassFootstep).setBlockName("hay");
	public static final Block hayStairs = (new BlockKonungStairs(162,0)).setHardness(0.5F).setStepSound(Block.soundGrassFootstep).setBlockName("hayStairs");
	public static final Block hayCornerStairs = (new BlockKonungCornerStairs(163,0)).setHardness(0.5F).setStepSound(Block.soundGrassFootstep).setBlockName("hayCornerStairs");
	
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
	
	public String getVersion()
	{
		return "1.2.5";
	}
	
	public void load()
	{
		RenderKonungWoodTable renderwoodtable = new RenderKonungWoodTable();
		RenderKonungWoodTablePine renderwoodtablepine = new RenderKonungWoodTablePine();
		RenderKonungWoodTableBirch renderwoodtablebirch = new RenderKonungWoodTableBirch();
		RenderKonungWoodTableJungle renderwoodtablejungle = new RenderKonungWoodTableJungle();
		RenderKonungWoodBench renderwoodbench = new RenderKonungWoodBench();
		RenderKonungWoodBenchPine renderwoodbenchpine = new RenderKonungWoodBenchPine();
		RenderKonungWoodBenchBirch renderwoodbenchbirch = new RenderKonungWoodBenchBirch();
		RenderKonungWoodBenchJungle renderwoodbenchjungle = new RenderKonungWoodBenchJungle();
		RenderKonungWoodBarrel renderwoodbarrel = new RenderKonungWoodBarrel();
		RenderKonungLeatherBanner renderleatherbanner = new RenderKonungLeatherBanner();
		RenderKonungWindow renderwindow = new RenderKonungWindow();
		
		ModLoader.registerTileEntity(TileEntityKonungWoodTable.class, "WoodTableTileEntity", renderwoodtable);
		ModLoader.registerTileEntity(TileEntityKonungWoodTablePine.class, "WoodTablePineTileEntity", renderwoodtablepine);
		ModLoader.registerTileEntity(TileEntityKonungWoodTableBirch.class, "WoodTableBirchTileEntity", renderwoodtablebirch);
		ModLoader.registerTileEntity(TileEntityKonungWoodTableJungle.class, "WoodTableJungleTileEntity", renderwoodtablejungle);
		ModLoader.registerTileEntity(TileEntityKonungWoodBench.class, "WoodBenchTileEntity", renderwoodbench);
		//ModLoader.registerEntityID(EntityKonungWoodBench.class, "WoodBenchEntity", );
		ModLoader.registerTileEntity(TileEntityKonungWoodBenchPine.class, "WoodBenchPineTileEntity", renderwoodbenchpine);
		ModLoader.registerTileEntity(TileEntityKonungWoodBenchBirch.class, "WoodBenchBirchTileEntity", renderwoodbenchbirch);
		ModLoader.registerTileEntity(TileEntityKonungWoodBenchJungle.class, "WoodBenchJungleTileEntity", renderwoodbenchjungle);
		ModLoader.registerTileEntity(TileEntityKonungWoodBarrel.class, "WoodBarrelTileEntity", renderwoodbarrel);
		ModLoader.registerTileEntity(TileEntityKonungLeatherBanner.class, "LeatherBannerTileEntity", renderleatherbanner);
		ModLoader.registerTileEntity(TileEntityKonungWindow.class, "WindowTileEntity", renderwindow);
		
		ModLoader.registerBlock(hay);
		ModLoader.registerBlock(hayStairs);
		ModLoader.registerBlock(hayCornerStairs);
		hay.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/hay.png");
		hayStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/hay.png");
		hayCornerStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/hay.png");
		
		ModLoader.addName(itemWoodTable, (new StringBuilder()).append("Wooden Table").toString());
		ModLoader.addName(itemWoodTablePine, (new StringBuilder()).append("Wooden Table").toString());
		ModLoader.addName(itemWoodTableBirch, (new StringBuilder()).append("Wooden Table").toString());
		ModLoader.addName(itemWoodTableJungle, (new StringBuilder()).append("Wooden Table").toString());
		ModLoader.addName(itemWoodBench, (new StringBuilder()).append("Wooden Bench").toString());
		ModLoader.addName(itemWoodBenchPine, (new StringBuilder()).append("Wooden Bench").toString());
		ModLoader.addName(itemWoodBenchBirch, (new StringBuilder()).append("Wooden Bench").toString());
		ModLoader.addName(itemWoodBenchJungle, (new StringBuilder()).append("Wooden Bench").toString());
		ModLoader.addName(itemWoodBarrel, (new StringBuilder()).append("Wooden Barrel").toString());
		ModLoader.addName(itemLeatherBanner, (new StringBuilder()).append("Crucified Leather").toString());
		ModLoader.addName(itemWindow, (new StringBuilder()).append("Window").toString());
		ModLoader.addName(hay, "Haystack");
		ModLoader.addName(hayStairs, "Hay Stairs");
		ModLoader.addName(hayCornerStairs, "Hay Stairs");
		
		itemWoodTable.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/icontable.png");
		itemWoodTablePine.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/icontablepine.png");
		itemWoodTableBirch.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/icontablebirch.png");
		itemWoodTableJungle.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/icontablejungle.png");
		itemWoodBench.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconbench.png");
		itemWoodBenchPine.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconbenchpine.png");
		itemWoodBenchBirch.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconbenchbirch.png");
		itemWoodBenchJungle.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconbenchjungle.png");
		itemWoodBarrel.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconbarrel.png");
		itemLeatherBanner.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconleatherbanner.png");
		itemWindow.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconwindow.png");
		
		ModLoader.addRecipe(new ItemStack(itemWoodTable, 1), new Object[] { "XXX", "X#X", "X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,0)});
		ModLoader.addRecipe(new ItemStack(itemWoodTablePine, 1), new Object[] { "XXX", "X#X","X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,1)});
		ModLoader.addRecipe(new ItemStack(itemWoodTableBirch, 1), new Object[] { "XXX", "X#X","X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,2)});
		ModLoader.addRecipe(new ItemStack(itemWoodTableJungle, 1), new Object[] { "XXX", "X#X","X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,3)});
		ModLoader.addRecipe(new ItemStack(itemWoodBench, 1), new Object[] { "###", "XXX", "X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,0)});
		ModLoader.addRecipe(new ItemStack(itemWoodBenchPine, 1), new Object[] { "###", "XXX", "X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,1)});
		ModLoader.addRecipe(new ItemStack(itemWoodBenchBirch, 1), new Object[] { "###", "XXX", "X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,2)});
		ModLoader.addRecipe(new ItemStack(itemWoodBenchJungle, 1), new Object[] { "###", "XXX", "X#X", Character.valueOf('X'), new ItemStack(Block.planks,1,3)});
		ModLoader.addRecipe(new ItemStack(itemWoodBarrel, 1), new Object[] { "#X#", "X#X", "#X#", Character.valueOf('X'), Block.planks});
		ModLoader.addRecipe(new ItemStack(itemLeatherBanner, 1), new Object[] { "#X#", "#Y#", "X#X", Character.valueOf('X'), new ItemStack(Item.stick,1),Character.valueOf('Y'), new ItemStack(Item.leather,1)});
		ModLoader.addRecipe(new ItemStack(itemWindow, 1), new Object[] { "#X#", "XYX", "#X#", Character.valueOf('X'), Block.planks ,Character.valueOf('Y'), Block.thinGlass});
		ModLoader.addRecipe(new ItemStack(hay, 3), 	new Object[]{ "XXX","XXX","XXX",Character.valueOf('X'), new ItemStack(Item.wheat,1)});
		ModLoader.addRecipe(new ItemStack(hayStairs, 3), 	new Object[]{ "X##","XX#","XXX",Character.valueOf('X'), new ItemStack(Item.wheat,1)});
		ModLoader.addRecipe(new ItemStack(hayCornerStairs, 3), 	new Object[]{ "X##","X##","XXX",Character.valueOf('X'), new ItemStack(Item.wheat,1)});
	}
}