package com.mygame.game.manager;

import com.mygame.game.entity.WeaponPartEntity;
import com.mygame.game.mapper.WeaponPartEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
