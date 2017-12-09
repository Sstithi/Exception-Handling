import java.util.Scanner;

public class Xception {
	public static void main(String[] args)  {
		
	
	Scanner sc = new Scanner (System.in);
	//int x =1;
	//while(x==1)
	//{
	 
	try {
	
	{
	int n1 = inputInt ("Enter first num :",sc);
	int n2 = inputInt ("Enter first second num :",sc);
	int sum = n1/n2;
	System.out.println(sum);
//	x=2;
	

	}
	}
	
	catch (Exception e)
	  {
		System.out.println("Sorry you can't devide with zero");
	}
	//}
	}

	public static int inputInt(String m,Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println(m);
		return sc.nextInt();
	
		
	}
}
