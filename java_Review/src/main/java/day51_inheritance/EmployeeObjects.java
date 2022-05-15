package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Contractor contractor= new Contractor();
        contractor.jobTitle="Developer";
        System.out.println("contractor.calculateSalary(67.8) = " + contractor.calculateSalary(67.8));


        Employee employee= new Employee();
        employee.jobTitle="SDET";
        System.out.println("employee.calculateSalary(55.0) = " + employee.calculateSalary(55.0));
        double annualSalary= employee.calculateSalary(30.78);
        System.out.println("annualSalary = " + Math.round(annualSalary));

        System.out.println("employee.toString() = " + employee.toString());
        System.out.println("contractor = " + contractor);


    }
}
