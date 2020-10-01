package Section21_40_Questions;

import java.util.Scanner;

/*Question: input1="Rajasthan";
              input2=2;
              input3=5;
              output=hts;*/

public class Stringreverse_Q31 {

	public static void main(String[] args) {	
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Input String: ");
		str = sc.next();
		int input2;
		int input3;
		StringBuffer ans = new StringBuffer();
		StringBuffer s = new StringBuffer(str);
		ans =s.reverse();//travese from ending as per program requirement
		//System.out.println("StringBuffer: "+ans);
		System.out.println("input2: ");
		input2=sc.nextInt();
		
		System.out.println("input: ");
		input3=sc.nextInt();
		System.out.println("output: "+ans.substring(input2,input3));//start,end-1
		
		
		
                    /*String s = "Rajasthan";
			     	StringBuffer sb = new StringBuffer(s);
					sb.reverse();
					String n = sb.toString();
					System.out.println(n.substring(2,5));*/
		}


	}
