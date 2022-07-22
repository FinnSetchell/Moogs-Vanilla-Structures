package com.finndog.moogsvanillastructures;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;

public class STConfiguredStructures {
    /**
     * Static instance of our configured structure so we can reference it and add it to biomes easily.
     */
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_RUN_DOWN_HOUSE = STStructures.RUN_DOWN_HOUSE.configure(DefaultFeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_HOUSE = STStructures.HOUSE.configure(DefaultFeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_BARN = STStructures.BARN.configure(DefaultFeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_CART = STStructures.CART.configure(DefaultFeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_SHED = STStructures.SHED.configure(DefaultFeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_WELL = STStructures.WELL.configure(DefaultFeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_WARPEDHOUSE = STStructures.WARPEDHOUSE.configure(DefaultFeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_RAREWELL = STStructures.RAREWELL.configure(DefaultFeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_CALCITEHOUSE = STStructures.CALCITEHOUSE.configure(DefaultFeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_DEEPSLATEHOUSE = STStructures.DEEPSLATEHOUSE.configure(DefaultFeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_FLOWERHOLE = STStructures.FLOWERHOLE.configure(DefaultFeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_ISLAND = STStructures.ISLAND.configure(DefaultFeatureConfig.DEFAULT);



    /**
     * Registers the configured structure which is what gets added to the biomes.
     * You can use the same identifier for the configured structure as the regular structure
     * because the two of them are registered to different registries.
     *
     * We can register configured structures at any time before a world is clicked on and made.
     * But the best time to register configured features by code is honestly to do it in onInitialize.
     */
    public static void registerConfiguredStructures() {
        Registry<ConfiguredStructureFeature<?, ?>> registry = BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE;
        Registry.register(registry, new Identifier(StructureTutorialMain.MODID, "configured_run_down_house"), CONFIGURED_RUN_DOWN_HOUSE);
        Registry.register(registry, new Identifier(StructureTutorialMain.MODID, "configured_house"), CONFIGURED_HOUSE);
        Registry.register(registry, new Identifier(StructureTutorialMain.MODID, "configured_barn"), CONFIGURED_BARN);
        Registry.register(registry, new Identifier(StructureTutorialMain.MODID, "configured_cart"), CONFIGURED_CART);
        Registry.register(registry, new Identifier(StructureTutorialMain.MODID, "configured_shed"), CONFIGURED_SHED);
        Registry.register(registry, new Identifier(StructureTutorialMain.MODID, "configured_well"), CONFIGURED_WELL);
        Registry.register(registry, new Identifier(StructureTutorialMain.MODID, "configured_warpedhouse"), CONFIGURED_WARPEDHOUSE);
        Registry.register(registry, new Identifier(StructureTutorialMain.MODID, "configured_rarewell"), CONFIGURED_RAREWELL);
        Registry.register(registry, new Identifier(StructureTutorialMain.MODID, "configured_calcitehouse"), CONFIGURED_CALCITEHOUSE);
        Registry.register(registry, new Identifier(StructureTutorialMain.MODID, "configured_deepslatehouse"), CONFIGURED_DEEPSLATEHOUSE);
        Registry.register(registry, new Identifier(StructureTutorialMain.MODID, "configured_flowerhole"), CONFIGURED_FLOWERHOLE);
        Registry.register(registry, new Identifier(StructureTutorialMain.MODID, "configured_island"), CONFIGURED_ISLAND);

    }
}
