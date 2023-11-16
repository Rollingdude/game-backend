package com.mygame.game.api;

import lombok.Data;
import lombok.Setter;

import java.util.Objects;

/**
 * base response api
 *
 * @param <T>
 * @author Lynx
 * @since 2023/07/18
 */
@Setter
public class Response<T> implements IResponse<T> {

    private static final long serialVersionUID = 1L;

    /**
     * response code
     */
    private int code;

    /**
     * response msg
     */
    private String msg;

    /**
     * response data
     */
    private T data;

    @Override
    public T getData() {
        return data;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    public static <T> Response<T> success() {
        return restResult(null, BaseResponseCode.SUCCESS.getCode(), BaseResponseCode.SUCCESS.getMsg());
    }

    public static <T> Response<T> success(T data) {
        return restResult(data, BaseResponseCode.SUCCESS.getCode(), BaseResponseCode.SUCCESS.getMsg());
    }

    public static <T> Response<T> success(T data, String msg) {
        return restResult(data, BaseResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> Response<T> failure() {
        return restResult(null, BaseResponseCode.SUCCESS.getCode(), BaseResponseCode.SUCCESS.getMsg());
    }

    public static <T> Response<T> failure(String msg) {
        return restResult(null, BaseResponseCode.SUCCESS.getCode(), msg);
    }


    private static <T> Response<T> restResult(T data, int code, String msg) {
        Response<T> apiResult = new Response<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

    public static Boolean isError(Response<?> response) {
        return !isSuccess(response);
    }

    public static Boolean isSuccess(Response<?> response) {
        return Objects.nonNull(response) && response.getCode() == BaseResponseCode.SUCCESS.getCode();
    }
}
