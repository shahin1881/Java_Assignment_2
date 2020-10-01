package Section21_40_Questions;
  
  /*Question:  Retrieve the odd-position digits from input integer array.
               Multiply them with their index and return their sum. */

public class Odd_Position_Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,3,4,5,6};
		
		int ans = 0 ;
		for(int i=1;i<a.length;i=i+2)
		{
			ans = ans + (a[i] * i);//0+1*1=1
		}System.out.println(ans);
		

}


}

