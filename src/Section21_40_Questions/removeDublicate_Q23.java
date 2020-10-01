package Section21_40_Questions;

  //Question: Write a Program that accepts a string and removes the duplicate characters.

import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeDublicate_Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			String s = sc.nextLine();
			String n = "";
			LinkedHashSet<Character> hs = new LinkedHashSet<Character>();//create object for hashser
			
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				hs.add(c);
			}
			
			
			for(char j:hs){//for each coming in java 8
				
			//System.out.print(j);
			}
			
			
		System.out.println(hs);//option 2....[s, h, a, i, n]
			
			
			/*for(char j : hs)//for each loop//option 1
			{
				n = n + j;
			}System.out.println(n);//java java
*/			
		}

	

	}


