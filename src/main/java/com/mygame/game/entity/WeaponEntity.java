package com.mygame.game.entity;

public class WeaponEntity {
    private Long id;

    private String itemName;

    private String alias;

    private Integer itemType;

    private String staticMeshAssets;

    private String skeletalMeshAssets;

    private Byte weaponCategory;

    private Byte concrete;

    private Integer baseClipCapacity;

    private Integer baseClipSize;

    private Integer maxAmmo;

    private Float timeBetweenShots;

    private Float adsInTime;

    private Float adsOutTime;

    private Float baseAdsFov;

    private Float baseeDamage;

    private Float muzzleSpeed;

    private Float scanTraceRange;

    private Integer semiBurstCount;

    private Float semiBurstInverval;

    private Integer bulletPerCartrige;

    private Float projectileDamageMultiplier;

    private Boolean requreOpticRail;

    private Byte priority;

    private String availableFireModes;

    private String availableReloadTypes;

    private String defaultWeaponPartPath;

    private String projectileClassPath;

    private String weaponEffectsAssetsPath;

    private Float baseRecoilHorizontalFactor;

    private Float baseRecoilVerticalFactor;

    private String desc;

    private Long createTime;

    private Long updateTime;

    private Boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public String getStaticMeshAssets() {
        return staticMeshAssets;
    }

    public void setStaticMeshAssets(String staticMeshAssets) {
        this.staticMeshAssets = staticMeshAssets == null ? null : staticMeshAssets.trim();
    }

    public String getSkeletalMeshAssets() {
        return skeletalMeshAssets;
    }

    public void setSkeletalMeshAssets(String skeletalMeshAssets) {
        this.skeletalMeshAssets = skeletalMeshAssets == null ? null : skeletalMeshAssets.trim();
    }

    public Byte getWeaponCategory() {
        return weaponCategory;
    }

    public void setWeaponCategory(Byte weaponCategory) {
        this.weaponCategory = weaponCategory;
    }

    public Byte getConcrete() {
        return concrete;
    }

    public void setConcrete(Byte concrete) {
        this.concrete = concrete;
    }

    public Integer getBaseClipCapacity() {
        return baseClipCapacity;
    }

    public void setBaseClipCapacity(Integer baseClipCapacity) {
        this.baseClipCapacity = baseClipCapacity;
    }

    public Integer getBaseClipSize() {
        return baseClipSize;
    }

    public void setBaseClipSize(Integer baseClipSize) {
        this.baseClipSize = baseClipSize;
    }

    public Integer getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(Integer maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public Float getTimeBetweenShots() {
        return timeBetweenShots;
    }

    public void setTimeBetweenShots(Float timeBetweenShots) {
        this.timeBetweenShots = timeBetweenShots;
    }

    public Float getAdsInTime() {
        return adsInTime;
    }

    public void setAdsInTime(Float adsInTime) {
        this.adsInTime = adsInTime;
    }

    public Float getAdsOutTime() {
        return adsOutTime;
    }

    public void setAdsOutTime(Float adsOutTime) {
        this.adsOutTime = adsOutTime;
    }

    public Float getBaseAdsFov() {
        return baseAdsFov;
    }

    public void setBaseAdsFov(Float baseAdsFov) {
        this.baseAdsFov = baseAdsFov;
    }

    public Float getBaseeDamage() {
        return baseeDamage;
    }

    public void setBaseeDamage(Float baseeDamage) {
        this.baseeDamage = baseeDamage;
    }

    public Float getMuzzleSpeed() {
        return muzzleSpeed;
    }

    public void setMuzzleSpeed(Float muzzleSpeed) {
        this.muzzleSpeed = muzzleSpeed;
    }

    public Float getScanTraceRange() {
        return scanTraceRange;
    }

    public void setScanTraceRange(Float scanTraceRange) {
        this.scanTraceRange = scanTraceRange;
    }

    public Integer getSemiBurstCount() {
        return semiBurstCount;
    }

    public void setSemiBurstCount(Integer semiBurstCount) {
        this.semiBurstCount = semiBurstCount;
    }

    public Float getSemiBurstInverval() {
        return semiBurstInverval;
    }

    public void setSemiBurstInverval(Float semiBurstInverval) {
        this.semiBurstInverval = semiBurstInverval;
    }

    public Integer getBulletPerCartrige() {
        return bulletPerCartrige;
    }

    public void setBulletPerCartrige(Integer bulletPerCartrige) {
        this.bulletPerCartrige = bulletPerCartrige;
    }

    public Float getProjectileDamageMultiplier() {
        return projectileDamageMultiplier;
    }

    public void setProjectileDamageMultiplier(Float projectileDamageMultiplier) {
        this.projectileDamageMultiplier = projectileDamageMultiplier;
    }

    public Boolean getRequreOpticRail() {
        return requreOpticRail;
    }

    public void setRequreOpticRail(Boolean requreOpticRail) {
        this.requreOpticRail = requreOpticRail;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public String getAvailableFireModes() {
        return availableFireModes;
    }

    public void setAvailableFireModes(String availableFireModes) {
        this.availableFireModes = availableFireModes == null ? null : availableFireModes.trim();
    }

    public String getAvailableReloadTypes() {
        return availableReloadTypes;
    }

    public void setAvailableReloadTypes(String availableReloadTypes) {
        this.availableReloadTypes = availableReloadTypes == null ? null : availableReloadTypes.trim();
    }

    public String getDefaultWeaponPartPath() {
        return defaultWeaponPartPath;
    }

    public void setDefaultWeaponPartPath(String defaultWeaponPartPath) {
        this.defaultWeaponPartPath = defaultWeaponPartPath == null ? null : defaultWeaponPartPath.trim();
    }

    public String getProjectileClassPath() {
        return projectileClassPath;
    }

    public void setProjectileClassPath(String projectileClassPath) {
        this.projectileClassPath = projectileClassPath == null ? null : projectileClassPath.trim();
    }

    public String getWeaponEffectsAssetsPath() {
        return weaponEffectsAssetsPath;
    }

    public void setWeaponEffectsAssetsPath(String weaponEffectsAssetsPath) {
        this.weaponEffectsAssetsPath = weaponEffectsAssetsPath == null ? null : weaponEffectsAssetsPath.trim();
    }

    public Float getBaseRecoilHorizontalFactor() {
        return baseRecoilHorizontalFactor;
    }

    public void setBaseRecoilHorizontalFactor(Float baseRecoilHorizontalFactor) {
        this.baseRecoilHorizontalFactor = baseRecoilHorizontalFactor;
    }

    public Float getBaseRecoilVerticalFactor() {
        return baseRecoilVerticalFactor;
    }

    public void setBaseRecoilVerticalFactor(Float baseRecoilVerticalFactor) {
        this.baseRecoilVerticalFactor = baseRecoilVerticalFactor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}