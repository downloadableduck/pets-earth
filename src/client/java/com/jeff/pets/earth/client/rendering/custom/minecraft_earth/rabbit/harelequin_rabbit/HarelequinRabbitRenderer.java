package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.harelequin_rabbit;

import com.jeff.pets.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.AbstractRabbitRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class HarelequinRabbitRenderer extends AbstractRabbitRenderer {

    public static final ModelLayerLocation HOW_DO_I_SPELL_THIS = Utils.createModelLayer("harelqueuinra_rabbit");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/rabbit/harelequin_rabbit.png");

    public HarelequinRabbitRenderer(EntityRendererProvider.Context context) {
        super(context, HOW_DO_I_SPELL_THIS, TEXTURE);
    }
}
