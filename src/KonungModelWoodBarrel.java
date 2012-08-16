package net.minecraft.src;

public class KonungModelWoodBarrel extends ModelBase
{
  //fields
    ModelRenderer center;
    ModelRenderer side1;
    ModelRenderer side2;
    ModelRenderer side3;
    ModelRenderer side4;
  
  public KonungModelWoodBarrel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      center = new ModelRenderer(this, 24, 0);
      center.addBox(-5F, 0F, -5F, 10, 14, 10);
      center.setRotationPoint(0F, 9F, 0F);
      center.setTextureSize(64, 32);
      center.mirror = true;
      setRotation(center, 0F, 0F, 0F);
      side1 = new ModelRenderer(this, 0, 0);
      side1.addBox(0F, 0F, 0F, 1, 16, 11);
      side1.setRotationPoint(-6F, 8F, -5F);
      side1.setTextureSize(64, 32);
      side1.mirror = true;
      setRotation(side1, 0F, 1.570796F, 0F);
      side2 = new ModelRenderer(this, 0, 0);
      side2.addBox(0F, 0F, 0F, 1, 16, 11);
      side2.setRotationPoint(5F, 8F, -6F);
      side2.setTextureSize(64, 32);
      side2.mirror = true;
      setRotation(side2, 0F, 0F, 0F);
      side3 = new ModelRenderer(this, 0, 0);
      side3.addBox(0F, 0F, 0F, 1, 16, 11);
      side3.setRotationPoint(6F, 8F, 5F);
      side3.setTextureSize(64, 32);
      side3.mirror = true;
      setRotation(side3, 0F, -1.570796F, 0F);
      side4 = new ModelRenderer(this, 0, 0);
      side4.addBox(0F, 0F, 0F, 1, 16, 11);
      side4.setRotationPoint(-5F, 8F, 6F);
      side4.setTextureSize(64, 32);
      side4.mirror = true;
      setRotation(side4, 0F, 3.141593F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    center.render(f5);
    side1.render(f5);
    side2.render(f5);
    side3.render(f5);
    side4.render(f5);
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
	center.render(f);
	side1.render(f);
	side2.render(f);
	side3.render(f);
	side4.render(f);
  }
  
}