package com.mygame.game.api;

/**
 * base response code implementation
 *
 * @author Lynx
 * @since 2023/07/18
 */
public enum BaseResponseCode implements IResponseCode {
    SUCCESS(200, "success"),
    FAILURE(500, "failure");

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

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
