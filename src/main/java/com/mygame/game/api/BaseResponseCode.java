package com.mygame.game.api;

public enum BaseResponseCode implements IResponseCode{
    SUCCESS(200,"success"),
    FAILED(500,"failed")
    ;

    private final Integer code;

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
