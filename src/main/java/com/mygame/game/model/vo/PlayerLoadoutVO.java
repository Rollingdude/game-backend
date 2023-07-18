package com.mygame.game.model.vo;

import lombok.Data;

/**
 * loadout vo
 *
 * @author Lynx
 * @since 2023/07/18
 */
@Data
public class PlayerLoadoutVO {

    /**
     * the actual load out content data
     */
    private String content;

    /**
     * loadout index
     */
    private Byte loadoutIndex;

    /**
     * the name for this loadout
     */
    private String loadoutName;

}
