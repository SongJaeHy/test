package polymorphism;

public class Job extends Person{
	private String name1;
	
	
	public Job(String name, int age, String name1) {
		super(name, age);
		this.name1 = name1;
	}
	
	public void showJob() {
		showPerson();
		System.out.println("이름 :" + name1);
		System.out.println("------------");
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("직업 : " + name1);
		System.out.println("------------");
	}
}
