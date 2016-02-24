public class g{
	public static void main(String[] args){
		int[] array={1,2,3,4};

		for(int i=1; i<array.length;i+=2){
			System.out.println(array[i]);
		}

		System.out.println(".....");

		for(int i=array.length/2;i<array.length;i++){
			System.out.println(array[i]);
		}

	}
}
