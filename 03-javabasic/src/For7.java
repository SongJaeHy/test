
public class For7 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		for(int i=1; i<=4; i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}System.out.println("");
		}
		for(int i=1;i<=4;i++) {
			for(int j =4; j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				}else
					System.out.print("*");
			}System.out.println("");
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");
			}for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
