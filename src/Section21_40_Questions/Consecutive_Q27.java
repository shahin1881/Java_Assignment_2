package Section21_40_Questions;

 /*Question:  find the three consecutive characters in a string. if the string consists any three 
              consecutive characters return 1 else return -1
              like AAAxyzaaa will return true.*/

public class Consecutive_Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

			String s = "AzpAxAyza";
			int count = 0 ;
			for(int i=0;i<s.length()-2;i++)
			{
				
				if((s.charAt(i)==s.charAt(i+1)) && (s.charAt(i)==s.charAt(i+2)))//AA&&Ax
				{
					count++;
					if(count>=1)
					{
						System.out.println("1");
					}break;
				}
			}	
				
				if(count==0)
				{
					System.out.println("-1");
				}
			
			
			
		}

	}

