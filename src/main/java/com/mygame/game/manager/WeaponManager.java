package com.mygame.game.manager;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mygame.game.entity.WeaponEntity;
import com.mygame.game.mapper.WeaponEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * weapon entity management
 *
 * @author Lynx
 * @since 2023/07/19
 */
@Component
public class WeaponManager {

    private final WeaponEntityMapper weaponEntityMapper;

    @Autowired
    public WeaponManager(WeaponEntityMapper weaponEntityMapper) {
        this.weaponEntityMapper = weaponEntityMapper;
    }

    /**
     * get weapon by id
     *
     * @param id weapon id
     * @return weapon entity
     */
    public WeaponEntity getById(Long id) {
        return weaponEntityMapper.selectById(id);
    }


    /**
     * get all the weapon entities
     *
     * @return all weapon entities
     */
    public List<WeaponEntity> getAll() {
        LambdaQueryWrapper<WeaponEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(WeaponEntity::getStatus, 1);
        return weaponEntityMapper.selectList(lambdaQueryWrapper);
    }
}
