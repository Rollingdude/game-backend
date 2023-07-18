package com.mygame.game.mapper;

public interface PlayerLoadoutEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PlayerLoadoutEntity record);

    int insertSelective(PlayerLoadoutEntity record);

    PlayerLoadoutEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PlayerLoadoutEntity record);

    int updateByPrimaryKey(PlayerLoadoutEntity record);
}