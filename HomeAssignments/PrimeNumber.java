package week1.day2.HomeAssignments;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 15;
		int temp = 0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i == 0)
				temp++;
		}
		if(temp == 0)
			System.out.println("The given number " +num+ " is prime");
		else 
			System.out.println("The given number "+num+ " is not a prime number");

	}

}
