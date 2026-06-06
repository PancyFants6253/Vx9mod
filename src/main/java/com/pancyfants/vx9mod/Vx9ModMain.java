package com.pancyfants.vx9mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vx9ModMain implements ModInitializer {
    public static final String MOD_ID = "vx9mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing VX-9 Mod");
        
        // Register items
        Vx9ModItems.registerItems();
        
        // Register blocks
        Vx9ModBlocks.registerBlocks();
        
        // Register biomes
        Vx9ModBiomes.registerBiomes();
        
        // Register entities
        Vx9ModEntities.registerEntities();
        
        LOGGER.info("VX-9 Mod initialized successfully!");
    }
}
