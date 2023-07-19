package com.mygame.game.entity.item;

import com.mygame.game.entity.BaseEntity;
import com.mygame.game.enums.ItemMeshType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * item entity
 *
 * @author Lynx
 * @since 2023/07/18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ItemEntity extends BaseEntity {
    /**
     * item name
     */
    private String ItemName;

    /**
     * item alias name
     */
    private String alias;

    /**
     * item type
     */
    private String ItemType;

    /**
     * item desc
     */
    private String desc;

    /**
     * visual mesh type
     */
    private ItemMeshType MeshType;

    /**
     * the related animation asset to use
     */

    private String ItemAnimDataPath;

    /**
     * the skeletal mesh to use if applicable
     */
    private String skeletalMeshPath;

    /**
     * static mesh assets path
     */
    private String staticMeshPath;

    /**
     * the item avatar actor class
     */
    String AvatarActorClassPath;

    /**
     * the item anim class
     */
    private String ItemAnimClassPath;
}
