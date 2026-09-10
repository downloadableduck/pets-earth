package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow;

import com.jeff.pets.client.rendering.aprilfools.mooncow.LegacyCowModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class CowUtils {

    public static CowUtils getInstance() {
        return new CowUtils();
    }

    public LegacyCowModel createCowModel(EntityRendererProvider.Context context, ModelLayerLocation location) {
        return new LegacyCowModel(context.bakeLayer(location));
    }

    public CustomCowModel createCustomCowModel(EntityRendererProvider.Context context, ModelLayerLocation location) {
        return new CustomCowModel(context.bakeLayer(location));
    }
}
