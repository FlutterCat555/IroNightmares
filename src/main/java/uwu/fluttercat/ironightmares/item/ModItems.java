//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

//genuinely how the hell did i lose the source code lmao

package uwu.fluttercat.ironightmares.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import uwu.fluttercat.ironightmares.IroNightmares;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item RAW_IRON_NUGGET = registerItem("raw_iron_nugget", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IroNightmares.MOD_ID,"raw_iron_nugget1")))));
    public static final Item RAW_GOLD_NUGGET = registerItem("raw_gold_nugget", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IroNightmares.MOD_ID,"raw_gold_nugget")))));
    public static final Item RAW_COPPER_NUGGET = registerItem("raw_copper_nugget", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IroNightmares.MOD_ID,"raw_copper_nugget")))));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IroNightmares.MOD_ID,"copper_nugget")))));
    public static final Item DIAMOND_SHARD = registerItem("diamond_shard", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IroNightmares.MOD_ID,"diamond_shard")))));
    public static final Item EMERALD_SHARD = registerItem("emerald_shard", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IroNightmares.MOD_ID,"emerald_shard")))));
    //public static final Item LAPIS_FRAGMENT = registerItem("lapis_fragment", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(IroNightmares.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAW_IRON_NUGGET);
            entries.add(RAW_GOLD_NUGGET);
            entries.add(DIAMOND_SHARD);
            entries.add(EMERALD_SHARD);
            entries.add(RAW_COPPER_NUGGET);
            entries.add(COPPER_NUGGET);
        });
    }
}
