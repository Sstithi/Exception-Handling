//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

 class Xception3  {
	public static void main(String[] args)
	{
		
	int number = inputInt("Enter the number: " );
	try {
		if (number>10)
		{
			//Exception e = new Exception();
			throw new MyException1();
		}
		
	}
	catch (MyException1 e)
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
class MyException1 extends Exception
{
	public MyException1 ()
	{
		System.out.println("Number can't be greater then 10");
	}
}
