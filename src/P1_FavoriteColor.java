import java.util.Scanner;

/*
ISYS 320
Name(s):
Date: 
*/

/*  What was the error?
 	The "==" operator tests for numerical equality between two values.
  
 */

public class P1_FavoriteColor {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("What is your favorite color? ");
		String name = console.next();
		
		if(name.equals("blue")) {
			System.out.println("Mine too!");
		}else {
			System.out.println("Maybe you need a new favorite color.");
		}

	}

}
