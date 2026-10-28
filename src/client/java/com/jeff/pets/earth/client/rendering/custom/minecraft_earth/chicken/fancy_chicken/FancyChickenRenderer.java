package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.fancy_chicken;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.mob.vanilla.passive.ClientChicken;
import com.jeff.pets.client.rendering.PetRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.ChickenRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public class FancyChickenRenderer extends PetRenderer<ClientChicken, ChickenRenderState, FancyChickenModel> {

    public static final ModelLayerLocation FANCY_CHICKEN_LOCATION = EarthUtils.createModelLayer("fancy_chicken");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/chicken/fancy_chicken.png");

    public FancyChickenRenderer(EntityRendererProvider.Context context) {
        super(context, new FancyChickenModel(context.bakeLayer(FANCY_CHICKEN_LOCATION)), 0.75f);
    }

    @Override
    public @NotNull ChickenRenderState createRenderState() {
        return new ChickenRenderState();
    }

    @Override
    public @NotNull Identifier getTextureLocation(@NotNull ChickenRenderState state) {
        return TEXTURE;
    }
}
