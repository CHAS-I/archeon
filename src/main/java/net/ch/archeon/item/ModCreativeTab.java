package net.ch.archeon.item;


import net.ch.archeon.Archeon;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Archeon.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ARCHEON_TAB =
            CREATIVE_MODE_TABS.register("archeon",
                    ()->CreativeModeTab.builder().icon(()-> new ItemStack(ModItem.ASURA_SPAWN_EGG.get()))
                            .title(Component.translatable("creativetab.archeon_tab"))
                            .displayItems((pParameters, pOutput)->{
                                pOutput.accept(ModItem.ASURA_SPAWN_EGG.get());
                            })
                            .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
