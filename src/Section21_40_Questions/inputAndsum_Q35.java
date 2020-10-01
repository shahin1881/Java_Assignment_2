package Section21_40_Questions;

  /*Question:   Retrieve the elements in a array, which is an input, 
                which are greater than a specific input number. Add 
                them and find the reverse of the sum.*/

public class inputAndsum_Q35 {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5};//14
		int no =1,//no=1
		ans = 0;
				for(int i=0;i<a.length;i++)
				{
					int x = a[i];//1
					if(x>no)//1x=1..i=1 then condidtion false .
					{
						ans = ans + x;
					}
					
				}
				
				String n = String.valueOf(ans);// conversion in to string.
				
				StringBuffer sb = new StringBuffer(n);//used of reverse the elements
				System.out.println(sb.reverse());
				
				/*String nj =  sb.toString();
				int k = Integer.parseInt(nj);
				
				System.out.println(k);
*/
	}

}

	


