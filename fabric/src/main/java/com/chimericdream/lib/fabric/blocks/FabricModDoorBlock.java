package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModDoorBlock;
import net.minecraft.block.BlockSetType;

abstract public class FabricModDoorBlock extends ModDoorBlock implements FabricModBlockDataGenerator {
    public FabricModDoorBlock(BlockSetType type, ModBlock.Config config) {
        super(type, config);
    }
}
