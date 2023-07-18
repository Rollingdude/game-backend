package com.mygame.game.api;

import java.io.Serializable;

/**
 * response interface
 *
 * @author Lynx
 * @since 2023/07/18
 */
public interface IResponse<T> extends Serializable {
   T getData();

   int getCode();

   String getMsg();
}
