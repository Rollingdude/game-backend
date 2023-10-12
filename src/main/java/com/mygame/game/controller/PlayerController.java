package com.mygame.game.controller;

import com.mygame.game.api.IResponse;
import com.mygame.game.api.Response;
import com.mygame.game.model.vo.PlayerVO;
import com.mygame.game.service.PlayerService;
import org.springframework.data.web.JsonPath;
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

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


    /**
     * get user info by userId
     *
     * @param playerId playerId
     * @return User Rsp
     */
    @GetMapping("/{playerId}")
    public IResponse<PlayerVO> getPlayer(@PathVariable("playerId") Long playerId) {
        return Response.success(playerService.getPlayerInfo(playerId));
    }
}
