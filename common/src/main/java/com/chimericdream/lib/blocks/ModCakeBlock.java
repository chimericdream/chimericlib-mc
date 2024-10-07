package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.CakeBlock;

abstract public class ModCakeBlock extends CakeBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.Config config;

    public ModCakeBlock(ModBlock.Config config) {
        super(config.getBaseSettings());

        this.config = config;
    }
}
