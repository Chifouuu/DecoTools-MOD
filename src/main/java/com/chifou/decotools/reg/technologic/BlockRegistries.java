package com.chifou.decotools.reg.technologic;

import com.chifou.decotools.models.inware.BarelBlock;
import com.chifou.decotools.models.inware.BenchBlock;
import com.chifou.decotools.models.inware.ChairBlock;
import com.chifou.decotools.models.inware.TableBlock;
import com.chifou.decotools.models.technologic.ComputerBlock;
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


    //technologic
    public static final RegistryObject<Block> LAPTOP = BLOCKS.register
            ("laptop", () -> new LaptopBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SCREEN = BLOCKS.register
            ("screen", () -> new ScreenBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LEFT_SCREEN = BLOCKS.register
            ("left_screen", () -> new ScreenBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RIGHT_SCREEN = BLOCKS.register
            ("right_screen", () -> new ScreenBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COMPUTER = BLOCKS.register
            ("computer", () -> new ComputerBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops()));
}
