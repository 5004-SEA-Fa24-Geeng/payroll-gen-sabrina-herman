import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student.Employee;
import student.HourlyEmployee;
import student.PayStub;
import student.SalaryEmployee;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    private SalaryEmployee salaryEmployee;
    private HourlyEmployee hourlyEmployee;
    private SalaryEmployee salaryEmployee2;
    private PayStub payStub;

    @BeforeEach
    void setUp() {
        salaryEmployee = new SalaryEmployee("Jane", "123", 30, 10000, 1000, 300);
        hourlyEmployee = new HourlyEmployee("Joe", "456", 25, 20000, 2000, 700);
        salaryEmployee2 = new SalaryEmployee("Nami","s193",200000.0,1000.0,20000,6000.0);
        payStub = new PayStub("Nami",1804.83,528.50,1000,20000);
    }

    @Test
    void getName() {
        assertEquals("Jane", salaryEmployee.getName());
        assertEquals("Joe", hourlyEmployee.getName());
    }

    @Test
    void getPayRate() {
        assertEquals(30, salaryEmployee.getPayRate());
        assertEquals(25, hourlyEmployee.getPayRate());
    }

    @Test
    void getEmployeeType() {
        assertEquals("SALARY", salaryEmployee.getEmployeeType());
        assertEquals("HOURLY", hourlyEmployee.getEmployeeType());
    }

    @Test
    void getYTDEarnings() {
        assertEquals(10000, salaryEmployee.getYTDEarnings());
        assertEquals(20000, hourlyEmployee.getYTDEarnings());
    }

    @Test
    void getYTDTaxesPaid() {
        assertEquals(1000, salaryEmployee.getYTDTaxesPaid());
        assertEquals(2000, hourlyEmployee.getYTDTaxesPaid());
    }

    @Test
    void getPretaxDeductions() {
        assertEquals(300, salaryEmployee.getPretaxDeductions());
        assertEquals(700, hourlyEmployee.getPretaxDeductions());
    }

    @Test
    void toCSV() {
        assertEquals("SALARY,Jane,123,30.00,300.00,10000.00,1000.00", salaryEmployee.toCSV());
        assertEquals("HOURLY,Joe,456,25.00,700.00,20000.00,2000.00", hourlyEmployee.toCSV());
    }

    @Test
    void runPayroll() {

        assertEquals(payStub.toCSV(), salaryEmployee2.runPayroll(60).toCSV());
    }
}