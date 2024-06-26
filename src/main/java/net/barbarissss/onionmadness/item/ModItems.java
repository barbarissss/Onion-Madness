package net.barbarissss.onionmadness.item;

import net.barbarissss.onionmadness.OnionMadness;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item ONION_RING = registerItem("onion_ring", new Item(new FabricItemSettings().food(ModFoodComponents.ONION_RING)));

    private static void addItemsToItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(ONION_RING);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(OnionMadness.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        OnionMadness.LOGGER.info("reg item for" + OnionMadness.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToItemGroup);
    }
}
