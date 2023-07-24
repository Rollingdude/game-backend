package com.mygame.game.service;

import com.mygame.game.entity.WeaponPartEntity;
import com.mygame.game.manager.WeaponPartManager;
import com.mygame.game.model.mapstruct.WeaponPartModelMapper;
import com.mygame.game.model.vo.WeaponPartVO;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public WeaponPartVO getById(Long id) {
        return WeaponPartModelMapper.INSTANCE.toWeaponPartVo(weaponPartManager.getById(id));
    }

    /**
     * get all the weapon part data
     *
     * @return all weapon part
     */
    public List<WeaponPartVO> listAll() {
        List<WeaponPartEntity> allWeaponPartEntities = weaponPartManager.getAll();
        if (CollectionUtils.isEmpty(allWeaponPartEntities)) {
            return new ArrayList<>();
        }
        List<WeaponPartVO> allWeaponParts = new ArrayList<>(allWeaponPartEntities.size());
        allWeaponPartEntities.forEach(weaponPartEntity -> allWeaponParts.add(WeaponPartModelMapper.INSTANCE.toWeaponPartVo(weaponPartEntity)));
        return allWeaponParts;
    }
}
