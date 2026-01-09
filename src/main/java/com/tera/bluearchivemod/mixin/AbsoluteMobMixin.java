package com.tera.bluearchivemod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(net.minecraft.world.entity.monster.Zombie.class)
public abstract class AbsoluteMobMixin {

    @Inject(method = "tick", at = @At("HEAD"))
    private void debugTick(CallbackInfo ci) {
        System.out.println("[BLUEARCHIVE.MIXIN] zombie tick");
    }
}