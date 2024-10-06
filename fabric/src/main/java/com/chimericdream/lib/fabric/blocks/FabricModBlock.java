package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;

abstract public class FabricModBlock extends ModBlock implements FabricModBlockDataGenerator {
    public FabricModBlock(ModBlockConfig config) {
        super(config);
    }
}
