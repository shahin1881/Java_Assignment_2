package Section21_40_Questions;

import java.util.Scanner;

/*Question:    intput="xyzwabcd"
 *                    
               intput2=2;
               input3=4;
               output=bawz */

//zwab..reverse...bawz.
public class concatSrting_Q40 {

	public static void main(String[] args) {
		
		
		
		/*Scanner se = new Scanner(System.in);
		System.out.println("enter first String=");
		String s = se.next();*/

	String s = "xyzwabcd";

		String ans1 = s.substring(2, 4);

		StringBuffer sb = new StringBuffer(s);// declairing Stringbuffer class
		sb.reverse();// String reversed
		String x = sb.toString();// stoard value int x string
		String ans2 = x.substring(2, 4);// subString
		sb = new StringBuffer(ans1);
		sb.reverse();// String reversed
		String ans3 = sb.toString();// stoard value int x string
		System.out.println(ans2.concat(ans3));// final output
	}

}
