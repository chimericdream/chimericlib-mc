package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModSlabBlock;

abstract public class FabricModSlabBlock extends ModSlabBlock implements FabricModBlockDataGenerator {
    public FabricModSlabBlock(ModBlock.ModBlockConfig config) {
        super(config);
    }
}
