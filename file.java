import java.io.File;

public class file{

public static void main(String[] args){
	String fileName= "/home/umr"+File.separator+"test"+File.separator+"myfile.txt";
	File myFile=new File(fileName);

	try{
		myFile.createNewFile();
	}catch(Exception e){
		System.out.println("Couldn't create "+ myFile.getPath());
	}

	System.out.println("Created " +myFile.getPath());
}
}
