public class compareTest{

public static void main(String[] args){
	Person samSpade=new Person("sam","Spade");
	Person nonono= new Person("sam","Spade");

	System.out.println(samSpade==nonono);
	System.out.println(samSpade.equals(nonono));
	System.out.println(samSpade.hashCode());
	System.out.println(nonono.hashCode());
}
}
