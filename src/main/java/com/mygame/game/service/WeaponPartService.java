package com.mygame.game.service;

import com.mygame.game.manager.WeaponPartManager;
import com.mygame.game.model.mapstruct.WeaponPartModelMapper;
import com.mygame.game.model.vo.WeaponPartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Weapon part service
 *
 * @author Lynx
 * @since 2023/07/21
 */
@Service
public class WeaponPartService {

    private final WeaponPartManager weaponPartManager;

    @Autowired
    public WeaponPartService(WeaponPartManager weaponPartManager) {
        this.weaponPartManager = weaponPartManager;
    }

    public WeaponPartVO getbyId(Long id) {
        return WeaponPartModelMapper.INSTANCE.toWeaponPartVo(weaponPartManager.getById(id));
    }
}
