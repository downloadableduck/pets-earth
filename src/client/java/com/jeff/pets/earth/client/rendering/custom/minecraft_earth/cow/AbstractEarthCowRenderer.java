package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow;

import com.jeff.pets.earth.mob.custom.minecraft_earth.cow.MinecraftEarthCow;
import com.jeff.pets.client.rendering.PetRenderer;
import com.jeff.pets.client.rendering.aprilfools.mooncow.MoonCowRenderState;
import com.jeff.pets.client.rendering.vanilla.cow.ClientCowModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.client.Central.CONFIG;

public abstract class AbstractEarthCowRenderer<T extends ClientCowModel> extends PetRenderer<MinecraftEarthCow, FlowerRenderState, T> {

    private final ModelLayerLocation location;
    private final Identifier texture;

    public AbstractEarthCowRenderer(EntityRendererProvider.Context context, T model, Identifier identifier, ModelLayerLocation location) {
        super(context, model, 0.75f);
        this.location = location;
        this.texture = identifier;
    }

    @Override
    public @NotNull Identifier getTextureLocation(@NotNull FlowerRenderState state) {
        return texture;
    }

    @Override
    public @NotNull FlowerRenderState createRenderState() {
        return new FlowerRenderState();
    }

    @Override
    protected void scale(FlowerRenderState state, @NotNull PoseStack poseStack) {
        if (CONFIG.isBaby) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }
    }
}
