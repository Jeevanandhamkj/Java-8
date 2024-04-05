package Java8.Example.Employee.Dao;

import Java8.Example.Employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
public static List<Employee>getEmp(){
    List<Employee>emp=new ArrayList<>();
    emp.add(new Employee(1,"jeeva","java",550000));
    emp.add(new Employee(2,"sachin","it",650000));
    emp.add(new Employee(3,"ajith","css",150000));
    emp.add(new Employee(4,"rohit","c",250000));
    return emp;


}


}

