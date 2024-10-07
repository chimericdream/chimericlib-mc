package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.CandleBlock;

abstract public class ModCandleBlock extends CandleBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.Config config;

    public ModCandleBlock(ModBlock.Config config) {
        super(config.getBaseSettings());

        this.config = config;
    }
}
