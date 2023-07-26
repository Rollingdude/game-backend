package com.mygame.game.model.vo;

import com.alibaba.fastjson2.annotation.JSONField;
import com.mygame.game.config.JsonStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Weapon VO class
 *
 * @author Lynx.Luo
 * @since 2023/07/24
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WeaponVO extends ItemVO {

    @JSONField(name = "WeaponCategory")
    private String weaponCategory;

    @JSONField(name = "bConcrete")
    private Byte concrete;

    @JSONField(name = "BaseClipCapacity")
    private Integer baseClipCapacity;

    @JSONField(name = "BaseClipSize")
    private Integer baseClipSize;

    @JSONField(name = "MaxAmmo")
    private Integer maxAmmo;

    @JSONField(name = "TimeBetweenShots")
    private Float timeBetweenShots;

    @JSONField(name = "AdsInTime")
    private Float adsInTime;

    @JSONField(name = "AdsOutTime")
    private Float adsOutTime;

    @JSONField(name = "BaseAdsFov")
    private Float baseAdsFov;

    @JSONField(name = "BaseDamage")
    private Float baseDamage;

    @JSONField(name = "MuzzleSpeed")
    private Float muzzleSpeed;

    @JSONField(name = "ScanTraceRange")
    private Float scanTraceRange;

    @JSONField(name = "SemiBurstCount")
    private Integer semiBurstCount;

    @JSONField(name = "SemiBurstInterval")
    private Float semiBurstInterval;

    @JSONField(name = "BulletPerCartridge")
    private Integer bulletPerCartridge;

    @JSONField(name = "ProjectileDamageMultiplier")
    private Float projectileDamageMultiplier;

    @JSONField(name = "RequireOpticRail")
    private Boolean requireOpticRail;

    @JSONField(name = "priority")
    private Byte priority;

    @JSONField(name = "AvailableFireModes",serializeUsing = JsonStringSerializer.class)
    private String availableFireModes;

    @JSONField(name = "AvailableReloadTypes",serializeUsing = JsonStringSerializer.class)
    private String availableReloadTypes;

    @JSONField(name = "DefaultWeaponPartPath")
    private String defaultWeaponPartPath;

    @JSONField(name = "ProjectileClassPath")
    private String projectileClassPath;

    @JSONField(name = "WeaponEffectsAssetsPath")
    private String weaponEffectsAssetsPath;

    @JSONField(name = "BaseRecoilHorizontalFactor")
    private Float baseRecoilHorizontalFactor;

    @JSONField(name = "BaseRecoilVerticalFactor")
    private Float baseRecoilVerticalFactor;
}
