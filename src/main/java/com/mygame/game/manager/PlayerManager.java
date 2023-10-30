package com.mygame.game.manager;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mygame.game.api.ServiceException;
import com.mygame.game.entity.PlayerEntity;
import com.mygame.game.mapper.PlayerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * userManager
 *
 * @author Lynx
 * @since 2023/07/14
 */
@Component
public class PlayerManager {

    private final PlayerMapper playerMapper;

    private static final Logger logger = LoggerFactory.getLogger(PlayerManager.class);

    public PlayerManager(PlayerMapper playerMapper) {
        this.playerMapper = playerMapper;
    }

    /**
     * get the user by playerId
     *
     * @param playerId playerId
     * @return UserEntity
     */
    public PlayerEntity getById(int playerId) {
        LambdaQueryWrapper<PlayerEntity> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(PlayerEntity::getId, playerId);
        return playerMapper.selectOne(queryWrapper);
    }

    /**
     * persis a user
     *
     * @param entity player entity to persist
     * @return whether success or failed to persist
     */
    public boolean save(PlayerEntity entity) {
        if (Objects.isNull(entity)) {
            throw new ServiceException("can save player entity because it's null");
        }
        boolean insertSuccess = true;
        try {
            playerMapper.insert(entity);
            return insertSuccess;
        } catch (Exception e) {
            insertSuccess = false;
            logger.error("save player entity failed:{}", entity, e);
            return insertSuccess;
        }
    }
}
