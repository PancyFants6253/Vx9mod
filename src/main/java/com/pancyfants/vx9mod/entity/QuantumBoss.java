package com.pancyfants.vx9mod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class QuantumBoss extends HostileEntity {
    public QuantumBoss(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 250;
    }

    @Override
    public void tick() {
        super.tick();
        // Boss AI logic
    }
}
