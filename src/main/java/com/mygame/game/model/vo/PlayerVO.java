package com.mygame.game.model.vo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * user vo class
 * @author Lynx
 * @since 2023/07/14
 */
@Data
public class PlayerVO implements Serializable {

    private static final long serialVersionUID = -2001195483134855573L;
    /**
     * player id
     */
    @JSONField(name = "PlayerId")
    private Long id;

    /**
     * nickname of the player
     */
    @JSONField(name = "Nickname")
    private String nickname;

    /**
     * password
     */
    @JSONField(name = "Password")
    private String password;

    /**
     * the game level
     */
    @JSONField(name = "Level")
    private Integer level;

    /**
     * personalSignature
     */
    @JSONField(name = "PersonalSignature")
    private String personalSignature;

    /**
     * avatar
     */
    @JSONField(name = "Avatar")
    private String avatar;

    /**
     * the platform the player came from
     * such as steam or epic
     */
    @JSONField(name = "Platform")
    private String platform;

    /**
     * nickname of the player on that platform
     */
    @JSONField(name = "PlatformNickname")
    private String platformNickname;
}
