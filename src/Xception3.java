import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Xception3  {
	public static void main(String[] args) throws Exception{
		File f = new File("DemoFile.txt");
		Scanner sc ;
		String input ="";
		
			 sc  = new Scanner(f);
			 input = sc.nextLine();
		
			
	System.out.println(input);
		
	}

}
