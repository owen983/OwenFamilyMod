package com.owen983.owenfamilymod.villager;

import com.google.common.collect.ImmutableSet;
import com.owen983.owenfamilymod.OwenFamilyMod;
import com.owen983.owenfamilymod.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final PointOfInterestType BEEKEEPER_POI =
            registerPOI("beekeeperpoi", ModBlocks.OWEN_BEEKEEPER_BLOCK);
    public static final VillagerProfession BEEKEEPER =
            registerProfession("beekeeper",
                    RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(OwenFamilyMod.MOD_ID, "beekeeperpoi")));


    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(OwenFamilyMod.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(OwenFamilyMod.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        Identifier id = new Identifier(OwenFamilyMod.MOD_ID, name);
        return PointOfInterestHelper.register(id, 1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

}
