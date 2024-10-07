package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModCarpetBlock;

abstract public class FabricModCarpetBlock extends ModCarpetBlock implements FabricModBlockDataGenerator {
    public FabricModCarpetBlock(ModBlock.Config config) {
        super(config);
    }
}
