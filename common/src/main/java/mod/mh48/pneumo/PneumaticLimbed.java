package mod.mh48.pneumo;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PneumaticLimbed {
    public static final String MOD_ID = "pneumatic_limbed";
    public static final String NAME = "Pneumatic Limbed";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);


    public static void init() {
        //LOGGER.info("{} initializing! Create version: {} on platform: {}", NAME, Create.NAME, ExampleExpectPlatform.platformName());
        PneumoRegistry.init(); // hold registrate in a separate class to avoid loading early on forge
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
