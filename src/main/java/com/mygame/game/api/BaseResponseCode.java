package com.mygame.game.api;

import lombok.Getter;

/**
 * base response code implementation
 *
 * @author Lynx
 * @since 2023/07/18
 */
@Getter
public enum BaseResponseCode implements IResponseCode {
    SUCCESS(10000, "success"),
    FAILURE(50000, "failure");

    /**
     * the response code
     */
    private final Integer code;

    /**
     * the response message
     */
    private final String msg;

    BaseResponseCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
