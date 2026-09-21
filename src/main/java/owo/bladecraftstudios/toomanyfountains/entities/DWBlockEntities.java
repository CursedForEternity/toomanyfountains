//package owo.bladecraftstudios.toomanyfountains.entities;
//
//import net.minecraft.world.level.block.entity.BlockEntityType;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
//import owo.bladecraftstudios.toomanyfountains.server.blocks.DWWoodBlocks;
//
//
//public class DWBlockEntities {
//    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
//            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TooManyFountains.MODID);
//    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
//            BLOCK_ENTITY.register("mod_sign", () ->
//                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
//                            DWWoodBlocks.FROZEN_OAK_SIGN.get(), DWWoodBlocks.FROZEN_OAK_WALL_SIGN.get()).build(null));
//    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
//            BLOCK_ENTITY.register("mod_hanging_sign", () ->
//                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
//                            DWWoodBlocks.FROZEN_OAK_HANGING_SIGN.get(), DWWoodBlocks.FROZEN_OAK_WALL_HANGING_SIGN.get()).build(null));
//
//    public static void register(IEventBus eventBus) {BLOCK_ENTITIES.register(eventBus);}
//}
