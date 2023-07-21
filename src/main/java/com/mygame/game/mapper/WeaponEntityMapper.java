package com.mygame.game.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mygame.game.entity.WeaponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * WeaponEntityMapper
 *
 * @author Lynx
 * @since 2023/07/19
 */
@Mapper
public interface WeaponEntityMapper extends BaseMapper<WeaponEntity> {
    int deleteByPrimaryKey(Long id);
}