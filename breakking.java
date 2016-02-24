public class g{
	public static void main(String[] args){
		String[][] pieces={
			{"Black Castle","Black Knight","Black Bishop","Black Queen","Black King","","",""},
			{"Black Pawn","Black Pawn","Black Pawn","","","","",""},
			{"","","","","","","",""},
			{"","","","","","","",""},
			{"","","","","","","",""},
			{"","","","","","","",""},
			{"Black Pawn","Black Pawn","Black Pawn","","","","",""},
			{"Black Castle","Black Knight","Black Bishop","Black Queen","Black King","","",""}
		};
		int x=0,y=0;
king:
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(pieces[i][j].equals("Black King")){
					x=i;
					y=j;
					break king;
				}
			}
		}

					System.out.println(x+" "+y);
	}
}
