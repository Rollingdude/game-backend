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
    private String itemName;

    /**
     * item alias name
     */
    private String alias;

    /**
     * item type
     */
    private String itemType;

    /**
     * item desc
     */
    private String description;

    /**
     * visual mesh type
     */
    private String meshType;

    /**
     * the related animation asset to use
     */

    private String itemAnimDataPath;

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
    String avatarActorClassPath;

    /**
     * the item anim class
     */
    private String itemAnimClassPath;

    /**
     * display icons assets path used by ui
     */
    private String iconAssetsPath;
}
