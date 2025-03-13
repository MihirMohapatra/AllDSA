package dsa.designPattern.builder;

public class Test {
    public static void main(String[] args) {

        Employee employee = new Employee.EmployeeBuilder("Mihir", "mihir@gmail.com", "Nothing")
                .setHasCar(true).build();
        System.out.println(employee.getCompany());
    }
}
