package gregicadditions;

import com.google.common.collect.ImmutableList;
import gregicadditions.item.BasicMaterial;
import gregtech.api.unification.Element;
import gregtech.api.unification.material.MaterialIconSet;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.type.*;
import gregtech.api.unification.stack.MaterialStack;

public class GAMaterials {
    public static DustMaterial Brick;
    public static DustMaterial Fireclay;
    public static GemMaterial Coke;
    public static DustMaterial PhosphorousPentoxide;
    public static FluidMaterial PhosphoricAcid;
    public static FluidMaterial PolyvinylAcetate;
    public static FluidMaterial Phenol;
    public static FluidMaterial BisphenolA;
    public static IngotMaterial ReinforcedEpoxyResin;
    public static IngotMaterial BorosilicateGlass;
    public static IngotMaterial PolyvinylChloride;
    public static FluidMaterial VinylChloride;
    public static FluidMaterial Ethylene;
    public static FluidMaterial CharcoalByproducts;
    public static FluidMaterial Benzene;
    public static FluidMaterial WoodGas;
    public static FluidMaterial WoodVinegar;
    public static FluidMaterial WoodTar;
    public static DustMaterial SodiumHydroxide;
    public static DustMaterial Quicklime;
    public static FluidMaterial Acetone;
    public static FluidMaterial SulfurTrioxide;
    public static FluidMaterial SulfurDioxide;
    public static FluidMaterial Glycerol;
    public static FluidMaterial FishOil;
    public static FluidMaterial Methanol;
    public static FluidMaterial CarbonMonoxde;
    public static FluidMaterial DilutedSulfuricAcid;
    public static DustMaterial SodiumBisulfate;
    public static FluidMaterial Chloroform;
    public static FluidMaterial DilutedHydrochloricAcid;
    public static FluidMaterial HypochlorousAcid;
    public static FluidMaterial Ammonia;
    public static FluidMaterial Chloramine;
    public static FluidMaterial Dimethylamine;
    public static FluidMaterial Dimethylhydrazine;
    public static FluidMaterial RocketFuel;
    public static FluidMaterial DinitrogenTetroxide;
    public static IngotMaterial SiliconeRubber;
    public static DustMaterial Polydimethylsiloxane;
    public static FluidMaterial Dimethyldichlorosilane;
    public static FluidMaterial Styrene;
    public static IngotMaterial Polystyrene;
    public static FluidMaterial Butadiene;
    public static DustMaterial RawStyreneButadieneRubber;
    public static IngotMaterial StyreneButadieneRubber;
    public static FluidMaterial Dichlorobenzene;
    public static FluidMaterial HydrochloricAcid;
    public static FluidMaterial AceticAcid;
    public static FluidMaterial FermentedBiomass;
    public static DustMaterial Potash;
    public static DustMaterial SodaAsh;
    public static FluidMaterial HydrofluoricAcid;
    public static FluidMaterial NitricOxide;
    public static FluidMaterial MethylAcetate;
    public static FluidMaterial Ethenone;
    public static FluidMaterial Tetranitromethane;
    public static FluidMaterial BioDiesel;
    public static FluidMaterial RawGrowthMedium;
    public static FluidMaterial SterilizedGrowthMedium;
    public static DustMaterial Meat;
    public static FluidMaterial VinylAcetate;
    public static IngotMaterial GalliumArsenide;
    public static IngotMaterial PolyphenyleneSulfide;
    public static FluidMaterial NickelSulfateSolution;
    public static FluidMaterial BlueVitriolSolution;
    public static FluidMaterial Propane;
    public static FluidMaterial Propene;
    public static FluidMaterial Ethane;
    public static FluidMaterial Butene;
    public static FluidMaterial Butane;
    public static FluidMaterial CalciumAcetate;
    public static FluidMaterial Cumene;
    public static IngotMaterial IndiumGalliumPhosphide;
    public static DustMaterial PlatinumGroupSludge;
    public static DustMaterial FerriteMixture;
    public static IngotMaterial NickelZincFerrite;
    public static FluidMaterial IndiumConcentrate;
    public static FluidMaterial LeadZincSolution;
    public static FluidMaterial Tetrafluoroethylene;
    public static FluidMaterial SaltWater;
    public static FluidMaterial HydroCrackedEthane;
    public static FluidMaterial HydroCrackedEthylene;
    public static FluidMaterial HydroCrackedPropene;
    public static FluidMaterial HydroCrackedLightFuel;
    public static FluidMaterial HydroCrackedPropane;
    public static FluidMaterial HydroCrackedButane;
    public static FluidMaterial HydroCrackedNaphtha;
    public static FluidMaterial HydroCrackedHeavyFuel;
    public static FluidMaterial HydroCrackedGas;
    public static FluidMaterial HydroCrackedButene;
    public static FluidMaterial HydroCrackedButadiene;
    public static FluidMaterial SteamCrackedEthane;
    public static FluidMaterial SteamCrackedEthylene;
    public static FluidMaterial SteamCrackedPropene;
    public static FluidMaterial SteamCrackedPropane;
    public static FluidMaterial SteamCrackedButane;
    public static FluidMaterial SteamCrackedNaphtha;
    public static FluidMaterial SteamCrackedGas;
    public static FluidMaterial SteamCrackedButene;
    public static FluidMaterial SteamCrackedButadiene;
    public static FluidMaterial BioGas;
    public static FluidMaterial Chloromethane;
    public static FluidMaterial AllylChloride;
    public static FluidMaterial Isoprene;
    public static DustMaterial Massicot;
    public static DustMaterial AntimonyTrioxide;
    public static DustMaterial Zincite;
    public static DustMaterial CobaltOxide;
    public static DustMaterial ArsenicTrioxide;
    public static DustMaterial CupricOxide;
    public static DustMaterial Ferrosilite;
    public static DustMaterial Magnesia;
    public static DustMaterial GASodiumSulfide;
    public static FluidMaterial NeutralMatter;
    public static FluidMaterial PositiveMatter;
    public static IngotMaterial Neutronium;
    public static Material Extreme = new MarkerMaterial("extreme");
    public static Material Infinite = new MarkerMaterial("infinite");
    public static BasicMaterial Ultimate;
    public static BasicMaterial Superconductor;

    static {
        long STD_SOLID = DustMaterial.MatFlags.GENERATE_PLATE |
                gregtech.api.unification.material.type.SolidMaterial.MatFlags.GENERATE_ROD |
                gregtech.api.unification.material.type.IngotMaterial.MatFlags.GENERATE_BOLT_SCREW;
        long STD_GEM = DustMaterial.MatFlags.GENERATE_ORE | STD_SOLID |
                gregtech.api.unification.material.type.GemMaterial.MatFlags.GENERATE_LENSE;
        long STD_METAL = DustMaterial.MatFlags.GENERATE_PLATE;
        long EXT_METAL = STD_METAL | gregtech.api.unification.material.type.SolidMaterial.MatFlags.GENERATE_ROD |
                gregtech.api.unification.material.type.IngotMaterial.MatFlags.GENERATE_BOLT_SCREW;
        long EXT2_METAL = EXT_METAL | gregtech.api.unification.material.type.SolidMaterial.MatFlags.GENERATE_GEAR |
                gregtech.api.unification.material.type.IngotMaterial.MatFlags.GENERATE_FOIL |
                gregtech.api.unification.material.type.IngotMaterial.MatFlags.GENERATE_FINE_WIRE;

        Brick = new DustMaterial(999, "brick", 12016192, MaterialIconSet.ROUGH, 1, ImmutableList.of(new MaterialStack(Materials.Aluminium, 4), new MaterialStack(Materials.Silicon, 3), new MaterialStack(Materials.Oxygen, 12)), Material.MatFlags.DISABLE_DECOMPOSITION | DustMaterial.MatFlags.EXCLUDE_BLOCK_CRAFTING_RECIPES);
        Fireclay = new DustMaterial(998, "fireclay", 9601139, MaterialIconSet.ROUGH, 1, ImmutableList.of(new MaterialStack(Materials.Clay, 1), new MaterialStack(Brick, 1)), Material.MatFlags.DISABLE_DECOMPOSITION | DustMaterial.MatFlags.EXCLUDE_BLOCK_CRAFTING_RECIPES);
        Coke = new GemMaterial(997, "coke", 7303040, MaterialIconSet.valueOf("COKE"), 1, ImmutableList.of(new MaterialStack(Materials.Carbon, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING | SolidMaterial.MatFlags.MORTAR_GRINDABLE | Material.MatFlags.FLAMMABLE | DustMaterial.MatFlags.NO_SMELTING | DustMaterial.MatFlags.NO_SMASHING);
        Coke.setBurnTime(3200);
        PhosphorousPentoxide = new DustMaterial(996, "phosphorous_pentoxide", 8158464, MaterialIconSet.DULL, 1, ImmutableList.of(new MaterialStack(Materials.Phosphorus, 4), new MaterialStack(Materials.Oxygen, 10)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        PhosphoricAcid = new FluidMaterial(995, "phosphoric_acid", 11447824, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Hydrogen, 3), new MaterialStack(Materials.Phosphorus, 4)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        PolyvinylAcetate = new FluidMaterial(994, "polyvinyl_acetate", 13139532, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 4), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Oxygen, 2)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        Phenol = new FluidMaterial(993, "phenol", 6635559, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 6), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Oxygen, 1)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        BisphenolA = new FluidMaterial(992, "bisphenol_a", 10848014, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 15), new MaterialStack(Materials.Hydrogen, 16), new MaterialStack(Materials.Oxygen, 2)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        ReinforcedEpoxyResin = new IngotMaterial(991, "reinforced_epoxy_resin", 7491595, MaterialIconSet.DULL, 1, ImmutableList.of(new MaterialStack(Materials.Carbon, 6), new MaterialStack(Materials.Hydrogen, 4), new MaterialStack(Materials.Oxygen, 1)), DustMaterial.MatFlags.GENERATE_PLATE, (Element) null, 6.0F, 64);
        BorosilicateGlass = new IngotMaterial(990, "borosilicate_glass", 13424588, MaterialIconSet.METALLIC, 1, ImmutableList.of(new MaterialStack(Materials.Boron, 1), new MaterialStack(Materials.SiliconDioxide, 7)), Material.MatFlags.DECOMPOSITION_BY_CENTRIFUGING);
        PolyvinylChloride = new IngotMaterial(989, "polyvinyl_chloride", 10069156, MaterialIconSet.DULL, 1, ImmutableList.of(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 3), new MaterialStack(Materials.Chlorine, 1)), EXT_METAL | IngotMaterial.MatFlags.GENERATE_FOIL);
        VinylChloride = new FluidMaterial(988, "vinyl_chloride", 11582395, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 3), new MaterialStack(Materials.Chlorine, 1)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Ethylene = new FluidMaterial(987, "ethylene", 11382189, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 4)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        CharcoalByproducts = new FluidMaterial(986, "charcoal_byproducts", 6701095, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        Benzene = new FluidMaterial(985, "benzene", 2039583, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 6), new MaterialStack(Materials.Hydrogen, 6)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        WoodGas = new FluidMaterial(984, "wood_gas", 11642225, MaterialIconSet.GAS, ImmutableList.of(), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DISABLE_DECOMPOSITION);
        WoodVinegar = new FluidMaterial(983, "wood_vinegar", 10832655, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        WoodTar = new FluidMaterial(982, "wood_tar", 2957592, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        SodiumHydroxide = new DustMaterial(981, "sodium_hydroxide", 6466, MaterialIconSet.DULL, 1, ImmutableList.of(new MaterialStack(Materials.Sodium, 1), new MaterialStack(Materials.Oxygen, 1), new MaterialStack(Materials.Hydrogen, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Quicklime = new DustMaterial(980, "quicklime", 8421504, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Calcium, 1), new MaterialStack(Materials.Oxygen, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Acetone = new FluidMaterial(979, "acetone", 9342606, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 3), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Oxygen, 1)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        SulfurTrioxide = new FluidMaterial(978, "sulfur_trioxide", 8618781, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Sulfur, 1), new MaterialStack(Materials.Oxygen, 3)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        SulfurDioxide = new FluidMaterial(977, "sulfur_dioxide", 10263584, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Sulfur, 1), new MaterialStack(Materials.Oxygen, 2)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Glycerol = new FluidMaterial(976, "glycerol", 7384944, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 3), new MaterialStack(Materials.Hydrogen, 8), new MaterialStack(Materials.Oxygen, 3)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        FishOil = new FluidMaterial(975, "fish_oil", 14467421, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        Methanol = new FluidMaterial(974, "methanol", 8941584, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 1), new MaterialStack(Materials.Hydrogen, 4), new MaterialStack(Materials.Oxygen, 1)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        CarbonMonoxde = new FluidMaterial(973, "carbon_monoxide", 1655660, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Carbon, 1), new MaterialStack(Materials.Oxygen, 1)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Neutronium = new IngotMaterial(972, "neutronium", 12829635, MaterialIconSet.METALLIC, 6, ImmutableList.of(), EXT2_METAL | gregtech.api.unification.material.type.IngotMaterial.MatFlags.GENERATE_RING | gregtech.api.unification.material.type.IngotMaterial.MatFlags.GENERATE_ROTOR | gregtech.api.unification.material.type.IngotMaterial.MatFlags.GENERATE_SMALL_GEAR | gregtech.api.unification.material.type.SolidMaterial.MatFlags.GENERATE_LONG_ROD, Element.valueOf("Nt"), 24.0F, 655360);
        DilutedSulfuricAcid = new FluidMaterial(971, "diluted_sulfuric_acid", 9987366, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Hydrogen, 2), new MaterialStack(Materials.Sulfur, 1), new MaterialStack(Materials.Oxygen, 4)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        SodiumBisulfate = new DustMaterial(970, "sodium_bisulfate", 10291, MaterialIconSet.DULL, 1, ImmutableList.of(new MaterialStack(Materials.Sodium, 1), new MaterialStack(Materials.Hydrogen, 1), new MaterialStack(Materials.Sulfur, 1), new MaterialStack(Materials.Oxygen, 4)), Material.MatFlags.DISABLE_DECOMPOSITION);
        Chloroform = new FluidMaterial(969, "chloroform", 7351936, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 1), new MaterialStack(Materials.Hydrogen, 1), new MaterialStack(Materials.Chlorine, 3)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        DilutedHydrochloricAcid = new FluidMaterial(968, "diluted_hydrochloric_acid", 8160900, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Hydrogen, 1), new MaterialStack(Materials.Chlorine, 1)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        HypochlorousAcid = new FluidMaterial(967, "hypochlorous_acid", 6123637, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Hydrogen, 1), new MaterialStack(Materials.Chlorine, 1), new MaterialStack(Materials.Oxygen, 1)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Ammonia = new FluidMaterial(966, "ammonia", 4011371, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Nitrogen, 1), new MaterialStack(Materials.Hydrogen, 3)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Chloramine = new FluidMaterial(965, "chloramine", 4031340, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Nitrogen, 1), new MaterialStack(Materials.Hydrogen, 2), new MaterialStack(Materials.Chlorine, 1)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Dimethylamine = new FluidMaterial(964, "dimethylamine", 4931417, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 7), new MaterialStack(Materials.Nitrogen, 1)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Dimethylhydrazine = new FluidMaterial(963, "dimethylhidrazine", 1052748, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 8), new MaterialStack(Materials.Nitrogen, 2)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        RocketFuel = new FluidMaterial(962, "rocket_fuel", 12433292, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        DinitrogenTetroxide = new FluidMaterial(961, "dinitrogen_tetroxide", 998766, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Nitrogen, 2), new MaterialStack(Materials.Oxygen, 4)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        SiliconeRubber = new IngotMaterial(960, "silicon_rubber", 11316396, MaterialIconSet.DULL, 1, ImmutableList.of(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Oxygen, 1), new MaterialStack(Materials.Silicon, 1)), DustMaterial.MatFlags.GENERATE_PLATE | SolidMaterial.MatFlags.GENERATE_GEAR | IngotMaterial.MatFlags.GENERATE_RING | Material.MatFlags.FLAMMABLE | DustMaterial.MatFlags.NO_SMASHING | IngotMaterial.MatFlags.GENERATE_FOIL);
        Polydimethylsiloxane = new DustMaterial(959, "polydimethylsiloxane", 9211020, MaterialIconSet.DULL, 1, ImmutableList.of(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Oxygen, 1), new MaterialStack(Materials.Silicon, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Dimethyldichlorosilane = new FluidMaterial(958, "dimethyldichlorosilane", 4070471, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Chlorine, 2), new MaterialStack(Materials.Silicon, 1)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Styrene = new FluidMaterial(957, "styrene", 10722453, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 8), new MaterialStack(Materials.Hydrogen, 8)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Polystyrene = new IngotMaterial(956, "polystyrene", 8945785, MaterialIconSet.DULL, 1, ImmutableList.of(new MaterialStack(Materials.Carbon, 8), new MaterialStack(Materials.Hydrogen, 8)), Material.MatFlags.DISABLE_DECOMPOSITION | IngotMaterial.MatFlags.GENERATE_FOIL);
        Butadiene = new FluidMaterial(955, "butadiene", 11885072, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Carbon, 4), new MaterialStack(Materials.Hydrogen, 6)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        RawStyreneButadieneRubber = new DustMaterial(954, "raw_styrene_butadiene_rubber", 5192762, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Carbon, 8), new MaterialStack(Materials.Hydrogen, 8), new MaterialStack(GAMaterials.Butadiene, 3)), Material.MatFlags.DISABLE_DECOMPOSITION);
        StyreneButadieneRubber = new IngotMaterial(953, "styrene_butadiene_rubber", 1906453, MaterialIconSet.ROUGH, 1, ImmutableList.of(new MaterialStack(Materials.Carbon, 8), new MaterialStack(Materials.Hydrogen, 8), new MaterialStack(GAMaterials.Butadiene, 3)), DustMaterial.MatFlags.GENERATE_PLATE | SolidMaterial.MatFlags.GENERATE_GEAR | IngotMaterial.MatFlags.GENERATE_RING | Material.MatFlags.FLAMMABLE | DustMaterial.MatFlags.NO_SMASHING);
        Dichlorobenzene = new FluidMaterial(952, "dichlorobenzene", 868171, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 6), new MaterialStack(Materials.Hydrogen, 4), new MaterialStack(Materials.Chlorine, 2)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        HydrochloricAcid = new FluidMaterial(951, "hydrochloric_acid", 9477273, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Hydrogen, 1), new MaterialStack(Materials.Chlorine, 1)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        AceticAcid = new FluidMaterial(950, "acetic_acid", 10260096, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 4), new MaterialStack(Materials.Oxygen, 2)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        FermentedBiomass = new FluidMaterial(949, "fermented_biomass", 4147981, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        Potash = new DustMaterial(948, "potash", 5057059, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Potassium, 2), new MaterialStack(Materials.Oxygen, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        SodaAsh = new DustMaterial(947, "soda_ash", 7697800, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Sodium, 2), new MaterialStack(Materials.Carbon, 1), new MaterialStack(Materials.Oxygen, 3)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        HydrofluoricAcid = new FluidMaterial(946, "hydrofluoric_acid", 946055, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Hydrogen, 1), new MaterialStack(Materials.Fluorine, 1)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        NitricOxide = new FluidMaterial(945, "nitric_oxide", 6790328, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Nitrogen, 1), new MaterialStack(Materials.Oxygen, 1)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        MethylAcetate = new FluidMaterial(944, "methyl_acetate", 12427150, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 3), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Oxygen, 2)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Ethenone = new FluidMaterial(943, "ethenone", 1776449, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 2), new MaterialStack(Materials.Oxygen, 1)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Tetranitromethane = new FluidMaterial(942, "tetranitromethane", 1715244, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 1), new MaterialStack(Materials.Nitrogen, 4), new MaterialStack(Materials.Oxygen, 8)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        BioDiesel = new FluidMaterial(941, "bio_diesel", 12806415, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        RawGrowthMedium = new FluidMaterial(940, "raw_growth_medium", 10777425, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        SterilizedGrowthMedium = new FluidMaterial(939, "sterilized_growth_medium", 11306862, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        Meat = new DustMaterial(938, "meat", 12667980, MaterialIconSet.SAND, 1, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
        VinylAcetate = new FluidMaterial(936, "vinyl_acetate", 13144428, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 4), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Oxygen, 2)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        GalliumArsenide = new IngotMaterial(935, "gallium_arsenide", 7500402, MaterialIconSet.DULL, 1, ImmutableList.of(new MaterialStack(Materials.Arsenic, 1), new MaterialStack(Materials.Gallium, 1)), Material.MatFlags.DECOMPOSITION_BY_CENTRIFUGING | DustMaterial.MatFlags.GENERATE_PLATE, (Element) null, 1200);
        PolyphenyleneSulfide = new IngotMaterial(934, "polyphenylene_sulfide", 8743424, MaterialIconSet.DULL, 1, ImmutableList.of(new MaterialStack(Materials.Carbon, 6), new MaterialStack(Materials.Hydrogen, 4), new MaterialStack(Materials.Sulfur, 1)), Material.MatFlags.DISABLE_DECOMPOSITION | EXT_METAL | IngotMaterial.MatFlags.GENERATE_FOIL, (Element) null, 6.0F, 32);
        NickelSulfateSolution = new FluidMaterial(933, "nickel_sulfate_water_solution", 4109888, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        BlueVitriolSolution = new FluidMaterial(932, "blue_vitriol_water_solution", 4761024, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        Propane = new FluidMaterial(931, "propane", 12890952, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Carbon, 3), new MaterialStack(Materials.Hydrogen, 8)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Propene = new FluidMaterial(930, "propene", 12954956, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Carbon, 3), new MaterialStack(Materials.Hydrogen, 6)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Ethane = new FluidMaterial(929, "ethane", 10329540, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 6)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Butene = new FluidMaterial(928, "butene", 10700561, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Carbon, 4), new MaterialStack(Materials.Hydrogen, 8)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Butane = new FluidMaterial(927, "butane", 9385508, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Carbon, 4), new MaterialStack(Materials.Hydrogen, 10)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        CalciumAcetate = new FluidMaterial(926, "calcium_acetate", 11444113, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Calcium, 1), new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Oxygen, 4), new MaterialStack(Materials.Hydrogen, 6)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Cumene = new FluidMaterial(925, "cumene", 4924684, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 9), new MaterialStack(Materials.Hydrogen, 12)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        IndiumGalliumPhosphide = new IngotMaterial(924, "indium_gallium_phosphide", 8220052, MaterialIconSet.DULL, 1, ImmutableList.of(new MaterialStack(Materials.Indium, 1), new MaterialStack(Materials.Gallium, 1), new MaterialStack(Materials.Phosphorus, 1)), Material.MatFlags.DECOMPOSITION_BY_CENTRIFUGING | DustMaterial.MatFlags.GENERATE_PLATE);
        PlatinumGroupSludge = new DustMaterial(923, "platinum_group_sludge", 4864, MaterialIconSet.POWDER, 1, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
        FerriteMixture = new DustMaterial(922, "ferrite_mixture", 9803157, MaterialIconSet.METALLIC, 1, ImmutableList.of(new MaterialStack(Materials.Nickel, 1), new MaterialStack(Materials.Zinc, 1), new MaterialStack(Materials.Iron, 4)), Material.MatFlags.DISABLE_DECOMPOSITION);
        NickelZincFerrite = new IngotMaterial(921, "nickel_zinc_ferrite", 3092271, MaterialIconSet.METALLIC, 0, ImmutableList.of(new MaterialStack(Materials.Nickel, 1), new MaterialStack(Materials.Zinc, 1), new MaterialStack(Materials.Iron, 4), new MaterialStack(Materials.Oxygen, 8)), EXT_METAL, (Element) null, 1500);
        IndiumConcentrate = new FluidMaterial(920, "indium_concentrate", 205130, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
        LeadZincSolution = new FluidMaterial(919, "lead_zinc_solution", 3213570, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Lead, 1), new MaterialStack(Materials.Silver, 1), new MaterialStack(Materials.Zinc, 1), new MaterialStack(Materials.Sulfur, 3), new MaterialStack(Materials.Water, 1)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Tetrafluoroethylene = new FluidMaterial(918, "tetrafluoroethylene", 6776679, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Fluorine, 4)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        SaltWater = new FluidMaterial(917, "salt_water", 255, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        HydroCrackedEthane = new FluidMaterial(916, "hydrocracked_ethane", 9868988, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        HydroCrackedEthylene = new FluidMaterial(915, "hydrocracked_ethylene", 10724256, MaterialIconSet.GAS, ImmutableList.of(), FluidMaterial.MatFlags.STATE_GAS);
        HydroCrackedPropene = new FluidMaterial(914, "hydrocracked_propene", 12494144, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        HydroCrackedPropane = new FluidMaterial(913, "hydrocracked_propane", 12494144, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        HydroCrackedLightFuel = new FluidMaterial(912, "hydrocracked_light_fuel", 12037896, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        HydroCrackedButane = new FluidMaterial(911, "hydrocracked_butane", 8727576, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        HydroCrackedNaphtha = new FluidMaterial(910, "hydrocracked_naphtha", 12563976, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        HydroCrackedHeavyFuel = new FluidMaterial(909, "hydrocracked_heavy_fuel", 16776960, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        HydroCrackedGas = new FluidMaterial(908, "hydrocracked_gas", 11842740, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        HydroCrackedButene = new FluidMaterial(907, "hydrocracked_butene", 10042885, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        HydroCrackedButadiene = new FluidMaterial(906, "hydrocracked_butadiene", 11358723, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        SteamCrackedEthane = new FluidMaterial(905, "steamcracked_ethane", 9868988, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        SteamCrackedEthylene = new FluidMaterial(904, "steamcracked_ethylene", 10724256, MaterialIconSet.GAS, ImmutableList.of(), FluidMaterial.MatFlags.STATE_GAS);
        SteamCrackedPropene = new FluidMaterial(903, "steamcracked_propene", 12494144, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        SteamCrackedPropane = new FluidMaterial(902, "steamcracked_propane", 12494144, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        SteamCrackedButane = new FluidMaterial(901, "steamcracked_butane", 8727576, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        SteamCrackedNaphtha = new FluidMaterial(900, "steamcracked_naphtha", 12563976, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        SteamCrackedGas = new FluidMaterial(899, "steamcracked_gas", 11842740, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        SteamCrackedButene = new FluidMaterial(898, "steamcracked_butene", 10042885, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        SteamCrackedButadiene = new FluidMaterial(897, "steamcracked_butadiene", 11358723, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK);
        BioGas = new FluidMaterial(896, "biogas", 4279313, MaterialIconSet.GAS, ImmutableList.of(), FluidMaterial.MatFlags.STATE_GAS);
        Chloromethane = new FluidMaterial(895, "chloromethane", 10301057, MaterialIconSet.GAS, ImmutableList.of(new MaterialStack(Materials.Carbon, 1), new MaterialStack(Materials.Hydrogen, 3), new MaterialStack(Materials.Chlorine, 1)), FluidMaterial.MatFlags.STATE_GAS | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        AllylChloride = new FluidMaterial(894, "allyl_chloride", 7450250, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 3), new MaterialStack(Materials.Hydrogen, 5), new MaterialStack(Materials.Chlorine, 1)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Isoprene = new FluidMaterial(893, "isoprene", 1907997, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Carbon, 5), new MaterialStack(Materials.Hydrogen, 8)), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Massicot = new DustMaterial(892, "massicot", 8943149, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Lead, 1), new MaterialStack(Materials.Oxygen, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        AntimonyTrioxide = new DustMaterial(891, "antimony_trioxide", 8092544, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Antimony, 2), new MaterialStack(Materials.Oxygen, 3)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Zincite = new DustMaterial(890, "zincite", 8947843, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Zinc, 1), new MaterialStack(Materials.Oxygen, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        CobaltOxide = new DustMaterial(889, "cobalt_oxide", 3556352, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Cobalt, 1), new MaterialStack(Materials.Oxygen, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        ArsenicTrioxide = new DustMaterial(888, "arsenic_trioxide", 15856113, MaterialIconSet.ROUGH, 1, ImmutableList.of(new MaterialStack(Materials.Arsenic, 2), new MaterialStack(Materials.Oxygen, 3)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        CupricOxide = new DustMaterial(887, "cupric_oxide", 526344, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Copper, 1), new MaterialStack(Materials.Oxygen, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Ferrosilite = new DustMaterial(886, "ferrosilite", 5256470, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Iron, 1), new MaterialStack(Materials.Silicon, 1), new MaterialStack(Materials.Oxygen, 3)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        Magnesia = new DustMaterial(885, "magnesia", 8943736, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Magnesium, 1), new MaterialStack(Materials.Oxygen, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        GASodiumSulfide = new DustMaterial(884, "ga_sodium_sulfide", 8944452, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Sodium, 2), new MaterialStack(Materials.Sulfur, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        NeutralMatter = new FluidMaterial(883, "neutral_matter", 3956968, MaterialIconSet.FLUID, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
        PositiveMatter = new FluidMaterial(882, "positive_matter", 11279131, MaterialIconSet.FLUID, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
        Ultimate = new BasicMaterial(881, "ultimate", 13434880, MaterialIconSet.SHINY);
        Superconductor = new BasicMaterial(880, "superconductor", 15389725, MaterialIconSet.SHINY);

        Materials.YttriumBariumCuprate.addFlag(IngotMaterial.MatFlags.GENERATE_FINE_WIRE);
        Materials.Manganese.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
        Materials.Naquadah.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
        Materials.NaquadahEnriched.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
        Materials.Duranium.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
        Materials.Graphene.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
        Materials.Helium.addFlag(FluidMaterial.MatFlags.GENERATE_PLASMA);
        Materials.Oxygen.addFlag(FluidMaterial.MatFlags.GENERATE_PLASMA);
        Materials.Iron.addFlag(FluidMaterial.MatFlags.GENERATE_PLASMA);
        Materials.Nickel.addFlag(FluidMaterial.MatFlags.GENERATE_PLASMA);
        Materials.GreenSapphire.addFlag(DustMaterial.MatFlags.GENERATE_PLATE);
        Materials.GreenSapphire.addFlag(GemMaterial.MatFlags.GENERATE_LENSE);

        Materials.Salt.addOreByProducts(Materials.Borax);
        Materials.RockSalt.addOreByProducts(Materials.Borax);
        Materials.Lepidolite.addOreByProducts(Materials.Boron);
    }
}