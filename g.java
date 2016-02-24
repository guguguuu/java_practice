public class g{
	public static void main(String[] args){
		String[] detectives={"s a m","holmes","chan"};
		int characterBeforeSpace = 0;
		
		for(String str: detectives){
			char[] chh = str.toCharArray();
			for(char ch:chh){
				if(ch==' '){
					break;

				}
			characterBeforeSpace++;
			}
		}
		System.out.println(characterBeforeSpace);
	}
}
