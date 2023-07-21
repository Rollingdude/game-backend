package com.mygame.game.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * weapon part VO info
 *
 * @author Lynx
 * @since 2023/07/21
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WeaponPartVO extends ItemVO {
    /**
     * available attachment socket this weapon part contains
     */
    private String attachmentSockets;

    /**
     * the weapon id this part dedicated for
     */
    private Long dedicateWeaponId;

    /**
     * indicates if this is a concrete Weapon part
     */
    private Byte concrete;
}
