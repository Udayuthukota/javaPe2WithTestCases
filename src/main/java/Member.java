package com.company;


public class Member{
    String  MemName;
    int     MemAge, MemSalary;

    Member (String name, int age , int salary)
    {
        this.MemName = name;
        this.MemAge = age;
        this.MemSalary = salary;
    }

}

class  MemberVariable {

    Member memObject ;

    public MemberVariable(String name , int age, int salary) {

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