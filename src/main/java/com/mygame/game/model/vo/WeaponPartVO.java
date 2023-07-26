package com.mygame.game.model.vo;

import com.alibaba.fastjson2.annotation.JSONField;
import com.mygame.game.config.JsonStringSerializer;
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

    @JSONField(name = "DedicatedWeaponId")
    private Integer dedicatedWeaponId;
    @JSONField(name = "AttachParentSocketName")
    private String attachParentSocketName;

    @JSONField(name = "WeaponPartType")
    private String weaponPartType;

    @JSONField(name = "CompatibleWeapons", serializeUsing = JsonStringSerializer.class)
    private String compatibleWeapons;

    @JSONField(name = "SocketTypeAndNames", serializeUsing = JsonStringSerializer.class)
    private String socketTypeAndNames;
}
