package com.mygame.game.model.dto;

import lombok.Data;

/**
 * request params for updating a loadout
 * @author Lynx
 * @since 2023/07/18
 */
@Data
public class LoadoutUpdateDTO {

    private Long id;

    private String name;

    private String content;
}
