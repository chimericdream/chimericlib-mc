package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.SlabBlock;

abstract public class ModSlabBlock extends SlabBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.ModBlockConfig config;

    public ModSlabBlock(ModBlock.ModBlockConfig config) {
        super(config.getBaseSettings());

        this.config = config;
    }
}
