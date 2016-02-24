public class g{
	public static void main(String[] args){
		int[] a ={1,2,3,4};

		for(int i=0; i<a.length;i++){

			System.out.println((i+1)+" is "+a[i]);
		}
		System.out.println("......");
		for(int o:a){
			System.out.println(o+" is "+a[o-1]);
		}
	}

}
