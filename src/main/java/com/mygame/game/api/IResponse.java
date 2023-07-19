package com.mygame.game.api;

import java.io.Serializable;

/**
 * response interface
 *
 * @author Lynx
 * @since 2023/07/18
 */
public interface IResponse<T> extends Serializable {

    /**
     * returns the data contained by this response
     *
     * @return Data
     */
    T getData();

    /**
     * returns the response code
     *
     * @return code
     */
    int getCode();

    /**
     * returns the response msg
     *
     * @return response message
     */
    String getMsg();
}
