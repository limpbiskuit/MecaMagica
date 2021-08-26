package ch.limpbiskuit.mecamagica;

import ch.limpbiskuit.mecamagica.init.Registration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MecaMagica.MODID)
public class MecaMagica {

    public static final String MODID = "mecamagica";

    public MecaMagica() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        Registration.register();
    }



    public void setup(FMLCommonSetupEvent e) {
        
    }

    public void clientSetup(FMLClientSetupEvent e) {

    }

}
