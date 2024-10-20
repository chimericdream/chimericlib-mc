package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Tool;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.data.client.TextureMap;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class BlockConfig {
    protected AbstractBlock.Settings baseSettings = null;
    protected Item item = null;
    protected String itemName = null;
    protected String material = null;
    protected String materialName = null;
    protected Tool tool = null;
    protected final Map<String, Block> ingredients = new LinkedHashMap<>();
    protected final Map<String, TagKey<Item>> tagIngredients = new LinkedHashMap<>();
    protected boolean isFlammable = false;
    protected boolean isTranslucent = false;
    protected final Map<String, Identifier> textures = new LinkedHashMap<>();

    public BlockConfig settings(AbstractBlock.Settings baseSettings) {
        this.baseSettings = baseSettings;
        return this;
    }

    public AbstractBlock.Settings getBaseSettings() {
        return Objects.requireNonNullElseGet(this.baseSettings, () -> AbstractBlock.Settings.copy(this.getIngredient()));
    }

    public BlockConfig item(Item item) {
        this.item = item;
        return this;
    }

    public @Nullable Item getItem() {
        return item;
    }

    public BlockConfig itemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public @Nullable String getItemName() {
        return itemName;
    }

    public BlockConfig material(String material) {
        this.material = material;
        return this;
    }

    public @Nullable String getMaterial() {
        return material;
    }

    public BlockConfig materialName(String materialName) {
        this.materialName = materialName;
        return this;
    }

    public @Nullable String getMaterialName() {
        return materialName;
    }

    public BlockConfig ingredient(Block block) {
        this.ingredients.put("default", block);
        return this;
    }

    public BlockConfig ingredient(String key, Block block) {
        this.ingredients.put(key, block);
        return this;
    }

    public @Nullable Block getIngredient() {
        if (!ingredients.containsKey("default")) {
            throw new IllegalStateException("No default ingredient set");
        }

        return ingredients.get("default");
    }

    public @Nullable Block getIngredient(String key) {
        return ingredients.get(key);
    }

    public BlockConfig tagIngredient(TagKey<Item> tag) {
        this.tagIngredients.put("default", tag);
        return this;
    }

    public BlockConfig tagIngredient(String key, TagKey<Item> tag) {
        this.tagIngredients.put(key, tag);
        return this;
    }

    public @Nullable TagKey<Item> getTagIngredient() {
        return tagIngredients.get("default");
    }

    public @Nullable TagKey<Item> getTagIngredient(String key) {
        return tagIngredients.get(key);
    }

    public BlockConfig flammable(boolean isFlammable) {
        this.isFlammable = isFlammable;
        return this;
    }

    public BlockConfig flammable() {
        return flammable(true);
    }

    public boolean isFlammable() {
        return isFlammable;
    }

    public BlockConfig tool(Tool tool) {
        this.tool = tool;
        return this;
    }

    public @Nullable Tool getTool() {
        return tool;
    }

    public BlockConfig translucent(boolean isTranslucent) {
        this.isTranslucent = isTranslucent;
        return this;
    }

    public BlockConfig translucent() {
        return translucent(true);
    }

    public boolean isTranslucent() {
        return isTranslucent;
    }

    public BlockConfig texture(Identifier texture) {
        return texture("default", texture);
    }

    public BlockConfig texture(String name, Identifier texture) {
        this.textures.put(name, texture);
        return this;
    }

    public @Nullable Identifier getTexture() {
        return textures.getOrDefault("default", TextureMap.getId(this.getIngredient()));
    }

    public @Nullable Identifier getTexture(String name) {
        return textures.get(name);
    }
}
