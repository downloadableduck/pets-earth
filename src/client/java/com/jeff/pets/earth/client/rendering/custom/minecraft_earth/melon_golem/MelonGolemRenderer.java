package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.melon_golem;

import com.jeff.pets.Utils;
import com.jeff.pets.earth.PetsEarth;
import com.jeff.pets.mob.vanilla.passive.ClientSnowGolem;
import com.jeff.pets.rendering.PetRenderer;
import net.minecraft.client.model.animal.golem.SnowGolemModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.block.BlockModelRenderState;
import net.minecraft.client.renderer.block.BlockModelResolver;
import net.minecraft.client.renderer.block.model.BlockDisplayContext;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SnowGolemRenderer;
import net.minecraft.client.renderer.entity.layers.BlockDecorationLayer;
import net.minecraft.client.renderer.entity.layers.SnowGolemHeadLayer;
import net.minecraft.client.renderer.entity.state.SnowGolemRenderState;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;


public class MelonGolemRenderer extends PetRenderer<ClientSnowGolem, SnowGolemRenderState, SnowGolemModel> {

    public static final ModelLayerLocation MELON_GOLEM_LOCATION = Utils.createModelLayer("melon_golem");
    private final BlockModelResolver resolver;

    public MelonGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new SnowGolemModel(context.bakeLayer(MELON_GOLEM_LOCATION)), 0.75f);
        this.addLayer(new SnowGolemHeadLayer(this));
        this.resolver = context.getBlockModelResolver();
    }

    @Override
    public @NotNull Identifier getTextureLocation(@NotNull SnowGolemRenderState state) {
        return Identifier.withDefaultNamespace("textures/entity/snow_golem/snow_golem.png");
    }

    @Override
    public @NotNull SnowGolemRenderState createRenderState() {
        return new SnowGolemRenderState();
    }

    @Override
    public void extractRenderState(ClientSnowGolem snowGolem, SnowGolemRenderState state, float f) {
        super.extractRenderState(snowGolem, state, f);
        this.resolver.update(state.headBlock, PetsEarth.MELON_HEAD.defaultBlockState(), BlockDisplayContext.create());
    }
}
