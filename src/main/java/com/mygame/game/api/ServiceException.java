package com.mygame.game.api;

public class ServiceException extends RuntimeException{
    public ServiceException(String message) {
        super(message);
    }
}
