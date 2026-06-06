package com.pancyfants.vx9mod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class FabricationMob extends HostileEntity {
    public FabricationMob(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 50;
    }

    @Override
    public void tick() {
        super.tick();
        // Standard mob AI
    }
}
