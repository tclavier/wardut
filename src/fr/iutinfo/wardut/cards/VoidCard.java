package fr.iutinfo.wardut.cards;


// Just for tests
public class VoidCard implements Card {
	private int id = 0;
	
	public int getId() {
		return id;
	}

	public int getLuck() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void play(int round) {
	}

	public boolean isAliveUnit() {
		return false;
	}

	public boolean isAvailable(int round) {
		 
		return true; 
	}


	
}
