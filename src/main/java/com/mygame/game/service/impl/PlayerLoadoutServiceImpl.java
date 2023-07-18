package com.mygame.game.service.impl;

import com.mygame.game.entity.PlayerLoadoutEntity;
import com.mygame.game.manager.PlayerLoadoutManager;
import com.mygame.game.model.vo.PlayerLoadoutVO;
import com.mygame.game.service.IPlayerLoadoutService;
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
public class PlayerLoadoutServiceImpl implements IPlayerLoadoutService {

    /**
     * playerLoadoutManager
     */
    private final PlayerLoadoutManager playerLoadoutManager;

    @Autowired
    public PlayerLoadoutServiceImpl(PlayerLoadoutManager playerLoadoutManager) {
        this.playerLoadoutManager = playerLoadoutManager;
    }

    @Override
    public List<PlayerLoadoutVO> getPlayerLoadouts(Long playerId) {
        List<PlayerLoadoutEntity> loadoutEntities = playerLoadoutManager.getByPlayerId(playerId);
        List<PlayerLoadoutVO> loadoutVOs = new ArrayList<>(loadoutEntities.size());
        loadoutEntities.forEach(playerLoadoutEntity -> {
            PlayerLoadoutVO playerLoadoutVO = new PlayerLoadoutVO();
            playerLoadoutVO.setId(playerLoadoutEntity.getPlayerId());
            playerLoadoutVO.setLoadoutName(playerLoadoutEntity.getName());
            playerLoadoutVO.setContent(playerLoadoutEntity.getContent());
            playerLoadoutVO.setLoadoutIndex(playerLoadoutEntity.getLoadoutIndex());
        });
        return loadoutVOs;
    }
}
