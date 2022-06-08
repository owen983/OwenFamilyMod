package com.owen983.owenfamilymod.villager;

import com.google.common.collect.ImmutableSet;
import com.owen983.owenfamilymod.OwenFamilyMod;
import com.owen983.owenfamilymod.block.ModBlocks;
import net.fabricmc.fabric.mixin.object.builder.PointOfInterestTypeAccessor;
import net.fabricmc.fabric.mixin.object.builder.VillagerProfessionAccessor;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final PointOfInterestType BEEKEEPER_POI = registerPOI("beekeeperpoi", ModBlocks.OWEN_BEEKEEPER_BLOCK);
    public static final VillagerProfession BEEKEEPER = registerProfession("beekeeper", BEEKEEPER_POI);

    public static VillagerProfession registerProfession(String name, PointOfInterestType type) {

        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(OwenFamilyMod.MOD_ID, name),
                VillagerProfessionAccessor.create(name, type, ImmutableSet.of(), ImmutableSet.of(),
                        SoundEvents.ENTITY_VILLAGER_CELEBRATE));

    }

    public static PointOfInterestType registerPOI(String name, Block block) {

        return Registry.register(Registry.POINT_OF_INTEREST_TYPE, new Identifier(OwenFamilyMod.MOD_ID, name),
                PointOfInterestTypeAccessor.callCreate(name,
                        ImmutableSet.copyOf(block.getStateManager().getStates()), 1, 1));
    }

    public static void setupPOIs() {
        OwenFamilyMod.LOGGER.info("calling setupPOIs for " + OwenFamilyMod.MOD_ID);
        PointOfInterestTypeAccessor.callSetup(BEEKEEPER_POI);
    }
}
