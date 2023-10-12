package com.mygame.game.service;

import com.alibaba.fastjson.JSON;
import com.mygame.game.entity.WeaponEntity;
import com.mygame.game.manager.WeaponManager;
import com.mygame.game.model.mapstruct.WeaponModelMapper;
import com.mygame.game.model.vo.WeaponVO;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Weapon Service
 *
 * @author Lynx.Luo
 * @since 2023/07/24
 */
@Service
public class WeaponService {

    private static final Logger logger = LoggerFactory.getLogger(WeaponService.class);

    private final WeaponManager weaponManager;

    @Autowired
    public WeaponService(WeaponManager weaponManager) {
        this.weaponManager = weaponManager;
    }

    public WeaponVO getById(Long id) {
        return WeaponModelMapper.INSTANCE.toWeaponVO(weaponManager.getById(id));
    }

    public List<WeaponVO> getAll() {
        List<WeaponEntity> allWeaponEntities = weaponManager.getAll();
        if (CollectionUtils.isEmpty(allWeaponEntities)) {
            return new ArrayList<>();
        }
        List<WeaponVO> allWeapons = new ArrayList<>(allWeaponEntities.size());
        allWeaponEntities.forEach(weaponPartEntity -> allWeapons.add(WeaponModelMapper.INSTANCE.toWeaponVO(weaponPartEntity)));
        logger.info(JSON.toJSONString(allWeapons));
        return allWeapons;
    }
}
