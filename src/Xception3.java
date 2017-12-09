//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class Xception3  {
	public static void main(String[] args)
	{
		
	int number = inputInt("Enter the number: " );
	try {
		if (number>10)
		{
			//Exception e = new Exception();
			throw new MyException();
		}
		
	}
	catch (MyException e)
	{
		System.out.println("Number can't be greater than 12");
	}
	System.out.println("Here ends the program");
	}

	public static int inputInt(String m) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println(m);
		return sc.nextInt();
	}

}
class MyException extends Exception
{
	public MyException ()
	{
		System.out.println("Number can't be greater then 10");
	}
}
