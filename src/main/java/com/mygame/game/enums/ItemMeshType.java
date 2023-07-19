package com.mygame.game.enums;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * item visual mesh type
 *
 * @author Lynx
 * @since 2023/07/18
 */
@Getter
public enum ItemMeshType {

    /**
     * none
     */
    NONE("None", "None"),

    /**
     * static visual mesh
     */
    STATIC_MESH("STATIC_MESH", "Static mesh"),

    /**
     * skeletal visual mesh
     */
    SKELETAL_MESH("SKELETAL_MESH", "Skeletal mesh"),
    ;

    private final String value;

    private final String desc;

    /**
     * find the enum instance by value
     *
     * @param value the value to find
     * @return corresponding enum value
     */
    public static ItemMeshType getItemMeshTypeByValue(String value) {
        ItemMeshType[] values = ItemMeshType.values();
        for (ItemMeshType itemMeshType : values) {
            if (StringUtils.equals(value, itemMeshType.getValue())) {
                return itemMeshType;
            }
        }
        return null;
    }

    ItemMeshType(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
