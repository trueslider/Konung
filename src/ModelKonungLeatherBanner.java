package net.minecraft.src;

public class ModelKonungLeatherBanner extends ModelBase
{
  //fields
    ModelRenderer stick1;
    ModelRenderer stick2;
    ModelRenderer stick3;
    ModelRenderer stick4;
    ModelRenderer skin;
  
    public ModelKonungLeatherBanner()
    {
      textureWidth = 32;
      textureHeight = 32;
      
        stick1 = new ModelRenderer(this, 0, 0);
        stick1.addBox(0F, -20F, -1F, 1, 20, 1);
        stick1.setRotationPoint(7F, 24F, 6F);
        stick1.setTextureSize(32, 32);
        stick1.mirror = true;
        setRotation(stick1, -0.6981317F, -3.141593F, 0F);
        stick2 = new ModelRenderer(this, 0, 0);
        stick2.addBox(0F, -20F, -1F, 1, 20, 1);
        stick2.setRotationPoint(-6F, 24F, 6F);
        stick2.setTextureSize(32, 32);
        stick2.mirror = true;
        setRotation(stick2, -0.6981317F, -3.141593F, 0F);
        stick3 = new ModelRenderer(this, 5, 0);
        stick3.addBox(0F, 0F, 0F, 12, 1, 1);
        stick3.setRotationPoint(-6F, 8F, -6F);
        stick3.setTextureSize(32, 32);
        stick3.mirror = true;
        setRotation(stick3, -0.6981317F, 0F, 0F);
        stick4 = new ModelRenderer(this, 0, 0);
        stick4.addBox(-0.5F, 0F, 0F, 1, 15, 1);
        stick4.setRotationPoint(0F, 9F, -7F);
        stick4.setTextureSize(32, 32);
        stick4.mirror = true;
        setRotation(stick4, 0F, 0F, 0F);
        skin = new ModelRenderer(this, 5, 3);
        skin.addBox(0F, -19F, 0F, 12, 19, 0);
        skin.setRotationPoint(6F, 23.5F, 6.5F);
        skin.setTextureSize(32, 32);
        skin.mirror = true;
        setRotation(skin, -0.6981317F, 3.141593F, 0F);
    }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    stick1.render(f5);
    stick2.render(f5);
    stick3.render(f5);
    stick4.render(f5);
    skin.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

 public void renderModel(float f)
  {
	stick1.render(f);
	stick2.render(f);
	stick3.render(f);
	stick4.render(f);
	skin.render(f);
  }
  
}