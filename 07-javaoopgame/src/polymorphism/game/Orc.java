package polymorphism.game;

public class Orc extends Monster{

	private int hp;
	private int dp;

	public Orc() {
		super("오크",10,5,0);
	}

	public void doBattle(int ap) {
		this.hp = (this.hp + this.dp) - ap;
		if(this.hp <= 0) {
			System.out.println("이 오크는 이미 죽었습니다.");
		}
	}

	public int getAtk() {
		return this.getAp();
	}
	
}