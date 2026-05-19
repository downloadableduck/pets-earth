package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.umbra_cow;

import com.jeff.pets.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.rendering.aprilfools.mooncow.LegacyCowModel;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.AbstractEarthCowRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.CowUtils;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class UmbraCowRenderer extends AbstractEarthCowRenderer<LegacyCowModel> {

    public static final ModelLayerLocation UMBRA_COW_LOCATION = new ModelLayerLocation(Utils.withModNamespace("umbra_cow"), "main");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/cow/umbra_cow.png");

    public UmbraCowRenderer(EntityRendererProvider.Context context) {
        super(context, CowUtils.getInstance().createCowModel(context, UMBRA_COW_LOCATION), TEXTURE, UMBRA_COW_LOCATION);
    }
}
