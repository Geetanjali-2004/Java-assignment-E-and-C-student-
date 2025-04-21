package Pack;

public class Person {
	String name;
	public Person(String name) {
		super();
		this.name = name;
	}
	String hobbies;
	public Person(String hobbies) {
		super();
		this.hobbies = hobbies;
	}
	String qualify;
	

	public Person(String qualify) {
		super();
		this.qualify = qualify;
	}
	void cooking()
	{
	System.out.println("The Person cooks pizza");
	}
	void playing()
	{
		System.out.println("Person plays cricket");
	}

}
 