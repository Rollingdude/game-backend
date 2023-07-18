package com.mygame.game.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mygame.game.entity.PlayerEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * player mapper
 *
 * @author Lynx
 * @since 2023/07/14
 */
@Mapper
public interface PlayerMapper extends BaseMapper<PlayerEntity> {
}
