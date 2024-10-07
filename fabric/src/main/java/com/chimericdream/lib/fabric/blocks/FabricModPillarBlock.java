package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModPillarBlock;

abstract public class FabricModPillarBlock extends ModPillarBlock implements FabricModBlockDataGenerator {
    public FabricModPillarBlock(ModBlock.Config config) {
        super(config);
    }
}
