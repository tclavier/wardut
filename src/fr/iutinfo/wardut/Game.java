package fr.iutinfo.wardut;

public class Game {
	private Player player1 = new Player();
	private Player player2 = new Player();

	public void init() {
		player1.init();
		player2.init();
	}

	public boolean isNotEnd() {
		// TODO
		return false;
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void doBattle() {
		// TODO plus tard s'occuper des sapeurs et des
		player1.applySpell(player1, player2);
		player2.applySpell(player2, player1);
		Integer damage1 = player1.computeDamage();
		Integer damage2 = player2.computeDamage();
		player2.killUnits(damage1);
		player1.killUnits(damage2);
		player1.resetSpell();
		player2.resetSpell();
	}
}
