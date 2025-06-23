//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package uwu.fluttercat.ironightmares;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uwu.fluttercat.ironightmares.item.ModItems;

public class IroNightmares implements ModInitializer {
	public static final String MOD_ID = "ironightmares";
	public static final Logger LOGGER = LoggerFactory.getLogger("ironightmares");

	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("you have ironightmares installed. prepare for your life to suck slightly more.");
	}
}
