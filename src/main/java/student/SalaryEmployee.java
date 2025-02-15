package student;

/**
 * A class that represents a Salary Employee. It extends the Employee class.
 */
public class SalaryEmployee extends Employee {
    /**
     * The Constructor for SalaryEmployee.
     * @param name The name of the Employee.
     * @param id The id of the Employee.
     * @param payRate The pay rate of the Employee.
     * @param ytdEarnings The ytdEarnings of the Employee.
     * @param ytdTaxesPaid The ytdTaxesPaid of the Employee.
     * @param pretaxDeductions The name of the Employee.
     */
    public SalaryEmployee(String name, String id, double payRate, double ytdEarnings,
                          double ytdTaxesPaid, double pretaxDeductions) {
        super(name, id, payRate, ytdEarnings, ytdTaxesPaid, pretaxDeductions);
        setEmployeeType("SALARY");
    }

    /**
     * Calculates gross pay of the employee.
     * For salaried employees the gross pay is the pay rate divided by the 24 pay periods.
     * @param hoursWorked the hours worked for the pay period
     * @return the gross pay for the pay period
     */
    protected double calculateGrossPay(double hoursWorked) {
        return this.getPayRate() / 24;
    }

}
