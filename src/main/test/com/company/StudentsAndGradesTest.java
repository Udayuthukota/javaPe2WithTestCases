import com.company.StudentsAndGrades;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsAndGradesTest {

    int NumberOfStudents=4;
    int[] Grades={86,65,98,77};

    @Before
    public void setUp()
    {
        studentsAndGrades=new StudentsAndGrades();
    }
    StudentsAndGrades studentsAndGrades;

    @After
    public void tearDown()
    {
        studentsAndGrades=new StudentsAndGrades();
    }


    @Test

    public void testAverageGradesSuccess()
    {
        double expectedValue=81.50;
        double actualValue;
        actualValue=studentsAndGrades.averageGrade(NumberOfStudents,Grades);
        assertEquals(expectedValue,actualValue,0);

    }
    @Test
    public void testAverageGradesFailure()
    {
        double expectedValue=80,actualValue;
        actualValue=studentsAndGrades.averageGrade(NumberOfStudents,Grades);
        assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void testMinimumGradesSuccess()
    {
        long expectedValue=65,actualValue;
        actualValue=studentsAndGrades.minimumGrade(NumberOfStudents,Grades);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testMinimummGradesFailure()
    {
        long expectedValue=60,actualValue;
        actualValue=studentsAndGrades.minimumGrade(NumberOfStudents,Grades);
        assertNotEquals(expectedValue,actualValue);
    }


    @Test
    public void testMaximumGradesSuccess()
    {
        long expectedValue=98,actualValue;
        actualValue=studentsAndGrades.maximumGrade(NumberOfStudents,Grades);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void testMaximumGradesFailure()
    {
        long expectedValue=80,actualValue;
        actualValue=studentsAndGrades.maximumGrade(NumberOfStudents,Grades);
        assertNotEquals(expectedValue,actualValue);
    }



}