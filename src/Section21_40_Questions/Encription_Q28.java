package Section21_40_Questions;

  /*Question: String encrption. replace the odd-index character with next character(if it is 'z' 
              replace with 'a'..if 'a' with 'b' as such), leave the even index as such. 
              Return the encrypted string.*/


public class Encription_Q28 {

public static void main(String[] args) {
		

		String s = "shahinaz";
		//          siaiioaa
		String n = "";
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2!=0)//odd index  didnt divide by 2 then replace in z.
			{
				if(s.charAt(i)=='z')
				{
					n= n + "a";
				}
				else
				{
					int no =((int) s.charAt(i))+1;
					char c = (char) no;
					n = n + c;
				}
				
			}
			else
			{
				n= n + s.charAt(i);
			}
		}
		System.out.println(n);
		
	}

}

