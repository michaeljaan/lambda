package in.com.cg.file;

import java.io.File;

public class FileFilter {

	public static void main(String[] args) {
		
		File file=new File("Jaan");
		
		
		File listOfFolder[]=file.listFiles((fileElement)->{return fileElement.isDirectory();});//reading all the file in the folder through lambda expression
		
		
		for(File eachFile: listOfFolder)
		{
			System.out.println(eachFile.getName());//display filename each
		}
		
		
	}

}
