package com.mygame.game.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * weapon category enum
 *
 * @author Lynx
 * @since 2023/07/19
 */
@Getter
public enum WeaponCategory {
    AR("AR", "assault rifle"),
    PISTOL("PISTOL", "pistol"),
    SHOT_GUN("SHOT_GUN", "shot gun"),
    SUB_MACHINE_GUN("SUB_MACHINE_GUN", "sub machine gun"),
    LIGHT_MACHINE_GUN("LIGHT_MACHINE_GUN", "light machine gune"),
    SNIPER("SNIPER", "sniper"),
    MARKSMAN_RIFLE("MARKSMAN_RIFLE", "marksman rifle"),
    THROWABLE("THROWABLE", "throwable"),
    COLD("COLD", "cold"),
    NONE("NONE", "None of above"),
    ;

    /**
     * unreal engine serialize or deserialize this enum type as a string value ,so we need to save the value as string too,
     * make them compatible during serialize or deserialize period when interacting with backend
     */
    private final String value;

    /**
     * the value readable describe
     */
    private final String desc;

    private static final Map<String, WeaponCategory> cachedMap = new HashMap<>(16);

    static {
        WeaponCategory[] values = WeaponCategory.values();
        for (WeaponCategory value : values) {
            cachedMap.put(value.getValue(), value);
        }
    }

    /**
     * returns the target enum by value
     *
     * @param value value
     * @return target enum
     */
    public static WeaponCategory getByValue(String value) {
        return cachedMap.get(value);
    }

    WeaponCategory(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
