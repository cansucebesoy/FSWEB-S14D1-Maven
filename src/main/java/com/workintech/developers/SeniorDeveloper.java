package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(long id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("Senior Developers starts to working");
        setSalary(getSalary()*2);
    }
}
