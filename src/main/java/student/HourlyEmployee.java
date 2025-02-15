package student;

/**
 * A class that represents an Hourly Employee. It extends the Employee class.
 */
public class HourlyEmployee extends Employee {
    /**
     * The Constructor for HourlyEmployee
     * @param name The name of the Employee.
     * @param id The id of the Employee.
     * @param payRate The pay rate of the Employee.
     * @param ytdEarnings The ytdEarnings of the Employee.
     * @param ytdTaxesPaid The ytdTaxesPaid of the Employee.
     * @param pretaxDeductions The name of the Employee.
     */
    public HourlyEmployee(String name, String id, double payRate, double ytdEarnings,
                          double ytdTaxesPaid, double pretaxDeductions) {
        super(name, id, payRate, ytdEarnings, ytdTaxesPaid, pretaxDeductions);
        setEmployeeType("HOURLY");
    }

    /**
     * Calculates gross pay of the employee. For hourly employees it is the hoursWorked times their gross pay.
     * For any hours over 40, the pay is multiplied by 1.5.
     * @param hoursWorked the hours worked for the pay period
     * @return the gross pay for the pay period
     */
    protected double calculateGrossPay(double hoursWorked) {
        double grossPay;
        // Check if there is overtime (40 hours)
        if (hoursWorked <= 40) {
            // Normal pay, so grossPay is just the pay rate times the hours worked.
            grossPay = this.getPayRate() * hoursWorked;
        } else {
            // There is more than 40 hours, so any hours after 40 are multiplied by 1.5
            grossPay = this.getPayRate() * 40 + this.getPayRate() * 1.5 * (hoursWorked - 40);
        }
        return grossPay;
    }
}
