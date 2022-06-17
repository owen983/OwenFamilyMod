package com.owen983.owenfamilymod;

import com.owen983.owenfamilymod.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class OwenClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
       // EntityRendererRegistry.register(ModEntities.FLORAL_HORNET, FloralHornetRenderer::new);
    }
}
