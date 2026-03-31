package net.examplemod.forge;

import com.tterrag.registrate.providers.ProviderType;
import net.examplemod.ExampleBlocks;
import net.examplemod.ExampleMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExampleBlocks.REGISTRATE.registerEventListeners(eventBus);
        ExampleMod.init();
    }
}
