package com.mygame.game.service;

import com.mygame.game.model.dto.PlayerRegisterDTO;
import com.mygame.game.model.vo.PlayerVO;

/**
 * user service
 *
 * @author Lynx
 * @since 2023/07/14
 */
public interface IPlayerService {

    /**
     * get the user info by userId
     *
     * @param userId userId
     * @return UserVo
     */
    PlayerVO getUserInfo(Long userId);

    /**
     * register a new game user
     * @param playerRegisterDTO register params
     */
    void register(PlayerRegisterDTO playerRegisterDTO);
}
