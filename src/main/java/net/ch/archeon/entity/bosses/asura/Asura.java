package net.ch.archeon.entity.bosses.asura;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class Asura extends IronGolem {

    public Asura(EntityType<? extends IronGolem> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier setAttributes(){
        return Monster.createMonsterAttributes().add(Attributes.MAX_HEALTH, 300D).add(Attributes.ATTACK_DAMAGE, 5D).build();
    }
}
