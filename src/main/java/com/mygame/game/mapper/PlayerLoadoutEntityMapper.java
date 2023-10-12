package com.mygame.game.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mygame.game.entity.PlayerLoadoutEntity;
import org.apache.ibatis.annotations.Mapper;


/**
 * mapper interface for player loadout
 *
 * @author Lynx
 * @since 2023/07/18
 */
@Mapper
public interface PlayerLoadoutEntityMapper extends BaseMapper<PlayerLoadoutEntity> {

    int deleteByPrimaryKey(Long id);

    int insert(PlayerLoadoutEntity record);

    int insertSelective(PlayerLoadoutEntity record);

    PlayerLoadoutEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PlayerLoadoutEntity record);

    int updateByPrimaryKey(PlayerLoadoutEntity record);
}