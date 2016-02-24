public class text{
	public static void main(String[] args){
		int[] directions={30,170,225,180};

		for(int i=0;i<directions.length;i++){
			System.out.println("direction"+directions[i]+" is "+Direction.findDirection(directions[i]));
		}
	for(Direction d:Direction.values()){	
		System.out.println(d.getdegree());
	}}
}
