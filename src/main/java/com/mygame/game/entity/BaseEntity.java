package com.mygame.game.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * base entity class for all entities
 *
 * @author Lynx
 * @since 2023/07/14
 */
@Data
public class BaseEntity {

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * createTime
     */
    @TableField(fill = FieldFill.INSERT)
    private Long createTime;

    /**
     * status
     * 0--禁用
     * 1--正常
     */
    private Byte states;

    /**
     * updateTime
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateTime;

}
