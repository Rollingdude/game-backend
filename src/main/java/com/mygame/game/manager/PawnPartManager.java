package com.mygame.game.manager;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mygame.game.entity.PawnPartEntity;
import com.mygame.game.mapper.PawnPartEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Character part manager
 */
@Component
public class PawnPartManager {
    private final PawnPartEntityMapper pawnPartEntityMapper;

    @Autowired
    public PawnPartManager(PawnPartEntityMapper pawnPartEntityMapper) {
        this.pawnPartEntityMapper = pawnPartEntityMapper;
    }

    /**
     * queries all the data
     *
     * @return all pawn part list
     */
    public List<PawnPartEntity> getAll() {
        LambdaQueryWrapper<PawnPartEntity> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(PawnPartEntity::getStates, 1);
        return pawnPartEntityMapper.selectList(queryWrapper);
    }
}
