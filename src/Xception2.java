
public class Xception2 {
	public static void main(String[] args) {
		 int i =0,j=5,k=0;
		 int arr[] = new int[5];
		 
		 
		 try {
			 arr[10] =10;
			 k = j/i;
		 }
		 catch (ArithmeticException e)
		 {
			 System.out.println("This is arithmetic exception");
		 }
		 catch (ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Execute will be this one");
		 }
		catch (Exception e)
		 {
			 System.out.println("This is a normal exception");
             System.out.println(e);
		 }
		 System.out.println("Finish Here");
	}
    
}
