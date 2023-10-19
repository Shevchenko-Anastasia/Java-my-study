package net.study.basic.lesson8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestTest {

    @Test
    void calculateGradeJunior() {
        Employee junior = new Employee("Masha", 1000);
        String actualGrade = EmployeeTest.calculateGrade(junior);
        String expectedGrade = "Junior";
        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    void calculateGradeMiddleMinBoundaryValue() {
        Employee middle = new Employee("Vasil", 1001);
        String actualGrade = EmployeeTest.calculateGrade(middle);
        String expectedGrade = "Middle";
        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    void calculateGradeMiddleMaxBoundaryValue() {
        Employee middle = new Employee("Vasil", 2500);
        String actualGrade = EmployeeTest.calculateGrade(middle);
        String expectedGrade = "Middle";
        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    void calculateGradeSeniorMinBoundaryValue() {
        Employee senior = new Employee("Mykola", 2501);
        String actualGrade = EmployeeTest.calculateGrade(senior);
        String expectedGrade = "Senior";
        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    void calculateGradeSeniorMaxBoundaryValue() {
        Employee senior = new Employee("Mykola", 4500);
        String actualGrade = EmployeeTest.calculateGrade(senior);
        String expectedGrade = "Senior";
        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    void calculateGradeManager() {
        Employee manager = new Employee("Dmytro", 4501);
        String actualGrade = EmployeeTest.calculateGrade(manager);
        String expectedGrade = "Manager";
        assertEquals(expectedGrade, actualGrade);
    }
}