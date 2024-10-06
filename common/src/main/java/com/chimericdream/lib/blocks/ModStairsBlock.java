package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

abstract public class ModStairsBlock extends StairsBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.ModBlockConfig config;

    public ModStairsBlock(BlockState baseBlockState, ModBlock.ModBlockConfig config) {
        super(baseBlockState, config.getBaseSettings());

        this.config = config;
    }
}
