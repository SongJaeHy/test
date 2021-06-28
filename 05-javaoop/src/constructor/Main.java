package constructor;

import java.util.Scanner;

import structure.PersonClass;

public class Main {

	
	
	
	public static void main(String[] args) {
		// constructor 패키지 내부에 소속된 Car를 호출할떄는
		// 같은 영역이기 때문에 constructor.Car로 호출해도 되고
		// 그냥 Car로 호출해도 된다.
		Car car1 = 
				new Car(0, 0, "채종훈");
		// 자동차 정보 조회
		car1.breakSpped();
		car1.getInfo();
		car1.accelSpped();
		car1.accelSpped();
		car1.breakSpped();
		// 다른 패키지의 Car 호출
		// 다른 패키지의 클래스를 호출할때는
		// 반드시 클래스명을 앞에 붙여주셔야 합니다.
//		Car car2 = 
//				new Car();
//		car2.model = "k5";
//		car2.owner = "채종훈";
//		car2.price = 10000000;
//		
//		car2.getInfo();
		// 같은 패키지 내부에 중복된 이름이 없는 외부클래스라고 해도
		// 호출시에는 반드시 패키지명을 입력해줘야 호출됩니다.
		//structure.PersonClass p1 = 
		//		new structure.PersonClass();
		
		// 두 번째 방법은 아예 문서 상단에 import구문을 이용해
		// 현재 패키지의 PersonClass는 structure의 클래스임을
		// 명시하는 방법이 있습니다.
		// 명시방법은 클래스명을 적고 ctrl + space를 이용해서
		// 자동입력 하거나, 그냥 직접 import를 적어주는 방법이 있습니다.
		PersonClass p2 =
				new PersonClass();
		Scanner scan = new Scanner(System.in);
	}

}
