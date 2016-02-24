public enum Degree{
	NORTH(0),
	WEST(90),
	SOUTH(180),
	EAST(270);

private final int degree;

Degree(int degree){
	this.degree=degree;
}

public int getDegree(){
	return degree;
}

public static Degree findD(int degree){
	if(degree<90){
		return NORTH;
	}else if(degree<180){
		return WEST;
	}else if(degree<270){
		return SOUTH;
	}else if(degree<0){
		return EAST;
	}else{
		return NORTH;
	}
}
}
