import java.util.Scanner;

/*
	ISYS 320
	Name(s): Anthony Quehl
	Date: 
*/

public class P6_Quadrant {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int num1 = console.nextInt();				
		System.out.print("Enter your second number: ");
		int num2 = console.nextInt();
				if(num1 > 0 && num2 > 0 ) {
					System.out.println("This number is in Quadrant 1");
				}else if(num1 < 0 && num2 > 0) {
					System.out.println("This number is in Quadrant 2");		
				}else if(num1 < 0 && num2 < 0) {
					System.out.println("This number is in Quadrant 3");
				}else if(num1 > 0 && num2 < 0) {
					System.out.println("This number is in Quadrant 4");
				}
	}

}
