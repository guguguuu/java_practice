public enum Direction{
	NORTH(0),
	WEST(90),
	SOUTH(180),
	EAST(270);//comma and semi-colon


private  final int directions;

Direction(int directions){
	this.directions=directions;
}

public int getdegree(){
	return directions;
}

public static Direction findDirection(int directions){
	if (directions<90){
		return NORTH;
	}else if (directions<180){
		return WEST;
	}else if(directions<270){
		return SOUTH;
	}else if(directions<360){
		return EAST;
	}else{
		return NORTH;
	}

}
}
