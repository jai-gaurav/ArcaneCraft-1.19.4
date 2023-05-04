package net.ryuzaki.arcanecraftmod;

import net.fabricmc.api.ModInitializer;
import net.ryuzaki.arcanecraftmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// added a comment to test commits
public class ArcaneCraftMod implements ModInitializer {
	public static final String MOD_ID = "arcanecraftmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
