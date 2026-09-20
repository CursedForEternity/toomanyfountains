package owo.bladecraftstudios.toomanyfountains.server.registries;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.core.fluid.ArcticWaterType;
import owo.bladecraftstudios.toomanyfountains.core.fluid.BaseFluidType;
import owo.bladecraftstudios.toomanyfountains.core.util.UniversalCommon;

public class DWFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = UniversalCommon.modRL("block/arctic_water_fluid");
    public static final ResourceLocation WATER_FLOWING_RL = UniversalCommon.modRL("block/flowing_arctic_water");
    public static final ResourceLocation ARCTIC_OVERLAY_RL = UniversalCommon.modRL("misc/in_arctic_water");
    public static final ResourceLocation SODA_STILL_RL = UniversalCommon.modRL("block/soda_fluid");
    public static final ResourceLocation SODA_FLOWING_RL = UniversalCommon.modRL("block/soda_flowing");
    public static final ResourceLocation SODA_OVERLAY_RL = UniversalCommon.modRL("block/soda_fluid");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TooManyFountains.MODID);


    public static final RegistryObject<FluidType> ARCTIC_WATER_FLUID_TYPE = registerFluidType("arctic_water_fluid",
        new ArcticWaterType(WATER_STILL_RL, WATER_FLOWING_RL, ARCTIC_OVERLAY_RL, 0xFFFFFFFF,
                new Vector3f(21f / 255f, 18f / 255f, 38f / 255f),
                FluidType.Properties.create().lightLevel(2).viscosity(5).density(15).canExtinguish(true)
                        .canHydrate(true).canConvertToSource(true)));

    public static final RegistryObject<FluidType> SODA_FLUID_TYPE = registerFluidType("soda_fluid",
            new ArcticWaterType(SODA_STILL_RL, SODA_FLOWING_RL, SODA_OVERLAY_RL, 0xFFFFFFFF,
                    new Vector3f(21f / 255f, 18f / 255f, 38f / 255f),
                    FluidType.Properties.create().lightLevel(0).viscosity(9).density(12).canExtinguish(true)
                            .canHydrate(true).canConvertToSource(true)));

    private static RegistryObject<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

public static void register(IEventBus eventBus){
    FLUID_TYPES.register(eventBus);
}




}
