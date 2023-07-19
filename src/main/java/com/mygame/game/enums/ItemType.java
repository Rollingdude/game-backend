package com.mygame.game.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * item type enum
 *
 * @author Lynx
 * @since 2023/07/18
 */
@Getter
public enum ItemType {
    NONE("NONE","none"),
    WEAPON("WEAPON", "Weapon"),
    AMMO("AMMO", "Ammo"),
    WEAPON_ATTACHMENT("WEAPON_ATTACHMENT", "Weapon attachment"),
    HEALTH("HEALTH", "Health"),
    ARMOR("ARMOR", "Armor"),
    BUFF("BUFF", "Buff"),
    COSMETICS("COSMETICS", "CosmeticItem"),
    WEAPON_PART("WEAPON_PART", "Weapon part");

    /**
     * cached the value with hashmap
     */
    private static final Map<String, ItemType> cachedMap = new HashMap<>(16);

    static {
        ItemType[] values = ItemType.values();
        for (ItemType value : values) {
            cachedMap.put(value.getValue(), value);
        }
    }

    /**
     * the code
     */
    private final String value;

    /**
     * desc
     */
    private final String desc;

    public static ItemType getByValue(String value) {
        return cachedMap.get(value);
    }

    ItemType(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
