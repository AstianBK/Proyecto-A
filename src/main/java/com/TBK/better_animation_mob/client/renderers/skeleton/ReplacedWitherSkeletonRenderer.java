package com.TBK.better_animation_mob.client.renderers.skeleton;

import com.TBK.better_animation_mob.BetterAnimationMob;
import com.TBK.better_animation_mob.client.layers.StrayGeckoLayer;
import com.TBK.better_animation_mob.client.models.skeleton.ReplacedSkeletonModel;
import com.TBK.better_animation_mob.client.models.skeleton.ReplacedWitherSkeletonModel;
import com.TBK.better_animation_mob.server.modbusevent.entity.ReplacedSkeleton;
import com.TBK.better_animation_mob.server.modbusevent.entity.ReplacedWitherSkeleton;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraft.world.entity.monster.WitherSkeleton;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.geo.render.built.GeoModel;

public class ReplacedWitherSkeletonRenderer<T extends WitherSkeleton,P extends ReplacedSkeleton> extends ReplacedSkeletonRenderer<T,P> {
    public ReplacedWitherSkeletonRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ReplacedWitherSkeletonModel<>(), (P) new ReplacedWitherSkeleton(),new ResourceLocation("textures/entity/skeleton/wither_skeleton.png"));
    }

    @Override
    public void render(GeoModel model, Object o, float partialTick, RenderType type, PoseStack poseStack, @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        poseStack.scale(1.2F, 1.2F, 1.2F);
        super.render(model, o, partialTick, type, poseStack, bufferSource, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
