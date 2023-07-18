package com.mygame.game.service;

import com.mygame.game.model.dto.LoadoutUpdateDTO;
import com.mygame.game.model.vo.PlayerLoadoutVO;

import java.util.List;

/**
 * PlayeLoadout service
 *
 * @author Lynx
 * @since 2023/07/18
 */
public interface IPlayerLoadoutService {

    /**
     * retrieves the player load lists
     *
     * @param playerId playerId
     * @return player loadout list
     */
    List<PlayerLoadoutVO> getPlayerLoadouts(Long playerId);


    /**
     * update the loadout data
     *
     * @param updateDTO loadout data to update
     */
    void UpdateLoadout(LoadoutUpdateDTO updateDTO);

}
