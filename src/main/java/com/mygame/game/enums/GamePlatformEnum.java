package com.mygame.game.enums;

import lombok.Getter;

/**
 * lists of the modern game platform
 *
 * @author Lynx
 * @since 2023/07/18
 */
@Getter
public enum GamePlatformEnum {

    STEAM("Steam"),
    EPIC("Epic"),
    NONE("None");

    private final String value;

    GamePlatformEnum(String value) {
        this.value = value;
    }
}
