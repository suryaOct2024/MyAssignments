package week1.day2.HomeAssignments;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		
		int version = 10;
		if(version > 0)
			System.out.println("The given number "+version+" is positive");
		else if(version < 0)
			System.out.println("The given number "+version+" is negative");
		else
			System.out.println("The given number "+version+" is zero");

	}

}
