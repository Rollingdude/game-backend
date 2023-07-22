package com.mygame.game.controller;

import com.mygame.game.api.IResponse;
import com.mygame.game.api.Response;
import com.mygame.game.model.dto.LoadoutUpdateDTO;
import com.mygame.game.model.vo.PlayerLoadoutVO;
import com.mygame.game.service.PlayerLoadoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * api for player loadout
 *
 * @author Lynx
 * @since 2023/07/18
 */
@RestController
@RequestMapping("/loadout")
public class PlayerLoadoutController {

    private final PlayerLoadoutService playerLoadoutService;

    @Autowired
    public PlayerLoadoutController(PlayerLoadoutService playerLoadoutService) {
        this.playerLoadoutService = playerLoadoutService;
    }

    /**
     * gets the loadout by player id
     *
     * @param playerId playerid
     * @return loadout data
     */
    @GetMapping("/{playerId}")
    IResponse<List<PlayerLoadoutVO>> getByPlayer(@PathVariable("playerId") Long playerId) {
        return Response.success(playerLoadoutService.getPlayerLoadouts(playerId));
    }

    /**
     * gets the loadout by player id
     *
     * @param loadoutUpdateDTO loadoutUpdateDTO
     * @return void
     */
    @GetMapping("/update")
    IResponse<Void> UpdateLoadout(@RequestBody LoadoutUpdateDTO loadoutUpdateDTO) {
        playerLoadoutService.UpdateLoadout(loadoutUpdateDTO);
        return Response.success();
    }
}
