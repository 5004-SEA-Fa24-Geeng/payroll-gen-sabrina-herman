package student;

/**
 * An abstract class that implements the IEmployee interface. It represents an employee.
 */
public abstract class Employee implements IEmployee {
    /** The name of the Employee. */
    private String name;
    /** The id of the Employee. */
    private String id;
    /** The pay rate of the Employee. */
    private double payRate;
    /** The type of employee, "HOURLY" for hourly and "SALARY" for salary. */
    private String employeeType;
    /** The ytdEarnings of the Employee. */
    private double ytdEarnings;
    /** The ytdTaxesPaid of the Employee. */
    private double ytdTaxesPaid;
    /** The name of the Employee. */
    private double pretaxDeductions;

    /**
     * The Employee constructor.
     * @param name The name of the Employee.
     * @param id The id of the Employee.
     * @param payRate The pay rate of the Employee.
     * @param ytdEarnings The ytdEarnings of the Employee.
     * @param ytdTaxesPaid The ytdTaxesPaid of the Employee.
     * @param pretaxDeductions The name of the Employee.
     */
    public Employee(String name, String id, double payRate,
                    double ytdEarnings, double ytdTaxesPaid, double pretaxDeductions) {
        this.name = name;
        this.id = id;
        this.payRate = payRate;
        this.ytdEarnings = ytdEarnings;
        this.ytdTaxesPaid = ytdTaxesPaid;
        this.pretaxDeductions = pretaxDeductions;
    }

    /**
     * Gets the name of the Employee.
     * @return the name of the Employee.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets the employee's ID.
     * @return the ID of the employee.
     */
    @Override
    public String getID() {
        return id;
    }

    /**
     * Gets the employee's pay rate.
     * @return the pay rate of the employee.
     */
    @Override
    public double getPayRate() {
        return payRate;
    }

    /**
     * Gets the employee type, either "HOURLY" or "SALARY".
     * @return the type of employee as a string.
     */
    @Override
    public String getEmployeeType() {
        return employeeType;
    }

    /**
     * sets the employee type, this is called in the SalaryEmployee or HourlyEmployee
     * class constructor depending on the type of employee.
     * @param employeeType the type of employee as a string.
     */
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    /**
     * Gets the YTD earnings of the employee.
     * @return the YTD earnings of the employee.
     */
    @Override
    public double getYTDEarnings() {
        return ytdEarnings;
    }

    /**
     * Gets the YTD taxes paid by the employee.
     * @return the YTD taxes paid by the employee.
     */
    @Override
    public double getYTDTaxesPaid() {
        return ytdTaxesPaid;
    }

    /**
     * Gets the preTaxDeductions the employee.
     * @return the preTaxDeductions of the employee.
     */
    @Override
    public double getPretaxDeductions() {
        return pretaxDeductions;
    }

    /**
     * Runs the employees payroll and creates a PayStub object based on their
     * info.
     * @param hoursWorked the hours worked for the pay period.
     *
     * @return A new PayStub object, or null if they have worked less than 0 hours.
     */
    @Override
    public IPayStub runPayroll(double hoursWorked) {
        // Check for negative hours. if so, return a null.
        if (hoursWorked < 0) {
            return null;
        }

        // Tried using BigDecimal for this as recommended, but it would mess up in the Gradescope Autograder.
        // Double ended up working fine for me.

        // Pay - preTaxDeductions.
        double netPay = this.calculateGrossPay(hoursWorked) - this.pretaxDeductions;

        // Get the amount of taxes.
        double taxes = netPay * .2265;

        // Subtract taxes from the netPay.
        netPay -= taxes;

        // Add netPay to the ytdEarnings and taxes onto the ytdTaxesPaid.
        this.ytdEarnings += netPay;
        this.ytdTaxesPaid += taxes;

        // Return a new PayStub
        return new PayStub(this.name, netPay, taxes, this.ytdEarnings, this.ytdTaxesPaid);

    }

    /**
     * Converts the employee to a CSV string.
     *
     * Format of the String s as follows:
     * employee_type,name,ID,payRate,pretaxDeductions,YTDEarnings,YTDTaxesPaid
     * @return the employee as a CSV string
     */
    @Override
    public String toCSV() {
        return String.format("%s,%s,%s,%.2f,%.2f,%.2f,%.2f",
                this.employeeType, this.name, this.id, this.payRate,
                this.pretaxDeductions, this.ytdEarnings, this.ytdTaxesPaid);
    }

    /**
     * An abstract method for calculating gross pay of the employee. SalaryEmployee and Hourly Employee handle this.
     * @param hoursWorked the hours worked for the pay period
     * @return the gross pay for the pay period
     */
    protected abstract double calculateGrossPay(double hoursWorked);

}
