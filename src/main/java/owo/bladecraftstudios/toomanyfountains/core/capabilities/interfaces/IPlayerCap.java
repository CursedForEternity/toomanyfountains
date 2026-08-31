/* (C) TAMA Studios 2025 */
package owo.bladecraftstudios.toomanyfountains.core.capabilities.interfaces;

import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.util.INBTSerializable;
import owo.bladecraftstudios.toomanyfountains.core.speels.AbstractSpell;

public interface IPlayerCap extends INBTSerializable<CompoundTag> {
    AbstractSpell getSelectedSpell();

    void setSelectedSpell(AbstractSpell spell);
}
