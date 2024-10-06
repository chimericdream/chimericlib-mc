package com.chimericdream.lib.blocks;

import net.minecraft.block.Block;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

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

    public Block getIngredient() {
        return config.getIngredient();
    }

    public Block getIngredient(String key) {
        return config.getIngredient(key);
    }

    public Map<String, Block> getIngredients() {
        return config.ingredients;
    }

    public String getMaterial() {
        return config.material;
    }

    public String getMaterialName() {
        return config.materialName;
    }

    public Identifier getTexture() {
        return config.getTexture();
    }

    public Identifier getTexture(String name) {
        return config.getTexture(name);
    }

    public boolean isFlammable() {
        return config.isFlammable;
    }

    public boolean isTranslucent() {
        return config.isTranslucent;
    }

    public static class ModBlockConfig {
        protected Settings baseSettings = null;
        protected String material = null;
        protected String materialName = null;
        protected final Map<String, Block> ingredients = new LinkedHashMap<>();
        protected boolean isFlammable = false;
        protected boolean isTranslucent = false;
        protected final Map<String, Identifier> textures = new LinkedHashMap<>();

        public ModBlockConfig settings(Settings baseSettings) {
            this.baseSettings = baseSettings;
            return this;
        }

        public Settings getBaseSettings() {
            return Objects.requireNonNullElseGet(this.baseSettings, () -> Settings.copy(this.getIngredient()));
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
            this.ingredients.put("default", block);
            return this;
        }

        public ModBlockConfig ingredient(String key, Block block) {
            this.ingredients.put(key, block);
            return this;
        }

        @Nullable
        public Block getIngredient() {
            return ingredients.get("default");
        }

        @Nullable
        public Block getIngredient(String key) {
            return ingredients.get(key);
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

        public ModBlockConfig texture(Identifier texture) {
            return texture("default", texture);
        }

        public ModBlockConfig texture(String name, Identifier texture) {
            this.textures.put(name, texture);
            return this;
        }

        @Nullable
        public Identifier getTexture() {
            return textures.getOrDefault("default", TextureMap.getId(this.getIngredient()));
        }

        @Nullable
        public Identifier getTexture(String name) {
            return textures.get(name);
        }
    }
}
