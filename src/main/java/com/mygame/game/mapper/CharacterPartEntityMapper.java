package com.mygame.game.mapper;

import com.mygame.game.entity.CharacterPartEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CharacterPartEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CharacterPartEntity record);

    int insertSelective(CharacterPartEntity record);

    CharacterPartEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CharacterPartEntity record);

    int updateByPrimaryKey(CharacterPartEntity record);
}