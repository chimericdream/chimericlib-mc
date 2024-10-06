package com.chimericdream.lib.fabric.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

abstract public class FabricModBlockWithEntity extends FabricModBlock implements BlockEntityProvider {
    public FabricModBlockWithEntity(ModBlockConfig config) {
        super(config);
    }

    abstract protected MapCodec<? extends FabricModBlockWithEntity> getCodec();

    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }

    protected boolean onSyncedBlockEvent(
        BlockState state,
        World world,
        BlockPos pos,
        int type,
        int data
    ) {
        super.onSyncedBlockEvent(state, world, pos, type, data);

        BlockEntity blockEntity = world.getBlockEntity(pos);

        return blockEntity != null && blockEntity.onSyncedBlockEvent(type, data);
    }

    @Nullable
    protected NamedScreenHandlerFactory createScreenHandlerFactory(
        BlockState state,
        World world,
        BlockPos pos
    ) {
        BlockEntity blockEntity = world.getBlockEntity(pos);

        return blockEntity instanceof NamedScreenHandlerFactory
            ? (NamedScreenHandlerFactory)blockEntity
            : null;
    }

    @Nullable
    protected static <E extends BlockEntity, A extends BlockEntity> BlockEntityTicker<A> validateTicker(
        BlockEntityType<A> givenType,
        BlockEntityType<E> expectedType,
        BlockEntityTicker<? super E> ticker
    ) {
        //noinspection unchecked
        return expectedType == givenType ? (BlockEntityTicker<A>) ticker : null;
    }
}
