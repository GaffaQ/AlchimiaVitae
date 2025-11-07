package me.apeiros.alchimiavitae.setup;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

import me.apeiros.alchimiavitae.AlchimiaUtils;
import me.apeiros.alchimiavitae.AlchimiaVitae;

/**
 * Holds {@link SlimefunItemStack} constants used in {@link AlchimiaVitae}
 */
public class AlchimiaItems {

    // {{{ Menu items (for custom crafters)
    public static final ItemStack IN_BG = new CustomItemStack(Material.ORANGE_STAINED_GLASS_PANE,
            AlchimiaUtils.format("<gradient:#ff68fc:#ff9a5c>Input</gradient>"));

    public static final ItemStack CRAFT_BTN = new CustomItemStack(Material.LIME_STAINED_GLASS_PANE,
            AlchimiaUtils.format("<gradient:#39f792:#5c95ff>Craft</gradient>"), "&aClick to craft");

    public static final ItemStack CRAFT_BG = new CustomItemStack(Material.CYAN_STAINED_GLASS_PANE,
            AlchimiaUtils.format("<gradient:#39f792:#5c95ff>Craft</gradient>"));

    public static final ItemStack OUT_BG = new CustomItemStack(Material.CYAN_STAINED_GLASS_PANE,
            AlchimiaUtils.format("<gradient:#5cb8ff:#39f7e1>Output</gradient>"));
    // }}}

    // {{{ Tools
    public static final SlimefunItemStack SOUL_COLLECTOR = new SlimefunItemStack("AV_SOUL_COLLECTOR",
            Material.DIAMOND_SWORD, AlchimiaUtils.format("<gradient:#6baefa:#7145b0>Soul Collector</gradient>"),
            "&bCollect souls",
            "&bUse this sword to kill creatures,",
            "&band collect their souls.",
            "&aGrants 3x experience drops.",
            "&9Wither-type mobs will drop extra souls.",
            "&cCannot be used on players.",
            "", AlchimiaUtils.itemType("Tool"));

    static {
        ItemMeta meta = SOUL_COLLECTOR.getItemMeta();
        meta.setUnbreakable(true);

        SOUL_COLLECTOR.setItemMeta(meta);
        SOUL_COLLECTOR.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
    }
    // }}}

    // {{{ Machines
    public static final SlimefunItemStack PLANT_INFUSION_CHAMBER = new SlimefunItemStack("AV_PLANT_INFUSION_CHAMBER",
            Material.LIME_STAINED_GLASS, AlchimiaUtils.format("<gradient:#549c64:#1de078>Plant Infusion Chamber</gradient>"),
            "&bUse souls to infuse plants with dark energy",
            "&bor use magic crystals to infuse plants with light energy", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(64),
            "", AlchimiaUtils.itemType("Machine"));

    public static final SlimefunItemStack EXP_CRYSTALLIZER = new SlimefunItemStack("AV_EXP_CRYSTALLIZER",
            Material.LIME_STAINED_GLASS,
            AlchimiaUtils.format("<gradient:#50fa75:#3dd2ff>EXP Crystallizer</gradient>"),
            "&aConverts experience orbs into crystal form,",
            "&aDurable and full of energy.", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(32),
            "", AlchimiaUtils.itemType("Machine"));
    // }}}

    // {{{ Resources
    public static final SlimefunItemStack CONDENSED_SOUL = new SlimefunItemStack("AV_CONDENSED_SOUL",
            Material.LIGHT_BLUE_DYE, AlchimiaUtils.format("<gradient:#6baefa:#7145b0>Condensed Soul</gradient>"),
            "&bA soul condensed into a sphere",
            "&9&oPerhaps there is a way",
            "&9&oto harness its power...",
            "", AlchimiaUtils.itemType("Primal Magic Resource"));

    static {
        ItemMeta meta = CONDENSED_SOUL.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        CONDENSED_SOUL.setItemMeta(meta);
        CONDENSED_SOUL.addUnsafeEnchantment(Enchantment.LUCK, 1);
    }

    public static final SlimefunItemStack LIGHT_MAGIC_PLANT = new SlimefunItemStack("AV_GOOD_MAGIC_PLANT",
            Material.OAK_SAPLING,
            AlchimiaUtils.format("<gradient:#2ddae0:#31f876>Light Magic Plant</gradient>"),
            "&aEmits supreme radiant light.",
            "", AlchimiaUtils.itemType("Basic Magic Resource"));

    static {
        ItemMeta meta = LIGHT_MAGIC_PLANT.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        LIGHT_MAGIC_PLANT.setItemMeta(meta);
        LIGHT_MAGIC_PLANT.addUnsafeEnchantment(Enchantment.LUCK, 1);
    }

    public static final SlimefunItemStack DARK_MAGIC_PLANT = new SlimefunItemStack("AV_EVIL_MAGIC_PLANT",
            Material.OAK_SAPLING,
            AlchimiaUtils.format("<gradient:#ff5555:#ffa012>Dark Magic Plant</gradient>"),
            "&cHas absorbed too much light energy",
            "&cand can no longer photosynthesize...",
            "", AlchimiaUtils.itemType("Basic Magic Resource"));

    static {
        ItemMeta meta = DARK_MAGIC_PLANT.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        DARK_MAGIC_PLANT.setItemMeta(meta);
        DARK_MAGIC_PLANT.addUnsafeEnchantment(Enchantment.LUCK, 1);
    }

    public static final SlimefunItemStack EXP_CRYSTAL = new SlimefunItemStack("AV_EXP_CRYSTAL",
            Material.EMERALD,
            AlchimiaUtils.format("<gradient:#50fa75:#3dd2ff>EXP Crystal</gradient>"),
            "&aCrystallized experience.",
            "", AlchimiaUtils.itemType("Basic Magic Resource"));

    static {
        ItemMeta meta = EXP_CRYSTAL.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        EXP_CRYSTAL.setItemMeta(meta);
        EXP_CRYSTAL.addUnsafeEnchantment(Enchantment.LUCK, 1);
    }

    public static final SlimefunItemStack LIGHT_ESSENCE = new SlimefunItemStack("AV_GOOD_ESSENCE",
            Material.SUGAR,
            AlchimiaUtils.format("<gradient:#2ddae0:#31f876>Light Essence</gradient>"),
            "&aEmits pulsing luminescence.",
            "", AlchimiaUtils.itemType("Refined Magic Resource"));

    public static final SlimefunItemStack DARK_ESSENCE = new SlimefunItemStack("AV_EVIL_ESSENCE",
            Material.GUNPOWDER,
            AlchimiaUtils.format("<gradient:#ff5555:#ffa012>Dark Essence</gradient>"),
            "&cAbsorbs light energy",
            "&clike a sponge.",
            "", AlchimiaUtils.itemType("Refined Magic Resource"));

    public static final SlimefunItemStack ILLUMIUM = new SlimefunItemStack("AV_ILLUMIUM",
            Material.IRON_INGOT,
            AlchimiaUtils.format("<gradient:#2ddae0:#31f876>Illumium Ingot</gradient>"),
            "&aIt radiates powerful light in your hand.",
            "", AlchimiaUtils.itemType("Concentrated Magic Resource"));

    static {
        ItemMeta meta = ILLUMIUM.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ILLUMIUM.setItemMeta(meta);
        ILLUMIUM.addUnsafeEnchantment(Enchantment.LUCK, 1);
    }

    public static final SlimefunItemStack DARKSTEEL = new SlimefunItemStack("AV_DARKSTEEL",
            Material.NETHERITE_INGOT,
            AlchimiaUtils.format("<gradient:#ff5555:#ffa012>Darksteel Ingot</gradient>"),
            "&cDoes it radiate... endless darkness?",
            "", AlchimiaUtils.itemType("Concentrated Magic Resource"));

    static {
        ItemMeta meta = DARKSTEEL.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        DARKSTEEL.setItemMeta(meta);
        DARKSTEEL.addUnsafeEnchantment(Enchantment.LUCK, 1);
    }
    // }}}

    // {{{ Divine Altar (Transmutation)
    public static final SlimefunItemStack DIVINE_ALTAR = new SlimefunItemStack("AV_DIVINE_ALTAR",
            Material.ENCHANTING_TABLE,
            AlchimiaUtils.format("<gradient:#ff5555:#ff6cfd>Divine Altar</gradient>"),
            "&5A sacred device",
            "&5used for ancient rituals.",
            "", AlchimiaUtils.itemType("Altar"));

    public static final SlimefunItemStack MOLTEN_MYSTERY_METAL = new SlimefunItemStack("AV_MOLTEN_MYSTERY_METAL",
            Material.LAVA_BUCKET,
            AlchimiaUtils.format("<gradient:#ff6745:#ff5555>Molten Mystery Metal</gradient>"),
            "&6An amalgamation of different metals.",
            "", AlchimiaUtils.itemType("Transmutation Resource"));

    public static final SlimefunItemStack MYSTERY_METAL = new SlimefunItemStack("AV_MYSTERY_METAL",
            Material.IRON_INGOT,
            AlchimiaUtils.format("<gradient:#ff6745:#ff5555>Mystery Metal Ingot</gradient>"),
            "&6Contains many metals",
            "", AlchimiaUtils.itemType("Transmutation Resource"));
    // }}}

    // {{{ Cosmic Cauldron (Potions)
    public static final SlimefunItemStack COSMIC_CAULDRON = new SlimefunItemStack("AV_ORNATE_CAULDRON",
            Material.CAULDRON,
            AlchimiaUtils.format("<gradient:#57ebbe:#f6fa2a>Ornate Cauldron</gradient>"),
            "&2An altar used to brew powerful potions.",
            "", AlchimiaUtils.itemType("Altar"));

    private static final Map<PotionEffectType, int[]> potEffectsMap = new HashMap<>();

    public static final SlimefunItemStack POTION_OF_OSMOSIS = AlchimiaUtils.makePotion(
            "AV_POTION_OF_OSMOSIS",
            AlchimiaUtils.format("<gradient:#6274e7:#8752a3>Potion of Osmosis</gradient>"),
            Color.SILVER, potEffectsMap, false,
            "&eRight-click &6to absorb",
            "&6all active potion effects into the bottle.",
            "", AlchimiaUtils.itemType("Potion"));

    private static final Configuration cfg = AlchimiaVitae.i().getConfig();

    static {
        // Add effects
        potEffectsMap.put(PotionEffectType.DAMAGE_RESISTANCE, new int[] {
                cfg.getInt("options.potions.benevolent-brew.resistance.ticks"),
                cfg.getInt("options.potions.benevolent-brew.resistance.level") - 1
        });
        potEffectsMap.put(PotionEffectType.FAST_DIGGING, new int[] {
                cfg.getInt("options.potions.benevolent-brew.haste.ticks"),
                cfg.getInt("options.potions.benevolent-brew.haste.level") - 1
        });
        potEffectsMap.put(PotionEffectType.REGENERATION, new int[] {
                cfg.getInt("options.potions.benevolent-brew.regen.ticks"),
                cfg.getInt("options.potions.benevolent-brew.regen.level") - 1
        });
        potEffectsMap.put(PotionEffectType.SPEED, new int[] {
                cfg.getInt("options.potions.benevolent-brew.speed.ticks"),
                cfg.getInt("options.potions.benevolent-brew.speed.level") - 1
        });
        potEffectsMap.put(PotionEffectType.JUMP, new int[] {
                cfg.getInt("options.potions.benevolent-brew.jump.ticks"),
                cfg.getInt("options.potions.benevolent-brew.jump.level") - 1
        });
    }

    public static final SlimefunItemStack BENEVOLENT_BREW = AlchimiaUtils.makePotion(
            "AV_BENEVOLENT_BREW_POTION",
            AlchimiaUtils.format("<gradient:#2ddae0:#31f876>Benevolent Brew</gradient>"),
            Color.LIME, potEffectsMap, false,
            "", AlchimiaUtils.itemType("Potion"));

    static {
        // Clear the map from the previous usage
        potEffectsMap.clear();

        // Add effects
        potEffectsMap.put(PotionEffectType.WEAKNESS, new int[] {
                cfg.getInt("options.potions.malevolent-concoction.weakness.ticks"),
                cfg.getInt("options.potions.malevolent-concoction.weakness.level") - 1
        });
        potEffectsMap.put(PotionEffectType.SLOW, new int[] {
                cfg.getInt("options.potions.malevolent-concoction.slowness.ticks"),
                cfg.getInt("options.potions.malevolent-concoction.slowness.level") - 1
        });
        potEffectsMap.put(PotionEffectType.POISON, new int[] {
                cfg.getInt("options.potions.malevolent-concoction.poison.ticks"),
                cfg.getInt("options.potions.malevolent-concoction.poison.level") - 1
        });
        potEffectsMap.put(PotionEffectType.BLINDNESS, new int[] {
                cfg.getInt("options.potions.malevolent-concoction.blindness.ticks"),
                cfg.getInt("options.potions.malevolent-concoction.blindness.level") - 1
        });
        potEffectsMap.put(PotionEffectType.HUNGER, new int[] {
                cfg.getInt("options.potions.malevolent-concoction.hunger.ticks"),
                cfg.getInt("options.potions.malevolent-concoction.hunger.level") - 1
        });
    }

    public static final SlimefunItemStack MALEVOLENT_CONCOCTION = AlchimiaUtils.makePotion(
            "AV_MALEVOLENT_CONCOCTION_SPLASH_POTION",
            AlchimiaUtils.format("<gradient:#ff5555:#ffa012>Malevolent Concoction</gradient>"),
            Color.MAROON, potEffectsMap, true,
            "", AlchimiaUtils.itemType("Potion"));
    // }}}

    // {{{ Altar of Infusion (Infusion)
    public static final SlimefunItemStack ALTAR_OF_INFUSION = new SlimefunItemStack("AV_ALTAR_OF_INFUSION",
            Material.LODESTONE, AlchimiaUtils.format("<gradient:#f78770:#ff607b>Infusion Altar</gradient>"),
            "&5Adds effects to equipment.", "",
            "&7Can only infuse gold, iron, diamond, and netherite gear,",
            "&7also includes fishing rods, bows, and crossbows.",
            "", AlchimiaUtils.itemType("Altar"));
    // }}}

}
