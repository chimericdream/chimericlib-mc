package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModTrapdoorBlock;
import net.minecraft.block.BlockSetType;

abstract public class FabricModTrapdoorBlock extends ModTrapdoorBlock implements FabricModBlockDataGenerator {
    public FabricModTrapdoorBlock(BlockSetType type, ModBlock.Config config) {
        super(type, config);
    }
}
