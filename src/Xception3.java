import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Xception3 {
	public static void main(String[] args) {
		File f = new File("DemoFile.txt");
		Scanner sc ;
		String input ="abc";
		try {
			 sc  = new Scanner(f);
			 input = sc.nextLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		System.out.println("File not found");
		}
		
		System.out.println(input);
	}
	

}
