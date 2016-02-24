public class string{
	public static void main(String[] args){
		String fileName=".hello.jav";
		String mailName="hello@gmail.@com";

		int index=fileName.indexOf(".");

		String suffix=fileName.substring(index+1,fileName.length());

		if(index!=0&&index!=-1&&suffix.equals("java")){
			System.out.println("Filename correct");
		}else{
			System.out.println("Filename false");
		}

		int index2=mailName.indexOf('@');
		
		int index3=mailName.indexOf('.');
			System.out.println(index2);
			System.out.println(index3);

		if(index2!=-1&&index3>index2){
			System.out.println("Mailname correct");
		}else{
			System.out.println("Mailname false");
		}

	}
}
