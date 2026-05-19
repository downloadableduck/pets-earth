package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.moobloom;

import com.jeff.pets.Utils;
import com.jeff.pets.earth.PetsEarth;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.mob.custom.minecraft_earth.cow.MinecraftEarthCow;
import com.jeff.pets.rendering.aprilfools.mooncow.LegacyCowModel;
import com.jeff.pets.rendering.aprilfools.mooncow.MoonCowRenderState;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.AbstractEarthCowRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.CowUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.CustomFlowerLayer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.block.BlockModelResolver;
import net.minecraft.client.renderer.block.model.BlockDisplayContext;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class MoobloomRenderer extends AbstractEarthCowRenderer<LegacyCowModel> {

    public static final ModelLayerLocation MOOBLOOM_LOCATION = new ModelLayerLocation(Utils.withModNamespace("moobloom"), "main");
    private static final Identifier texture = EarthUtils.withModNamespace("textures/entity/minecraft_earth/cow/moobloom.png");
    private final BlockModelResolver resolver;

    public MoobloomRenderer(EntityRendererProvider.Context context) {
        super(context, CowUtils.getInstance().createCowModel(context, MOOBLOOM_LOCATION), texture, MOOBLOOM_LOCATION);
        this.resolver = context.getBlockModelResolver();
        this.addLayer(new CustomFlowerLayer(this));
    }

    @Override
    public void extractRenderState(MinecraftEarthCow cow, MoonCowRenderState state, float f) {
        super.extractRenderState(cow, state, f);
        this.resolver.update(state.flower, PetsEarth.BUTTERCUP.defaultBlockState(), BlockDisplayContext.create());
    }
}
