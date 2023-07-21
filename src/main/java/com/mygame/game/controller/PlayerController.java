package com.mygame.game.controller;

import com.mygame.game.api.IResponse;
import com.mygame.game.api.Response;
import com.mygame.game.model.vo.PlayerVO;
import com.mygame.game.service.IPlayerService;
import org.springframework.web.bind.annotation.*;

/**
 * User Controller
 *
 * @author Lynx
 * @since 2023/07/14
 */
@RestController
@RequestMapping("/player")
public class PlayerController {

    private final IPlayerService playerService;

    public PlayerController(IPlayerService playerService) {
        this.playerService = playerService;
    }


    /**
     * get user info by userId
     *
     * @param userId userId
     * @return User Rsp
     */
    @GetMapping("/getByPlayerId")
    public IResponse<PlayerVO> getPlayer(@RequestParam("playerId") Long playerId) {
        return Response.success(playerService.getUserInfo(playerId));
    }
}
