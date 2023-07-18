package com.mygame.game.mapper;

import com.mygame.game.entity.WeaponEntity;

public interface WeaponEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WeaponEntity record);

    int insertSelective(WeaponEntity record);

    WeaponEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WeaponEntity record);

    int updateByPrimaryKey(WeaponEntity record);
}