package practice;

public class Boll {
	public static void main(String[] args) {
		boolean isSuccess = true;
		boolean isTest = false;
		
		int base = 180;
		int height = 185;
		boolean isTall = height > base;
		
		if(isTall) {
			System.out.println("키가 큽니다.");
		}
		int i = 3;
		boolean idOdd = i % 2 == 1;
	}
}
