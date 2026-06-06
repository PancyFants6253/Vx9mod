package com.pancyfants.vx9mod.recipe;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class VX9CraftingStationRecipe implements Recipe<Inventory> {
    private final Identifier id;
    private final ItemStack output;
    private final boolean requiresQuantumNexus;

    public VX9CraftingStationRecipe(Identifier id, ItemStack output, boolean requiresQuantumNexus) {
        this.id = id;
        this.output = output;
        this.requiresQuantumNexus = requiresQuantumNexus;
    }

    @Override
    public boolean matches(Inventory inventory, World world) {
        return hasRequiredItems(inventory);
    }

    @Override
    public ItemStack craft(Inventory inventory, net.minecraft.registry.DynamicRegistryManager registryManager) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return width >= 8 && height >= 8;
    }

    @Override
    public ItemStack getOutput(net.minecraft.registry.DynamicRegistryManager registryManager) {
        return output.copy();
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<?> getType() {
        return null;
    }

    private boolean hasRequiredItems(Inventory inventory) {
        return true;
    }

    public boolean requiresQuantumNexus() {
        return requiresQuantumNexus;
    }
}
