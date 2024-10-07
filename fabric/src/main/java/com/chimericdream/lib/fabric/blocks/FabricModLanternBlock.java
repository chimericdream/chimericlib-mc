package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModLanternBlock;

abstract public class FabricModLanternBlock extends ModLanternBlock implements FabricModBlockDataGenerator {
    public FabricModLanternBlock(ModBlock.Config config) {
        super(config);
    }
}
