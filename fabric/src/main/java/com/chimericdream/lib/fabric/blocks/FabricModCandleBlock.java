package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModCandleBlock;

abstract public class FabricModCandleBlock extends ModCandleBlock implements FabricModBlockDataGenerator {
    public FabricModCandleBlock(ModBlock.Config config) {
        super(config);
    }
}
