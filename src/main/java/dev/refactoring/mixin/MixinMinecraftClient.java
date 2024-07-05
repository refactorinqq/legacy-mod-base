package dev.refactoring.mixin;

import dev.refactoring.mod.ExampleMod;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MixinMinecraftClient {
    @Inject(method = "initializeGame", at = @At("RETURN"))
    public void example$initializeGame(CallbackInfo ci) {
        ExampleMod.getLogger().info("hello, mixin");
    }
}
