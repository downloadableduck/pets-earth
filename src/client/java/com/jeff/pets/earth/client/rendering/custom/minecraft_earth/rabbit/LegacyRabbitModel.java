package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.RabbitRenderState;
import org.jetbrains.annotations.NotNull;

public class LegacyRabbitModel extends EntityModel<@NotNull RabbitRenderState> {

    private final ModelPart backlegs;
    private final ModelPart left_hind_leg;
    private final ModelPart right_hind_leg;
    private final ModelPart haunchLeft;
    private final ModelPart haunchRight;
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart left_ear;
    private final ModelPart right_ear;
    private final ModelPart frontlegs;
    private final ModelPart left_front_leg;
    private final ModelPart right_front_leg;
    private final ModelPart tail;
    private final ModelPart nose;

    public LegacyRabbitModel(ModelPart root) {
        super(root);
        this.backlegs = root.getChild("backlegs");
        this.left_hind_leg = this.backlegs.getChild("left_hind_leg");
        this.right_hind_leg = this.backlegs.getChild("right_hind_leg");
        this.haunchLeft = root.getChild("haunchLeft");
        this.haunchRight = root.getChild("haunchRight");
        this.body = root.getChild("body");
        this.head = this.body.getChild("head");
        this.left_ear = this.head.getChild("left_ear");
        this.right_ear = this.head.getChild("right_ear");
        this.frontlegs = root.getChild("frontlegs");
        this.left_front_leg = this.frontlegs.getChild("left_front_leg");
        this.right_front_leg = this.frontlegs.getChild("right_front_leg");
        this.tail = root.getChild("tail");
        this.nose = root.getChild("nose");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition backlegs = partdefinition.addOrReplaceChild("backlegs", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, -1.0F));

        PartDefinition left_hind_leg = backlegs.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(8, 24).mirror().addBox(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.0F, 1.5F, 4.7F));

        PartDefinition right_hind_leg = backlegs.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(26, 24).mirror().addBox(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.0F, 1.5F, 4.7F));

        PartDefinition haunchLeft = partdefinition.addOrReplaceChild("haunchLeft", CubeListBuilder.create().texOffs(16, 15).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 17.5F, 3.7F, -0.3491F, 0.0F, 0.0F));

        PartDefinition haunchRight = partdefinition.addOrReplaceChild("haunchRight", CubeListBuilder.create().texOffs(30, 15).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 17.5F, 3.7F, -0.3491F, 0.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 19.0F, 8.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-2.5F, -4.342F, -4.0603F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.342F, -9.9397F, 0.3491F, 0.0F, 0.0F));

        PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.342F, 0.9397F, 0.0F, 0.2618F, 0.0F));

        PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-2.5F, -6.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.342F, 0.9397F, 0.0F, -0.2618F, 0.0F));

        PartDefinition frontlegs = partdefinition.addOrReplaceChild("frontlegs", CubeListBuilder.create(), PartPose.offset(0.0F, 19.342F, -1.9397F));

        PartDefinition left_front_leg = frontlegs.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(8, 15).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, -2.342F, 0.9397F, -0.1745F, 0.0F, 0.0F));

        PartDefinition right_front_leg = frontlegs.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -2.342F, 0.9397F, -0.1745F, 0.0F, 0.0F));

        PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(52, 6).mirror().addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 20.0F, 7.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition nose = partdefinition.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(32, 9).mirror().addBox(-0.5F, -2.5F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 16.0F, -1.0F));

        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}