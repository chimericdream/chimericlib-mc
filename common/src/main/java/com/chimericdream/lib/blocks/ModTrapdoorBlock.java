package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.TrapdoorBlock;

abstract public class ModTrapdoorBlock extends TrapdoorBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.Config config;

    public ModTrapdoorBlock(BlockSetType type, ModBlock.Config config) {
        super(type, config.getBaseSettings());

        this.config = config;
    }
}
