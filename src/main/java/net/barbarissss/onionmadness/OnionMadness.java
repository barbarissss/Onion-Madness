package net.barbarissss.onionmadness;

import net.barbarissss.onionmadness.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnionMadness implements ModInitializer {
	public static final String MOD_ID = "onion-madness";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}