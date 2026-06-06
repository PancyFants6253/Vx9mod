package com.pancyfants.vx9mod;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

public class Vx9ModBiomes {
    // Biome identifiers
    public static final Identifier QUANTUM_NEXUS_ID = new Identifier(Vx9ModMain.MOD_ID, "quantum_nexus");
    public static final Identifier SKILL_SANCTUM_ID = new Identifier(Vx9ModMain.MOD_ID, "skill_sanctum");
    public static final Identifier BOSS_CITADEL_ID = new Identifier(Vx9ModMain.MOD_ID, "boss_citadel");
    public static final Identifier FABRICATION_CORE_ID = new Identifier(Vx9ModMain.MOD_ID, "fabrication_core");

    public static void registerBiomes() {
        Vx9ModMain.LOGGER.info("Registering VX-9 Mod biomes");
        // Biome registration handled in data generation
    }
}
