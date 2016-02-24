public class override{
	public static void main(String[] args){

		override over = new override();

		over.print();

		over.print("tom");

		over.print(12);
	}

	public void print(){
		System.out.println("a");
	}

	public void print(String name){
		System.out.println(name);
	}

	public void print(int age){
		System.out.println(age);
	}
}
