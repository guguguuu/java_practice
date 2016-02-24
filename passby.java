public class passby{
	static	int a=0;
	static	integerWapper b = new integerWapper();

	public static void main(String[] args) throws Exception{
		passbyvalue(a,b);
		System.out.println("a in main="+a+" "+"b:"+b.objectInt);
	}

	public  static int passbyvalue(int a, integerWapper b){
		a++;
		b.objectInt++;
		System.out.println("a in function:"+ a);
		return a;}
}

