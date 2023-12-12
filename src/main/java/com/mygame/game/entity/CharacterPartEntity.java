package com.mygame.game.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CharacterPartEntity extends BaseEntity {
    private String itemName;

    private String itemType;

    private Byte applyType;

    private String skeletalMeshPath;
}