import java.util.Scanner;

public class Xception4 
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
				int x= inputInt("Enter a number : ") ;
				sc.close();
			try
			{
				if (x>10 && x<20)
				{
					throw new MyException("My exception");
				}
			 else  if (x>20 && x<50)
			   {
				throw new Exception ("Now it's greater than 50");
			    } 
			}
			
			catch (MyException e)
			{
				System.out.println("It's not more than 20");
				e.printStackTrace();
			}
			catch (Exception e)
			{
				System.out.println("S can't be greater that 10");
				e.printStackTrace();
			}

}
	public static int inputInt(String m)
	{
		sc = new Scanner (System.in);
		System.out.println(m);
		return sc.nextInt();
	}
}
