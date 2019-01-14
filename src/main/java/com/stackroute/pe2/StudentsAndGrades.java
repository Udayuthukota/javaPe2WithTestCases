/*
Write a program, which reads number of students and n grades as input (of int between 0 and 100, inclusive) and displays the average, minimum and maximum.Your program shall check for valid input. You should keep all the grades in an int[] and use a method for each of the computations.
 Output:
Enter the number of students: 4
Enter the grade for student 1: 86
Enter the grade for student 2: 65
Enter the grade for student 3: 98
Enter the grade for student 4: 77
The average is 81.50
The minimum is 65
The maximum is 98
*/
package com.stackroute.pe2;
public class StudentsAndGrades
{
    public double averageGrade(int input, int[] grades)
    { //method to calculate average grade
        double averagegGrade=0 ;//double sum;
        double input1=input;
        for(int i=0;i<input;i++)
        {

            averagegGrade=averagegGrade+grades[i]/input1;
        }
        return averagegGrade;
    }

    public int minimumGrade(int input, int[] grades)
    { //method to calculate  minimumm grade
        int minimumGrade=grades[0];
        for(int i=0;i<input-1;i++)
        {
            if(minimumGrade>grades[i+1])
            {
                minimumGrade=grades[i+1];
            }
        }
        return minimumGrade;
    }
    public int maximumGrade(int input, int[] grades)
    {  //method to calculate maximum grade
        int maximuGrade=grades[0];
        for(int i=0;i<input-1;i++)
        {
            if(maximuGrade<grades[i+1])
            {
                maximuGrade=grades[i+1];
            }
        }
        return maximuGrade;
    }
}
