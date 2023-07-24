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
    /**
     * available attachment socket this weapon part contains
     */
    private String attachmentSockets;

    /**
     * the weapon id this part dedicated for
     */
    private Long dedicatedWeaponId;

    /**
     * indicates if this is a concrete Weapon part
     */
    private Byte concrete;

    /**
     * the buff items applied to this weapon part
     */
    private String buffItemIds;

}