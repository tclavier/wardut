package fr.iutinfo.wardut;

import java.util.HashMap;
import java.util.Map;

import fr.iutinfo.wardut.cards.Card;

public class Hand {
	private Map<Integer, Card> listOfCards = new HashMap<Integer, Card>();

	public void addCard(Card card) {
		if (listOfCards.size() == 5) {
			throw new RuntimeException("No more than 5 cards in hand");
		} else {
			listOfCards.put(card.getId(), card);
		}
	}

}
