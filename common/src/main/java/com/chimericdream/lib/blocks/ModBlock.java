package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.Block;
import net.minecraft.data.client.TextureMap;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

abstract public class ModBlock extends Block implements ModBlockDataGenerator, Registerable {
    public final Config config;

    public ModBlock(Config config) {
        super(config.getBaseSettings());

        this.config = config;
    }

    public static class Config {
        protected Settings baseSettings = null;
        protected Item item = null;
        protected String itemName = null;
        protected String material = null;
        protected String materialName = null;
        protected final Map<String, Block> ingredients = new LinkedHashMap<>();
        protected final Map<String, TagKey<Item>> tagIngredients = new LinkedHashMap<>();
        protected boolean isFlammable = false;
        protected boolean isTranslucent = false;
        protected final Map<String, Identifier> textures = new LinkedHashMap<>();

        public Config settings(Settings baseSettings) {
            this.baseSettings = baseSettings;
            return this;
        }

        public Settings getBaseSettings() {
            return Objects.requireNonNullElseGet(this.baseSettings, () -> Settings.copy(this.getIngredient()));
        }

        public Config item(Item item) {
            this.item = item;
            return this;
        }

        public Item getItem() {
            return item;
        }

        public Config itemName(String itemName) {
            this.itemName = itemName;
            return this;
        }

        public String getItemName() {
            return itemName;
        }

        public Config material(String material) {
            this.material = material;
            return this;
        }

        public String getMaterial() {
            return material;
        }

        public Config materialName(String materialName) {
            this.materialName = materialName;
            return this;
        }

        public String getMaterialName() {
            return materialName;
        }

        public Config ingredient(Block block) {
            this.ingredients.put("default", block);
            return this;
        }

        public Config ingredient(String key, Block block) {
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

        public Config tagIngredient(TagKey<Item> tag) {
            this.tagIngredients.put("default", tag);
            return this;
        }

        public Config tagIngredient(String key, TagKey<Item> tag) {
            this.tagIngredients.put(key, tag);
            return this;
        }

        public TagKey<Item> getTagIngredient() {
            return tagIngredients.get("default");
        }

        @Nullable
        public TagKey<Item> getTagIngredient(String key) {
            return tagIngredients.get(key);
        }

        public Config flammable(boolean isFlammable) {
            this.isFlammable = isFlammable;
            return this;
        }

        public Config flammable() {
            return flammable(true);
        }

        public boolean isFlammable() {
            return isFlammable;
        }

        public Config translucent(boolean isTranslucent) {
            this.isTranslucent = isTranslucent;
            return this;
        }

        public Config translucent() {
            return translucent(true);
        }

        public boolean isTranslucent() {
            return isTranslucent;
        }

        public Config texture(Identifier texture) {
            return texture("default", texture);
        }

        public Config texture(String name, Identifier texture) {
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
