package com.mygame.game.service;

import com.mygame.game.entity.PlayerLoadoutEntity;
import com.mygame.game.manager.PlayerLoadoutManager;
import com.mygame.game.model.dto.LoadoutUpdateDTO;
import com.mygame.game.model.vo.PlayerLoadoutVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * player loadout service impl
 *
 * @author Lynx
 * @since 2023/07/18
 */
@Service
public class PlayerLoadoutService {

    /**
     * playerLoadoutManager
     */
    private final PlayerLoadoutManager playerLoadoutManager;

    @Autowired
    public PlayerLoadoutService(PlayerLoadoutManager playerLoadoutManager) {
        this.playerLoadoutManager = playerLoadoutManager;
    }

    public List<PlayerLoadoutVO> getPlayerLoadouts(Integer playerId) {
        List<PlayerLoadoutEntity> loadoutEntities = playerLoadoutManager.getByPlayerId(playerId);
        List<PlayerLoadoutVO> loadoutVOs = new ArrayList<>(loadoutEntities.size());
        loadoutEntities.forEach(playerLoadoutEntity -> {
            PlayerLoadoutVO playerLoadoutVO = new PlayerLoadoutVO();
            playerLoadoutVO.setId(playerLoadoutEntity.getPlayerId());
            playerLoadoutVO.setLoadoutName(playerLoadoutEntity.getName());
            playerLoadoutVO.setContent(playerLoadoutEntity.getContent());
            playerLoadoutVO.setLoadoutIndex(playerLoadoutEntity.getLoadoutIndex());
            loadoutVOs.add(playerLoadoutVO);
        });
        return loadoutVOs;
    }

    public void UpdateLoadout(LoadoutUpdateDTO updateDTO) {
        PlayerLoadoutEntity playerLoadoutEntity = new PlayerLoadoutEntity();
        playerLoadoutEntity.setId(updateDTO.getId());
        playerLoadoutEntity.setName(updateDTO.getName());
        playerLoadoutEntity.setContent(updateDTO.getContent());
        playerLoadoutManager.updateById(playerLoadoutEntity);
    }
}
