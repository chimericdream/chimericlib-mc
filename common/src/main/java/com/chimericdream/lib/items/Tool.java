package com.chimericdream.lib.items;

import net.minecraft.item.Item;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import org.jetbrains.annotations.Nullable;

public enum Tool {
    AXE(ItemTags.AXES),
    HOE(ItemTags.HOES),
    MACE(null),
    PICKAXE(ItemTags.PICKAXES),
    SHEARS(null),
    SHOVEL(ItemTags.SHOVELS),
    NONE(null);

    @Nullable
    public final TagKey<Item> itemTag;

    Tool(@Nullable TagKey<Item> itemTag) {
        this.itemTag = itemTag;
    }
}
