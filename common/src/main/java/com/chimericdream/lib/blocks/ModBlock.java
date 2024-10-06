package com.chimericdream.lib.blocks;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

abstract public class ModBlock extends Block implements ModBlockDataGenerator {
    protected final ModBlockConfig config;

    public ModBlock(ModBlockConfig config) {
        super(config.getBaseSettings());

        this.config = config;
    }

    abstract public void register();

    public boolean isTranslucent() {
        return config.isTranslucent;
    }

    public boolean isFlammable() {
        return config.isFlammable;
    }

    public static class ModBlockConfig {
        protected Settings baseSettings = null;
        protected String material = null;
        protected String materialName = null;
        protected final List<Block> ingredients = new ArrayList<>();
        protected boolean isFlammable = false;
        protected boolean isTranslucent = false;
        protected final Map<String, Identifier> textures = new LinkedHashMap<>();

        public ModBlockConfig settings(Settings baseSettings) {
            this.baseSettings = baseSettings;
            return this;
        }

        public Settings getBaseSettings() {
            return Objects.requireNonNullElseGet(this.baseSettings, () -> Settings.copy(ingredients.getFirst()));

        }

        public ModBlockConfig material(String material) {
            this.material = material;
            return this;
        }

        public ModBlockConfig materialName(String materialName) {
            this.materialName = materialName;
            return this;
        }

        public ModBlockConfig ingredient(Block block) {
            this.ingredients.add(block);
            return this;
        }

        public ModBlockConfig flammable(boolean isFlammable) {
            this.isFlammable = isFlammable;
            return this;
        }

        public ModBlockConfig flammable() {
            return flammable(true);
        }

        public ModBlockConfig translucent(boolean isTranslucent) {
            this.isTranslucent = isTranslucent;
            return this;
        }

        public ModBlockConfig translucent() {
            return translucent(true);
        }

        public ModBlockConfig texture(String name, Identifier texture) {
            this.textures.put(name, texture);
            return this;
        }
    }
}
