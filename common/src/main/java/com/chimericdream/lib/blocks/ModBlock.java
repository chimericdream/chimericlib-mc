package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.Block;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

abstract public class ModBlock extends Block implements ModBlockDataGenerator, Registerable {
    public final ModBlockConfig config;

    public ModBlock(ModBlockConfig config) {
        super(config.getBaseSettings());

        this.config = config;
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

        public String getMaterial() {
            return material;
        }

        public ModBlockConfig materialName(String materialName) {
            this.materialName = materialName;
            return this;
        }

        public String getMaterialName() {
            return materialName;
        }

        public ModBlockConfig ingredient(Block block) {
            this.ingredients.put("default", block);
            return this;
        }

        public ModBlockConfig ingredient(String key, Block block) {
            this.ingredients.put(key, block);
            return this;
        }

        @NotNull
        public Block getIngredient() {
            if (!ingredients.containsKey("default")) {
                throw new IllegalStateException("No default ingredient set");
            }

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

        public boolean isFlammable() {
            return isFlammable;
        }

        public ModBlockConfig translucent(boolean isTranslucent) {
            this.isTranslucent = isTranslucent;
            return this;
        }

        public ModBlockConfig translucent() {
            return translucent(true);
        }

        public boolean isTranslucent() {
            return isTranslucent;
        }

        public ModBlockConfig texture(Identifier texture) {
            return texture("default", texture);
        }

        public ModBlockConfig texture(String name, Identifier texture) {
            this.textures.put(name, texture);
            return this;
        }

        @NotNull
        public Identifier getTexture() {
            return textures.getOrDefault("default", TextureMap.getId(this.getIngredient()));
        }

        @Nullable
        public Identifier getTexture(String name) {
            return textures.get(name);
        }
    }
}
