package net.dorianpb.cem.external;

import net.dorianpb.cem.external.renderers.*;
import net.dorianpb.cem.internal.api.CemEntityInitializer;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;

public class CemEntitiesInit extends CemEntityInitializer{
	@Override
	public void onInit(){
		register(EntityType.PIGLIN, (ctx) -> new CemPiglinRenderer(ctx, EntityType.PIGLIN));
		register(EntityType.PIGLIN_BRUTE, (ctx) -> new CemPiglinRenderer(ctx, EntityType.PIGLIN_BRUTE));
		register(EntityType.ZOMBIFIED_PIGLIN, (ctx) -> new CemPiglinRenderer(ctx, EntityType.ZOMBIFIED_PIGLIN));
		register(EntityType.ENDERMAN, CemEndermanRenderer::new);
		register(EntityType.CREEPER, CemCreeperRenderer::new);
		register("creeper_charge");
		register(EntityType.CAT, CemCatRenderer::new);
		register(EntityType.BLAZE, CemBlazeRenderer::new);
		register(EntityType.ARMOR_STAND, CemArmorStandRenderer::new);
		register(EntityType.OCELOT, CemOcelotRenderer::new);
		register(EntityType.BAT, CemBatRenderer::new);
		register(EntityType.BEE, CemBeeRenderer::new);
		register(EntityType.SILVERFISH, CemSilverfishRenderer::new);
		register(EntityType.PARROT, CemParrotRenderer::new);
		register(EntityType.CHICKEN, CemChickenRenderer::new);
		register(EntityType.COW, CemCowRenderer::new);
		register(EntityType.RAVAGER, CemRavagerRenderer::new);
		register(EntityType.HOGLIN, CemHoglinRenderer::new);
		register(EntityType.ZOGLIN, CemZoglinRenderer::new);
		register(EntityType.SHEEP, CemSheepRenderer::new);
		register("sheep_wool");
		register(EntityType.PIG, CemPigRenderer::new);
		register(EntityType.STRIDER, CemStriderRenderer::new);
		register(EntityType.TURTLE, CemTurtleRenderer::new);
		register(EntityType.LLAMA, (ctx) -> new CemLlamaRenderer(ctx, EntityType.LLAMA));
		register(EntityType.TRADER_LLAMA, (ctx) -> new CemTraderLlamaRenderer(ctx, EntityType.TRADER_LLAMA));
		register(BlockEntityType.BANNER, CemBannerRenderer::new);
		register(EntityType.MOOSHROOM, CemMooshroomRenderer::new);
		register(EntityType.ZOMBIE, CemZombieRenderer::new);
		register(EntityType.HUSK, CemHuskZombieRenderer::new);
		register(EntityType.DROWNED, CemDrownedZombieRenderer::new);
		register("drowned_outer");
		register(EntityType.SKELETON, CemSkeletonRenderer::new);
		register(EntityType.WITHER_SKELETON, CemWitherSkeletonRenderer::new);
		register(EntityType.STRAY, CemStraySkeletonRenderer::new);
		register("stray_outer");
		register(EntityType.PILLAGER, CemPillagerRenderer::new);
		register(EntityType.VINDICATOR, CemVindicatorRenderer::new);
		register(EntityType.EVOKER, CemEvokerRenderer::new);
		register(EntityType.ILLUSIONER, CemIllusionerRenderer::new);
		register(EntityType.FOX, CemFoxRenderer::new);
		register(EntityType.SLIME, CemSlimeRenderer::new);
		register("slime_gel");
		register(EntityType.MAGMA_CUBE, CemMagmaCubeRenderer::new);
		register(EntityType.SPIDER, CemSpiderRenderer::new);
		register(EntityType.CAVE_SPIDER, CemCaveSpiderRenderer::new);
		register(EntityType.VILLAGER, CemVillagerRenderer::new);
		register(EntityType.WANDERING_TRADER, CemWanderingTraderRenderer::new);
		register(EntityType.ZOMBIE_VILLAGER, CemZombieVillagerRenderer::new);
		register(EntityType.RABBIT, CemRabbitRenderer::new);
		register(EntityType.VEX, CemVexRenderer::new);
		register(EntityType.GIANT, CemGiantZombieRenderer::new);
		register(EntityType.WOLF, CemWolfRenderer::new);
		register(EntityType.MINECART, (ctx) -> new CemMinecartRenderer(ctx, EntityType.MINECART));
		register(EntityType.CHEST_MINECART, (ctx) -> new CemMinecartRenderer(ctx, EntityType.CHEST_MINECART));
		register(EntityType.COMMAND_BLOCK_MINECART, (ctx) -> new CemMinecartRenderer(ctx, EntityType.COMMAND_BLOCK_MINECART));
		register(EntityType.FURNACE_MINECART, (ctx) -> new CemMinecartRenderer(ctx, EntityType.FURNACE_MINECART));
		register(EntityType.HOPPER_MINECART, (ctx) -> new CemMinecartRenderer(ctx, EntityType.HOPPER_MINECART));
		register(EntityType.SPAWNER_MINECART, (ctx) -> new CemMinecartRenderer(ctx, EntityType.SPAWNER_MINECART));
		register(EntityType.TNT_MINECART, CemTntMinecartRenderer::new);
		register(EntityType.GUARDIAN, CemGuardianRenderer::new);
		register(EntityType.ELDER_GUARDIAN, CemElderGuardianRenderer::new);
		register(EntityType.ENDER_DRAGON, CemEnderDragonRenderer::new);
		register(EntityType.HORSE, CemHorseRenderer::new);
		register(EntityType.DONKEY, (ctx) -> new CemDonkeyRenderer(ctx, 1.0F, EntityModelLayers.DONKEY));
		register(EntityType.MULE, (ctx) -> new CemDonkeyRenderer(ctx, 1.0F, EntityModelLayers.MULE));
		register(EntityType.ZOMBIE_HORSE, (ctx) -> new CemUndeadHorseRenderer(ctx, EntityType.ZOMBIE_HORSE));
		register(EntityType.SKELETON_HORSE, (ctx) -> new CemUndeadHorseRenderer(ctx, EntityType.SKELETON_HORSE));
		register(EntityType.WITCH, CemWitchRenderer::new);
		register(EntityType.IRON_GOLEM, CemIronGolemRenderer::new);
		register(EntityType.PHANTOM, CemPhantomRenderer::new);
		register(EntityType.GHAST, CemGhastRenderer::new);
		register(EntityType.SALMON, CemSalmonRenderer::new);
		register(EntityType.DOLPHIN, CemDolphinRenderer::new);
		register(EntityType.TRIDENT, CemTridentRenderer::new);
	}
}