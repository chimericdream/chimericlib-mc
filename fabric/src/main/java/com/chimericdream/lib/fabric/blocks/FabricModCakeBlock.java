package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModCakeBlock;

abstract public class FabricModCakeBlock extends ModCakeBlock implements FabricModBlockDataGenerator {
    public FabricModCakeBlock(ModBlock.Config config) {
        super(config);
    }
}
