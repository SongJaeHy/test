package buyandsell;

public class MellonSeller {
	private int money;
	private int mellon;
	
	// 생성자에서 망고갯수를 입력받을 수 있습니다.
	// 돈은 0으로 넣어주세요.
	public MellonSeller(int mellon) {
		this.money = 0;
		this.mellon = mellon;
	}
	
	// 판매시 망고갯수를 입력할 수  있고
	// 망고갯수 * 1000만큼의 돈이 올라가고
	// 망고는 판 갯수만큼 차감됩니다.
	// 0 미만으로 망고가 줄어들 수 없습니다.
	public void sellmellon(int mellon) {
		if(this.mellon < mellon) {
			System.out.println("멜론이 부족합니다.");
			return;
		}
		this.money += mellon*2000;
		this.mellon -= mellon;
	}
	// showSeller를 이용해 현재 남은 망고와 돈을 볼 수 있습니다.
	public void showSeller(){
		System.out.println("현재 소지금 :" + money);
		System.out.println("멜론 개수 :" + mellon);
		System.out.println("----------");
	}
	
	// 망고개수를 buyer에서 확인할 수 있도록
	// getMango() 게터를 생성해줌.

	public int getMellon() {
		return mellon;
	}
}

