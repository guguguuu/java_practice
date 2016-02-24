public class hello{
	public static void main(String[] args) throws Exception{
		byte byte1=Byte.parseByte("A",16);//convert string to value
		byte byte2=Byte.parseByte("A",16);
		int result=byte1&byte2;
		int result2=byte1|byte2;
		int result3=byte1^byte2;
		System.out.println(byte1);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}


}

