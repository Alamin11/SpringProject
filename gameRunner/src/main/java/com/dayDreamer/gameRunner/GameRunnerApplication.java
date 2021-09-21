package com.dayDreamer.gameRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dayDreamer.gameRunner.game.GameRunner;
import com.dayDreamer.gameRunner.game.MarioGame;
import com.dayDreamer.gameRunner.game.SuperContraGame;

@SpringBootApplication
public class GameRunnerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(GameRunnerApplication.class, args);
		
		//GameRunner, MarioGame
	GameRunner runner = context.getBean(GameRunner.class);
//		
//		MarioGame game = new MarioGame();
//		//SuperContraGame game = new SuperContraGame();
//
//		GameRunner runner = new GameRunner(game);
		
		
		runner.run();
	}

}
