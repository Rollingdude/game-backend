package com.mygame.game.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * request params for updating a loadout
 *
 * @author Lynx
 * @since 2023/07/18
 */
@Data
public class LoadoutUpdateDTO implements Serializable {

    private static final long serialVersionUID = -6730580635320977644L;
    /**
     * loadout id
     */
    private Integer id;

    /**
     * loadout name
     */
    private String name;

    /**
     * loadout data content
     */
    private String content;
}
