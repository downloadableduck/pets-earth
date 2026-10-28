package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.bone_spider;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.mob.vanilla.neutral.ClientSpider;
import com.jeff.pets.client.rendering.PetRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.monster.spider.SpiderModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.state.SlimeRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public class BoneSpiderRenderer extends PetRenderer<ClientSpider, LivingEntityRenderState, SpiderModel> {

    public static final ModelLayerLocation BONE_SPIDER_LOCATION = EarthUtils.createModelLayer("bone_spider");
    public BoneSpiderRenderer(EntityRendererProvider.Context context) {
        super(context, new SpiderModel(context.bakeLayer(BONE_SPIDER_LOCATION)), 0.75f);
    }

    @Override
    public Identifier getTextureLocation(@NotNull LivingEntityRenderState state) {
        return EarthUtils.withModNamespace("textures/entity/minecraft_earth/bone_spider.png");
    }

    @Override
    public @NotNull LivingEntityRenderState createRenderState() {
        return new LivingEntityRenderState();
    }
}
