package com.mygame.game.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.mygame.game.entity.item.ItemEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * weapon entity
 *
 * @author Lynx
 * @since 2023/07/19
 */
@EqualsAndHashCode(callSuper = true)
@TableName("tb_weapons")
@Data
public class WeaponEntity extends ItemEntity {

    private Byte weaponCategory;

    private Byte concrete;

    private Integer baseClipCapacity;

    private Integer baseClipSize;

    private Integer maxAmmo;

    private Float timeBetweenShots;

    private Float adsInTime;

    private Float adsOutTime;

    private Float baseAdsFov;

    private Float baseDamage;

    private Float muzzleSpeed;

    private Float scanTraceRange;

    private Integer semiBurstCount;

    private Float semiBurstInterval;

    private Integer bulletPerCartridge;

    private Float projectileDamageMultiplier;

    private Boolean requireOpticRail;

    private Byte priority;

    private String availableFireModes;

    private String availableReloadTypes;

    private String defaultWeaponPartPath;

    private String projectileClassPath;

    private String weaponEffectsAssetsPath;

    private Float baseRecoilHorizontalFactor;

    private Float baseRecoilVerticalFactor;
}