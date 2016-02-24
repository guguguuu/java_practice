public class bubble1{
	public static void main(String[] args){
		int m;
		
		bubble1 aa=new bubble1();
		int[] b=aa.array(9000000000000);//how to create a very big array: malloc
		bubble1 bb=new bubble1();
		bb.bubblesort(b);
		//		int[] b=bb.bubblesort(arr);
		//		for(m=0;m<arr.length;m++){
		//		System.out.println(b[m]);
		for( m=0;m<b.length;m++){
			System.out.println(b[m]);
		}
		}

	public int[] array(int length){
		int r;
		int[] arr= new int[length];
		for(r=0;r<arr.length;r++){
			arr[r]=(int)(Math.random()*100);
		}
			return arr;
	}

	public int[] bubblesort(int[] b){
		int i,j,temp;

		for(i=0;i<b.length-1;i++){
			for(j=0;j<b.length-1-i;j++){
				if(b[j]<b[j+1]){
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		return b;	
	}
	}
