package Section21_40_Questions;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*//Question:Find the number of days between two input dates.
               input1:2020-07-01
               input2: 2020-07-30*/
//21/31/32
public class NumberofDays_Q21 {

	public static void main(String[] args) {

		

		Scanner se = new Scanner(System.in);
		System.out.println("enter 1 date format=yyyy-mm-dd=");
		String n = se.next();
		System.out.println("enter 2 date format=yyyy-mm-dd=");
		String j = se.next();
		
		/*String n = "2012-12-01";
        String j = "2012-01-03";*/
        
		// validate+dynamic
		
		  /* LocalDate d = LocalDate.of(2013,10, 01);
		   LocalDate x = LocalDate.of(2012,01, 01); */   
		
	      Period diff = Period.between(LocalDate.parse(n), LocalDate.parse(j));
		   
		
		System.out.println(diff);
		// System.out.println(ChronoUnit.MONTHS.between(x, d));
	}	}

