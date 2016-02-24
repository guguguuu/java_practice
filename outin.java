public class outin{
	int a=1;
	String b= "aaa";

	public class inner{//any modifier(public private and protec
		String in="inner";
		int a=10;
		String b="bbb";
		public void show(){
		System.out.println(outin.this.a);
		System.out.println(a);
		System.out.println(outin.this.b);//this visit outer variable
		}//inner method can visit outer variable

	}

	public static void main(String[] args){

		outin member1= new outin();

		inner memberinner = member1.new inner();//new

		memberinner.show();

}
}
