import java.util.Scanner;

public class Bonase2 {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("몇 까지의 숫자 중 소수만 탐색하시겠습니까?");
	int n = scan.nextInt();
	int num,count, i;
	for(num =4;num <=n; num++) {
		count = 0;
		for(i=4;i<num;i++) {
			if(num%i==0) {
				count+=1;
			}
		
		if(count==0) {
			System.out.println(num+"소수입니다.");
			}
		scan.close();
			}
		}
	}
}
