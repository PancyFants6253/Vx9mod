package com.pancyfants.vx9mod.skill;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;

public class PlayerSkillData {
    public static final String DATA_KEY = "vx9_skills";

    public static boolean hasSkill(PlayerEntity player, String skillId) {
        NbtCompound playerData = player.getPersistentData();
        NbtCompound skillData = playerData.getCompound(DATA_KEY);
        return skillData.getBoolean(skillId);
    }

    public static void unlockSkill(PlayerEntity player, String skillId) {
        NbtCompound playerData = player.getPersistentData();
        NbtCompound skillData = playerData.getCompound(DATA_KEY);
        skillData.putBoolean(skillId, true);
        playerData.put(DATA_KEY, skillData);
    }

    public static int getPlayerExp(PlayerEntity player) {
        NbtCompound playerData = player.getPersistentData();
        return playerData.getInt("vx9_exp");
    }

    public static void addPlayerExp(PlayerEntity player, int amount) {
        NbtCompound playerData = player.getPersistentData();
        int current = playerData.getInt("vx9_exp");
        playerData.putInt("vx9_exp", current + amount);
    }

    public static void removePlayerExp(PlayerEntity player, int amount) {
        NbtCompound playerData = player.getPersistentData();
        int current = playerData.getInt("vx9_exp");
        playerData.putInt("vx9_exp", Math.max(0, current - amount));
    }
}
