package Section21_40_Questions;
   
  /*Question: GIVEN A STRING 555-666-1234.
              DISPLAY AS 55-56-661-234? */

public class String_Q30 {

	public static void main(String[] args) {
		
		String s = "555-666-1234";

		String n[] = s.split("-");
		
		String j = "";//output stored the value
		
		for(int i=0;i<n.length;i++)
		{
			j = j + n[i];
		}
		//StringBuffer is mutebal to change string
		//string is imutebal
		StringBuffer sb = new StringBuffer(j);
		sb.insert(2,'-');//insert to add singal "-" in string
		sb.insert(5,'-');//
		sb.insert(9,'-');
		sb.insert(sb.length(),'?');
		String x = sb.toString();
		System.out.println(x);
		
		
		
		
		
	}

}
