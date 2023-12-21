package com.mygame.game.service;

import com.alibaba.fastjson.JSON;
import com.mygame.game.entity.PawnPartEntity;
import com.mygame.game.manager.PawnPartManager;
import com.mygame.game.model.mapstruct.PawnPartModelMapper;
import com.mygame.game.model.vo.PawnPartVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PawnPartService {

    private final PawnPartManager pawnPartManager;

    @Autowired
    public PawnPartService(PawnPartManager pawnPartManager) {
        this.pawnPartManager = pawnPartManager;
    }

    public List<PawnPartVO> listAll() {
        List<PawnPartEntity> allPawnParts = pawnPartManager.getAll();
        List<PawnPartVO> vos = new ArrayList<>(allPawnParts.size());
        allPawnParts.forEach(entity -> vos.add(PawnPartModelMapper.INSTANCE.toPawnPartVO(entity)));
        log.info("PawnPartService.listAll data:{}", JSON.toJSONString(vos));
        return vos;
    }
}
