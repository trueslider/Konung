package net.minecraft.src;

public class mod_konungDecorations extends BaseMod
{
	/*
	 * Устанавливаем ID блока и предмета.
	 */	
	public static int blockWindowID = 160;
	public static int blockTableID = 161;
	public static int blockBenchID = 162;
	public static int blockBarrelID = 163;
	public static int blockLeatherID = 164;
	public static int blockIdolID = 166;

	/*
	 * Переменная для хранения ссылки на модель. 
	 */
	public static int modelWindowID; 
	public static int modelTableID;
	public static int modelBenchID;
	public static int modelBarrelID;
	public static int modelLeatherID;
	public static int modelIdolID;
	
	/* 
	 * Создаем блок.
	 */
	public static final Block blockWindow = (new KonungBlockWindow(blockWindowID, 0, KonungTileEntityWindow.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("Window").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockTable = (new KonungBlockTable(blockTableID, 0, KonungTileEntityTable.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("Table").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockBench = (new KonungBlockBench(blockBenchID, 0, KonungTileEntityBench.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("Bench").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockBarrel = (new KonungBlockBarrel(blockBarrelID, 0, KonungTileEntityBarrel.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("Barrel").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockLeather = (new KonungBlockLeather(blockLeatherID, 0, KonungTileEntityLeather.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("Leather").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockIdol = (new KonungBlockIdol(blockIdolID, 0, KonungTileEntityIdol.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("Idol").setCreativeTab(CreativeTabs.tabBlock);	
	
	/*
	 * blockWindowID-256 связывает ID блока с предметом.
	 */
	public static final Item itemWindow = (new KonungItemWindow (blockWindowID-256, blockWindow).setItemName("Window")).setTabToDisplayOn(CreativeTabs.tabBlock);
	public static final Item itemTable = (new KonungItemTable (blockTableID-256, blockTable).setItemName("Table")).setTabToDisplayOn(CreativeTabs.tabBlock);
	public static final Item itemBench = (new KonungItemBench (blockBenchID-256, blockBench).setItemName("Bench")).setTabToDisplayOn(CreativeTabs.tabBlock);
	public static final Item itemBarrel = (new KonungItemBarrel (blockBarrelID-256, blockBarrel).setItemName("Barrel")).setTabToDisplayOn(CreativeTabs.tabBlock);
	public static final Item itemLeather = (new KonungItemLeather (blockLeatherID-256, blockLeather).setItemName("Leather")).setTabToDisplayOn(CreativeTabs.tabBlock);
	public static final Item itemIdol = (new KonungItemIdol (blockIdolID-256, blockIdol).setItemName("Idol")).setTabToDisplayOn(CreativeTabs.tabBlock);
	

	
	public mod_konungDecorations()
	{
		
		/*
		 * Устанавливаем имя блока.
		 */
		ModLoader.addName(new ItemStack(blockWindow, 1, 0), "Oak Window");
		ModLoader.addName(new ItemStack(blockWindow, 1, 0), "ru_RU", "Дубовое окно");
		ModLoader.addName(new ItemStack(blockTable, 1, 0), "Oak Table");
		ModLoader.addName(new ItemStack(blockTable, 1, 0), "ru_RU", "Дубовый стол");
		ModLoader.addName(new ItemStack(blockBench, 1, 0), "Oak Bench");
		ModLoader.addName(new ItemStack(blockBench, 1, 0), "ru_RU", "Дубовая лавка");
		ModLoader.addName(new ItemStack(blockBarrel, 1, 0), "Oak Barrel");
		ModLoader.addName(new ItemStack(blockBarrel, 1, 0), "ru_RU", "Дубовая бочка");
		ModLoader.addName(new ItemStack(blockLeather, 1, 0), "Leather");
		ModLoader.addName(new ItemStack(blockLeather, 1, 0), "ru_RU", "Шкура");
		ModLoader.addName(new ItemStack(blockIdol, 1, 0), "Idol");
		ModLoader.addName(new ItemStack(blockIdol, 1, 0), "ru_RU", "Идол");

		
		/*
		 * Регистрируем TileEntity.
		 */
		ModLoader.registerTileEntity(KonungTileEntityWindow.class, "WindowTileEntity", new KonungRenderWindow());
		ModLoader.registerTileEntity(KonungTileEntityTable.class, "TableTileEntity", new KonungRenderTable());
		ModLoader.registerTileEntity(KonungTileEntityBench.class, "BenchTileEntity", new KonungRenderBench());
		ModLoader.registerTileEntity(KonungTileEntityBarrel.class, "BarrelTileEntity", new KonungRenderBarrel());
		ModLoader.registerTileEntity(KonungTileEntityLeather.class, "LeatherTileEntity", new KonungRenderLeather());
		ModLoader.registerTileEntity(KonungTileEntityIdol.class, "IdolTileEntity", new KonungRenderIdol());
		ModLoader.registerTileEntity(KonungTileEntityIdolIcon.class, "IdolIconTileEntity", new KonungRenderIdolIcon());
		
		
		/*
		 * Добавляем рецепт блока.
		 */
		ModLoader.addRecipe(new ItemStack(blockWindow, 1, 0), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), new ItemStack (mod_konungRefinedPlanks.refinedPlanks, 1, 0) ,Character.valueOf('Y'), Block.thinGlass});
		ModLoader.addRecipe(new ItemStack(blockTable, 1, 0), new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), new ItemStack(mod_konungRefinedPlanks.refinedPlanks, 1, 0)});
		ModLoader.addRecipe(new ItemStack(blockBench, 1, 0), new Object[] { "   ", "XXX", "X X", Character.valueOf('X'), new ItemStack(mod_konungRefinedPlanks.refinedPlanks, 1, 0)});
		ModLoader.addRecipe(new ItemStack(blockBarrel, 1, 0), new Object[] { " X ", "X X", " X ", Character.valueOf('X'), new ItemStack(mod_konungRefinedPlanks.refinedPlanks, 1, 0)});
		ModLoader.addRecipe(new ItemStack(blockLeather, 1, 0), new Object[] { " X ", " Y ", "X X", Character.valueOf('X'), new ItemStack(Item.stick,1),Character.valueOf('Y'), new ItemStack(Item.leather, 1)});
		ModLoader.addRecipe(new ItemStack(blockIdol, 1, 0), new Object[] { " X ", " X ", " X ", Character.valueOf('X'), new ItemStack(mod_konungRefinedWood.refinedWood, 1, 0)});
		

		/*
		 * Задаем уникальный ID для блока модели.
		 */
		modelWindowID = ModLoader.getUniqueBlockModelID(this, true);
		modelTableID = ModLoader.getUniqueBlockModelID(this, true);
		modelBenchID = ModLoader.getUniqueBlockModelID(this, true);
		modelBarrelID = ModLoader.getUniqueBlockModelID(this, true);
		modelLeatherID = ModLoader.getUniqueBlockModelID(this, true);
		modelIdolID = ModLoader.getUniqueBlockModelID(this, true);

	}
		
	/*
	 * Метод позволяющий блоку рендериться в инвентаре.
	 */
	public void renderInvBlock(RenderBlocks var1, Block var2, int var3, int var4)
	{
		super.renderInvBlock(var1, var2, var3, var4);

		if (var2 == blockWindow)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new KonungTileEntityWindow(), 0.0D, -0.1D, 0.0D, 0.0F);
		}
		if (var2 == blockTable)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new KonungTileEntityTable(), 0.0D, -0.1D, 0.0D, 0.0F);
		}
		if (var2 == blockBench)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new KonungTileEntityBench(), 0.0D, 0.0D, 0.0D, 0.0F);
		}
		if (var2 == blockBarrel)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new KonungTileEntityBarrel(), 0.0D, -0.1D, 0.0D, 0.0F);
		}
		if (var2 == blockLeather)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new KonungTileEntityLeather(), 0.0D, 0.0D, 0.0D, 0.0F);
		}
		if (var2 == blockIdol)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new KonungTileEntityIdolIcon(), 0.0D, 0.0D, 0.0D, 0.0F);
		}
	}	
	
	public void load(){};
	public String getVersion(){return "1.3.2";}
	
}
