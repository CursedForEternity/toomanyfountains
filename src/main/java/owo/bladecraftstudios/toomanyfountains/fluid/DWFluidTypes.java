package owo.bladecraftstudios.toomanyfountains.fluid;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;

public class DWFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation ARCTIC_OVERLAY_RL = new ResourceLocation(TooManyFountains.MODID,"misc/in_arctic_water");

public static final DeferredRegister<FluidType> FLUID_TYPES =
        DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TooManyFountains.MODID);

public static final RegistryObject<FluidType> ARCTIC_WATER_FLUID_TYPE = register("arctic_water_fluid",
        FluidType.Properties.create().lightLevel(2).density(15).viscosity(5));

private static RegistryObject<FluidType> register(String name, FluidType.Properties proporties) {
    return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, ARCTIC_OVERLAY_RL,
            0X2f1b69, new Vector3f(47f/255f, 27f/255f, 105f/255f), proporties));
}

public static void register(IEventBus eventBus){
    FLUID_TYPES.register(eventBus);
}




}
