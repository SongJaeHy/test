package polymorphism.game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior w1 = new Warrior();
		Orc z1 = new Orc();
		
		w1.huntOrc(z1);
		w1.huntOrc(z1);
		w1.huntOrc(z1);
		w1.showStatus();
		
	}

}
