package com.mygame.game.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * user vo class
 * @author Lynx
 * @since 2023/07/14
 */
@Data
public class PlayerVO implements Serializable {

    /**
     * userId
     */
    private Long id;

    /**
     * nickname of the player
     */
    private String nickname;

    /**
     * password
     */
    private String password;

    /**
     * the game level
     */
    private Integer level;

    /**
     * personalSignature
     */
    private String personalSignature;

    /**
     * avatar
     */
    private String avatar;

    /**
     * the platform the player came from
     * such as steam or epic
     */
    private String platform;

    /**
     * nickname of the player on that platform
     */
    private String platformNickname;
}
