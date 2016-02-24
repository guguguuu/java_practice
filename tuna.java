public class tuna{

	 static int member=0;

	public	String firstName;

	public String lastName;

	String name;

	int age;

	public tuna(String fristName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		member++;
		System.out.println(member);
	}


	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age=age;
	}

	public int getAge(){
		return age;
	}



	
}
