package mod.mh48.pneumo.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import mod.mh48.pneumo.PneumoRegistry;
import mod.mh48.pneumo.PneumaticLimbed;
import net.fabricmc.api.ModInitializer;

public class PneumaticLimbedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PneumaticLimbed.init();
        PneumaticLimbed.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), PneumaticLimbed.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        PneumoRegistry.REGISTRATE.register();
    }
}
