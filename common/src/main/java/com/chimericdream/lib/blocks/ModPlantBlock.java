package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.PlantBlock;

abstract public class ModPlantBlock extends PlantBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.Config config;

    public ModPlantBlock(ModBlock.Config config) {
        super(config.getBaseSettings());

        this.config = config;
    }
}
