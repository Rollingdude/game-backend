package com.mygame.game.enums;

import lombok.Getter;

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
    NONE((byte) 0, "None"),

    /**
     * static visual mesh
     */
    STATIC_MESH((byte) 0, "Static mesh"),

    /**
     * skeletal visual mesh
     */
    SKELETAL_MESH((byte) 0, "Skeletal mesh"),
    ;

    private final byte code;

    private final String desc;

    ItemMeshType(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
