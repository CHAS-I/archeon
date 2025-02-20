package net.ch.archeon.item;

import net.ch.archeon.Archeon;
import net.ch.archeon.entity.ModEntity;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Archeon.MOD_ID);

    public static final RegistryObject<Item> ASURA_SPAWN_EGG = ITEMS.register("asura_spawn_egg", () -> new ForgeSpawnEggItem(ModEntity.ASURA, 0x8B0000, 0x000000, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
