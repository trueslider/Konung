package net.minecraft.src;

import java.util.Map;
import java.util.Random;

public class mod_konungMobs extends BaseMod
{
	
	public static final Item KonungPoisonSting = new KonungItemPoisonSting(4500).setItemName("Poison Sting");
	
	public mod_konungMobs()
	{
		//Posion Sting
		KonungPoisonSting.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/poisonsting.png");
		ModLoader.addName(KonungPoisonSting, "en_EN", "Poison Sting");
		
		
		//Poison Spider
		ModLoader.registerEntityID(KonungEntitySpider.class, "Poison Spider", (byte)ModLoader.getUniqueEntityId());
		ModLoader.addSpawn(KonungEntitySpider.class, 100, 10, 16, EnumCreatureType.monster);
	}
	
	public void addRenderer(Map map)
	{
		map.put(KonungEntitySpider.class, new RenderSpider());
	}
	
	
	
	
	
	
	public void load(){};
	public String getVersion(){return "1.4.7";}
	
}
