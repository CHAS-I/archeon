package net.ch.archeon.event;

import net.ch.archeon.Archeon;
import net.ch.archeon.entity.ModEntity;
import net.ch.archeon.entity.bosses.asura.Asura;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Archeon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvent {
    @SubscribeEvent
    public static void entityAttibuteEvent(EntityAttributeCreationEvent event){
        event.put(ModEntity.ASURA.get(), Asura.setAttributes());
    }
}
