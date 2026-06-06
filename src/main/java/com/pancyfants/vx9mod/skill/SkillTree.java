package com.pancyfants.vx9mod.skill;

import java.util.HashMap;
import java.util.Map;

public class SkillTree {
    private static final Map<String, Skill> SKILLS = new HashMap<>();

    static {
        // Root skills
        SKILLS.put("laser_mastery", new Skill("laser_mastery", "Laser Mastery", 0, 100));
        SKILLS.put("quantum_affinity", new Skill("quantum_affinity", "Quantum Affinity", 0, 100));
        SKILLS.put("combat_training", new Skill("combat_training", "Combat Training", 0, 100));

        // Advanced skills
        SKILLS.put("laser_precision", new Skill("laser_precision", "Laser Precision", 1, 150));
        SKILLS.put("quantum_surge", new Skill("quantum_surge", "Quantum Surge", 1, 150));
        SKILLS.put("weapon_mastery", new Skill("weapon_mastery", "Weapon Mastery", 1, 150));

        // Ultimate skills
        SKILLS.put("perfect_shot", new Skill("perfect_shot", "Perfect Shot", 2, 300));
        SKILLS.put("quantum_realm", new Skill("quantum_realm", "Quantum Realm", 2, 300));
    }

    public static Skill getSkill(String id) {
        return SKILLS.get(id);
    }

    public static Map<String, Skill> getAllSkills() {
        return new HashMap<>(SKILLS);
    }

    public static class Skill {
        public final String id;
        public final String displayName;
        public final int tier;
        public final int expCost;

        public Skill(String id, String displayName, int tier, int expCost) {
            this.id = id;
            this.displayName = displayName;
            this.tier = tier;
            this.expCost = expCost;
        }
    }
}
