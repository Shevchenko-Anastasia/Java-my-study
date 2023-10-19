package net.study.basic.lesson8;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee tester = new Employee("Anastasia", 5000);

        final String grade = calculateGrade(tester);
        System.out.println(grade);

    }

    public static String calculateGrade (Employee employeeData) {
        if (employeeData.salary <= 1000){
            return "Junior";
        } else if (employeeData.salary > 1000 && employeeData.salary <= 2500){
            return "Middle";
        } else if (employeeData.salary > 2500 && employeeData.salary <= 4500){
            return "Senior";
        } else {
            return "Manager";
        }
    }
}
