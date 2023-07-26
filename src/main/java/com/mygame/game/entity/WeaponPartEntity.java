package com.mygame.game.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.mygame.game.entity.item.ItemEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Weapon part entity
 *
 * @author Lynx
 * @since 2023/07/21
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("tb_weapon_part")
public class WeaponPartEntity extends ItemEntity {

    private Integer dedicatedWeaponId;

    private String attachParentSocketName;

    private String weaponPartType;

    private String compatibleWeapons;

    private String socketTypeAndNames;

}