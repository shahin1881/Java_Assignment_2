package Section21_40_Questions;
 
  /*Question: validate the ip address in the form a.b.c.d
              where a,b,c,d must be between 0and 255
              if validated return 1 else return 2*/

import java.util.StringTokenizer;

public class ValiAddress_Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			StringTokenizer s = new StringTokenizer("10.99.51.100",".");
			
					int count = 0 ;
					while(s.hasMoreTokens())
					{
						String n = s.nextToken().toString();//converstion integer to string tokonizer
						
						int no = Integer.parseInt(n);
						if(no>=0 && no<=255)
						{
							count++;
						}
					}
					if(count==4)
					{
						System.out.println("1");
					}
					else
					{
						System.out.println("2");
					}

		}

	}

