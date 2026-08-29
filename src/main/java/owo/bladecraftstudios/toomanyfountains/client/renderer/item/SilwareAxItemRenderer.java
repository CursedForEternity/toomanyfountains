package owo.bladecraftstudios.toomanyfountains.client.renderer.item;


import owo.bladecraftstudios.toomanyfountains.core.items.SilwareAxItem;
import owo.bladecraftstudios.toomanyfountains.core.util.UniversalCommon;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SilwareAxItemRenderer extends GeoItemRenderer<SilwareAxItem> {
    public SilwareAxItemRenderer() {
        super(new DefaultedItemGeoModel<>(UniversalCommon.modRL( "silware_ax")));
    }
}
