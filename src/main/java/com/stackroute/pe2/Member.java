/*Create a class named Member with Name, age, Salary as its variable, write an other class named Member Variable that creates an instance of the Member class, initialises its member variables, and then displays the value of each member variable.
Output:
Members Name: Harry Potter
Members Age: 30
Members Salary: 2500.3
*/
package com.stackroute.pe2;
public class Member
{
    String  MemName;
    int     MemAge, MemSalary;
    Member (String name, int age , int salary)
    {
        this.MemName = name;
        this.MemAge = age;
        this.MemSalary = salary;
    }

}

class  MemberVariable
{
    Member memObject ;
    public MemberVariable(String name , int age, int salary)
    {
        memObject  = new Member(name,age,salary);
    }
    public String getName(){
        return memObject.MemName;
    }

    public int getAge(){
        return memObject.MemAge;
    }

    public int getSalary(){
        return memObject.MemSalary;
    }
}