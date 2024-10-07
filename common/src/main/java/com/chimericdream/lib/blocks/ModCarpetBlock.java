package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.CarpetBlock;

abstract public class ModCarpetBlock extends CarpetBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.Config config;

    public ModCarpetBlock(ModBlock.Config config) {
        super(config.getBaseSettings());

        this.config = config;
    }
}
