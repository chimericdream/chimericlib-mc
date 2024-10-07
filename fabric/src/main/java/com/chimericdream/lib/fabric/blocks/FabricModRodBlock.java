package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModRodBlock;

abstract public class FabricModRodBlock extends ModRodBlock implements FabricModBlockDataGenerator {
    public FabricModRodBlock(ModBlock.Config config) {
        super(config);
    }
}
