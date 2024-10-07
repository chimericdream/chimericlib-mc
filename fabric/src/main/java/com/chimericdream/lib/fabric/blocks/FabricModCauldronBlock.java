package com.chimericdream.lib.fabric.blocks;

import com.chimericdream.lib.blocks.ModBlock;
import com.chimericdream.lib.blocks.ModCauldronBlock;
import net.minecraft.block.cauldron.CauldronBehavior;

abstract public class FabricModCauldronBlock extends ModCauldronBlock implements FabricModBlockDataGenerator {
    public FabricModCauldronBlock(ModBlock.Config config, CauldronBehavior.CauldronBehaviorMap behaviors) {
        super(config, behaviors);
    }
}
