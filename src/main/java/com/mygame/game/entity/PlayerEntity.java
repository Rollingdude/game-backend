package com.mygame.game.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * user entity
 *
 * @author Lynx
 * @since 2023/07/17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_player")
public class PlayerEntity extends BaseEntity{
    /**
     * user's preferred nickname
     */
    private String nickname;

    /**
     * password
     */
    private String password;

    /**
     * game level
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
     * the platform that the player came from,such as steam
     */
    private String platform;

    /**
     * the nickname of the player on that platform
     */
    private String platformNickname;

    /**
     * which load out dose the player preferred
     */
    private Byte preferredLoadoutIndex;
}