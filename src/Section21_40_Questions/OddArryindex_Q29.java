package Section21_40_Questions;

 //Question: Retrieve the max from array which is in a odd-index.

public class OddArryindex_Q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,2,9,6,1,10,7};//even=2,2,6,.....
		//odd=9
		
		int max=0;
		for(int i=1;i<a.length;i=i+2)
		{
			if(max<a[i])
			{
				max = a[i];
			}
		}System.out.println(max);
		


}

}

