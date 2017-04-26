package fr.iutinfo.wardut;

import fr.iutinfo.wardut.cards.Card;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		game.init();
		
		while (game.isNotEnd()) {
			doPlayerTurn(game.getPlayer1());
			doPlayerTurn(game.getPlayer2());
			game.doBattle();
		}
		
		ConsoleIHM.showWinner(game);
	}

	private static void doPlayerTurn(Player currentPlayer) {
		ConsoleIHM.showBoard(currentPlayer);
		ConsoleIHM.showHand(currentPlayer);
		Card cardToPlay = ConsoleIHM.selectOneCard(currentPlayer);
		currentPlayer.playCard(cardToPlay);
	}

	
}
