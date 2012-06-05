package net.minecraft.src;

import java.util.Map;
import java.util.Random;

public class mod_konungMobs extends BaseMod
{
	
	public static final Item KonungPoisonSting = new ItemKonungPoisonSting (4500).setItemName("Poison Sting!");
	
	public mod_konungMobs()
	{
		//Posion Sting
		KonungPoisonSting.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/poisonsting.png");
		ModLoader.addName(KonungPoisonSting, "Poison Sting");
		
		
		//Poison Spider
		ModLoader.registerEntityID(EntityKonungSpider.class, "Poison Spider", ModLoader.getUniqueEntityId());
		ModLoader.addSpawn(EntityKonungSpider.class, 100, 10, 16, EnumCreatureType.monster);
	}
	
	public void addRenderer(Map map)
	{
		map.put(EntityKonungSpider.class, new RenderSpider());
	}
	
	
	
	
	
	
	public void load(){};
	public String getVersion(){return "1.2.5";}
	
}
