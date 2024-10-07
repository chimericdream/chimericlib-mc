package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.AbstractCauldronBlock;
import net.minecraft.block.cauldron.CauldronBehavior;

abstract public class ModCauldronBlock extends AbstractCauldronBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.Config config;

    public ModCauldronBlock(ModBlock.Config config, CauldronBehavior.CauldronBehaviorMap behaviors) {
        super(config.getBaseSettings(), behaviors);

        this.config = config;
    }
}
