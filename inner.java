public class inner{
	public class inner1{

		public void show(){
			System.out.println("aaa");
		}
	}
	public static void main(String[] args){
		inner in =new inner();
		inner1 in1= in.new inner1();//newnewnew
		in1.show();
	}
}
