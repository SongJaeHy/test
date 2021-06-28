package polymorphism;

public class Main {
	public static void main(String[] args) {
		
		// 부모타입인 Person만으로도 양쪽 자료형을 모두 처리 가능.
		Person a1 = new Job("나비", 1, "소방관");
		Person s1 = new Student("학생", 2, 3);
		Person n1 = new Singer("이순",10,10);
		// 단 메서드는 Person을 베이스 객체는
		// Person에 정의된 메서드만 호출 가능
		a1.showPerson();
		// a1.showJob();
		s1.showPerson();
		// s1.showStudent();
		n1.showPerson();
	}
}
