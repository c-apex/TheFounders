/*
!!!
FIX LATER: Aug 3, 2020
util/RegistryHandler already uses this class, though it seems to not load.
!!!
 */
package com.capex.bbifounders.entities;

import com.capex.bbifounders.util.RegistryHandler;
import net.minecraft.entity.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Founder extends MobEntity {
    public Founder(EntityType<? extends MobEntity> type, World worldIn) {
        super(type, worldIn);
        Founder entity = new Founder(RegistryHandler.FOUNDER.get(), this.world);
        entity.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(entity)),
                SpawnReason.BREEDING, (ILivingEntityData) null, (CompoundNBT) null);
        entity.setGlowing(true);

    }
    @Override
    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(65.0D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.40D);
    }
}
