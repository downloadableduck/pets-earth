package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.jolly_llama;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.mob.vanilla.neutral.ClientLlama;
import com.jeff.pets.client.rendering.PetRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LlamaRenderer;
import net.minecraft.client.renderer.entity.state.LlamaRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.client.Central.CONFIG;

public class JollyLlamaRenderer extends PetRenderer<ClientLlama, LlamaRenderState, JollyLlamaModel> {

    public static final ModelLayerLocation JOLLY_LLAMA_LOCATION = new ModelLayerLocation(Utils.withModNamespace("jolly_llama"), "main");

    public JollyLlamaRenderer(EntityRendererProvider.Context context) {
        super(context, new JollyLlamaModel(context.bakeLayer(JOLLY_LLAMA_LOCATION)), 0.75f);
    }

    @Override
    protected void scale(LlamaRenderState state, @NotNull PoseStack poseStack) {
        if (CONFIG.isBaby) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }
    }

    @Override
    public @NotNull Identifier getTextureLocation(@NotNull LlamaRenderState state) {
        return EarthUtils.withModNamespace("textures/entity/minecraft_earth/jolly_llama.png");
    }

    @Override
    public @NotNull LlamaRenderState createRenderState() {
        return new LlamaRenderState();
    }
}
