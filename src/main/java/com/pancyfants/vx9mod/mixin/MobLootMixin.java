package com.pancyfants.vx9mod.mixin;

import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HostileEntity.class)
public class MobLootMixin {
    @Inject(method = "dropLoot", at = @At("HEAD"), cancellable = true)
    private void onMobDeath(CallbackInfo ci) {
        // Custom mob drops handled here
    }
}
