package com.mygame.game.manager;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mygame.game.entity.PlayerLoadoutEntity;
import com.mygame.game.mapper.PlayerLoadoutEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * manages the player loadout data
 *
 * @author Lynx
 * @since 2023/07/18
 */
@Component
public class PlayerLoadoutManager {

    private final PlayerLoadoutEntityMapper playerLoadoutEntityMapper;

    @Autowired
    public PlayerLoadoutManager(PlayerLoadoutEntityMapper playerLoadoutEntityMapper) {
        this.playerLoadoutEntityMapper = playerLoadoutEntityMapper;
    }

    public List<PlayerLoadoutEntity> getByPlayerId(Long playerId) {
        LambdaQueryWrapper<PlayerLoadoutEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(PlayerLoadoutEntity::getPlayerId, playerId).eq(PlayerLoadoutEntity::getStatus, 1);
        return playerLoadoutEntityMapper.selectList(lambdaQueryWrapper);
    }
}
