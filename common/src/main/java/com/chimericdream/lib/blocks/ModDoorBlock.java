package com.chimericdream.lib.blocks;

import com.chimericdream.lib.util.Registerable;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.DoorBlock;

abstract public class ModDoorBlock extends DoorBlock implements ModBlockDataGenerator, Registerable {
    public final ModBlock.ModBlockConfig config;

    public ModDoorBlock(BlockSetType type, ModBlock.ModBlockConfig config) {
        super(type, config.getBaseSettings());

        this.config = config;
    }
}
