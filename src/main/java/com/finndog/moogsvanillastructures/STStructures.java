package com.finndog.moogsvanillastructures;

import com.finndog.moogsvanillastructures.structures.*;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.chunk.StructureConfig;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;

public class STStructures {

    /**
     /**
     * Registers the structure itself and sets what its path is. In this case, the
     * structure will have the Identifier of mvs_tutorial:run_down_house.
     *
     * It is always a good idea to register your Structures so that other mods and datapacks can
     * use them too directly from the registries. It great for mod/datapacks compatibility.
     */
    public static StructureFeature<DefaultFeatureConfig> RUN_DOWN_HOUSE = new RunDownHouseStructure(DefaultFeatureConfig.CODEC);
    public static StructureFeature<DefaultFeatureConfig> HOUSE = new HouseStructure(DefaultFeatureConfig.CODEC);
    public static StructureFeature<DefaultFeatureConfig> BARN = new BarnStructure(DefaultFeatureConfig.CODEC);
    public static StructureFeature<DefaultFeatureConfig> CART = new CartStructure(DefaultFeatureConfig.CODEC);
    public static StructureFeature<DefaultFeatureConfig> SHED = new ShedStructure(DefaultFeatureConfig.CODEC);
    public static StructureFeature<DefaultFeatureConfig> WELL = new WellStructure(DefaultFeatureConfig.CODEC);
    public static StructureFeature<DefaultFeatureConfig> WARPEDHOUSE = new WarpedhouseStructure(DefaultFeatureConfig.CODEC);
    public static StructureFeature<DefaultFeatureConfig> RAREWELL = new RarewellStructure(DefaultFeatureConfig.CODEC);
    public static StructureFeature<DefaultFeatureConfig> CALCITEHOUSE = new CalcitehouseStructure(DefaultFeatureConfig.CODEC);
    public static StructureFeature<DefaultFeatureConfig> DEEPSLATEHOUSE = new DeepslatehouseStructure(DefaultFeatureConfig.CODEC);
    public static StructureFeature<DefaultFeatureConfig> FLOWERHOLE = new FlowerholeStructure(DefaultFeatureConfig.CODEC);
    public static StructureFeature<DefaultFeatureConfig> ISLAND = new IslandStructure(DefaultFeatureConfig.CODEC);



    /**
     * This is where we use Fabric API's structure API to setup the StructureFeature
     * See the comments in below for more details.
     */
    public static void setupAndRegisterStructureFeatures() {

        // This is Fabric API's builder for structures.
        // It has many options to make sure your structure will spawn and work properly.
        // Give it your structure and the identifier you want for it.
        FabricStructureBuilder.create(new Identifier(StructureTutorialMain.MODID, "run_down_house"), RUN_DOWN_HOUSE)

                /* Generation stage for when to generate the structure. there are 10 stages you can pick from!
                   This surface structure stage places the structure before plants and ores are generated. */
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)

                .defaultConfig(new StructureConfig(
                        100, /* average distance apart in chunks between spawn attempts */
                        20, /* minimum distance apart in chunks between spawn attempts. MUST BE LESS THAN ABOVE VALUE */
                        399117345 /* this modifies the seed of the structure so no two structures always spawn over each-other. Make this large and unique. */))

                /* Always set this or else re-entering SuperFlat worldtype will crash.
                   Getting structures to spawn in Superflat is a bit buggy right now so don't focus too much on this. */
                .superflatFeature(RUN_DOWN_HOUSE.configure(FeatureConfig.DEFAULT))

                /*
                 * Whether surrounding land will be modified automatically to conform to the bottom of the structure.
                 * Basically, it adds land at the base of the structure like it does for Villages and Outposts.
                 * Doesn't work well on structure that have pieces stacked vertically or change in heights.
                 *
                 * Note: The air space this method will create will be filled with water if the structure is below sealevel.
                 * This means this is best for structure above sealevel so keep that in mind.
                 */
                .adjustsSurface()

                /* Finally! Now we register our structure and everything above will take effect. */
                .register();

        // Add more structures here and so on
        FabricStructureBuilder.create(new Identifier(StructureTutorialMain.MODID, "house"), HOUSE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        100,
                        20,
                        683091733))
                .superflatFeature(HOUSE.configure(FeatureConfig.DEFAULT))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(StructureTutorialMain.MODID, "barn"), BARN)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        100,
                        20,
                        735841632))
                .superflatFeature(BARN.configure(FeatureConfig.DEFAULT))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(StructureTutorialMain.MODID, "cart"), CART)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        100,
                        20,
                        254679813))
                .superflatFeature(CART.configure(FeatureConfig.DEFAULT))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(StructureTutorialMain.MODID, "shed"), SHED)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        100,
                        20,
                        467985132))
                .superflatFeature(SHED.configure(FeatureConfig.DEFAULT))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(StructureTutorialMain.MODID, "well"), WELL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        100,
                        20,
                        164985236))
                .superflatFeature(WELL.configure(FeatureConfig.DEFAULT))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(StructureTutorialMain.MODID, "warpedhouse"), WARPEDHOUSE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        100,
                        20,
                        134679852))
                .superflatFeature(WARPEDHOUSE.configure(FeatureConfig.DEFAULT))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(StructureTutorialMain.MODID, "rarewell"), RAREWELL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        1000,
                        200,
                        718365434))
                .superflatFeature(RAREWELL.configure(FeatureConfig.DEFAULT))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(StructureTutorialMain.MODID, "calcitehouse"), CALCITEHOUSE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        100,
                        20,
                        147852369))
                .superflatFeature(CALCITEHOUSE.configure(FeatureConfig.DEFAULT))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(StructureTutorialMain.MODID, "deepslatehouse"), DEEPSLATEHOUSE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        100,
                        20,
                        164976435))
                .superflatFeature(DEEPSLATEHOUSE.configure(FeatureConfig.DEFAULT))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(StructureTutorialMain.MODID, "flowerhole"), FLOWERHOLE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        100,
                        20,
                        456852165))
                .superflatFeature(FLOWERHOLE.configure(FeatureConfig.DEFAULT))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(StructureTutorialMain.MODID, "island"), ISLAND)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        50,
                        5,
                        753459852))
                .superflatFeature(ISLAND.configure(FeatureConfig.DEFAULT))
                .adjustsSurface()
                .register();
    }
}
