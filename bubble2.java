import java.util.Arrays;
public class bubble2{
	public static void main(String[] args){
		bubble2 bb= new bubble2();
		//bb.bubblesort(10);
		//int[] b=bb.bubblesort(10);
		System.out.println(Arrays.toString(bb.bubblesort(10)));
	}

	public int[] bubblesort(int length){

		int[] a = new int[length];

		System.out.println("original array:");
		for(int i=0;i<a.length;i++){
			a[i]=(int)(Math.random()*100);
		//	System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));

		int r,c,temp;

		for(r=0;r<a.length-1;r++){
			for(c=0;c<a.length-1-r;c++){
				if(a[c]>a[c+1]){
					temp=a[c];
					a[c]=a[c+1];
					a[c+1]=temp;
				}
			}
		}
		return a;
	}
}




