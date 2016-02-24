public class setget{
	private String color;
	private float size;
	private String owner;


	public float getsize(){
		return size;
	}

	public void setsize(float size){
		if(size>5)
		{
		System.out.println("nononono");
			this.size=size;
		
		}else{
					this.size=0;
		}
	}

	public static void main(String[] args){

		setget sg=new setget();

		sg.setsize(10f);
		System.out.println(sg.getsize());
	}




}

