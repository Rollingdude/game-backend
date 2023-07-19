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

    private String alias;

    /**
     * item type
     */
    private Byte  ItemType;

    /** item desc*/
    private String desc;

    private ItemMeshType MeshType ;

    /** the related animation asset to use*/

    private String ItemAnimDataPath;

    /** the skeletal mesh to use if applicable*/
    private String ItemSkeletalMeshPath;

    private String ItemStaticMeshPath;

    /**the item avatar actor class*/
    String AvatarActorClassPath;

    /** the item anim class*/
    private String  ItemAnimClassPath;
}
