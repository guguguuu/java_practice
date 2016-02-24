public class bubble{

	public static void main(String[] argc){

		int[] a={1,2,3,4,5};
		//int arr = new int[5];
		bubble bb = new bubble();
		bb.bubblesort(a);
	}

	public void bubblesort(int[] a){
		int m,i,j,temp;
		temp=0;
		for(i=0;i<a.length-1;i++){
			for(j=0;j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		for(m=0;m<a.length;m++){
			System.out.println(a[m]);
		}
	}

}
