package owo.bladecraftstudios.toomanyfountains.client.renderer.item;


import owo.bladecraftstudios.toomanyfountains.core.items.SilwareJavelinItem;
import owo.bladecraftstudios.toomanyfountains.core.util.UniversalCommon;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SilwareJavelinItemRenderer extends GeoItemRenderer<SilwareJavelinItem> {
    public SilwareJavelinItemRenderer() {
        super(new DefaultedItemGeoModel<>(UniversalCommon.modRL( "silware_javelin")));
    }
}
