//package owo.bladecraftstudios.toomanyfountains.core.blocks;
//
//import net.minecraft.core.BlockPos;
//import net.minecraft.world.level.block.CeilingHangingSignBlock;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.block.state.properties.WoodType;
//import owo.bladecraftstudios.toomanyfountains.entities.DWBlockEntities;
//import owo.bladecraftstudios.toomanyfountains.entities.ModHangingSignBlockEntity;
//
//public class ModHangingSignBlock extends CeilingHangingSignBlock {
//    public ModHangingSignBlock(Properties pProperties, WoodType pType) {
//        super(pProperties, pType);
//    }
//
//    @Override
//    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
//        return new ModHangingSignBlockEntity(pPos, pState);
//    }
//}
//All the sign stuff dosn't seem to work, and I'm not sure how to properly implament it