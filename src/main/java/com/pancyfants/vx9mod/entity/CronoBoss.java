package com.pancyfants.vx9mod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class CronoBoss extends HostileEntity {
    public CronoBoss(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 300;
    }

    @Override
    public void tick() {
        super.tick();
        // Boss AI logic
    }
}
