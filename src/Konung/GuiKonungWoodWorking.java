package net.minecraft.src.Konung;

import java.util.Random;
import net.minecraft.src.*;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
       

public class GuiKonungWoodWorking extends GuiContainer
{
	private TileEntityKonungWoodWorking woodWorkInventory;
	
    public GuiKonungWoodWorking(InventoryPlayer inventoryplayer, TileEntityKonungWoodWorking tileentitywoodworking)
    {
        super(new ContainerKonungWoodWorking(inventoryplayer, tileentitywoodworking));
        woodWorkInventory = tileentitywoodworking;
    }

    protected void drawGuiContainerForegroundLayer()
    {
        fontRenderer.drawString("Work", 60, 6, 0x404040);
        fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
    }

   /* protected void drawGuiContainerBackgroundLayer(float f)
    {
    	int i = mc.renderEngine.getTexture("/textures/konung/guiwoodworking.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(i);
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
        
        if(woodWorkInventory.isWorking())
        {
            int l = woodWorkInventory.getWorkTimeRemainingScaled(12);
            drawTexturedModalRect(j + 56, (k + 36 + 12) - l, 176, 12 - l, 14, l + 2);
        }
        int i1 = woodWorkInventory.getWorkProgressScaled(24);
        drawTexturedModalRect(j + 79, k + 34, 176, 14, i1 + 1, 16);
    }*/
    
    protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        int k = mc.renderEngine.getTexture("/textures/konung/guiwoodworking.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(k);
        int l = (width - xSize) / 2;
        int i1 = (height - ySize) / 2;
        drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
        if(woodWorkInventory.isWorking())
        {
            int j1 = woodWorkInventory.getWorkTimeRemainingScaled(12);
            drawTexturedModalRect(l + 56, (i1 + 36 + 12) - j1, 176, 12 - j1, 14, j1 + 2);
        }
        int k1 = woodWorkInventory.getWorkProgressScaled(24);
        drawTexturedModalRect(l + 79, i1 + 34, 176, 14, k1 + 1, 16);
    }

	
}