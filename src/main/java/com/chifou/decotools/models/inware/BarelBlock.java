package com.chifou.decotools.models.inware;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class BarelBlock extends HorizontalDirectionalBlock {
    public BarelBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public static final VoxelShape SHAPE_N =
            Stream.of(
                    Block.box(5, 0, 4, 11, 1, 12),
                    Block.box(5, 15, 4, 11, 16, 12),
                    Block.box(5, 14, 12, 11, 15, 16),
                    Block.box(5, 14, 0, 11, 15, 4),
                    Block.box(5, 1, 12, 11, 2, 16),
                    Block.box(5, 2, 13.4, 11, 3, 14.4),
                    Block.box(5, 2, 1.6, 11, 3, 2.6),
                    Block.box(5, 13, 13.4, 11, 14, 14.4),
                    Block.box(5, 13, 1.6, 11, 14, 2.6),
                    Block.box(3, 3, 13.4, 13, 5, 14.4),
                    Block.box(3, 3, 1.6, 13, 5, 2.6),
                    Block.box(3, 11, 13.4, 13, 13, 14.4),
                    Block.box(3, 11, 1.6, 13, 13, 2.6),
                    Block.box(2, 5, 13.4, 14, 11, 14.4),
                    Block.box(2, 5, 1.6, 14, 11, 2.6),
                    Block.box(5, 1, 0, 11, 2, 4),
                    Block.box(3, 14, 4, 5, 15, 12),
                    Block.box(11, 14, 4, 13, 15, 12),
                    Block.box(3, 1, 4, 5, 2, 12),
                    Block.box(3, 2, 12, 5, 3, 16),
                    Block.box(3, 2, 0, 5, 3, 4),
                    Block.box(11, 2, 12, 13, 3, 16),
                    Block.box(11, 2, 0, 13, 3, 4),
                    Block.box(3, 13, 12, 5, 14, 16),
                    Block.box(3, 13, 0, 5, 14, 4),
                    Block.box(11, 13, 12, 13, 14, 16),
                    Block.box(11, 13, 0, 13, 14, 4),
                    Block.box(11, 1, 4, 13, 2, 12),
                    Block.box(2, 13, 4, 3, 14, 12),
                    Block.box(13, 13, 4, 14, 14, 12),
                    Block.box(2, 2, 4, 3, 3, 12),
                    Block.box(13, 2, 4, 14, 3, 12),
                    Block.box(1, 11, 4, 2, 13, 12),
                    Block.box(14, 11, 4, 15, 13, 12),
                    Block.box(1, 3, 4, 2, 5, 12),
                    Block.box(2, 11, 12, 3, 13, 16),
                    Block.box(2, 11, 0, 3, 13, 4),
                    Block.box(13, 11, 12, 14, 13, 16),
                    Block.box(13, 11, 0, 14, 13, 4),
                    Block.box(2, 3, 12, 3, 5, 16),
                    Block.box(2, 3, 0, 3, 5, 4),
                    Block.box(13, 3, 12, 14, 5, 16),
                    Block.box(13, 3, 0, 14, 5, 4),
                    Block.box(14, 3, 4, 15, 5, 12),
                    Block.box(0, 5, 4, 1, 11, 12),
                    Block.box(1, 5, 12, 2, 11, 16),
                    Block.box(1, 5, 0, 2, 11, 4),
                    Block.box(14, 5, 12, 15, 11, 16),
                    Block.box(14, 5, 0, 15, 11, 4),
                    Block.box(15, 5, 4, 16, 11, 12),
                    Block.box(7.5, 5, -0.5, 8.5, 6, 1.5),
                    Block.box(7.5, 4, -1.5, 8.5, 5, -0.5),
                    Block.box(7.51, 4.39289, -1, 8.49, 5.79289, -0.1),
                    Block.box(0, 0, 3, 16, 6, 4),
                    Block.box(0, 0, 12, 16, 6, 13)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPE_S =
            Stream.of(
                    Block.box(5, 0, 4, 11, 1, 12),
                    Block.box(5, 15, 4, 11, 16, 12),
                    Block.box(5, 14, 12, 11, 15, 16),
                    Block.box(5, 14, 0, 11, 15, 4),
                    Block.box(5, 1, 12, 11, 2, 16),
                    Block.box(5, 2, 13.4, 11, 3, 14.4),
                    Block.box(5, 2, 1.6, 11, 3, 2.6),
                    Block.box(5, 13, 13.4, 11, 14, 14.4),
                    Block.box(5, 13, 1.6, 11, 14, 2.6),
                    Block.box(3, 3, 13.4, 13, 5, 14.4),
                    Block.box(3, 3, 1.6, 13, 5, 2.6),
                    Block.box(3, 11, 13.4, 13, 13, 14.4),
                    Block.box(3, 11, 1.6, 13, 13, 2.6),
                    Block.box(2, 5, 13.4, 14, 11, 14.4),
                    Block.box(2, 5, 1.6, 14, 11, 2.6),
                    Block.box(5, 1, 0, 11, 2, 4),
                    Block.box(3, 14, 4, 5, 15, 12),
                    Block.box(11, 14, 4, 13, 15, 12),
                    Block.box(3, 1, 4, 5, 2, 12),
                    Block.box(3, 2, 12, 5, 3, 16),
                    Block.box(3, 2, 0, 5, 3, 4),
                    Block.box(11, 2, 12, 13, 3, 16),
                    Block.box(11, 2, 0, 13, 3, 4),
                    Block.box(3, 13, 12, 5, 14, 16),
                    Block.box(3, 13, 0, 5, 14, 4),
                    Block.box(11, 13, 12, 13, 14, 16),
                    Block.box(11, 13, 0, 13, 14, 4),
                    Block.box(11, 1, 4, 13, 2, 12),
                    Block.box(2, 13, 4, 3, 14, 12),
                    Block.box(13, 13, 4, 14, 14, 12),
                    Block.box(2, 2, 4, 3, 3, 12),
                    Block.box(13, 2, 4, 14, 3, 12),
                    Block.box(1, 11, 4, 2, 13, 12),
                    Block.box(14, 11, 4, 15, 13, 12),
                    Block.box(1, 3, 4, 2, 5, 12),
                    Block.box(2, 11, 12, 3, 13, 16),
                    Block.box(2, 11, 0, 3, 13, 4),
                    Block.box(13, 11, 12, 14, 13, 16),
                    Block.box(13, 11, 0, 14, 13, 4),
                    Block.box(2, 3, 12, 3, 5, 16),
                    Block.box(2, 3, 0, 3, 5, 4),
                    Block.box(13, 3, 12, 14, 5, 16),
                    Block.box(13, 3, 0, 14, 5, 4),
                    Block.box(14, 3, 4, 15, 5, 12),
                    Block.box(0, 5, 4, 1, 11, 12),
                    Block.box(1, 5, 12, 2, 11, 16),
                    Block.box(1, 5, 0, 2, 11, 4),
                    Block.box(14, 5, 12, 15, 11, 16),
                    Block.box(14, 5, 0, 15, 11, 4),
                    Block.box(15, 5, 4, 16, 11, 12),
                    Block.box(7.5, 5, -0.5, 8.5, 6, 1.5),
                    Block.box(7.5, 4, -1.5, 8.5, 5, -0.5),
                    Block.box(7.51, 4.39289, -1, 8.49, 5.79289, -0.1),
                    Block.box(0, 0, 3, 16, 6, 4),
                    Block.box(0, 0, 12, 16, 6, 13)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPE_E=
            Stream.of(
                    Block.box(2.5, 0, 5.5, 10.5, 1, 11.5),
                    Block.box(2.5, 15, 5.5, 10.5, 16, 11.5),
                    Block.box(-1.5, 14, 5.5, 2.5, 15, 11.5),
                    Block.box(10.5, 14, 5.5, 14.5, 15, 11.5),
                    Block.box(-1.5, 1, 5.5, 2.5, 2, 11.5),
                    Block.box(0.09999999999999964, 2, 5.5, 1.0999999999999996, 3, 11.5),
                    Block.box(11.9, 2, 5.5, 12.9, 3, 11.5),
                    Block.box(0.09999999999999964, 13, 5.5, 1.0999999999999996, 14, 11.5),
                    Block.box(11.9, 13, 5.5, 12.9, 14, 11.5),
                    Block.box(0.09999999999999964, 3, 3.5, 1.0999999999999996, 5, 13.5),
                    Block.box(11.9, 3, 3.5, 12.9, 5, 13.5),
                    Block.box(0.09999999999999964, 11, 3.5, 1.0999999999999996, 13, 13.5),
                    Block.box(11.9, 11, 3.5, 12.9, 13, 13.5),
                    Block.box(0.09999999999999964, 5, 2.5, 1.0999999999999996, 11, 14.5),
                    Block.box(11.9, 5, 2.5, 12.9, 11, 14.5),
                    Block.box(10.5, 1, 5.5, 14.5, 2, 11.5),
                    Block.box(2.5, 14, 3.5, 10.5, 15, 5.5),
                    Block.box(2.5, 14, 11.5, 10.5, 15, 13.5),
                    Block.box(2.5, 1, 3.5, 10.5, 2, 5.5),
                    Block.box(-1.5, 2, 3.5, 2.5, 3, 5.5),
                    Block.box(10.5, 2, 3.5, 14.5, 3, 5.5),
                    Block.box(-1.5, 2, 11.5, 2.5, 3, 13.5),
                    Block.box(10.5, 2, 11.5, 14.5, 3, 13.5),
                    Block.box(-1.5, 13, 3.5, 2.5, 14, 5.5),
                    Block.box(10.5, 13, 3.5, 14.5, 14, 5.5),
                    Block.box(-1.5, 13, 11.5, 2.5, 14, 13.5),
                    Block.box(10.5, 13, 11.5, 14.5, 14, 13.5),
                    Block.box(2.5, 1, 11.5, 10.5, 2, 13.5),
                    Block.box(2.5, 13, 2.5, 10.5, 14, 3.5),
                    Block.box(2.5, 13, 13.5, 10.5, 14, 14.5),
                    Block.box(2.5, 2, 2.5, 10.5, 3, 3.5),
                    Block.box(2.5, 2, 13.5, 10.5, 3, 14.5),
                    Block.box(2.5, 11, 1.5, 10.5, 13, 2.5),
                    Block.box(2.5, 11, 14.5, 10.5, 13, 15.5),
                    Block.box(2.5, 3, 1.5, 10.5, 5, 2.5),
                    Block.box(-1.5, 11, 2.5, 2.5, 13, 3.5),
                    Block.box(10.5, 11, 2.5, 14.5, 13, 3.5),
                    Block.box(-1.5, 11, 13.5, 2.5, 13, 14.5),
                    Block.box(10.5, 11, 13.5, 14.5, 13, 14.5),
                    Block.box(-1.5, 3, 2.5, 2.5, 5, 3.5),
                    Block.box(10.5, 3, 2.5, 14.5, 5, 3.5),
                    Block.box(-1.5, 3, 13.5, 2.5, 5, 14.5),
                    Block.box(10.5, 3, 13.5, 14.5, 5, 14.5),
                    Block.box(2.5, 3, 14.5, 10.5, 5, 15.5),
                    Block.box(2.5, 5, 0.5, 10.5, 11, 1.5),
                    Block.box(-1.5, 5, 1.5, 2.5, 11, 2.5),
                    Block.box(10.5, 5, 1.5, 14.5, 11, 2.5),
                    Block.box(-1.5, 5, 14.5, 2.5, 11, 15.5),
                    Block.box(10.5, 5, 14.5, 14.5, 11, 15.5),
                    Block.box(2.5, 5, 15.5, 10.5, 11, 16.5),
                    Block.box(13, 5, 8, 15, 6, 9),
                    Block.box(15, 4, 8, 16, 5, 9),
                    Block.box(10.635531629887918, 0.23603669327625187, 8.01, 11.535531629887918, 1.6360366932762513, 8.99),
                    Block.box(10.5, 0, 0.5, 11.5, 6, 16.5),
                    Block.box(1.5, 0, 0.5, 2.5, 6, 16.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPE_O =
            Stream.of(
                    Block.box(2.5, 0, 5.5, 10.5, 1, 11.5),
                    Block.box(2.5, 15, 5.5, 10.5, 16, 11.5),
                    Block.box(-1.5, 14, 5.5, 2.5, 15, 11.5),
                    Block.box(10.5, 14, 5.5, 14.5, 15, 11.5),
                    Block.box(-1.5, 1, 5.5, 2.5, 2, 11.5),
                    Block.box(0.09999999999999964, 2, 5.5, 1.0999999999999996, 3, 11.5),
                    Block.box(11.9, 2, 5.5, 12.9, 3, 11.5),
                    Block.box(0.09999999999999964, 13, 5.5, 1.0999999999999996, 14, 11.5),
                    Block.box(11.9, 13, 5.5, 12.9, 14, 11.5),
                    Block.box(0.09999999999999964, 3, 3.5, 1.0999999999999996, 5, 13.5),
                    Block.box(11.9, 3, 3.5, 12.9, 5, 13.5),
                    Block.box(0.09999999999999964, 11, 3.5, 1.0999999999999996, 13, 13.5),
                    Block.box(11.9, 11, 3.5, 12.9, 13, 13.5),
                    Block.box(0.09999999999999964, 5, 2.5, 1.0999999999999996, 11, 14.5),
                    Block.box(11.9, 5, 2.5, 12.9, 11, 14.5),
                    Block.box(10.5, 1, 5.5, 14.5, 2, 11.5),
                    Block.box(2.5, 14, 3.5, 10.5, 15, 5.5),
                    Block.box(2.5, 14, 11.5, 10.5, 15, 13.5),
                    Block.box(2.5, 1, 3.5, 10.5, 2, 5.5),
                    Block.box(-1.5, 2, 3.5, 2.5, 3, 5.5),
                    Block.box(10.5, 2, 3.5, 14.5, 3, 5.5),
                    Block.box(-1.5, 2, 11.5, 2.5, 3, 13.5),
                    Block.box(10.5, 2, 11.5, 14.5, 3, 13.5),
                    Block.box(-1.5, 13, 3.5, 2.5, 14, 5.5),
                    Block.box(10.5, 13, 3.5, 14.5, 14, 5.5),
                    Block.box(-1.5, 13, 11.5, 2.5, 14, 13.5),
                    Block.box(10.5, 13, 11.5, 14.5, 14, 13.5),
                    Block.box(2.5, 1, 11.5, 10.5, 2, 13.5),
                    Block.box(2.5, 13, 2.5, 10.5, 14, 3.5),
                    Block.box(2.5, 13, 13.5, 10.5, 14, 14.5),
                    Block.box(2.5, 2, 2.5, 10.5, 3, 3.5),
                    Block.box(2.5, 2, 13.5, 10.5, 3, 14.5),
                    Block.box(2.5, 11, 1.5, 10.5, 13, 2.5),
                    Block.box(2.5, 11, 14.5, 10.5, 13, 15.5),
                    Block.box(2.5, 3, 1.5, 10.5, 5, 2.5),
                    Block.box(-1.5, 11, 2.5, 2.5, 13, 3.5),
                    Block.box(10.5, 11, 2.5, 14.5, 13, 3.5),
                    Block.box(-1.5, 11, 13.5, 2.5, 13, 14.5),
                    Block.box(10.5, 11, 13.5, 14.5, 13, 14.5),
                    Block.box(-1.5, 3, 2.5, 2.5, 5, 3.5),
                    Block.box(10.5, 3, 2.5, 14.5, 5, 3.5),
                    Block.box(-1.5, 3, 13.5, 2.5, 5, 14.5),
                    Block.box(10.5, 3, 13.5, 14.5, 5, 14.5),
                    Block.box(2.5, 3, 14.5, 10.5, 5, 15.5),
                    Block.box(2.5, 5, 0.5, 10.5, 11, 1.5),
                    Block.box(-1.5, 5, 1.5, 2.5, 11, 2.5),
                    Block.box(10.5, 5, 1.5, 14.5, 11, 2.5),
                    Block.box(-1.5, 5, 14.5, 2.5, 11, 15.5),
                    Block.box(10.5, 5, 14.5, 14.5, 11, 15.5),
                    Block.box(2.5, 5, 15.5, 10.5, 11, 16.5),
                    Block.box(13, 5, 8, 15, 6, 9),
                    Block.box(15, 4, 8, 16, 5, 9),
                    Block.box(10.635531629887918, 0.23603669327625187, 8.01, 11.535531629887918, 1.6360366932762513, 8.99),
                    Block.box(10.5, 0, 0.5, 11.5, 6, 16.5),
                    Block.box(1.5, 0, 0.5, 2.5, 6, 16.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }
}
