package com.mygame.game.model.vo;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PawnPartVO extends ItemVO {

    @JSONField(name = "PawnPartType")
    private String pawnPartType;

    @JSONField(name = "SocketNames")
    private String socketNames;
}
