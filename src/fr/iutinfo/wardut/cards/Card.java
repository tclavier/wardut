package fr.iutinfo.wardut.cards;

public interface Card {
	int getId();

	int getLuck();

	void play(int round);

	boolean isAvailable(int round);

	boolean isAliveUnit();
}
