package com.mygame.game.entity;

import com.mygame.game.entity.item.ItemEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PawnPartEntity extends ItemEntity {
    private String pawnPartType;

    private String socketNames;

}