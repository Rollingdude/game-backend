package com.mygame.game.model.vo;

import com.mygame.game.enums.ItemMeshType;
import lombok.Data;

/**
 * base ItemVO info
 *
 * @author Lynx
 * @since 2023/07/21
 */
@Data
public class ItemVO {

    /**
     * the item id
     */
    private Long id;

    /**
     * status
     * 0--禁用
     * 1--正常
     */
    private Byte status;

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
