package owo.bladecraftstudios.toomanyfountains.server.registries;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.core.fluid.BaseFluidType;
import owo.bladecraftstudios.toomanyfountains.core.util.UniversalCommon;

public class DWFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = UniversalCommon.modRL("block/arctic_water_fluid");
    public static final ResourceLocation WATER_FLOWING_RL = UniversalCommon.modRL("block/flowing_arctic_water");
    public static final ResourceLocation ARCTIC_OVERLAY_RL = UniversalCommon.modRL("misc/in_arctic_water");

public static final DeferredRegister<FluidType> FLUID_TYPES =
        DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TooManyFountains.MODID);

public static final RegistryObject<FluidType> ARCTIC_WATER_FLUID_TYPE = register("arctic_water_fluid",
        FluidType.Properties.create().lightLevel(2).density(15).viscosity(5));

private static RegistryObject<FluidType> register(String name, FluidType.Properties proporties) {
    return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, ARCTIC_OVERLAY_RL,
            0xffffff, new Vector3f(0/255f, 0/255f, 0/255f), proporties));
}

public static void register(IEventBus eventBus){
    FLUID_TYPES.register(eventBus);
}




}
