package mod.mh48.pneumo.forge;

import mod.mh48.pneumo.PneumoRegistry;
import mod.mh48.pneumo.PneumaticLimbed;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PneumaticLimbed.MOD_ID)
public class PneumaticLimbedForge {
    public PneumaticLimbedForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        PneumoRegistry.REGISTRATE.registerEventListeners(eventBus);
        PneumaticLimbed.init();
    }
}
