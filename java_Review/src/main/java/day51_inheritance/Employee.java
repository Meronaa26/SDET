package day51_inheritance;

public class Employee  extends Object{
    String jobTitle;

    public double calculateSalary(double hourlySalary){

        return 52* 40* hourlySalary *1.1;
    }

    @Override    // it is overriding because this class is extending an object class on default
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
