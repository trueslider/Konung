package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import java.io.File;

public class mod_konungStockade extends BaseMod
{		
	public static void prepareProps()
    { 
		props.getInt("Slopes_Opacity", 0);
		props.getInt("BlockKaevWoodCorners", 165);
    }
	
	public mod_konungStockade()
    {		
		CornersRenderID = ModLoader.getUniqueBlockModelID(this, true);		
		
		enableAO = false;
		aoLightValueThis = 0.0F;
        aoLightValueXNeg = 0.0F;
        aoLightValueYNeg = 0.0F;
        aoLightValueZNeg = 0.0F;
        aoLightValueXPos = 0.0F;
        aoLightValueYPos = 0.0F;
        aoLightValueZPos = 0.0F;
        aoLightValueXNegYNegZNeg = 0.0F;
        aoLightValueXNegYNeg = 0.0F;
        aoLightValueXNegYNegZPos = 0.0F;
        aoLightValueYNegZNeg = 0.0F;
        aoLightValueYNegZPos = 0.0F;
        aoLightValueXPosYNegZNeg = 0.0F;
        aoLightValueXPosYNeg = 0.0F;
        aoLightValueXPosYNegZPos = 0.0F;
        aoLightValueXNegYPosZNeg = 0.0F;
        aoLightValueXNegYPos = 0.0F;
        aoLightValueXNegYPosZPos = 0.0F;
        aoLightValueYPosZNeg = 0.0F;
        aoLightValueXPosYPosZNeg = 0.0F;
        aoLightValueXPosYPos = 0.0F;
        aoLightValueYPosZPos = 0.0F;
        aoLightValueXPosYPosZPos = 0.0F;
        aoLightValueXNegZNeg = 0.0F;
        aoLightValueXPosZNeg = 0.0F;
        aoLightValueXNegZPos = 0.0F;
        aoLightValueXPosZPos = 0.0F;
        field_22352_G = 1;        
        isBlockYPosZNeg = false;
        isBlockXPosYPos = false;
        isBlockXNegYPos = false;
        isBlockYPosZPos = false;
        isBlockXNegZNeg = false;
        isBlockXPosZPos = false;
        isBlockXNegZPos = false;
        isBlockXPosZNeg = false;
        isBlockYNegZNeg = false;
        isBlockXPosYNeg = false;
        isBlockXNegYNeg = false;
        isBlockYNegZPos = false;

		factorTop = 1.0F;
		factorBottom = 0.5F;
		factorEast = 0.8F;
		factorWest = 0.8F;
		factorNorth = 0.6F;
		factorSouth = 0.6F;	
		
		colorRedTopLeft_TopFace = 0.0F;
		colorRedBottomLeft_TopFace = 0.0F;
		colorRedBottomRight_TopFace = 0.0F;
		colorRedTopRight_TopFace = 0.0F;
		colorGreenTopLeft_TopFace = 0.0F;
		colorGreenBottomLeft_TopFace = 0.0F;
		colorGreenBottomRight_TopFace = 0.0F;
		colorGreenTopRight_TopFace = 0.0F;
		colorBlueTopLeft_TopFace = 0.0F;
		colorBlueBottomLeft_TopFace = 0.0F;
		colorBlueBottomRight_TopFace = 0.0F;
		colorBlueTopRight_TopFace = 0.0F;
		
		colorRedTopLeft_BottomFace = 0.0F;
		colorRedBottomLeft_BottomFace = 0.0F;
		colorRedBottomRight_BottomFace = 0.0F;
		colorRedTopRight_BottomFace = 0.0F;
		colorGreenTopLeft_BottomFace = 0.0F;
		colorGreenBottomLeft_BottomFace = 0.0F;
		colorGreenBottomRight_BottomFace = 0.0F;
		colorGreenTopRight_BottomFace = 0.0F;
		colorBlueTopLeft_BottomFace = 0.0F;
		colorBlueBottomLeft_BottomFace = 0.0F;
		colorBlueBottomRight_BottomFace = 0.0F;
		colorBlueTopRight_BottomFace = 0.0F;
		
		colorRedTopLeft_EastFace = 0.0F;
		colorRedBottomLeft_EastFace = 0.0F;
		colorRedBottomRight_EastFace = 0.0F;
		colorRedTopRight_EastFace = 0.0F;
		colorGreenTopLeft_EastFace = 0.0F;
		colorGreenBottomLeft_EastFace = 0.0F;
		colorGreenBottomRight_EastFace = 0.0F;
		colorGreenTopRight_EastFace = 0.0F;
		colorBlueTopLeft_EastFace = 0.0F;
		colorBlueBottomLeft_EastFace = 0.0F;
		colorBlueBottomRight_EastFace = 0.0F;
		colorBlueTopRight_EastFace = 0.0F;
		
		colorRedTopLeft_WestFace = 0.0F;
		colorRedBottomLeft_WestFace = 0.0F;
		colorRedBottomRight_WestFace = 0.0F;
		colorRedTopRight_WestFace = 0.0F;
		colorGreenTopLeft_WestFace = 0.0F;
		colorGreenBottomLeft_WestFace = 0.0F;
		colorGreenBottomRight_WestFace = 0.0F;
		colorGreenTopRight_WestFace = 0.0F;
		colorBlueTopLeft_WestFace = 0.0F;
		colorBlueBottomLeft_WestFace = 0.0F;
		colorBlueBottomRight_WestFace = 0.0F;
		colorBlueTopRight_WestFace = 0.0F;
		
		colorRedTopLeft_NorthFace = 0.0F;
		colorRedBottomLeft_NorthFace = 0.0F;
		colorRedBottomRight_NorthFace = 0.0F;
		colorRedTopRight_NorthFace = 0.0F;
		colorGreenTopLeft_NorthFace = 0.0F;
		colorGreenBottomLeft_NorthFace = 0.0F;
		colorGreenBottomRight_NorthFace = 0.0F;
		colorGreenTopRight_NorthFace = 0.0F;
		colorBlueTopLeft_NorthFace = 0.0F;
		colorBlueBottomLeft_NorthFace = 0.0F;
		colorBlueBottomRight_NorthFace = 0.0F;
		colorBlueTopRight_NorthFace = 0.0F;
		
		colorRedTopLeft_SouthFace = 0.0F;
		colorRedBottomLeft_SouthFace = 0.0F;
		colorRedBottomRight_SouthFace = 0.0F;
		colorRedTopRight_SouthFace = 0.0F;
		colorGreenTopLeft_SouthFace = 0.0F;
		colorGreenBottomLeft_SouthFace = 0.0F;
		colorGreenBottomRight_SouthFace = 0.0F;
		colorGreenTopRight_SouthFace = 0.0F;
		colorBlueTopLeft_SouthFace = 0.0F;
		colorBlueBottomLeft_SouthFace = 0.0F;
		colorBlueBottomRight_SouthFace = 0.0F;
		colorBlueTopRight_SouthFace = 0.0F;		
		
		colorRedSlopes = 0.0F;
		colorGreenSlopes = 0.0F;
		colorBlueSlopes = 0.0F;
		
		ModLoader.addLocalization("KaevWoodSlopesQuadriCornerDown.name", "wooden stockade");
		//ModLoader.addLocalization("KaevWoodSlopesQuadriCornerUp.name", "wooden ceiling angle");
		//ModLoader.addLocalization("KaevWoodSlopesTriCornerDown.name", "wooden slanted corner");
		//ModLoader.addLocalization("KaevWoodSlopesTriCornerUp.name", "wooden slanted corner");
		
		BlockKaevWoodCorners.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/Stockade.png");
		
		//if(props.getInt("BlockKaevWoodCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, KonungBlockStockade.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.wood
			});
		//	ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, KonungBlockStockade.func_21035_d(0)), new Object[] {
		//		" # ", "###", Character.valueOf('#'), mod_konungLog.logVert
		//	});
		//}
	}
	
	private static String getAppdata()
	{
		return Minecraft.getMinecraftDir().getPath();
	}		
	
	public static KrushProps props;	
	
	public static int CornersRenderID;
	public static int SlopesOpacity;	
	
	public static final Block BlockKaevWoodCorners;

	public static Item ItemKaevWoodCorners;

	public static boolean field_27406_a = true;
    public static boolean field_27511_cfgGrassFix = true;
	public boolean enableAO;
	public float aoLightValueThis;
    public float aoLightValueXNeg;
    public float aoLightValueYNeg;
    public float aoLightValueZNeg;
    public float aoLightValueXPos;
    public float aoLightValueYPos;
    public float aoLightValueZPos;
    public float aoLightValueXNegYNegZNeg;
    public float aoLightValueXNegYNeg;
    public float aoLightValueXNegYNegZPos;
    public float aoLightValueYNegZNeg;
    public float aoLightValueYNegZPos;
    public float aoLightValueXPosYNegZNeg;
    public float aoLightValueXPosYNeg;
    public float aoLightValueXPosYNegZPos;
    public float aoLightValueXNegYPosZNeg;
    public float aoLightValueXNegYPos;
    public float aoLightValueXNegYPosZPos;
    public float aoLightValueYPosZNeg;
    public float aoLightValueXPosYPosZNeg;
    public float aoLightValueXPosYPos;
    public float aoLightValueYPosZPos;
    public float aoLightValueXPosYPosZPos;
    public float aoLightValueXNegZNeg;
    public float aoLightValueXPosZNeg;
    public float aoLightValueXNegZPos;
    public float aoLightValueXPosZPos;
    public int field_22352_G;    
    public boolean isBlockYPosZNeg;
    public boolean isBlockXPosYPos;
    public boolean isBlockXNegYPos;
    public boolean isBlockYPosZPos;
    public boolean isBlockXNegZNeg;
    public boolean isBlockXPosZPos;
    public boolean isBlockXNegZPos;
    public boolean isBlockXPosZNeg;
    public boolean isBlockYNegZNeg;
    public boolean isBlockXPosYNeg;
    public boolean isBlockXNegYNeg;
    public boolean isBlockYNegZPos;
    public int field_27510_blockX;
    public int field_27509_blockY;
    public int field_27508_blockZ;
	
	public float factorTop;
    public float factorBottom;
    public float factorEast;
    public float factorWest;
    public float factorNorth;
    public float factorSouth;
	
	public float colorRedTopLeft_TopFace;
    public float colorRedBottomLeft_TopFace;
    public float colorRedBottomRight_TopFace;
    public float colorRedTopRight_TopFace;
    public float colorGreenTopLeft_TopFace;
    public float colorGreenBottomLeft_TopFace;
    public float colorGreenBottomRight_TopFace;
    public float colorGreenTopRight_TopFace;
    public float colorBlueTopLeft_TopFace;
    public float colorBlueBottomLeft_TopFace;
    public float colorBlueBottomRight_TopFace;
    public float colorBlueTopRight_TopFace;
	
	public float colorRedTopLeft_BottomFace;
    public float colorRedBottomLeft_BottomFace;
    public float colorRedBottomRight_BottomFace;
    public float colorRedTopRight_BottomFace;
    public float colorGreenTopLeft_BottomFace;
    public float colorGreenBottomLeft_BottomFace;
    public float colorGreenBottomRight_BottomFace;
    public float colorGreenTopRight_BottomFace;
    public float colorBlueTopLeft_BottomFace;
    public float colorBlueBottomLeft_BottomFace;
    public float colorBlueBottomRight_BottomFace;
    public float colorBlueTopRight_BottomFace;
	
	public float colorRedTopLeft_EastFace;
    public float colorRedBottomLeft_EastFace;
    public float colorRedBottomRight_EastFace;
    public float colorRedTopRight_EastFace;
    public float colorGreenTopLeft_EastFace;
    public float colorGreenBottomLeft_EastFace;
    public float colorGreenBottomRight_EastFace;
    public float colorGreenTopRight_EastFace;
    public float colorBlueTopLeft_EastFace;
    public float colorBlueBottomLeft_EastFace;
    public float colorBlueBottomRight_EastFace;
    public float colorBlueTopRight_EastFace;
	
	public float colorRedTopLeft_WestFace;
    public float colorRedBottomLeft_WestFace;
    public float colorRedBottomRight_WestFace;
    public float colorRedTopRight_WestFace;
    public float colorGreenTopLeft_WestFace;
    public float colorGreenBottomLeft_WestFace;
    public float colorGreenBottomRight_WestFace;
    public float colorGreenTopRight_WestFace;
    public float colorBlueTopLeft_WestFace;
    public float colorBlueBottomLeft_WestFace;
    public float colorBlueBottomRight_WestFace;
    public float colorBlueTopRight_WestFace;
	
	public float colorRedTopLeft_NorthFace;
    public float colorRedBottomLeft_NorthFace;
    public float colorRedBottomRight_NorthFace;
    public float colorRedTopRight_NorthFace;
    public float colorGreenTopLeft_NorthFace;
    public float colorGreenBottomLeft_NorthFace;
    public float colorGreenBottomRight_NorthFace;
    public float colorGreenTopRight_NorthFace;
    public float colorBlueTopLeft_NorthFace;
    public float colorBlueBottomLeft_NorthFace;
    public float colorBlueBottomRight_NorthFace;
    public float colorBlueTopRight_NorthFace;
	
	public float colorRedTopLeft_SouthFace;
    public float colorRedBottomLeft_SouthFace;
    public float colorRedBottomRight_SouthFace;
    public float colorRedTopRight_SouthFace;
    public float colorGreenTopLeft_SouthFace;
    public float colorGreenBottomLeft_SouthFace;
    public float colorGreenBottomRight_SouthFace;
    public float colorGreenTopRight_SouthFace;
    public float colorBlueTopLeft_SouthFace;
    public float colorBlueBottomLeft_SouthFace;
    public float colorBlueBottomRight_SouthFace;
    public float colorBlueTopRight_SouthFace;	
	
	public float colorRedSlopes;
	public float colorGreenSlopes;
	public float colorBlueSlopes; 
	
	static
	{
		props = new KrushProps(new File(getAppdata() + "/config/KaevatorSuperSlopes.props").getPath());	
		prepareProps();
		SlopesOpacity = props.getInt("Slopes_Opacity");
		
		if(props.getInt("BlockKaevWoodCorners") != 0){
			BlockKaevWoodCorners = new KonungBlockStockade(props.getInt("BlockKaevWoodCorners"),4,Material.wood).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setResistance(5F).setBlockName("BlockKaevWoodCorners").setCreativeTab(CreativeTabs.tabBlock);
			ItemKaevWoodCorners = new KonungItemStockade(BlockKaevWoodCorners.blockID - 256, "Wood").setItemName("ItemKaevWoodCorners").setTabToDisplayOn(CreativeTabs.tabBlock);
		}else{
			BlockKaevWoodCorners = Block.stone;
		}
		
		props.save();
	}		
	
	public void renderInvBlock(RenderBlocks renderblocks, Block block, int i, int j)
    {
		Tessellator tessellator = Tessellator.instance;			
		if(j == CornersRenderID)
        {            
			block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
		
			GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
			
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0F, -1F, 0.0F);
			renderCornersBottomFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(0,i),i+1, renderblocks, 240);
			tessellator.draw();
			
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0F, 1.0F, 0.0F);
			renderCornersTopFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(1,i),i+1, renderblocks, 240);
			tessellator.draw();
			
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0F, 0.0F, -1F);
			renderCornersEastFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(2,i),i+1, renderblocks, 240);
			tessellator.draw();
			
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0F, 0.0F, 1.0F);
			renderCornersWestFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(3,i),i+1, renderblocks, 240);
			tessellator.draw();
			
			tessellator.startDrawingQuads();
			tessellator.setNormal(-1F, 0.0F, 0.0F);
			renderCornersNorthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(4,i),i+1, renderblocks, 240);
			tessellator.draw();
			
			tessellator.startDrawingQuads();
			tessellator.setNormal(1.0F, 0.0F, 0.0F);
			renderCornersSouthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(5,i),i+1, renderblocks, 240);
			tessellator.draw();
			
			GL11.glTranslatef(0.5F, 0.5F, 0.5F);				
        }     
		block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
    }	
	
	public boolean renderWorldBlock(RenderBlocks renderblocks, IBlockAccess iblockaccess, int i, int j, int k, Block block, int l)
	{		
		if(l == CornersRenderID)
		{
			return renderBlockCorners(block, i, j, k, renderblocks, iblockaccess);
		} 
		
        return false;
	}	
	
	public boolean renderBlockCorners(Block block, int i, int j, int k, RenderBlocks renderblocks, IBlockAccess iblockaccess)
    {
		int iDir = iblockaccess.getBlockMetadata(i, j, k);
        int l = block.colorMultiplier(iblockaccess, i, j, k);
        float f = (float)(l >> 16 & 0xff) / 255F;
        float f1 = (float)(l >> 8 & 0xff) / 255F;
        float f2 = (float)(l & 0xff) / 255F;
		
		if(Minecraft.isAmbientOcclusionEnabled())
        {			
            return renderCornersBlockWithAmbientOcclusion(block, i, j, k, f, f1, f2, iDir, renderblocks, iblockaccess);
        } else
        {
            return renderCornersBlockWithColorMultiplier(block, i, j, k, f, f1, f2, iDir, renderblocks, iblockaccess);
        }        
    }	
	
	public boolean renderCornersBlockWithAmbientOcclusion(Block block, int i, int j, int k, float f, float f1, float f2, int iDir, RenderBlocks renderblocks, IBlockAccess iblockaccess)
    {
        enableAO = true;
        boolean flag = false;        
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        boolean flag4 = true;
        boolean flag5 = true;
        boolean flag6 = true;
		
        aoLightValueThis = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k);
        aoLightValueXNeg = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j, k);
        aoLightValueYNeg = block.getAmbientOcclusionLightValue(iblockaccess, i, j - 1, k);
        aoLightValueZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k - 1);
        aoLightValueXPos = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j, k);
        aoLightValueYPos = block.getAmbientOcclusionLightValue(iblockaccess, i, j + 1, k);
        aoLightValueZPos = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k + 1);
		
		aoLightValueXPosYPos = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j + 1, k);
		aoLightValueXPosYNeg = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j - 1, k);
		aoLightValueXPosZPos = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j, k + 1);
		aoLightValueXPosZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j, k - 1);
		aoLightValueXNegYPos = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j + 1, k);
		aoLightValueXNegYNeg = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j - 1, k);
		aoLightValueXNegZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j, k - 1);	
		aoLightValueXNegZPos = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j, k + 1);
		aoLightValueYPosZPos = block.getAmbientOcclusionLightValue(iblockaccess, i, j + 1, k + 1);
		aoLightValueYPosZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i, j + 1, k - 1);
		aoLightValueYNegZPos = block.getAmbientOcclusionLightValue(iblockaccess, i, j - 1, k + 1);
		aoLightValueYNegZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i, j - 1, k - 1);			
			
		aoLightValueXPosYPosZPos = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j + 1, k + 1);
		aoLightValueXPosYNegZPos = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j - 1, k + 1);
		aoLightValueXPosYPosZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j + 1, k - 1);
		aoLightValueXPosYNegZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j - 1, k - 1);
		aoLightValueXNegYPosZPos = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j + 1, k + 1);
		aoLightValueXNegYNegZPos = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j - 1, k + 1);
		aoLightValueXNegYPosZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j + 1, k - 1);
		aoLightValueXNegYNegZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j - 1, k - 1);		
		
        if(block.blockIndexInTexture == 3)
        {
            flag1 = flag3 = flag4 = flag5 = flag6 = false;
        }
        
		///////////////////////////////////
		float f7;
		float f13;
		float f19;
		float f25;
		if(field_22352_G > 0)
		{						
			f7 = (aoLightValueXNegYNegZPos + aoLightValueXNegYNeg + aoLightValueYNegZPos + aoLightValueYNeg) / 4F;
			f25 = (aoLightValueYNegZPos + aoLightValueYNeg + aoLightValueXPosYNegZPos + aoLightValueXPosYNeg) / 4F;
			f19 = (aoLightValueYNeg + aoLightValueYNegZNeg + aoLightValueXPosYNeg + aoLightValueXPosYNegZNeg) / 4F;
			f13 = (aoLightValueXNegYNeg + aoLightValueXNegYNegZNeg + aoLightValueYNeg + aoLightValueYNegZNeg) / 4F;
		} else
		{
			f7 = f13 = f19 = f25 = aoLightValueYNeg;
		}
		colorRedTopLeft_BottomFace = colorRedBottomLeft_BottomFace = colorRedBottomRight_BottomFace = colorRedTopRight_BottomFace = (flag1 ? f : 1.0F) * 0.5F;
		colorGreenTopLeft_BottomFace = colorGreenBottomLeft_BottomFace = colorGreenBottomRight_BottomFace = colorGreenTopRight_BottomFace = (flag1 ? f1 : 1.0F) * 0.5F;
		colorBlueTopLeft_BottomFace = colorBlueBottomLeft_BottomFace = colorBlueBottomRight_BottomFace = colorBlueTopRight_BottomFace = (flag1 ? f2 : 1.0F) * 0.5F;
		colorRedTopLeft_BottomFace *= f7;
		colorGreenTopLeft_BottomFace *= f7;
		colorBlueTopLeft_BottomFace *= f7;
		colorRedBottomLeft_BottomFace *= f13;
		colorGreenBottomLeft_BottomFace *= f13;
		colorBlueBottomLeft_BottomFace *= f13;
		colorRedBottomRight_BottomFace *= f19;
		colorGreenBottomRight_BottomFace *= f19;
		colorBlueBottomRight_BottomFace *= f19;
		colorRedTopRight_BottomFace *= f25;
		colorGreenTopRight_BottomFace *= f25;
		colorBlueTopRight_BottomFace *= f25;
		
		///////////////////////////////////	
		float f8;
		float f14;
		float f20;
		float f26;
		if(field_22352_G > 0)
		{				
			f26 = (aoLightValueXNegYPosZPos + aoLightValueXNegYPos + aoLightValueYPosZPos + aoLightValueYPos) / 4F;
			f8 = (aoLightValueYPosZPos + aoLightValueYPos + aoLightValueXPosYPosZPos + aoLightValueXPosYPos) / 4F;
			f14 = (aoLightValueYPos + aoLightValueYPosZNeg + aoLightValueXPosYPos + aoLightValueXPosYPosZNeg) / 4F;
			f20 = (aoLightValueXNegYPos + aoLightValueXNegYPosZNeg + aoLightValueYPos + aoLightValueYPosZNeg) / 4F;
		} else
		{
			f8 = f14 = f20 = f26 = aoLightValueYPos;
		}
		colorRedTopLeft_TopFace = colorRedBottomLeft_TopFace = colorRedBottomRight_TopFace = colorRedTopRight_TopFace = flag2 ? f : 1.0F;
		colorGreenTopLeft_TopFace = colorGreenBottomLeft_TopFace = colorGreenBottomRight_TopFace = colorGreenTopRight_TopFace = flag2 ? f1 : 1.0F;
		colorBlueTopLeft_TopFace = colorBlueBottomLeft_TopFace = colorBlueBottomRight_TopFace = colorBlueTopRight_TopFace = flag2 ? f2 : 1.0F;
		colorRedTopLeft_TopFace *= f8;
		colorGreenTopLeft_TopFace *= f8;
		colorBlueTopLeft_TopFace *= f8;
		colorRedBottomLeft_TopFace *= f14;
		colorGreenBottomLeft_TopFace *= f14;
		colorBlueBottomLeft_TopFace *= f14;
		colorRedBottomRight_TopFace *= f20;
		colorGreenBottomRight_TopFace *= f20;
		colorBlueBottomRight_TopFace *= f20;
		colorRedTopRight_TopFace *= f26;
		colorGreenTopRight_TopFace *= f26;
		colorBlueTopRight_TopFace *= f26;
		
		///////////////////////////////////	
		float f9;
		float f15;
		float f21;
		float f27;
		if(field_22352_G > 0)
		{				
			f9 = (aoLightValueXNegZNeg + aoLightValueXNegYPosZNeg + aoLightValueZNeg + aoLightValueYPosZNeg) / 4F;
			f15 = (aoLightValueZNeg + aoLightValueYPosZNeg + aoLightValueXPosZNeg + aoLightValueXPosYPosZNeg) / 4F;
			f21 = (aoLightValueYNegZNeg + aoLightValueZNeg + aoLightValueXPosYNegZNeg + aoLightValueXPosZNeg) / 4F;
			f27 = (aoLightValueXNegYNegZNeg + aoLightValueXNegZNeg + aoLightValueYNegZNeg + aoLightValueZNeg) / 4F;
		} else
		{
			f9 = f15 = f21 = f27 = aoLightValueZNeg;
		}
		colorRedTopLeft_EastFace = colorRedBottomLeft_EastFace = colorRedBottomRight_EastFace = colorRedTopRight_EastFace = (flag3 ? f : 1.0F) * 0.8F;
		colorGreenTopLeft_EastFace = colorGreenBottomLeft_EastFace = colorGreenBottomRight_EastFace = colorGreenTopRight_EastFace = (flag3 ? f1 : 1.0F) * 0.8F;
		colorBlueTopLeft_EastFace = colorBlueBottomLeft_EastFace = colorBlueBottomRight_EastFace = colorBlueTopRight_EastFace = (flag3 ? f2 : 1.0F) * 0.8F;
		colorRedTopLeft_EastFace *= f9;
		colorGreenTopLeft_EastFace *= f9;
		colorBlueTopLeft_EastFace *= f9;
		colorRedBottomLeft_EastFace *= f15;
		colorGreenBottomLeft_EastFace *= f15;
		colorBlueBottomLeft_EastFace *= f15;
		colorRedBottomRight_EastFace *= f21;
		colorGreenBottomRight_EastFace *= f21;
		colorBlueBottomRight_EastFace *= f21;
		colorRedTopRight_EastFace *= f27;
		colorGreenTopRight_EastFace *= f27;
		colorBlueTopRight_EastFace *= f27;
		int l = block.getBlockTexture(iblockaccess, i, j, k, 2);
		
		///////////////////////////////////
		float f10;
		float f16;
		float f22;
		float f28;
		if(field_22352_G > 0)
		{				
			f10 = (aoLightValueXNegZPos + aoLightValueXNegYPosZPos + aoLightValueZPos + aoLightValueYPosZPos) / 4F;
			f28 = (aoLightValueZPos + aoLightValueYPosZPos + aoLightValueXPosZPos + aoLightValueXPosYPosZPos) / 4F;
			f22 = (aoLightValueYNegZPos + aoLightValueZPos + aoLightValueXPosYNegZPos + aoLightValueXPosZPos) / 4F;
			f16 = (aoLightValueXNegYNegZPos + aoLightValueXNegZPos + aoLightValueYNegZPos + aoLightValueZPos) / 4F;
		} else
		{
			f10 = f16 = f22 = f28 = aoLightValueZPos;
		}
		colorRedTopLeft_WestFace = colorRedBottomLeft_WestFace = colorRedBottomRight_WestFace = colorRedTopRight_WestFace = (flag4 ? f : 1.0F) * 0.8F;
		colorGreenTopLeft_WestFace = colorGreenBottomLeft_WestFace = colorGreenBottomRight_WestFace = colorGreenTopRight_WestFace = (flag4 ? f1 : 1.0F) * 0.8F;
		colorBlueTopLeft_WestFace = colorBlueBottomLeft_WestFace = colorBlueBottomRight_WestFace = colorBlueTopRight_WestFace = (flag4 ? f2 : 1.0F) * 0.8F;
		colorRedTopLeft_WestFace *= f10;
		colorGreenTopLeft_WestFace *= f10;
		colorBlueTopLeft_WestFace *= f10;
		colorRedBottomLeft_WestFace *= f16;
		colorGreenBottomLeft_WestFace *= f16;
		colorBlueBottomLeft_WestFace *= f16;
		colorRedBottomRight_WestFace *= f22;
		colorGreenBottomRight_WestFace *= f22;
		colorBlueBottomRight_WestFace *= f22;
		colorRedTopRight_WestFace *= f28;
		colorGreenTopRight_WestFace *= f28;
		colorBlueTopRight_WestFace *= f28;
		int i1 = block.getBlockTexture(iblockaccess, i, j, k, 3);
		
		///////////////////////////////////
		float f11;
		float f17;
		float f23;
		float f29;
		if(field_22352_G > 0)
		{				
			f29 = (aoLightValueXNegYNeg + aoLightValueXNegYNegZPos + aoLightValueXNeg + aoLightValueXNegZPos) / 4F;
			f11 = (aoLightValueXNeg + aoLightValueXNegZPos + aoLightValueXNegYPos + aoLightValueXNegYPosZPos) / 4F;
			f17 = (aoLightValueXNegZNeg + aoLightValueXNeg + aoLightValueXNegYPosZNeg + aoLightValueXNegYPos) / 4F;
			f23 = (aoLightValueXNegYNegZNeg + aoLightValueXNegYNeg + aoLightValueXNegZNeg + aoLightValueXNeg) / 4F;
		} else
		{
			f11 = f17 = f23 = f29 = aoLightValueXNeg;
		}
		colorRedTopLeft_NorthFace = colorRedBottomLeft_NorthFace = colorRedBottomRight_NorthFace = colorRedTopRight_NorthFace = (flag5 ? f : 1.0F) * 0.6F;
		colorGreenTopLeft_NorthFace = colorGreenBottomLeft_NorthFace = colorGreenBottomRight_NorthFace = colorGreenTopRight_NorthFace = (flag5 ? f1 : 1.0F) * 0.6F;
		colorBlueTopLeft_NorthFace = colorBlueBottomLeft_NorthFace = colorBlueBottomRight_NorthFace = colorBlueTopRight_NorthFace = (flag5 ? f2 : 1.0F) * 0.6F;
		colorRedTopLeft_NorthFace *= f11;
		colorGreenTopLeft_NorthFace *= f11;
		colorBlueTopLeft_NorthFace *= f11;
		colorRedBottomLeft_NorthFace *= f17;
		colorGreenBottomLeft_NorthFace *= f17;
		colorBlueBottomLeft_NorthFace *= f17;
		colorRedBottomRight_NorthFace *= f23;
		colorGreenBottomRight_NorthFace *= f23;
		colorBlueBottomRight_NorthFace *= f23;
		colorRedTopRight_NorthFace *= f29;
		colorGreenTopRight_NorthFace *= f29;
		colorBlueTopRight_NorthFace *= f29;
		int j1 = block.getBlockTexture(iblockaccess, i, j, k, 4);
		
		///////////////////////////////////	
		float f12;
		float f18;
		float f24;
		float f30;
		if(field_22352_G > 0)
		{						
			f12 = (aoLightValueXPosYNeg + aoLightValueXPosYNegZPos + aoLightValueXPos + aoLightValueXPosZPos) / 4F;
			f30 = (aoLightValueXPos + aoLightValueXPosZPos + aoLightValueXPosYPos + aoLightValueXPosYPosZPos) / 4F;
			f24 = (aoLightValueXPosZNeg + aoLightValueXPos + aoLightValueXPosYPosZNeg + aoLightValueXPosYPos) / 4F;
			f18 = (aoLightValueXPosYNegZNeg + aoLightValueXPosYNeg + aoLightValueXPosZNeg + aoLightValueXPos) / 4F;
		} else
		{
			f12 = f18 = f24 = f30 = aoLightValueXPos;
		}
		colorRedTopLeft_SouthFace = colorRedBottomLeft_SouthFace = colorRedBottomRight_SouthFace = colorRedTopRight_SouthFace = (flag6 ? f : 1.0F) * 0.6F;
		colorGreenTopLeft_SouthFace = colorGreenBottomLeft_SouthFace = colorGreenBottomRight_SouthFace = colorGreenTopRight_SouthFace = (flag6 ? f1 : 1.0F) * 0.6F;
		colorBlueTopLeft_SouthFace = colorBlueBottomLeft_SouthFace = colorBlueBottomRight_SouthFace = colorBlueTopRight_SouthFace = (flag6 ? f2 : 1.0F) * 0.6F;
		colorRedTopLeft_SouthFace *= f12;
		colorGreenTopLeft_SouthFace *= f12;
		colorBlueTopLeft_SouthFace *= f12;
		colorRedBottomLeft_SouthFace *= f18;
		colorGreenBottomLeft_SouthFace *= f18;
		colorBlueBottomLeft_SouthFace *= f18;
		colorRedBottomRight_SouthFace *= f24;
		colorGreenBottomRight_SouthFace *= f24;
		colorBlueBottomRight_SouthFace *= f24;
		colorRedTopRight_SouthFace *= f30;
		colorGreenTopRight_SouthFace *= f30;
		colorBlueTopRight_SouthFace *= f30;
		int k1 = block.getBlockTexture(iblockaccess, i, j, k, 5);
		
		/////////////////////////////////////////SUPERSLOPES//////////////////////////////		
		
		colorRedSlopes = f;
		colorGreenSlopes = f1;
		colorBlueSlopes = f2;		
        
		/////////////////////////////////////////
		
		if(renderblocks.isRenderAllFaces() || block.shouldSideBeRendered(iblockaccess, i, j - 1, k, 0))
        {
			renderCornersBottomFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0),iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));		
            flag = true;
		}
		if(renderblocks.isRenderAllFaces() || block.shouldSideBeRendered(iblockaccess, i, j + 1, k, 1))
        {
			renderCornersTopFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0),iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            flag = true;
		}
		if(renderblocks.isRenderAllFaces() || block.shouldSideBeRendered(iblockaccess, i, j, k - 1, 2))
        {
			renderCornersEastFace(block, i, j, k, l, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			if(field_27511_cfgGrassFix && l == 3)
            {
                colorRedTopLeft_EastFace *= f;
                colorRedBottomLeft_EastFace *= f;
                colorRedBottomRight_EastFace *= f;
                colorRedTopRight_EastFace *= f;
                colorGreenTopLeft_EastFace *= f1;
                colorGreenBottomLeft_EastFace *= f1;
                colorGreenBottomRight_EastFace *= f1;
                colorGreenTopRight_EastFace *= f1;
                colorBlueTopLeft_EastFace *= f2;
                colorBlueBottomLeft_EastFace *= f2;
                colorBlueBottomRight_EastFace *= f2;
                colorBlueTopRight_EastFace *= f2;
                renderCornersEastFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }    
			flag = true;
		}		
		if(renderblocks.isRenderAllFaces() || block.shouldSideBeRendered(iblockaccess, i, j, k + 1, 3))
        {
			renderCornersWestFace(block, i, j, k, i1, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            if(field_27511_cfgGrassFix && i1 == 3)
            {
                colorRedTopLeft_WestFace *= f;
                colorRedBottomLeft_WestFace *= f;
                colorRedBottomRight_WestFace *= f;
                colorRedTopRight_WestFace *= f;
                colorGreenTopLeft_WestFace *= f1;
                colorGreenBottomLeft_WestFace *= f1;
                colorGreenBottomRight_WestFace *= f1;
                colorGreenTopRight_WestFace *= f1;
                colorBlueTopLeft_WestFace *= f2;
                colorBlueBottomLeft_WestFace *= f2;
                colorBlueBottomRight_WestFace *= f2;
                colorBlueTopRight_WestFace *= f2;
                renderCornersWestFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }
            flag = true;
        }
		if(renderblocks.isRenderAllFaces() || block.shouldSideBeRendered(iblockaccess, i - 1, j, k, 4))
        {
			renderCornersNorthFace(block, i, j, k, j1, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			if(field_27511_cfgGrassFix && j1 == 3)
            {
                colorRedTopLeft_NorthFace *= f;
                colorRedBottomLeft_NorthFace *= f;
                colorRedBottomRight_NorthFace *= f;
                colorRedTopRight_NorthFace *= f;
                colorGreenTopLeft_NorthFace *= f1;
                colorGreenBottomLeft_NorthFace *= f1;
                colorGreenBottomRight_NorthFace *= f1;
                colorGreenTopRight_NorthFace *= f1;
                colorBlueTopLeft_NorthFace *= f2;
                colorBlueBottomLeft_NorthFace *= f2;
                colorBlueBottomRight_NorthFace *= f2;
                colorBlueTopRight_NorthFace *= f2;
                renderCornersNorthFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }
            flag = true;
        }
		if(renderblocks.isRenderAllFaces() || block.shouldSideBeRendered(iblockaccess, i + 1, j, k, 5))
        {
			renderCornersSouthFace(block, i, j, k, k1, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            if(field_27511_cfgGrassFix && k1 == 3)
            {
                colorRedTopLeft_SouthFace *= f;
                colorRedBottomLeft_SouthFace *= f;
                colorRedBottomRight_SouthFace *= f;
                colorRedTopRight_SouthFace *= f;
                colorGreenTopLeft_SouthFace *= f1;
                colorGreenBottomLeft_SouthFace *= f1;
                colorGreenBottomRight_SouthFace *= f1;
                colorGreenTopRight_SouthFace *= f1;
                colorBlueTopLeft_SouthFace *= f2;
                colorBlueBottomLeft_SouthFace *= f2;
                colorBlueBottomRight_SouthFace *= f2;
                colorBlueTopRight_SouthFace *= f2;
                renderCornersSouthFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }
            flag = true;
        }	
		
        enableAO = false;
        return flag;
    }
	
    public boolean renderCornersBlockWithColorMultiplier(Block block, int i, int j, int k, float f, float f1, float f2, int iDir, RenderBlocks renderblocks, IBlockAccess iblockaccess)
    {
        Tessellator tessellator = Tessellator.instance;
        boolean flag = false;
        float f3 = 0.5F;
        float f4 = 1F;
        float f5 = 0.8F;
        float f6 = 0.6F;
        float f7 = f4 * f;
        float f8 = f4 * f1;
        float f9 = f4 * f2;
        if(block == Block.grass)
        {
            f = f1 = f2 = 1.0F;
        }
        float f10 = f3 * f;
        float f11 = f5 * f;
        float f12 = f6 * f;
        float f13 = f3 * f1;
        float f14 = f5 * f1;
        float f15 = f6 * f1;
        float f16 = f3 * f2;
        float f17 = f5 * f2;
        float f18 = f6 * f2;
        float f19 = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k);
		
		if(renderblocks.isRenderAllFaces() || block.shouldSideBeRendered(iblockaccess, i, j - 1, k, 0))
        {
			if(iDir/4 != 1 && iDir/4 != 3){
				float f20 = block.getAmbientOcclusionLightValue(iblockaccess, i, j - 1, k);
				tessellator.setColorOpaque_F(f10 * f20, f13 * f20, f16 * f20);
				renderCornersBottomFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
				flag = true;
			}
        }  

		if(renderblocks.isRenderAllFaces() || block.shouldSideBeRendered(iblockaccess, i, j + 1, k, 1))
        {
			if(iDir/4 != 0 && iDir/4 != 2){
				float f21 = block.getAmbientOcclusionLightValue(iblockaccess, i, j + 1, k);
				if(block.maxY != 1.0D && !block.blockMaterial.isLiquid())
				{
					f21 = f19;
				}
				tessellator.setColorOpaque_F(f7 * f21, f8 * f21, f9 * f21);
				renderCornersTopFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 1), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
				flag = true;
			}
        }   
		
        if(renderblocks.isRenderAllFaces() || block.shouldSideBeRendered(iblockaccess, i, j, k - 1, 2) || iDir%2 == 0)
        {
			float f22 = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k - 1);			
			if(iDir%2 == 0){ 
                f22 = f19; 
			}			
			tessellator.setColorOpaque_F(f11 * f22, f14 * f22, f17 * f22);		
			renderCornersEastFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 2), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));		
            
            flag = true;
        }
        if(renderblocks.isRenderAllFaces() || block.shouldSideBeRendered(iblockaccess, i, j, k + 1, 3) || iDir%2 == 1)
        {			
            float f23 = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k + 1);
            if(iDir%2 == 1)
            {
                f23 = f19;
            }			
            tessellator.setColorOpaque_F(f11 * f23, f14 * f23, f17 * f23);
            renderCornersWestFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 3), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            flag = true;
        }
        if(renderblocks.isRenderAllFaces() || block.shouldSideBeRendered(iblockaccess, i - 1, j, k, 4) || iDir == 0 || iDir == 3 || iDir == 4 || iDir == 7 || iDir == 11 || iDir == 15)
        {
            float f24 = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j, k);
            if(iDir == 0 || iDir == 3 || iDir == 4 || iDir == 7 || iDir == 11 || iDir == 15)
            {
                f24 = f19;
            }
            tessellator.setColorOpaque_F(f12 * f24, f15 * f24, f18 * f24);
            renderCornersNorthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 4), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            flag = true;
        }
        if(renderblocks.isRenderAllFaces() || block.shouldSideBeRendered(iblockaccess, i + 1, j, k, 5) || iDir == 1 || iDir == 2 || iDir == 5 || iDir == 6 || iDir == 10 || iDir == 14)
        {
            float f25 = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j, k);
            if(iDir == 1 || iDir == 2 || iDir == 5 || iDir == 6 || iDir == 10 || iDir == 14)
            {
                f25 = f19;
            }
            tessellator.setColorOpaque_F(f12 * f25, f15 * f25, f18 * f25);
            renderCornersSouthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 5), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            flag = true;
        }
        return flag;
    } 
	
	public void renderCornersBottomFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(lBrightness);
        if(renderblocks.getOverrideBlockTexture() >= 0)
        {
            i = renderblocks.getOverrideBlockTexture();
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.minX * 16D) / 256D;
        double d4 = (((double)j + block.maxX * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.minZ * 16D) / 256D;
        double d6 = (((double)k + block.maxZ * 16D) - 0.01D) / 256D;
        if(block.minX < 0.0D || block.maxX > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.minZ < 0.0D || block.maxZ > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d7 = d + block.minX;
        double d8 = d + block.maxX;
        double d9 = d1 + block.minY;
        double d10 = d2 + block.minZ;
        double d11 = d2 + block.maxZ;       
		
		if(enableAO)
        {
			if(iDir/4 == 0){
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
			}
			
		} else
		{
			if(iDir/4 == 0){
			// Standard
			tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
            tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
            tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
            tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
			}
		}
    }

	public void renderCornersTopFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(lBrightness);
        if(renderblocks.getOverrideBlockTexture() >= 0)
        {
            i = renderblocks.getOverrideBlockTexture();
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.minX * 16D) / 256D;
        double d4 = (((double)j + block.maxX * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.minZ * 16D) / 256D;
        double d6 = (((double)k + block.maxZ * 16D) - 0.01D) / 256D;
        if(block.minX < 0.0D || block.maxX > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.minZ < 0.0D || block.maxZ > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d7 = d + block.minX;
        double d8 = d + block.maxX;
        double d9 = d1 + block.maxY;
        double d10 = d2 + block.minZ;
        double d11 = d2 + block.maxZ;
        
		if(enableAO)
        {
			if(iDir/4 == 1){
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
			} 
			
		} else
		{
			if(iDir/4 == 1){
				// Standard
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
			} 
		}
    }
	
	public void renderCornersEastFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(lBrightness);
        if(renderblocks.getOverrideBlockTexture() >= 0)
        {
            i = renderblocks.getOverrideBlockTexture();
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.minX * 16D) / 256D;
        double d4 = (((double)j + block.maxX * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.minY * 16D) / 256D;
        double d6 = (((double)k + block.maxY * 16D) - 0.01D) / 256D;
        if(renderblocks.isFlipTexture())
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(block.minX < 0.0D || block.maxX > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.minY < 0.0D || block.maxY > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d8 = d + block.minX;
        double d9 = d + block.maxX;
        double d91 = d + block.maxX/2;
        double d10 = d1 + block.minY;
        double d11 = d1 + block.maxY;//высота блока
        double d12 = d2 + block.minZ;
		double d13 = d2 + block.maxZ/2;
		
		if(enableAO)
        {		
			if(iDir == 0){
				// Slope facing Up - East
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d91, d11, d13, d3, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d91, d11, d13, d3, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			}
		} else
		{
			if(iDir == 1 || iDir == 9){
				// Pointing 1, X = 0, Z = 0
				tessellator.addVertexWithUV(d91, d11, d13, d4, d5);
				tessellator.addVertexWithUV(d91, d11, d13, d4, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			}
		}
    }

    public void renderCornersWestFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(lBrightness);
        if(renderblocks.getOverrideBlockTexture() >= 0)
        {
            i = renderblocks.getOverrideBlockTexture();
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.minX * 16D) / 256D;
        double d4 = (((double)j + block.maxX * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.minY * 16D) / 256D;
        double d6 = (((double)k + block.maxY * 16D) - 0.01D) / 256D;
        if(renderblocks.isFlipTexture())
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(block.minX < 0.0D || block.maxX > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.minY < 0.0D || block.maxY > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d8 = d + block.minX;
        double d9 = d + block.maxX;
        double d91 = d + block.maxX/2;
        double d10 = d1 + block.minY;
        double d11 = d1 + block.maxY;//высота блока
        double d12 = d2 + block.maxZ;
        double d121 = d2 + block.maxZ/2;
		double d13 = d2 + block.minZ;
		
		if(enableAO)
        {
			if(iDir == 0 || iDir == 8){
				// Triangle Down pointing north
				tessellator.setColorOpaque_F(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
				tessellator.addVertexWithUV(d91, d11, d121, d4, d5);	
			} 
			
		} else
		{
			
			if(iDir == 1){
				// Pointing 1, X = 0, Z = 0, Sloped
				tessellator.addVertexWithUV(d91, d11, d121, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d91, d11, d121, d3, d5);			
			
			}
		}
    }

    public void renderCornersNorthFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(lBrightness);
        if(renderblocks.getOverrideBlockTexture() >= 0)
        {
            i = renderblocks.getOverrideBlockTexture();
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.minZ * 16D) / 256D;
        double d4 = (((double)j + block.maxZ * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.minY * 16D) / 256D;
        double d6 = (((double)k + block.maxY * 16D) - 0.01D) / 256D;
        if(renderblocks.isFlipTexture())
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(block.minZ < 0.0D || block.maxZ > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.minY < 0.0D || block.maxY > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d8 = d + block.minX;
        double d9 = d1 + block.minY;
        double d10 = d1 + block.maxY;//высота блока
        double d11 = d2 + block.minZ;
        double d12 = d2 + block.maxZ;
        double d121 = d2 + block.maxZ/2;	
		double d13 = d + block.maxX/2;
		
		if(enableAO)
        {
			if(iDir == 0){
				// Slope facing Up - North
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d10, d121, d4, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d10, d121, d4, d5);		
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);		
			}
			
		} else
		{
			if(iDir == 1 || iDir == 9){
				// Pointing 1, X = 0, Z = 0
				tessellator.addVertexWithUV(d13, d10, d121, d3, d5);
				tessellator.addVertexWithUV(d13, d10, d121, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);		
			}			
		}
    }

    public void renderCornersSouthFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(lBrightness);
        if(renderblocks.getOverrideBlockTexture() >= 0)
        {
            i = renderblocks.getOverrideBlockTexture();
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.minZ * 16D) / 256D;
        double d4 = (((double)j + block.maxZ * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.minY * 16D) / 256D;
        double d6 = (((double)k + block.maxY * 16D) - 0.01D) / 256D;
        if(renderblocks.isFlipTexture())
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(block.minZ < 0.0D || block.maxZ > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.minY < 0.0D || block.maxY > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d8 = d + block.maxX;
        double d81 = d + block.maxX/2;
        double d9 = d1 + block.minY;
        double d10 = d1 + block.maxY;//высота блока
        double d11 = d2 + block.minZ;
        double d12 = d2 + block.maxZ;
        double d121 = d2 + block.maxZ/2;
		double d13 = d + block.minX;		
		
		if(enableAO)
        {
			if(iDir == 0 || iDir == 8){
				// Triangle Down pointing east
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d81, d10, d121, d3, d5);			
			}
			
		} else
		{
			if(iDir == 1){
				// Pointing 1, X = 0, Z = 0, Sloped
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d81, d10, d121, d4, d5);
				tessellator.addVertexWithUV(d81, d10, d121, d4, d5);		
			} 
		}
    }


	public void load(){};
	public String getVersion(){return "1.3.2";}
}