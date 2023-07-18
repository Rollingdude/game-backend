package com.mygame.game.mapper;

import com.mygame.game.entity.PlayerEntity;

public interface PlayerEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PlayerEntity record);

    int insertSelective(PlayerEntity record);

    PlayerEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PlayerEntity record);

    int updateByPrimaryKey(PlayerEntity record);
}