import java.util.*;

public class g{
	public static void main(String[] args){
		
		for(Direction d: Direction.values()){
			System.out.println(d.getdegrees());
		}
		}
			public enum Direction{
			SOUTH(10),
			WEST(20);
			private final int degrees;
			Direction(int degrees){
				this.degrees=degrees;
			}
			public int getdegrees(){
				return degrees;}
		}

	
	}
