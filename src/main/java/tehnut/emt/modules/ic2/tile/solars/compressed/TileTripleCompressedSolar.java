package tehnut.emt.modules.ic2.tile.solars.compressed;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import tehnut.emt.ConfigHandler;
import tehnut.emt.modules.ic2.blocks.IC2BlockRegistry;
import tehnut.emt.modules.ic2.tile.solars.TileEntitySolarBase;

public class TileTripleCompressedSolar extends TileEntitySolarBase {

    public TileTripleCompressedSolar() {
        output = ConfigHandler.tripleCompressedSolarOutput;
    }

    @Override
    public ItemStack getWrenchDrop(EntityPlayer entityPlayer) {
        return new ItemStack(IC2BlockRegistry.solars1, 1, 2);
    }
}