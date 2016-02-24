public class staticinner{
	static String b="bbb";
	static	float a=1.0f;//static variables!!!!!
	public static class inner{//static class

		String b="iii";
		float aa =2.0f;

		public void show(){
			System.out.println(staticinner.a);
			System.out.println(staticinner.b);
			System.out.println(b);
		}
	}

	public static void main(String[] args){

		inner in=new inner();
		in.show();
	}
}
