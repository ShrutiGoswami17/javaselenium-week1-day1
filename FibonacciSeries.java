package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int i=8,sum=0,firstNum=0,secondNum=1;
		System.out.println("Fibonacci series:");
		System.out.println(firstNum);
		for(i=1;i<8;i++)
		{
			sum=firstNum+secondNum;
			System.out.println(sum);
			firstNum=secondNum;
			secondNum=sum;
			
			
		}
		
	}

}
