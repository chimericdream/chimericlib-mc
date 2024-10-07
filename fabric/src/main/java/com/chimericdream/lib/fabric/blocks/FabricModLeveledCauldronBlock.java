package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModLeveledCauldronBlock;
import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.world.biome.Biome;

abstract public class FabricModLeveledCauldronBlock extends ModLeveledCauldronBlock implements FabricModBlockDataGenerator {
    public FabricModLeveledCauldronBlock(ModBlock.Config config, Biome.Precipitation precipitation, CauldronBehavior.CauldronBehaviorMap behaviors) {
        super(config, precipitation, behaviors);
    }
}
