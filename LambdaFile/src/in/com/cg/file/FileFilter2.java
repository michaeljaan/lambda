package in.com.cg.file;
//main function to list all the file and folder
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class FileFilter2 {

	public static void main(String[] args) {
		File file=new File("Jaan");
		String extension=".txt";
		
		
		List<String> listOfFoldersAndFiles=Arrays.asList(file.list());//listing of file into array

		
		Predicate<String> predicate=(element)->element.contains(extension);
		listOfFoldersAndFiles.stream().filter(predicate).forEach(System.out::println);//display all the content of list

	}

}
