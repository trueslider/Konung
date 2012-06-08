//Комментарий
package net.minecraft.src;

public class ModelKonungWindow extends ModelBase
{
  //fields
    ModelRenderer plank1;
    ModelRenderer plank2;
    ModelRenderer plank3;
    ModelRenderer plank4;
    ModelRenderer glass;
  
  public ModelKonungWindow()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      plank1 = new ModelRenderer(this, 2, 0);
      plank1.addBox(0F, 0F, 0F, 14, 1, 16);
      plank1.setRotationPoint(8F, 9F, -8F);
      plank1.setTextureSize(64, 32);
      plank1.mirror = true;
      setRotation(plank1, 0F, 0F, 1.570796F);
      plank2 = new ModelRenderer(this, 0, 0);
      plank2.addBox(0F, 0F, 0F, 16, 1, 16);
      plank2.setRotationPoint(-8F, 23F, -8F);
      plank2.setTextureSize(64, 32);
      plank2.mirror = true;
      setRotation(plank2, 0F, 0F, 0F);
      plank3 = new ModelRenderer(this, 0, 0);
      plank3.addBox(0F, 0F, 0F, 16, 1, 16);
      plank3.setRotationPoint(-8F, 8F, -8F);
      plank3.setTextureSize(64, 32);
      plank3.mirror = true;
      setRotation(plank3, 0F, 0F, 0F);
      plank4 = new ModelRenderer(this, 2, 0);
      plank4.addBox(0F, 0F, 0F, 14, 1, 16);
      plank4.setRotationPoint(-7F, 9F, -8F);
      plank4.setTextureSize(64, 32);
      plank4.mirror = true;
      setRotation(plank4, 0F, 0F, 1.570796F);
      glass = new ModelRenderer(this, 0, 17);
      glass.addBox(0F, 0F, -0.5F, 14, 14, 1);
      glass.setRotationPoint(-7F, 9F, 0F);
      glass.setTextureSize(64, 32);
      glass.mirror = true;
      setRotation(glass, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    plank1.render(f5);
    plank2.render(f5);
    plank3.render(f5);
    plank4.render(f5);
    glass.render(f5);
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
	plank1.render(f);
	plank2.render(f);
	plank3.render(f);
	plank4.render(f);
	glass.render(f);
  }
  
}