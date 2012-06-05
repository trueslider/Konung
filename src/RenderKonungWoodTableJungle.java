package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class RenderKonungWoodTableJungle extends TileEntitySpecialRenderer {
	private ModelKonungWoodTable model;

	public RenderKonungWoodTableJungle() {
		model = new ModelKonungWoodTable();
	}

	public void renderAModelAt(TileEntityKonungWoodTableJungle tile, double d, double d1, double d2, float f)
	{
		int i = tile.getBlockMetadata(); //this is for rotation
		int j = 0;
		if (i == 0)
		{
			j = 0;//������� �� 0 �������� ���� ��������� �������
		}
		if (i == 1)
		{
			j = 90;//������� �� 90 �������� ���� ��������� �����
		}
		if (i == 2)
		{
			j = 0;//������� �� 180 �������� ���� ��������� �����
		}
		if (i == 3)
		{
			j = 90;//������� �� 270 �������� ���� ��������� ������
		}
		bindTextureByName("/textures/konung/woodtablejungle.png");
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		GL11.glRotatef(j, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		model.renderModel(0.0625F);
		GL11.glPopMatrix();
	}
	
	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		renderAModelAt((TileEntityKonungWoodTableJungle) tileentity, d, d1, d2, f);
	}
}
