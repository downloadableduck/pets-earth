package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.vested_rabbit;

import com.jeff.pets.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.AbstractRabbitRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class VestedRabbitRenderer extends AbstractRabbitRenderer {

    public static final ModelLayerLocation VESTED_RABBIT_LOCATION = Utils.createModelLayer("vested_rabbit");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/rabbit/vested_rabbit.png");

    public VestedRabbitRenderer(EntityRendererProvider.Context context) {
        super(context, VESTED_RABBIT_LOCATION, TEXTURE);
    }
}
