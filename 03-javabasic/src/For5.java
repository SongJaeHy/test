
public class For5 {

	public static void main(String[] args) {
		// 2~9단까지 구구단을 출력하는 코드를 작성해주세요
		// 중첩 반복문을 써 주시면 됩니다.
		for(int i=1; i<=9; i++) { //for i 여는부분
			for(int j=2;j<=9;j++) { // for j 여는부분
				System.out.print(j + "*" + i + "=" + String.format("%2d", i*j));
				System.out.print("    ");
			}// for j 닫는부분
			System.out.println();
		} //for i 닫는부분
	} // main 닫는부분
}
