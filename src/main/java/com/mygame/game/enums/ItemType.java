package com.mygame.game.enums;

import lombok.Getter;

/**
 * item type enum
 *
 * @author Lynx
 * @since 2023/07/18
 */
@Getter
public enum ItemType {

    NON((byte) 0, "none"),
    WEAPON((byte) 1, "Weapon"),
    AMMO((byte) 2, "Ammo"),
    WEAPON_ATTACHMENT((byte) 3, "Weapon attachment"),
    HEALTH((byte) 4, "Health"),
    ARMOR((byte) 5, "Armor"),
    BUFF((byte) 6, "Buff"),
    COSMETICS((byte) 7, "CosmeticItem"),
    WEAPON_PART((byte) 7, "CosmeticItem");

    /**
     * the code
     */
    private final byte code;

    /**
     * desc
     */
    private final String desc;

    ItemType(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
