package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.freckled_rabbit;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.AbstractRabbitRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class FreckledRabbitRenderer extends AbstractRabbitRenderer {

    public static final ModelLayerLocation FRECKLED_RABBIT_LOCATION = Utils.createModelLayer("freckled_rabbit");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/rabbit/freckled_rabbit.png");

    public FreckledRabbitRenderer(EntityRendererProvider.Context context) {
        super(context, FRECKLED_RABBIT_LOCATION, TEXTURE);
    }
}
