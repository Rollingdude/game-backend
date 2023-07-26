package com.mygame.game.model.vo;

import com.alibaba.fastjson2.annotation.JSONField;
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
    @JSONField(name = "Id")
    private Long id;

    /**
     * status
     * 0--禁用
     * 1--正常
     */
    @JSONField(name = "States")
    private Byte states;

    /**
     * item name
     */
    @JSONField(name = "ItemName")
    private String itemName;

    /**
     * item alias name
     */
    @JSONField(name = "Alias")
    private String alias;

    /**
     * item type
     */
    @JSONField(name = "ItemType")
    private String itemType;

    /**
     * item desc
     */
    @JSONField(name = "Description")
    private String description;

    /**
     * visual mesh type
     */
    @JSONField(name = "MeshType")
    private String meshType;

    /**
     * the related animation asset to use
     */
    @JSONField(name = "ItemAnimDataPath")
    private String itemAnimDataPath;

    /**
     * the skeletal mesh to use if applicable
     */
    @JSONField(name = "SkeletalMeshPath")
    private String skeletalMeshPath;

    /**
     * static mesh assets path
     */
    @JSONField(name = "StaticMeshPath")
    private String staticMeshPath;

    /**
     * the item avatar actor class
     */
    @JSONField(name = "avatarActorClassPath")
    String AvatarActorClassPath;

    /**
     * the item anim class
     */
    @JSONField(name = "ItemAnimClassPath")
    private String itemAnimClassPath;
}
