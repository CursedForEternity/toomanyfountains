package owo.bladecraftstudios.toomanyfountains.server.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;

public class DWStoneBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TooManyFountains.MODID);
    //Stone Variants
    //Slate
    public static final RegistryObject<Block> SLATE_BRICKS = DWBlocks.registerBlock("slate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_SLATE = DWBlocks.registerBlock("polished_slate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOOTH_SLATE = DWBlocks.registerBlock("smooth_slate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLED_SLATE = DWBlocks.registerBlock("cobbled_slate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_SLATE = DWBlocks.registerBlock("chiseled_slate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    //Deepstone
    public static final RegistryObject<Block> DEEPSTONE_BRICKS = DWBlocks.registerBlock("deepstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_DEEPSTONE = DWBlocks.registerBlock("polished_deepstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.POLISHED_DEEPSLATE)));
    public static final RegistryObject<Block> SMOOTH_DEEPSTONE = DWBlocks.registerBlock("smooth_deepstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_DEEPSTONE = DWBlocks.registerBlock("cobbled_deepstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_DEEPSTONE = DWBlocks.registerBlock("chiseled_deepstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
}
