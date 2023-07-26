package com.mygame.game.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * player load out
 *
 * @author Lynx
 * @since 2023/07/18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_player_loadout")
public class PlayerLoadoutEntity extends BaseEntity {

    /**
     * the player owns this loadout
     */
    private Long playerId;

    /**
     * the loadout content data
     */
    private String content;

    /**
     * index of this loadoutd
     */
    private Byte loadoutIndex;

    /**
     * loadout name
     */
    private String name;

}