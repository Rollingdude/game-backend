package com.mygame.game.model.mapstruct;

import com.mygame.game.entity.PlayerEntity;
import com.mygame.game.model.dto.PlayerRegisterDTO;
import com.mygame.game.model.vo.PlayerVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * User model mapper,manipulate coping of player related properties
 *
 * @author Lynx
 * @since 2023/07/14
 */
@Mapper
public interface PlayerModelMapper {
    PlayerModelMapper INSTANCE = Mappers.getMapper(PlayerModelMapper.class);

    /**
     * gets a copy of the userEntity
     *
     * @param playerEntity source user
     * @return copy of source userEntity
     */
    PlayerEntity copyOf(PlayerEntity playerEntity);

    /**
     * convert the userEntity to userVO instance
     *
     * @param playerEntity source user
     * @return userVO
     */
    PlayerVO toPlayerVO(PlayerEntity playerEntity);

    /**
     * converts a user register dto to entity
     *
     * @param registerDTO register params
     * @return UserEntity
     */
    PlayerEntity fromUserRegisterDTO(PlayerRegisterDTO registerDTO);

}
