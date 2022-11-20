/* Question 

Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.

If percentage >= 90% : Grade A
If percentage >= 80% but <90 : Grade B
If percentage >= 70% but <80: Grade C
If percentage >= 60% but <70: Grade D
If percentage >= 40% but <60: Grade E
If percentage < 40%: Grade F


NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%.
*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int sub1 = s.nextInt();
        int sub2 = s.nextInt();
        int sub3 = s.nextInt();
        int sub4 = s.nextInt();
        int sub5 = s.nextInt();
        int total = (sub1+sub2+sub3+sub4+sub5)/5;
        if (total >= 90)
        {
            System.out.println(total);
            System.out.print("A");
        }
        else if(total >=80 && total<90)
        {
           System.out.println(total);
           System.out.print("B"); 
        }
        else if(total >=70 && total<80)
        {
           System.out.println(total);
           System.out.print("C"); 
        }
        else if(total >=60 && total<70)
        {
           System.out.println(total);
           System.out.print("D"); 
        }
        else if(total >=40 && total<60)
        {
           System.out.println(total);
           System.out.print("E"); 
        }
        else if(total <40)
        {
           System.out.println(total);
           System.out.print("F"); 
        }

    }
}
