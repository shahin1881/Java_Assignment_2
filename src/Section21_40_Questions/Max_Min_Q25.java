package Section21_40_Questions;

  //Question:find the average of the maximum and minimum number in an integer array.

public class Max_Min_Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			int a[] = {3,8,4,3,8,1,8};//2 
			//avg1:3+4+3+1=11%4=2....2 its min value
			//avg2:8+8+8=24%3=8......8 its max value
			
			int avg1 = 0 , avg2 = 0 ,value = 6;
			int count=0; 
			int count1=0;
			
			for(int i=0;i<a.length;i++)
			{
				int no = a[i];
				
				if(value>no)
				{
					avg1 = avg1 + no;
					count++;
				}
				else
				{
					avg2 = avg2 + no;
					count1++;
				}
			}
			
			System.out.println(avg1/count);
			System.out.println(avg2/count1);
			
			

		}

	}


