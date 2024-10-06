package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.WallBlock;

abstract public class ModWallBlock extends WallBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.ModBlockConfig config;

    public ModWallBlock(ModBlock.ModBlockConfig config) {
        super(config.getBaseSettings());

        this.config = config;
    }
}
