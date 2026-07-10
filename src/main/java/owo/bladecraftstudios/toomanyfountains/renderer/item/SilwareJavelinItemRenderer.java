package owo.bladecraftstudios.toomanyfountains.renderer.item;


import net.minecraft.resources.ResourceLocation;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.items.special.SilwareJavelinItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SilwareJavelinItemRenderer extends GeoItemRenderer<SilwareJavelinItem> {
    public SilwareJavelinItemRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(TooManyFountains.MODID, "silware_javelin")));
    }
}
