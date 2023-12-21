package com.mygame.game.model.mapstruct;

import com.mygame.game.entity.PawnPartEntity;
import com.mygame.game.model.vo.PawnPartVO;
import org.mapstruct.factory.Mappers;

/**
 * PawnPartModelMapper,manipulate coping of PawnPart related properties
 *
 * @author Lynx
 * @since 2023/07/14
 */
public interface PawnPartModelMapper {

    PawnPartModelMapper INSTANCE = Mappers.getMapper(PawnPartModelMapper.class);

    PawnPartVO toPawnPartVO(PawnPartEntity pawnPartEntity);
}
