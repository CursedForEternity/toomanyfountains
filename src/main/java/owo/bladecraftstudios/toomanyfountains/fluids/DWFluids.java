package owo.bladecraftstudios.toomanyfountains.fluids;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.blocks.DWBlocks;
import owo.bladecraftstudios.toomanyfountains.items.DWItems;

public class DWFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, TooManyFountains.MODID);


    public static final RegistryObject<FlowingFluid> SOURCE_PURE_DARKNESS = FLUIDS.register("pure_darkness",
            () -> new ForgeFlowingFluid.Source(DWFluids.PURE_DARKNESS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_PURE_DARKNESS = FLUIDS.register("flowing_pure_darkness",
            () -> new ForgeFlowingFluid.Flowing(DWFluids.PURE_DARKNESS_PROPERTIES));

    public static final ForgeFlowingFluid.Properties PURE_DARKNESS_PROPERTIES = new ForgeFlowingFluid.Properties(
            DWFluidRegistry.PURE_DARKNESS, SOURCE_PURE_DARKNESS, FLOWING_PURE_DARKNESS)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DWBlocks.PURE_DARKNESS)
            .bucket(DWItems.EXAMPLE_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
