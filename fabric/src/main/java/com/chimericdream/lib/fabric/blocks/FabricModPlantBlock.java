package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModPlantBlock;

abstract public class FabricModPlantBlock extends ModPlantBlock implements FabricModBlockDataGenerator {
    public FabricModPlantBlock(ModBlock.Config config) {
        super(config);
    }
}
