package fr.iutinfo.wardut.cards;

public abstract class Unit {
	abstract int getAttack();
	abstract int getStrength();
	abstract void addAttackBonus();
	abstract void addStrengthBonus();
	abstract void resetBonus();
}
