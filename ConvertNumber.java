package week1.day1;

public class ConvertNumber {

	public static void main(String[] args) {
		int i,num=-10;
		if(num<0)
		{
			i=Math.abs(num);
			
			System.out.println("The number "+num+" is a negative number");
			System.out.println("The number "+num+ " is converted to "+i );
			
		}
		else
			System.out.println("The number "+num+" is a positive number");
	}

}
