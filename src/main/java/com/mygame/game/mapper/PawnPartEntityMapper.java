package com.mygame.game.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mygame.game.entity.PawnPartEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PawnPartEntityMapper extends BaseMapper<PawnPartEntity> {
    int deleteByPrimaryKey(Integer id);

    int insert(PawnPartEntity record);

    int insertSelective(PawnPartEntity record);

    PawnPartEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PawnPartEntity record);

    int updateByPrimaryKey(PawnPartEntity record);
}