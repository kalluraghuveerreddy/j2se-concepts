package com.tech.collectionapi;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class SortEmployee {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(

                new Employee(1l, "Raghuveer", new BigDecimal(100000), 30),
                new Employee(3l, "Sravya", new BigDecimal(5000), 20),
                new Employee(2l, "Akhil", new BigDecimal(1455000), 40),
                new Employee(5l, "Zuhi", new BigDecimal(68666), 28),
                new Employee(6l, "Harsha", new BigDecimal(10880000), 36),
                new Employee(1l, "Raghuveer", new BigDecimal(100000), 30)

        );

        //employeeList.forEach(System.out::println);
        //employeeList.stream().filter(o->o!=null).sorted((o1, o2) -> o1.getAge()- o2.getAge()).forEach(System.out::println);

//        employeeList.stream()
//                .sorted(Comparator.comparing(Employee::getSalary)
//                        .thenComparing(Employee::getName).reversed())
//                .forEach(System.out::println);


        //employeeList.stream().map(employee -> employee.getAge()).peek(System.out::println).max(Comparator.comparingInt(value -> value)).stream().forEach(System.out::println);

//        employeeList.stream()
//                .sorted(Comparator.comparing(Employee::getAge).reversed())
//                .limit(3)
//                .peek(System.out::println)
//                .skip(2)
//                .forEach(System.out::println);

        Map<Integer, Set<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getAge(), Collectors.toSet()));
        System.out.println(map);

    }
}
