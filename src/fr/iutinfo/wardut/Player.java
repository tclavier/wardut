package fr.iutinfo.wardut;

import fr.iutinfo.wardut.cards.Card;

public class Player {
	private Deck deck;
	private Hand hand = new Hand();

	public void init() {
		deck = Deck.generateNewDeck(25);
		for (int i = 0; i < 5; i++) {
			hand.addCard(deck.nextCard());
		}
	}

	public void playCard(Card cardToPlay) {
		// TODO Auto-generated method stub
		
	}

	public Integer computeDamage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void killUnits(Integer damage1) {
		// TODO Auto-generated method stub
		
	}

	public void applySpell(Player me, Player other) {
		// TODO Auto-generated method stub
		
	}

	public void resetSpell() {
		// TODO Auto-generated method stub
		
	}

	
}
