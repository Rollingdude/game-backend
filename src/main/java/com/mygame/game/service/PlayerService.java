package com.mygame.game.service;

import com.mygame.game.api.ServiceException;
import com.mygame.game.entity.PlayerEntity;
import com.mygame.game.manager.PlayerManager;
import com.mygame.game.model.dto.PlayerRegisterDTO;
import com.mygame.game.model.mapstruct.PlayerModelMapper;
import com.mygame.game.model.vo.PlayerVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * user service impl
 *
 * @author Lynx
 * @since 2023/07/14
 */
@Service
public class PlayerService {
    private static final Logger logger = LoggerFactory.getLogger(PlayerService.class);
    private final PlayerManager userManager;

    public PlayerService(PlayerManager userManager) {
        this.userManager = userManager;
    }

    public PlayerVO getUserInfo(Long userId) {
        PlayerEntity playerEntity = userManager.getById(userId);
        logger.info("Player data:{}",playerEntity);
        return Objects.isNull(playerEntity) ? null : PlayerModelMapper.INSTANCE.toPlayerVO(playerEntity);
    }


    public void register(PlayerRegisterDTO playerRegisterDTO) {
        if (StringUtils.isBlank(playerRegisterDTO.getNickname())) {
            throw new ServiceException("User Nick name cannot be null");
        }
        userManager.save(PlayerModelMapper.INSTANCE.fromUserRegisterDTO(playerRegisterDTO));
    }
}
