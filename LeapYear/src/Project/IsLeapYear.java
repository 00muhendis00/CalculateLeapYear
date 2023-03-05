package Project;
import java.util.Scanner;
public class IsLeapYear {
	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year ");
		year = input.nextInt();
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 == 0))) {
			System.out.print(year + " is a leap year");
		}
		else {
			System.out.print(year + " is not a leap year");
		}
	}
}
