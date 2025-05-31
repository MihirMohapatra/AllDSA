package dsa.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalaryPerDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 5000),
                new Employee("Bob", "HR", 7000),
                new Employee("Charlie", "IT", 8000),
                new Employee("David", "IT", 8000),
                new Employee("Eve", "Finance", 6000),
                new Employee("Frank", "Finance", 7500)
        );

        Map<String, List<Employee>> topEarnersByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                empList -> {
                                    double max = empList.stream().mapToDouble(Employee::getSalary).max().orElse(0);
                                    return empList.stream()
                                            .filter(e -> e.getSalary() == max)
                                            .collect(Collectors.toList());
                                }
                        )
                ));

        // Print result
        topEarnersByDept.forEach((dept, emps) -> {
            System.out.println("Department: " + dept);
            emps.forEach(e -> System.out.println(" - " + e.getName() + ", Salary: " + e.getSalary()));
        });


    }
}
