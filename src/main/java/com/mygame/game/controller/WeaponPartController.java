package com.mygame.game.controller;

import com.mygame.game.api.IResponse;
import com.mygame.game.api.Response;
import com.mygame.game.model.vo.WeaponPartVO;
import com.mygame.game.service.WeaponPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * weaponPart Controller
 *
 * @author Lynx
 * @since 2023/07/14
 */
@RestController
@RequestMapping("/weaponPart")
public class WeaponPartController {

    /**
     * weapon part service
     */
    private final WeaponPartService weaponPartService;

    @Autowired
    public WeaponPartController(WeaponPartService weaponPartService) {
        this.weaponPartService = weaponPartService;
    }

    /**
     * get user info by userId
     *
     * @param id id
     * @return User Rsp
     */
    @GetMapping("/{id}")
    public IResponse<WeaponPartVO> getPlayer(@PathVariable("id") Long id) {
        return Response.success(weaponPartService.getbyId(id));
    }
}
