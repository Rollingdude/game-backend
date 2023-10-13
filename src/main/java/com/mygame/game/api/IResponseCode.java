package com.mygame.game.api;

import lombok.Getter;

/**
 * interface for response code definitions
 *
 * @author Lynx
 * @since 2023/07/18
 */
public interface IResponseCode {

    /**
     * get the code
     *
     * @return response code
     */
    Integer getCode();

    /**
     * get the msg
     *
     * @return response msg
     */
    String getMsg();
}
