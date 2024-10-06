package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModWallBlock;

abstract public class FabricModWallBlock extends ModWallBlock implements FabricModBlockDataGenerator {
    public FabricModWallBlock(ModBlock.ModBlockConfig config) {
        super(config);
    }
}
