package com.mygame.game.manager;

import com.mygame.game.mapper.CharacterPartEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Character part manager
 */
@Component
public class CharacterPartManager {


    private CharacterPartEntityMapper characterPartEntityMapper;

    @Autowired
    public CharacterPartManager(CharacterPartEntityMapper characterPartEntityMapper) {
        this.characterPartEntityMapper = characterPartEntityMapper;
    }
}
