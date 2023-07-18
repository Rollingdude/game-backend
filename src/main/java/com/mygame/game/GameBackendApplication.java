package com.mygame.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * starts the game backend server starter
 * @author Lynx
 * @since 2023、07、14
 */
@SpringBootApplication
public class GameBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameBackendApplication.class, args);
    }
}
