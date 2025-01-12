package tastyvanilla;

import net.fabricmc.api.ClientModInitializer;
import tastyvanilla.block.ModBlocks;
import tastyvanilla.item.ModItems;

public class TastyVanillaClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}

