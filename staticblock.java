public class staticblock{
	String name;
	String sex;
	static int age;
	
	public staticblock(){
		name="Tom"	;
		System.out.println("have a name");
	}

	{
		sex="female";
		System.out.println("have a age");
	}	
	static{
		age=20;
		System.out.println("have a age");
	}
	public void show(){
		System.out.println(name+sex+age);
	}
	public static void main(String[] args){
		staticblock sb= new staticblock();
		staticblock sb2= new staticblock();
		sb2.show();
		sb.show();	

	}



	
}

