package fr.iutinfo.wardut;

import org.junit.Test;

import fr.iutinfo.wardut.cards.VoidCard;

public class HandTest {
	@Test(expected=RuntimeException.class)
	public void should_not_add_more_than_5_card_in_hand() {
		Hand hand = new Hand();
		hand.addCard(new VoidCard());
		hand.addCard(new VoidCard());
		hand.addCard(new VoidCard());
		hand.addCard(new VoidCard());
		hand.addCard(new VoidCard());
		hand.addCard(new VoidCard());
	}
}
