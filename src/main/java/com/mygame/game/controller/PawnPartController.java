package com.mygame.game.controller;

import com.mygame.game.api.IResponse;
import com.mygame.game.api.Response;
import com.mygame.game.model.vo.PawnPartVO;
import com.mygame.game.service.PawnPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * api for pawn part
 */
@RestController
@RequestMapping("/pawnPart")
public class PawnPartController {

    private final PawnPartService pawnPartService;

    @Autowired
    public PawnPartController(PawnPartService pawnPartService) {
        this.pawnPartService = pawnPartService;
    }

    @RequestMapping("/listAll")
    public IResponse<List<PawnPartVO>> listAllPawnParts() {
        return Response.success(pawnPartService.listAll());
    }
}
