package Section21_40_Questions;


            /*Question:  input1=commitment;
                         output=cmmitmnt;
                         c be the first index position 
                         remove even vowels from the string*/


     /*vowels =  a,e,i,o,u.
                 c o m m i t m e n t
 index position: 1 2 3 4 5 6 7 8 9 10
   
 Def:      A palindrome number is a number that is same after reverse. 
	            For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
	            It can also be a string like LOL, MADAM etc.*/

public class Delete_Vowels_Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		         /*  String s1="commitment";
		          StringBuffer sb1=new StringBuffer();
		  for(int i=0;i<s1.length();i++)
		      if((i%2)==0)
		      sb1.append(s1.charAt(i));
		      else if((i%2)!=0)
		        if(s1.charAt(i)!='a' && s1.charAt(i)!='e' && s1.charAt(i)!='i'
		        && s1.charAt(i)!='o' && s1.charAt(i)!='u')
		        //if(s1.charAt(i)!='A' && s1.charAt(i)!='E' && s1.charAt(i)!='I'
		        //&& s1.charAt(i)!='O' && s1.charAt(i)!='U')                 //charAt() method returns the character at the specified index in a string
		     sb1.append(s1.charAt(i));                                      //append the string representation of the boolean argument to a given sequence.The length of this sequence increases by 1. 
		System.out.println(sb1);*/
		           
		         
		String string = "commitment";
		System.out.println("Input String : "+string);
		string = string.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(string); 
		     
		}

}