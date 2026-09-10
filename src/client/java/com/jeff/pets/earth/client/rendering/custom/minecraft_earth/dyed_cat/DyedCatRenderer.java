package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.dyed_cat;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.mob.vanilla.passive.ClientCat;
import com.jeff.pets.client.rendering.PetRenderer;
import com.jeff.pets.client.rendering.vanilla.cat.ClientCatModel;
import com.jeff.pets.client.rendering.vanilla.cat.ClientCatRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.CatRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.client.Central.CONFIG;


public class DyedCatRenderer extends PetRenderer<ClientCat, CatRenderState, ClientCatModel> {

    public static final ModelLayerLocation DYED_CAT_LOCATION = new ModelLayerLocation(Utils.withModNamespace("dyed_cat"), "main");

    public DyedCatRenderer(EntityRendererProvider.Context context) {
        super(context, new ClientCatModel(context.bakeLayer(ModelLayers.CAT)), 0.75f);
    }

    @Override
    protected void scale(CatRenderState state, @NotNull PoseStack poseStack) {
        if (CONFIG.isBaby) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }
    }

    @Override
    public @NotNull Identifier getTextureLocation(@NotNull CatRenderState state) {
        return EarthUtils.withModNamespace("textures/entity/minecraft_earth/dyed_cat.png");
    }

    @Override
    public @NotNull CatRenderState createRenderState() {
        return new CatRenderState();
    }
}
