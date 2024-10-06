package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModStairsBlock;
import net.minecraft.block.BlockState;

abstract public class FabricModStairsBlock extends ModStairsBlock implements FabricModBlockDataGenerator {
    public FabricModStairsBlock(BlockState baseBlockState, ModBlock.ModBlockConfig config) {
        super(baseBlockState, config);
    }
}
