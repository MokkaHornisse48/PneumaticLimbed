package mod.mh48.pneumo.mixin;

import net.minecraft.data.HashCache;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HashCache.class)
public class HashCacheMixin {

    @Inject(method = "purgeStaleAndWrite",at = @At("RETURN"))
    public void exit(CallbackInfo ci){
        System.exit(0);//Exit datagen fix.
    }
}
