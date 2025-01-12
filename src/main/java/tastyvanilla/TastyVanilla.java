package tastyvanilla;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tastyvanilla.block.ModBlocks;
import tastyvanilla.item.ModItems;

public class TastyVanilla implements ModInitializer {
	public static final String MOD_ID = "tastyvanilla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


	}
}