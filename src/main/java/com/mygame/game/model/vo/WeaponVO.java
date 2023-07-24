package com.mygame.game.model.vo;

import lombok.Data;

/**
 * Weapon VO class
 *
 * @author Lynx.Luo
 * @since 2023/07/24
 */
@Data
public class WeaponVO extends ItemVO {

    private String weaponCategory;

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
