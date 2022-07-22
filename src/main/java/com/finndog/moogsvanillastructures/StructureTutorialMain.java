package com.finndog.moogsvanillastructures;

import com.finndog.moogsvanillastructures.mixin.StructuresConfigAccessor;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.chunk.StructureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.world.biome.BiomeKeys;

import java.util.*;

public class StructureTutorialMain implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "mvs";

    @Override
    @SuppressWarnings("deprecation")
    public void onInitialize() {

        /*
         * We setup and register our structures here.
         * You should always register your stuff to prevent mod compatibility issue down the line.
         */
        com.finndog.moogsvanillastructures.STStructures.setupAndRegisterStructureFeatures();
        com.finndog.moogsvanillastructures.STConfiguredStructures.registerConfiguredStructures();

        /*
         * This is the API you will use to add anything to any biome.
         * This includes spawns, changing the biome's looks, messing with its surfacebuilders,
         * adding carvers, spawning new features... etc
         *
         * Make sure you give this an identifier to make it clear later what mod did a change and why.
         * It'll help people look to see if your mod was removing something from biomes.
         * The biome modifier identifier might also be used by modpacks to disable mod's modifiers too for customization.
         */
        BiomeModifications.create(new Identifier(MODID, "run_down_house_addition"))
                .add(   // Describes what we are doing. Since we are adding a structure, we choose ADDITIONS.
                        ModificationPhase.ADDITIONS,

                        // Add our structure to all biomes including other modded biomes.
                        // You can filter to certain biomes based on stuff like temperature, scale, precipitation, mod id.
                        BiomeSelectors.foundInOverworld(),

                        // context is basically the biome itself. This is where you do the changes to the biome.
                        // Here, we will add our ConfiguredStructureFeature to the biome.
                        context -> {
                            context.getGenerationSettings().addBuiltInStructure(com.finndog.moogsvanillastructures.STConfiguredStructures.CONFIGURED_RUN_DOWN_HOUSE);
                        });

        BiomeModifications.create(new Identifier(MODID, "house_addition"))
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.foundInOverworld(),
                        context -> {
                            context.getGenerationSettings().addBuiltInStructure(com.finndog.moogsvanillastructures.STConfiguredStructures.CONFIGURED_HOUSE);
                        });
        BiomeModifications.create(new Identifier(MODID, "barn_addition"))
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.foundInOverworld(),
                        context -> {
                            context.getGenerationSettings().addBuiltInStructure(com.finndog.moogsvanillastructures.STConfiguredStructures.CONFIGURED_BARN);
                        });
        BiomeModifications.create(new Identifier(MODID, "cart_addition"))
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.foundInOverworld(),
                        context -> {
                            context.getGenerationSettings().addBuiltInStructure(com.finndog.moogsvanillastructures.STConfiguredStructures.CONFIGURED_CART);
                        });
        BiomeModifications.create(new Identifier(MODID, "shed_addition"))
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.foundInOverworld(),
                        context -> {
                            context.getGenerationSettings().addBuiltInStructure(com.finndog.moogsvanillastructures.STConfiguredStructures.CONFIGURED_SHED);
                        });
        BiomeModifications.create(new Identifier(MODID, "well_addition"))
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.foundInOverworld(),
                        context -> {
                            context.getGenerationSettings().addBuiltInStructure(com.finndog.moogsvanillastructures.STConfiguredStructures.CONFIGURED_WELL);
                        });
        BiomeModifications.create(new Identifier(MODID, "warpedhouse_addition"))
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.foundInOverworld(),
                        context -> {
                            context.getGenerationSettings().addBuiltInStructure(com.finndog.moogsvanillastructures.STConfiguredStructures.CONFIGURED_WARPEDHOUSE);
                        });
        BiomeModifications.create(new Identifier(MODID, "rarewell_addition"))
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.includeByKey(Arrays.asList(BiomeKeys.FLOWER_FOREST)),
                        context -> {
                            context.getGenerationSettings().addBuiltInStructure(com.finndog.moogsvanillastructures.STConfiguredStructures.CONFIGURED_RAREWELL);
                        });
        BiomeModifications.create(new Identifier(MODID, "calcitehouse_addition"))
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.foundInOverworld(),
                        context -> {
                            context.getGenerationSettings().addBuiltInStructure(com.finndog.moogsvanillastructures.STConfiguredStructures.CONFIGURED_CALCITEHOUSE);
                        });
        BiomeModifications.create(new Identifier(MODID, "deepslatehouse_addition"))
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.foundInOverworld(),
                        context -> {
                            context.getGenerationSettings().addBuiltInStructure(com.finndog.moogsvanillastructures.STConfiguredStructures.CONFIGURED_DEEPSLATEHOUSE);
                        });
        BiomeModifications.create(new Identifier(MODID, "flowerhole_addition"))
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.includeByKey(Arrays.asList(BiomeKeys.FLOWER_FOREST)),
                        context -> {
                            context.getGenerationSettings().addBuiltInStructure(com.finndog.moogsvanillastructures.STConfiguredStructures.CONFIGURED_FLOWERHOLE);
                        });
        BiomeModifications.create(new Identifier(MODID, "island_addition"))
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.includeByKey(Arrays.asList(BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.DEEP_WARM_OCEAN, BiomeKeys.DEEP_COLD_OCEAN, BiomeKeys.DEEP_FROZEN_OCEAN)),
                        context -> {
                            context.getGenerationSettings().addBuiltInStructure(STConfiguredStructures.CONFIGURED_ISLAND);
                        });
    }


    // This is optional and can be used for blacklisting the structure from dimensions.
    // These two are for making sure our ServerWorldEvents.LOAD event always fires after Fabric API's usage of the same event.
    // This is done so our changes don't get overwritten by Fabric API adding structure spacings to all dimensions.
    // To activate these methods, make this class implement this:
    //    `implements ModInitializer, DedicatedServerModInitializer, ClientModInitializer {`
    // And then go to fabric.mod.json and add this class to a "client" and "server" entry within "entrypoints" section.

    //@Override
    //    public void onInitializeServer() {
    //    removeStructureSpawningFromSelectedDimension();
    //}

    //@Override
    //public void onInitializeClient() {
    //    removeStructureSpawningFromSelectedDimension();
    //}

    /**
     * || OPTIONAL ||
     *  This is optional as Fabric API already adds your structure to all dimension.
     *  But if you want to do dimension based blacklisting, you will need to both
     *  manually remove your structure from the chunkgenerator's structure spacing map.
     * If the spacing or our structure is not added, the structure doesn't spawn in that dimension.
     */
    public static void removeStructureSpawningFromSelectedDimension() {
        // Controls the dimension blacklisting
        ServerWorldEvents.LOAD.register((MinecraftServer minecraftServer, ServerWorld serverWorld)->{

            // Need temp map as some mods use custom chunk generators with immutable maps in themselves.
            Map<StructureFeature<?>, StructureConfig> tempMap = new HashMap<>(serverWorld.getChunkManager().getChunkGenerator().getStructuresConfig().getStructures());

            // Make absolutely sure modded dimension cannot spawn our structures.
            // New dimensions under the minecraft namespace will still get it (datapacks might do this)
            if(!serverWorld.getRegistryKey().getValue().getNamespace().equals("minecraft")) {
                tempMap.keySet().remove(com.finndog.moogsvanillastructures.STStructures.RUN_DOWN_HOUSE);
                tempMap.keySet().remove(com.finndog.moogsvanillastructures.STStructures.HOUSE);
                tempMap.keySet().remove(com.finndog.moogsvanillastructures.STStructures.BARN);
                tempMap.keySet().remove(com.finndog.moogsvanillastructures.STStructures.CART);
                tempMap.keySet().remove(com.finndog.moogsvanillastructures.STStructures.SHED);
                tempMap.keySet().remove(com.finndog.moogsvanillastructures.STStructures.WELL);
                tempMap.keySet().remove(com.finndog.moogsvanillastructures.STStructures.WARPEDHOUSE);
                tempMap.keySet().remove(com.finndog.moogsvanillastructures.STStructures.RAREWELL);
                tempMap.keySet().remove(com.finndog.moogsvanillastructures.STStructures.CALCITEHOUSE);
                tempMap.keySet().remove(com.finndog.moogsvanillastructures.STStructures.DEEPSLATEHOUSE);
                tempMap.keySet().remove(com.finndog.moogsvanillastructures.STStructures.FLOWERHOLE);
                tempMap.keySet().remove(com.finndog.moogsvanillastructures.STStructures.ISLAND);

            }

            // Set the new modified map of structure spacing to the dimension's chunkgenerator.
            ((StructuresConfigAccessor)serverWorld.getChunkManager().getChunkGenerator().getStructuresConfig()).setStructures(tempMap);
        });
    }
}
