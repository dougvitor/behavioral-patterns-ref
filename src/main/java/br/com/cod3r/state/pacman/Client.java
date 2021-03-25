package br.com.cod3r.state.pacman;

import java.io.IOException;

import br.com.cod3r.state.pacman.game.Game;

public class Client {

	public static void main(String[] args) throws IOException {
		Ghost ghost = new Ghost();

		Game game = new Game();
		game.addListener(option -> {
			switch (option) {
				case "1" -> ghost.spotPacman();
				case "2" -> ghost.losePacman(); 
				case "3" -> ghost.pacmanTurnsSpecial();
				case "4" -> ghost.pacmanTurnsNormal();
				case "5" -> ghost.eatenByPacman();
				case "6" -> ghost.reachTheBase();
				case "0" -> game.stopLoop();
				default -> System.out.println("Invalid Option");
			}
		});

		game.startLoop();
	}
}
