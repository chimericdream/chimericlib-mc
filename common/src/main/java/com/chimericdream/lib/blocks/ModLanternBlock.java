package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.LanternBlock;

abstract public class ModLanternBlock extends LanternBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.Config config;

    public ModLanternBlock(ModBlock.Config config) {
        super(config.getBaseSettings());

        this.config = config;
    }
}
