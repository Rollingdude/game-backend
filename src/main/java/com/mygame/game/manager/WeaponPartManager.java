package com.mygame.game.manager;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mygame.game.entity.WeaponPartEntity;
import com.mygame.game.mapper.WeaponPartEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * weapon part manager
 *
 * @author Lynx
 * @since 2023/07/21
 */
@Component
public class WeaponPartManager {

    private final WeaponPartEntityMapper weaponPartEntityMapper;

    @Autowired
    public WeaponPartManager(WeaponPartEntityMapper weaponPartEntityMapper) {
        this.weaponPartEntityMapper = weaponPartEntityMapper;
    }

    public WeaponPartEntity getById(Long Id) {
        return weaponPartEntityMapper.selectById(Id);
    }

    /**
     * gets all the available weapon part
     *
     * @return weapon part entities
     */
    public List<WeaponPartEntity> getAll() {
        LambdaQueryWrapper<WeaponPartEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(WeaponPartEntity::getStatus, 1);
        return weaponPartEntityMapper.selectList(new LambdaQueryWrapper<>());
    }
}
