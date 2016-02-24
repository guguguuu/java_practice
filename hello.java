public enum Direction{
	NORTH(0);
	WEST(90);
	SOUTH(180);
	EAST(270);
}

private int final direction;

public Direction(int direction){
	this.direction=direction;
}

public int getdieection(){
	return direction;
}

public static  Direction(int direction){
	if(direction<90){
		return NORTH;
	}else if(direction<180){
		return WEST;
	}else if(direction<270){
		return SOUTH;
	}else if(direction<360){
		return EAST;
	}else{
		return NORTH;
	}
}
