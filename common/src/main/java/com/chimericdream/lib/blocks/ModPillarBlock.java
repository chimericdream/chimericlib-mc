package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.PillarBlock;

abstract public class ModPillarBlock extends PillarBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.Config config;

    public ModPillarBlock(ModBlock.Config config) {
        super(config.getBaseSettings());

        this.config = config;
    }
}
