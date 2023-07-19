package com.mygame.game.manager;

import com.mygame.game.entity.WeaponEntity;
import com.mygame.game.mapper.WeaponEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
