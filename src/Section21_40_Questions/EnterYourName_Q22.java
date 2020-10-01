package Section21_40_Questions;

    /*Question: Enter your name and return a string "print the title first 
                 */

  import java.util.Scanner;

public class EnterYourName_Q22 {

public static void main(String[] args) {
		

		//String s = "shahin";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String n = sc.nextLine();
		
		String j = "miss.";
	
		String nj =j.concat(n);
		System.out.println(nj);
		
		
		
		
		/*String nj = j + n.charAt(0);//n in position 0 add j string.
		System.out.println(nj);
		
*/		
		
	}

}


	

	


