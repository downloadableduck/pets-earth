package com.jeff.pets.earth.client;

import com.jeff.pets.Central;
import com.jeff.pets.PetsClientInitializer;
import com.jeff.pets.Utils;
import com.jeff.pets.earth.PetsEarth;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.bone_spider.BoneSpiderRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.albino_cow.AlbinoCowRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.amber_chicken.AmberChickenRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.bronzed_chicken.BronzedChickenRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.cluckshroom.CluckshroomModel;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.cluckshroom.CluckshroomRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.fancy_chicken.FancyChickenModel;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.fancy_chicken.FancyChickenRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.gold_crested_chicken.GoldCrestedChickenRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.midnight_chicken.MidnightChickenRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.skewbald_chicken.SkewbaldChickenRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.stormy_chicken.StormyChickenRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.CustomCowModel;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.ashen_cow.AshenCowRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.cookie_cow.CookieCowRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.cream_cow.CreamCowRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.dairy_cow.DairyCowRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.moobloom.MoobloomRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.moolip.MoolipRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.pinto_cow.PintoCowRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.sunset_cow.SunsetCowRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.umbra_cow.UmbraCowRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.cow.wooly_cow.WoolyCowRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.dyed_cat.DyedCatRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.furnace_golem.FurnaceGolemRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.jolly_llama.JollyLlamaModel;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.jolly_llama.JollyLlamaRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.melon_golem.MelonGolemRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.pig.EarthPigModel;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.pig.mottled_pig.MottledPigRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.pig.muddy_pig.MuddyPigModel;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.pig.muddy_pig.MuddyPigRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.pig.pale_pig.PalePigRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.pig.piebald_pig.PiebaldPigRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.pig.pink_footed_pig.PinkFootedPigRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.pig.sooty_pig.SootyPigRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.pig.spotted_pig.SpottedPigRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.LegacyRabbitModel;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.bold_striped_rabbit.BoldStripedRabbitRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.freckled_rabbit.FreckledRabbitRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.harelequin_rabbit.HarelequinRabbitRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.muddy_foot_rabbit.MuddyFootRabbitRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.vested_rabbit.VestedRabbitRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.sheep.EarthSheepModel;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.sheep.flecked_sheep.FleckedSheepRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.sheep.fuzzy_sheep.FuzzySheepRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.sheep.horned_sheep.HornedSheepModel;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.sheep.horned_sheep.HornedSheepRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.sheep.inky_sheep.InkySheepRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.sheep.long_nosed_sheep.LongNosedSheepRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.sheep.patched_sheep.PatchedSheepRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.sheep.rainbow_sheep.RainbowSheepRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.sheep.rocky_sheep.RockySheepRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.skeleton_wolf.SkeletonWolfRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.tropical_slime.TropicalSlimeOuterLayer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.tropical_slime.TropicalSlimeRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.zombie.bouldering_zombie.BoulderingZombieModel;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.zombie.bouldering_zombie.BoulderingZombieRenderer;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.zombie.lobber_zombie.LobberZombieModel;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.zombie.lobber_zombie.LobberZombieRenderer;
import com.jeff.pets.rendering.aprilfools.mooncow.LegacyCowModel;
import com.jeff.pets.rendering.vanilla.cat.ClientCatRenderer;
import com.jeff.pets.rendering.vanilla.chicken.ClientChickenModel;
import com.jeff.pets.rendering.vanilla.wolf.ClientWolfRenderer;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.model.animal.golem.IronGolemModel;
import net.minecraft.client.model.animal.golem.SnowGolemModel;
import net.minecraft.client.model.monster.slime.SlimeModel;
import net.minecraft.client.model.monster.spider.SpiderModel;

import java.util.Arrays;

import static com.jeff.pets.earth.PetsEarth.MOD_ID;

public class PetsEarthClient implements ClientModInitializer {

    public static EarthConfig EARTH_CONFIG = AutoConfig.register(EarthConfig.class, GsonConfigSerializer::new).getConfig();

	@Override
	public void onInitializeClient() {
        PetsClientInitializer.ADDONS.add(MOD_ID);
        this.checkforNullObjects();
        this.addAllToPetList(Vals.getLowercaseVals());
        this.registerLayers();
	}

    private void checkforNullObjects() {
        EARTH_CONFIG.fleckedSheepName = Utils.checkNullString(EARTH_CONFIG.fleckedSheepName);
        EARTH_CONFIG.fuzzySheepName = Utils.checkNullString(EARTH_CONFIG.fuzzySheepName);
        EARTH_CONFIG.hornedSheepName = Utils.checkNullString(EARTH_CONFIG.hornedSheepName);
        EARTH_CONFIG.inkySheepName = Utils.checkNullString(EARTH_CONFIG.inkySheepName);
        EARTH_CONFIG.longNosedSheepName = Utils.checkNullString(EARTH_CONFIG.longNosedSheepName);
        EARTH_CONFIG.patchedSheepName = Utils.checkNullString(EARTH_CONFIG.patchedSheepName);
        EARTH_CONFIG.rainbowSheepName = Utils.checkNullString(EARTH_CONFIG.rainbowSheepName);
        EARTH_CONFIG.rockySheepName = Utils.checkNullString(EARTH_CONFIG.rockySheepName);

        EARTH_CONFIG.mottledPigName = Utils.checkNullString(EARTH_CONFIG.mottledPigName);
        EARTH_CONFIG.muddyPigName = Utils.checkNullString(EARTH_CONFIG.muddyPigName);
        EARTH_CONFIG.palePigName = Utils.checkNullString(EARTH_CONFIG.palePigName);
        EARTH_CONFIG.piebaldPigName = Utils.checkNullString(EARTH_CONFIG.piebaldPigName);
        EARTH_CONFIG.pinkFootedPigName = Utils.checkNullString(EARTH_CONFIG.pinkFootedPigName);
        EARTH_CONFIG.sootyPigName = Utils.checkNullString(EARTH_CONFIG.sootyPigName);
        EARTH_CONFIG.spottedPigName = Utils.checkNullString(EARTH_CONFIG.spottedPigName);

        EARTH_CONFIG.albinoCowName = Utils.checkNullString(EARTH_CONFIG.albinoCowName);
        EARTH_CONFIG.ashenCowName = Utils.checkNullString(EARTH_CONFIG.ashenCowName);
        EARTH_CONFIG.cookieCowName = Utils.checkNullString(EARTH_CONFIG.cookieCowName);
        EARTH_CONFIG.creamCowName = Utils.checkNullString(EARTH_CONFIG.creamCowName);
        EARTH_CONFIG.dairyCowName = Utils.checkNullString(EARTH_CONFIG.dairyCowName);
        EARTH_CONFIG.moobloomName = Utils.checkNullString(EARTH_CONFIG.moobloomName);
        EARTH_CONFIG.moolipName = Utils.checkNullString(EARTH_CONFIG.moolipName);
        EARTH_CONFIG.pintoCowName = Utils.checkNullString(EARTH_CONFIG.pintoCowName);
        EARTH_CONFIG.sunsetCowName = Utils.checkNullString(EARTH_CONFIG.sunsetCowName);
        EARTH_CONFIG.umbraCowName = Utils.checkNullString(EARTH_CONFIG.umbraCowName);
        EARTH_CONFIG.woolyCowName = Utils.checkNullString(EARTH_CONFIG.woolyCowName);
        EARTH_CONFIG.tropicalSlimeName = Utils.checkNullString(EARTH_CONFIG.tropicalSlimeName);

        EARTH_CONFIG.jollyLlamaName = Utils.checkNullString(EARTH_CONFIG.jollyLlamaName);
        EARTH_CONFIG.dyedCatName = Utils.checkNullString(EARTH_CONFIG.dyedCatName);
        EARTH_CONFIG.furnaceGolemName = Utils.checkNullString(EARTH_CONFIG.furnaceGolemName);

        EARTH_CONFIG.amberChickenName = Utils.checkNullString(EARTH_CONFIG.amberChickenName);
        EARTH_CONFIG.bronzedChickenName = Utils.checkNullString(EARTH_CONFIG.bronzedChickenName);
        EARTH_CONFIG.cluckshroomName = Utils.checkNullString(EARTH_CONFIG.cluckshroomName);
        EARTH_CONFIG.fancyChickenName = Utils.checkNullString(EARTH_CONFIG.fancyChickenName);
        EARTH_CONFIG.goldCrestedChickenName = Utils.checkNullString(EARTH_CONFIG.goldCrestedChickenName);
        EARTH_CONFIG.skewbaldChickenName = Utils.checkNullString(EARTH_CONFIG.skewbaldChickenName);
        EARTH_CONFIG.midnightChickenName = Utils.checkNullString(EARTH_CONFIG.midnightChickenName);
        EARTH_CONFIG.stormyChickenName = Utils.checkNullString(EARTH_CONFIG.stormyChickenName);
        EARTH_CONFIG.boldStripedRabbitName = Utils.checkNullString(EARTH_CONFIG.boldStripedRabbitName);
        EARTH_CONFIG.freckledRabbitName = Utils.checkNullString(EARTH_CONFIG.freckledRabbitName);
        EARTH_CONFIG.harelequinRabbitName = Utils.checkNullString(EARTH_CONFIG.harelequinRabbitName);
        EARTH_CONFIG.muddyFootRabbitName = Utils.checkNullString(EARTH_CONFIG.muddyFootRabbitName);
        EARTH_CONFIG.vestedRabbitName = Utils.checkNullString(EARTH_CONFIG.vestedRabbitName);
        EARTH_CONFIG.melonGolemName = Utils.checkNullString(EARTH_CONFIG.melonGolemName);
        EARTH_CONFIG.boulderingZombieName = Utils.checkNullString(EARTH_CONFIG.boulderingZombieName);
        EARTH_CONFIG.lobberZombieName = Utils.checkNullString(EARTH_CONFIG.lobberZombieName);
        EARTH_CONFIG.skeletonWolfName = Utils.checkNullString(EARTH_CONFIG.skeletonWolfName);
        EARTH_CONFIG.boneSpiderName = Utils.checkNullString(EARTH_CONFIG.boneSpiderName);
    }

    private void registerLayers() {
        EntityRendererRegistry.register(PetsEarth.RAINBOW_SHEEP, RainbowSheepRenderer::new);
        EntityRendererRegistry.register(PetsEarth.FLECKED_SHEEP, FleckedSheepRenderer::new);
        EntityRendererRegistry.register(PetsEarth.FUZZY_SHEEP, FuzzySheepRenderer::new);
        EntityRendererRegistry.register(PetsEarth.HORNED_SHEEP, HornedSheepRenderer::new);
        EntityRendererRegistry.register(PetsEarth.INKY_SHEEP, InkySheepRenderer::new);
        EntityRendererRegistry.register(PetsEarth.LONG_NOSED_SHEEP, LongNosedSheepRenderer::new);
        EntityRendererRegistry.register(PetsEarth.PATCHED_SHEEP, PatchedSheepRenderer::new);
        EntityRendererRegistry.register(PetsEarth.ROCKY_SHEEP, RockySheepRenderer::new);
        EntityRendererRegistry.register(PetsEarth.MOTTLED_PIG, MottledPigRenderer::new);
        EntityRendererRegistry.register(PetsEarth.MUDDY_PIG, MuddyPigRenderer::new);
        EntityRendererRegistry.register(PetsEarth.PALE_PIG, PalePigRenderer::new);
        EntityRendererRegistry.register(PetsEarth.PIEBALD_PIG, PiebaldPigRenderer::new);
        EntityRendererRegistry.register(PetsEarth.PINK_FOOTED_PIG, PinkFootedPigRenderer::new);
        EntityRendererRegistry.register(PetsEarth.SOOTY_PIG, SootyPigRenderer::new);
        EntityRendererRegistry.register(PetsEarth.SPOTTED_PIG, SpottedPigRenderer::new);
        EntityRendererRegistry.register(PetsEarth.MOOBLOOM, MoobloomRenderer::new);
        EntityRendererRegistry.register(PetsEarth.ALBINO_COW, AlbinoCowRenderer::new);
        EntityRendererRegistry.register(PetsEarth.ASHEN_COW, AshenCowRenderer::new);
        EntityRendererRegistry.register(PetsEarth.COOKIE_COW, CookieCowRenderer::new);
        EntityRendererRegistry.register(PetsEarth.CREAM_COW, CreamCowRenderer::new);
        EntityRendererRegistry.register(PetsEarth.DAIRY_COW, DairyCowRenderer::new);
        EntityRendererRegistry.register(PetsEarth.MOOLIP, MoolipRenderer::new);
        EntityRendererRegistry.register(PetsEarth.PINTO_COW, PintoCowRenderer::new);
        EntityRendererRegistry.register(PetsEarth.SUNSET_COW, SunsetCowRenderer::new);
        EntityRendererRegistry.register(PetsEarth.UMBRA_COW, UmbraCowRenderer::new);
        EntityRendererRegistry.register(PetsEarth.WOOLY_COW, WoolyCowRenderer::new);
        EntityRendererRegistry.register(PetsEarth.TROPICAL_SLIME, TropicalSlimeRenderer::new);
        EntityRendererRegistry.register(PetsEarth.JOLLY_LLAMA, JollyLlamaRenderer::new);
        EntityRendererRegistry.register(PetsEarth.DYED_CAT, DyedCatRenderer::new);
        EntityRendererRegistry.register(PetsEarth.FURNACE_GOLEM, FurnaceGolemRenderer::new);
        EntityRendererRegistry.register(PetsEarth.AMBER_CHICKEN, AmberChickenRenderer::new);
        EntityRendererRegistry.register(PetsEarth.BRONZED_CHICKEN, BronzedChickenRenderer::new);
        EntityRendererRegistry.register(PetsEarth.CLUCKSHROOM, CluckshroomRenderer::new);
        EntityRendererRegistry.register(PetsEarth.FANCY_CHICKEN, FancyChickenRenderer::new);
        EntityRendererRegistry.register(PetsEarth.GOLD_CRESTED_CHICKEN, GoldCrestedChickenRenderer::new);
        EntityRendererRegistry.register(PetsEarth.MIDNIGHT_CHICKEN, MidnightChickenRenderer::new);
        EntityRendererRegistry.register(PetsEarth.SKEWBALD_CHICKEN, SkewbaldChickenRenderer::new);
        EntityRendererRegistry.register(PetsEarth.STORMY_CHICKEN, StormyChickenRenderer::new);
        EntityRendererRegistry.register(PetsEarth.BOLD_STRIPED_RABBIT, BoldStripedRabbitRenderer::new);
        EntityRendererRegistry.register(PetsEarth.FRECKLED_RABBIT, FreckledRabbitRenderer::new);
        EntityRendererRegistry.register(PetsEarth.HARELEQUIN_RABBIT, HarelequinRabbitRenderer::new);
        EntityRendererRegistry.register(PetsEarth.MUDDY_FOOT_RABBIT, MuddyFootRabbitRenderer::new);
        EntityRendererRegistry.register(PetsEarth.VESTED_RABBIT, VestedRabbitRenderer::new);
        EntityRendererRegistry.register(PetsEarth.MELON_GOLEM, MelonGolemRenderer::new);
        EntityRendererRegistry.register(PetsEarth.BOULDERING_ZOMBIE, BoulderingZombieRenderer::new);
        EntityRendererRegistry.register(PetsEarth.LOBBER_ZOMBIE, LobberZombieRenderer::new);
        EntityRendererRegistry.register(PetsEarth.SKELETON_WOLF, SkeletonWolfRenderer::new);
        EntityRendererRegistry.register(PetsEarth.BONE_SPIDER, BoneSpiderRenderer::new);

        ModelLayerRegistry.registerModelLayer(RainbowSheepRenderer.RAINBOW_SHEEP_LOCATION, EarthSheepModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(FleckedSheepRenderer.FLECKED_SHEEP_LOCATION, EarthSheepModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(FuzzySheepRenderer.FUZZY_SHEEP_LOCATION, EarthSheepModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(HornedSheepRenderer.HORNED_SHEEP_LOCATION, HornedSheepModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(InkySheepRenderer.INKY_SHEEP_LOCATION, EarthSheepModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(LongNosedSheepRenderer.LONG_NOSED_SHEEP_LOCATION, EarthSheepModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(PatchedSheepRenderer.PATCHED_SHEEP_LOCATION, EarthSheepModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(RockySheepRenderer.ROCKY_SHEEP_LOCATION, EarthSheepModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(MottledPigRenderer.MOTTLED_PIG_LOCATION, EarthPigModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(MuddyPigRenderer.MUDDY_PIG_LOCATION, MuddyPigModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(PalePigRenderer.PALE_PIG_LOCATION, EarthPigModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(PiebaldPigRenderer.PIEBALD_PIG_LOCATION, EarthPigModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(PinkFootedPigRenderer.PINK_FOOTED_PIG_LOCATION, EarthPigModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(SootyPigRenderer.SOOTY_PIG_LOCATION, EarthPigModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(SpottedPigRenderer.SPOTTED_PIG_LOCATION, EarthPigModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(AlbinoCowRenderer.ALBINO_COW_LOCATION, CustomCowModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(AshenCowRenderer.ASHEN_COW_LOCATION, CustomCowModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(CookieCowRenderer.COOKIE_COW_LOCATION, CustomCowModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(CreamCowRenderer.CREAM_COW_LOCATION, LegacyCowModel::createLegacyCowModel);
        ModelLayerRegistry.registerModelLayer(DairyCowRenderer.DAIRY_COW_LOCATION, LegacyCowModel::createLegacyCowModel);
        ModelLayerRegistry.registerModelLayer(MoobloomRenderer.MOOBLOOM_LOCATION, LegacyCowModel::createLegacyCowModel);
        ModelLayerRegistry.registerModelLayer(MoolipRenderer.MOOLIP_LOCATION, LegacyCowModel::createLegacyCowModel);
        ModelLayerRegistry.registerModelLayer(PintoCowRenderer.PINTO_COW_LOCATION, CustomCowModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(SunsetCowRenderer.SUNSET_COW_LOCATION, CustomCowModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(UmbraCowRenderer.UMBRA_COW_LOCATION, LegacyCowModel::createLegacyCowModel);
        ModelLayerRegistry.registerModelLayer(WoolyCowRenderer.WOOLY_COW_LOCATION, LegacyCowModel::createLegacyCowModel);
        ModelLayerRegistry.registerModelLayer(TropicalSlimeRenderer.TROPICAL_SLIME_LOCATION, SlimeModel::createInnerBodyLayer);
        ModelLayerRegistry.registerModelLayer(TropicalSlimeOuterLayer.OUTER_LAYER_LOCATION, SlimeModel::createOuterBodyLayer);
        ModelLayerRegistry.registerModelLayer(JollyLlamaRenderer.JOLLY_LLAMA_LOCATION, JollyLlamaModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(DyedCatRenderer.DYED_CAT_LOCATION, ClientCatRenderer::createCatBodyLayer);
        ModelLayerRegistry.registerModelLayer(FurnaceGolemRenderer.FURNACE_GOLEM_LOCATION, IronGolemModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(AmberChickenRenderer.AMBER_CHICKEN_LOCATION, ClientChickenModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(BronzedChickenRenderer.BRONZED_CHICKEN_LOCATION, ClientChickenModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(CluckshroomRenderer.CLUCKSHROOM_LOCATION, CluckshroomModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(FancyChickenRenderer.FANCY_CHICKEN_LOCATION, FancyChickenModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(GoldCrestedChickenRenderer.GOLD_CRESTED_CHICKEN_LOCATION, ClientChickenModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(MidnightChickenRenderer.MIDNIGHT_CHICKEN_LOCATION, ClientChickenModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(SkewbaldChickenRenderer.SKEWBALD_CHICKEN_RENDERER, ClientChickenModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(StormyChickenRenderer.STORMY_CHICKEN_LOCATION, ClientChickenModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(BoldStripedRabbitRenderer.BOLD_STRIPED_RABBIT_LOCATION, LegacyRabbitModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(FreckledRabbitRenderer.FRECKLED_RABBIT_LOCATION, LegacyRabbitModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(HarelequinRabbitRenderer.HOW_DO_I_SPELL_THIS, LegacyRabbitModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(MuddyFootRabbitRenderer.MUDDY_FOOT_RABBIT_LOCATION, LegacyRabbitModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(VestedRabbitRenderer.VESTED_RABBIT_LOCATION, LegacyRabbitModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(MelonGolemRenderer.MELON_GOLEM_LOCATION, SnowGolemModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(BoulderingZombieRenderer.BOULDERING_ZOMBIE_LOCATION, BoulderingZombieModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(LobberZombieRenderer.LOBBER_ZOMBIE_LOCATION, LobberZombieModel::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(SkeletonWolfRenderer.SKELETON_WOLF_LOCATION, ClientWolfRenderer::createBodyLayer);
        ModelLayerRegistry.registerModelLayer(BoneSpiderRenderer.BONE_SPIDER_LOCATION, SpiderModel::createSpiderBodyLayer);
    }

    private void addAllToPetList(String ... s) {
        Central.PETS_LIST.addAll(Arrays.asList(s));
    }
}