
public class While1 {

	public static void main(String[] args) {
		// while문은 타겟이 되는 실행문을 반복해서 실행하는 구문입니다.
		// while문은 실행여부를 조건식 비교를 통해 결정합니다.
		// 한 번 실행하기로 결정되면 모든 타겟 실행문은 실행합니다.
		// 실행이 끝나면 다시 while구믄으로 복귀합니다.
		// 추가 비교를 통해 실행/탈출 여부가 결정됩니다.
		int a = 0;
		while(a < 2) {
			a +=1;
			System.out.println(a + "번째 실행.");
		}// 조건이 틀어져도 조건은 실행한다. 조건식 비교를 보고 결정한다.
	}
}
