package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.LeveledCauldronBlock;
import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.world.biome.Biome;

abstract public class ModLeveledCauldronBlock extends LeveledCauldronBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.Config config;

    public ModLeveledCauldronBlock(ModBlock.Config config, Biome.Precipitation precipitation, CauldronBehavior.CauldronBehaviorMap behaviors) {
        super(precipitation, behaviors, config.getBaseSettings());

        this.config = config;
    }
}
