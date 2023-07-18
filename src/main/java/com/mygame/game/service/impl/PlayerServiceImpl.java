package com.mygame.game.service.impl;

import com.mygame.game.api.ServiceException;
import com.mygame.game.entity.PlayerEntity;
import com.mygame.game.manager.PlayerManager;
import com.mygame.game.model.dto.PlayerRegisterDTO;
import com.mygame.game.model.mapstruct.PlayerModelMapper;
import com.mygame.game.model.vo.PlayerVO;
import com.mygame.game.service.IPlayerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * user service impl
 *
 * @author Lynx
 * @since 2023/07/14
 */
@Service
public class PlayerServiceImpl implements IPlayerService {

    private final PlayerManager userManager;

    public PlayerServiceImpl(PlayerManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public PlayerVO getUserInfo(Long userId) {
        PlayerEntity playerEntity = userManager.getById(userId);
        return Objects.isNull(playerEntity) ? null : PlayerModelMapper.INSTANCE.toPlayerVO(playerEntity);
    }

    @Override
    public void register(PlayerRegisterDTO playerRegisterDTO) {
        if (StringUtils.isBlank(playerRegisterDTO.getNickname())) {
            throw new ServiceException("User Nick name cannot be null");
        }
        userManager.save(PlayerModelMapper.INSTANCE.fromUserRegisterDTO(playerRegisterDTO));
    }
}
