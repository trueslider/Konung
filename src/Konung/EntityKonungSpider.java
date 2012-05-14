package net.minecraft.src.Konung;
import net.minecraft.src.*;

import java.util.Random;

public class EntityKonungSpider extends EntitySpider
{
    public EntityKonungSpider(World par1World)
    {
        super(par1World);
        texture = "/textures/konung/mobs/poisonspider.png";
        setSize(1.4F, 0.9F);
        moveSpeed = 0.8F;
    }
    
    public int getMaxHealth()
    {
    	return 12;
    }
    
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }
    
    protected int getDropItemId()
    {
        return mod_konungMobs.KonungPoisonSting.shiftedIndex;
    }
    
    protected void dropFewItems(boolean par1, int par2)
    {
    }
    
    protected String getLivingSound()
    {
        return "mob.spider";
    }

    protected String getHurtSound()
    {
        return "mob.spider";
    }

    protected String getDeathSound()
    {
        return "mob.spiderdeath";
    }
    public float spiderScaleAmount()
    {
        return 0.75F;
    }
    
    protected boolean isValidLightLevel()
    {
    	return true;
    }
    
    public boolean getCanSpawnHere()
    {
        return isValidLightLevel();
    }
    
    protected Entity findPlayerToAttack()
    {
        return worldObj.getClosestVulnerablePlayerToEntity(this, 16D);
    }
    
    protected void attackEntity(Entity par1Entity, float par2)
    {
    	((EntityLiving)par1Entity).addPotionEffect(new PotionEffect(Potion.poison.id, 5 * 20, 0));
    	
    }
    
    
}
