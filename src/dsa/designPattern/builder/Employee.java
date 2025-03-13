package dsa.designPattern.builder;

public class Employee {
    private String name;
    private String email;
    private String company;
    private boolean hasCar;
    private boolean hasBike;

    public Employee(EmployeeBuilder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.company = builder.company;
        this.hasCar = builder.hasCar;
        this.hasBike = builder.hasBike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    public void setHasBike(boolean hasBike) {
        this.hasBike = hasBike;
    }

    public static class EmployeeBuilder {
        private String name;
        private String email;
        private String company;
        private boolean hasCar;
        private boolean hasBike;

        public EmployeeBuilder(String name, String email, String company){
            this.name = name;
            this.email = email;
            this.company = company;
        }

        public EmployeeBuilder setHasCar(boolean hasCar){
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike){
            this.hasBike = hasBike;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

    }
}
