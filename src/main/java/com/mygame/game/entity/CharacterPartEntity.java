package com.mygame.game.entity;

import lombok.Data;

@Data
public class CharacterPartEntity extends BaseEntity {
    private String itemName;

    private String itemType;

    private Byte applyType;

    private String skeletalMeshPath;
}