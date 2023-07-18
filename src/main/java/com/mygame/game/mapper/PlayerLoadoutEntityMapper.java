package com.mygame.game.mapper;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mygame.game.entity.PlayerLoadoutEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * mapper interface for player loadout
 *
 * @author Lynx
 * @since 2023/07/18
 */
public interface PlayerLoadoutEntityMapper extends BaseMapper<PlayerLoadoutEntity> {
    int deleteByPrimaryKey(Long id);

    int insert(PlayerLoadoutEntity record);

    int insertSelective(PlayerLoadoutEntity record);

    PlayerLoadoutEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PlayerLoadoutEntity record);

    int updateByPrimaryKey(PlayerLoadoutEntity record);
}