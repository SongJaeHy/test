package polymorphism;

public class Singer extends Person{
	private int year;
	
	public Singer(String name, int age, int year) {
		super(name, age);
		this.year = year;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("행사 수  : " + year);
		System.out.println("---------");
	}
	
}
