//Комментарий
package net.minecraft.src;

public class ModelKonungWoodIdol extends ModelBase
{
	  //fields
	    ModelRenderer log;
	  
	  public ModelKonungWoodIdol()
	  {
	    textureWidth = 64;
	    textureHeight = 64;
	    
	      log = new ModelRenderer(this, 0, 0);
	      log.addBox(-7F, 0F, -7F, 14, 48, 14);
	      log.setRotationPoint(0F, -24F, 0F);
	      log.setTextureSize(64, 64);
	      log.mirror = true;
	      setRotation(log, 0F, 3.141593F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5);
	    log.render(f5);
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

	log.render(f);


  }
  
}