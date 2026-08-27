package owo.bladecraftstudios.toomanyfountains.fluids;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.fluids.fluid.PureDarknessFluidType;

public class DWFluidRegistry {
    public static final ResourceLocation PURE_DARKNESS_STILL = new ResourceLocation(TooManyFountains.MODID, "block/pure_darkness_still");
    public static final ResourceLocation PURE_DARKNESS_FLOW = new ResourceLocation(TooManyFountains.MODID, "block/pure_darkness_flow");
    public static final ResourceLocation PURE_DARKNESS_OVERLAY = new ResourceLocation(TooManyFountains.MODID, "misc/pure_darkness_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TooManyFountains.MODID);

    public static final RegistryObject<FluidType> PURE_DARKNESS = registerFluidType("pure_darkness",
            new PureDarknessFluidType(PURE_DARKNESS_STILL, PURE_DARKNESS_FLOW, PURE_DARKNESS_OVERLAY, 0xFFFFFFFF,
                    new Vector3f(21f / 255f, 18f / 255f, 38f / 255f),
                    FluidType.Properties.create().lightLevel(15).viscosity(7).density(14).canExtinguish(true)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                            .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    private static RegistryObject<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }

}
