package com.TBK.better_animation_mob.client.models.dm;

import com.TBK.better_animation_mob.client.models.zombie.ReplacedZombieModel;
import com.infamous.dungeons_mobs.DungeonsMobs;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib3.core.IAnimatable;

@OnlyIn(Dist.CLIENT)
public class ReplacedJungleZombieModel<T extends IAnimatable> extends ReplacedZombieModel<T> {
    @Override
    public ResourceLocation getTextureResource(T object) {
        return new ResourceLocation(DungeonsMobs.MODID,"textures/entity/zombie/jungle_zombie.png");
    }
}
