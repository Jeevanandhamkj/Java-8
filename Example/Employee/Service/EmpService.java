package Java8.Example.Employee.Service;

import Java8.Example.Employee.Dao.EmployeeDao;
import Java8.Example.Employee.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpService {
    public static List<Employee> tax(String k) {
        if (k.equalsIgnoreCase("tax")) {
            return EmployeeDao.getEmp().stream()
                    .filter(emp -> emp.getSalary() > 500000)
                    .collect(Collectors.toList());
        } else {
            return EmployeeDao.getEmp().stream()
                    .filter(emp -> emp.getSalary() < 500000)
                    .collect(Collectors.toList());
        } }

        public static void main (String[]args){
            System.out.println(tax("kk"));

            List<Employee>e=EmployeeDao.getEmp();
            e.stream().sorted(Comparator.comparing(em->em.getSalary()))
                    .forEach(k-> System.out.println(k));
//            e.stream()
//                    .sorted(Comparator.comparing(Employee::getName).reversed())
//                    .forEach(System.out::println);
//            e.stream()
//                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                    .forEach(System.out::println);

           // e.stream().sorted(Comparator.comparing(Employee::getSalary))
                //    .forEach(System.out::println);
        }




    }





    //using ternary op
// public static List<Employee> tax(String k) {
//        return (k.equalsIgnoreCase("tax"))
//                ? EmployeeDao.getEmp().stream()
//                .filter(emp -> emp.getSalary() > 500000)
//                .collect(Collectors.toList())
//
//                : EmployeeDao.getEmp().stream()
//                .filter(emp -> emp.getSalary() < 500000)
//                .collect(Collectors.toList());
//
//    }
//        public static void main (String[]args){
//            System.out.println(tax("kk"));
//        }
//    }
