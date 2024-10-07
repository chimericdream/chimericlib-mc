package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.RodBlock;

abstract public class ModRodBlock extends RodBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.Config config;

    public ModRodBlock(ModBlock.Config config) {
        super(config.getBaseSettings());

        this.config = config;
    }
}
