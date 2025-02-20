package net.ch.archeon.entity;

import net.ch.archeon.Archeon;
import net.ch.archeon.entity.bosses.asura.Asura;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntity {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Archeon.MOD_ID);

    public static final RegistryObject<EntityType<Asura>> ASURA =
            ENTITIES.register("asura", () ->
                    EntityType.Builder.of(Asura::new, MobCategory.MONSTER)
                            .sized(1.4F, 2.7F)
                            .build("asura"));

    public static void register(IEventBus eventBus){
        ENTITIES.register(eventBus);
    }
}
