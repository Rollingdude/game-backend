package com.mygame.game.api;

/**
 * base service exception
 *
 * @author Lynx
 * @since 2023/07/18
 */
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = -6426453279702656904L;

    public ServiceException(String message) {
        super(message);
    }
    public ServiceException(IResponse<?> response) {
        super(response.getMsg());
    }
}
