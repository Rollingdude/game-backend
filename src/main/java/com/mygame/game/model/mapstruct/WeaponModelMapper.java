package com.mygame.game.model.mapstruct;

import com.mygame.game.entity.PlayerEntity;
import com.mygame.game.entity.WeaponEntity;
import com.mygame.game.model.vo.PlayerVO;
import com.mygame.game.model.vo.WeaponVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Weapon model mapper
 * @author Lynx.Luo
 * @since 2023/07/24
 */
@Mapper
public interface WeaponModelMapper {
    WeaponModelMapper INSTANCE = Mappers.getMapper(WeaponModelMapper.class);

    /**
     * gets a copy of the weaponEntity
     *
     * @param weaponEntity source weaponEntity
     * @return copy of source weaponEntity
     */
    WeaponEntity copyOf(WeaponEntity weaponEntity);

    /**
     * convert the userEntity to userVO instance
     *
     * @param weaponEntity source weaponEntity
     * @return weaponEntity
     */
    WeaponVO toWeaponVO(WeaponEntity weaponEntity);
}
