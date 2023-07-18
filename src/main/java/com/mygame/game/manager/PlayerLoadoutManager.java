package com.mygame.game.manager;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mygame.game.entity.PlayerLoadoutEntity;
import com.mygame.game.mapper.PlayerLoadoutEntityMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    /**
     * logger
     */
    private static final Logger logger = LoggerFactory.getLogger(PlayerLoadoutManager.class);

    /**
     * mapper
     */
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

    public boolean updateById(PlayerLoadoutEntity loadoutEntity) {
        LambdaQueryWrapper<PlayerLoadoutEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        try {
            playerLoadoutEntityMapper.updateById(loadoutEntity);
            return true;
        } catch (Exception e) {
            logger.error("loadout entity update failed ,data:{},e:", loadoutEntity, e);
            return false;
        }
    }
}
