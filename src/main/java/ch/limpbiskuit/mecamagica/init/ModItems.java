package ch.limpbiskuit.mecamagica.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    
    public static final RegistryObject<Item> copper_ingot = Registration.ITEMS.register("copper_ingot", () -> new Item(new Item.Properties()));

}
