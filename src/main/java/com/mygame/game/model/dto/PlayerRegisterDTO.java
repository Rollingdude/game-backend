package com.mygame.game.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PlayerRegisterDTO implements Serializable {

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
