package com.pancyfants.vx9mod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import com.pancyfants.vx9mod.entity.QuantumBoss;
import com.pancyfants.vx9mod.entity.CronoBoss;
import com.pancyfants.vx9mod.entity.FabricationMob;

public class Vx9ModEntities {
    public static final EntityType<QuantumBoss> QUANTUM_BOSS = registerBoss("quantum_boss", 
        FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, QuantumBoss::new)
            .dimensions(EntityDimensions.fixed(1.0f, 2.5f)));

    public static final EntityType<CronoBoss> CRONO_BOSS = registerBoss("crono_boss", 
        FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CronoBoss::new)
            .dimensions(EntityDimensions.fixed(1.2f, 2.8f)));

    public static final EntityType<FabricationMob> FABRICATION_MOB = registerMob("fabrication_mob", 
        FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FabricationMob::new)
            .dimensions(EntityDimensions.fixed(0.8f, 1.8f)));

    public static void registerEntities() {
        Vx9ModMain.LOGGER.info("Registering VX-9 Mod entities");
    }

    private static <T extends HostileEntity> EntityType<T> registerBoss(String name, 
            FabricEntityTypeBuilder<T> builder) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(Vx9ModMain.MOD_ID, name),
            builder.build());
    }

    private static <T extends HostileEntity> EntityType<T> registerMob(String name, 
            FabricEntityTypeBuilder<T> builder) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(Vx9ModMain.MOD_ID, name),
            builder.build());
    }
}
