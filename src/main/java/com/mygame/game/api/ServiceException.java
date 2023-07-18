package com.mygame.game.api;

/**
 * base service exception
 *
 * @author Lynx
 * @since 2023/07/18
 */
public class ServiceException extends RuntimeException {
    public ServiceException(String message) {
        super(message);
    }


    public ServiceException(IResponse<?> response) {
        super(response.getMsg());
    }
}
