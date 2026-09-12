package owo.bladecraftstudios.toomanyfountains.server.registries;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.server.blocks.DWBlocks;
import owo.bladecraftstudios.toomanyfountains.server.blocks.DWColdBlocks;

public class DWFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, TooManyFountains.MODID);

    public static final RegistryObject<FlowingFluid> SOURCE_ARCTIC_WATER = FLUIDS.register("arctic_water_fluid",
            () -> new ForgeFlowingFluid.Source(DWFluids.ARCTIC_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ARCTIC_WATER = FLUIDS.register("flowing_arctic_water",
            () -> new ForgeFlowingFluid.Flowing(DWFluids.ARCTIC_WATER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_SODA = FLUIDS.register("soda_fluid",
            () -> new ForgeFlowingFluid.Source(DWFluids.SODA_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SODA = FLUIDS.register("flowing_soda_fluid",
            () -> new ForgeFlowingFluid.Flowing(DWFluids.SODA_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties ARCTIC_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            DWFluidTypes.ARCTIC_WATER_FLUID_TYPE, SOURCE_ARCTIC_WATER, FLOWING_ARCTIC_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DWBlocks.ARCTIC_WATER).bucket(DWColdBlocks.CRYOLITE_BUCKET);
    public static final ForgeFlowingFluid.Properties SODA_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            DWFluidTypes.SODA_FLUID_TYPE, SOURCE_SODA, FLOWING_SODA)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DWBlocks.SODA).bucket(DWItems.SILWARE_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
