public class shift{
	public static void main(String[] args) throws Exception{
		int b = 127;
		System.out.println("b:"+b);
		System.out.println("b as a binary string:"+Integer.toBinaryString(b));
		String leftShiftString = Integer.toBinaryString(b<<3);
		System.out.println("binary after signed left shifting 3 places:" + leftShiftString);
		System.out.println("value of b after signed left shifting 3 places:" + Integer.parseInt(leftShiftString,2));
		String rightShiftString = Integer.toBinaryString(b>>3);
		System.out.println("binary after signed right shifting 3 places:" + rightShiftString);
		System.out.println("value of b after signed right shifting 3 places:" + Integer.parseInt(rightShiftString,2));
		String unsignedRightShiftString = Integer.toBinaryString(b>>>3);
		System.out.println("binary after unsigned right shifting 3 places:" + unsignedRightShiftString);
		System.out.println("value of unsigned right shifting 3 places:" + Integer.parseInt(unsignedRightShiftString,2));

		b=-1;
		System.out.println("b:"+b);
		System.out.println("b as binary:" + Integer.toBinaryString(b));

		System.out.println("binary after unsigned shifting right 3 places:" + Integer.toBinaryString(b>>>3));
		System.out.println("value of b after unsigned shifting right 3 places:" + Integer.parseInt(Integer.toBinaryString(b>>>3),2));


	}


}

