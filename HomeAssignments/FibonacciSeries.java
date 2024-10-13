package week1.day2.HomeAssignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int inputRange = 8;
		int num1 = 0;
		int num2 = 1;
		
		for(int i=0; i<inputRange; i++)
		{
			System.out.println(num1);
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
		}

	}

}
