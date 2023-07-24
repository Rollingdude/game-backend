package com.mygame.game.controller;

import com.mygame.game.api.IResponse;
import com.mygame.game.api.Response;
import com.mygame.game.model.vo.WeaponPartVO;
import com.mygame.game.model.vo.WeaponVO;
import com.mygame.game.service.WeaponPartService;
import com.mygame.game.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * weapon Controller
 *
 * @author Lynx
 * @since 2023/07/14
 */
@RestController
@RequestMapping("/weapon")
public class WeaponController {

    /**
     * weapon part service
     */
    private final WeaponService weaponService;

    @Autowired
    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    /**
     * get weapon by id
     *
     * @param id id
     * @return User Rsp
     */
    @GetMapping("/{id}")
    public IResponse<WeaponVO> getPlayer(@PathVariable("id") Long id) {
        return Response.success(weaponService.getById(id));
    }

    /**
     * get all available weapons
     *
     * @return weapons Rsp
     */
    @GetMapping("/listAll")
    public IResponse<List<WeaponVO>> listAll() {
        return Response.success(weaponService.getAll());
    }
}
