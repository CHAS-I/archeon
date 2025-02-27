package net.ch.archeon.datagen;

import net.ch.archeon.item.ModItem;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModItem.ASURA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
}
