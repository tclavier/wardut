package fr.iutinfo.wardut;

import java.util.Stack;

import fr.iutinfo.wardut.cards.Card;

public class Deck {
	private Stack<Card> listOfCards = new Stack<Card>();
	private Deck() {}
	
	public static Deck generateNewDeck(int size) {
		// TODO
		return null;
	}
	
	public Card nextCard() {
		return listOfCards.pop();
	}
	
	
}
