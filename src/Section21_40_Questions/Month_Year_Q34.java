package Section21_40_Questions;

import java.util.Scanner;

//Question:  Return the number of days in a month, where month and year are given as input.
  /* output: Input a month number: 2
             Input a year: 2016
             February 2016 has 29 days */

/* Def:    switch statement in java. A switch statement allows a 
           variable to be tested for equality against a list of values.
           Each value is called a case, and the variable being switched
           on is checked for each case*/

public class Month_Year_Q34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "12";

        System.out.print("Input a month number: ");
        int month = sc.nextInt();

        System.out.print("Input a year: ");
        int year = sc.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}

	


