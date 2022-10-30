package com.chifou.decotools.reg.inware;

import com.chifou.decotools.models.inware.BarelBlock;
import com.chifou.decotools.models.inware.BenchBlock;
import com.chifou.decotools.models.inware.ChairBlock;
import com.chifou.decotools.models.inware.TableBlock;
import com.chifou.decotools.models.technologic.LaptopBlock;
import com.chifou.decotools.models.technologic.ScreenBlock;
import com.chifou.decotools.utils.Reference;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistries {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final RegistryObject<Block> CHAIR_BLOCK = BLOCKS.register("chair_block", () -> new ChairBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops()));

    //inware
    public static final RegistryObject<Block> SPRUCE_TABLE = BLOCKS.register
            ("spruce_table", () -> new TableBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OAK_TABLE = BLOCKS.register
            ("oak_table", () -> new TableBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BENCH = BLOCKS.register
            ("bench", () -> new BenchBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops()));

    //technologic
    public static final RegistryObject<Block> BAREL = BLOCKS.register
            ("barel", () -> new BarelBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops()));
}
