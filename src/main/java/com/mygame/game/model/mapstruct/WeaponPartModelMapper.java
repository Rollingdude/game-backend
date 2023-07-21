package com.mygame.game.model.mapstruct;

import com.mygame.game.entity.WeaponPartEntity;
import com.mygame.game.model.vo.WeaponPartVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WeaponPartModelMapper {
    /**
     * the mapper instance
     */
    WeaponPartModelMapper INSTANCE = Mappers.getMapper(WeaponPartModelMapper.class);

    /**
     * gets a weapon part entity copy
     *
     * @param sourceEntity source entity
     * @return copied entity
     */
    WeaponPartEntity getCopy(WeaponPartEntity sourceEntity);


    /**
     * converts the weapon part entity to it's VO object
     *
     * @param weaponPartEntity weaponPartEntity
     * @return WeaponPartVO
     */
    WeaponPartVO toWeaponPartVo(WeaponPartEntity weaponPartEntity);
}
