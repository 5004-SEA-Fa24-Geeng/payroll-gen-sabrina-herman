package student;

/**
 * A class that represents a time card.
 */
public class TimeCard implements ITimeCard {
    /** The id of the employee. */
    private String employeeID;
    /** The totals hours worked of the employee. */
    private double hoursWorked;

    /**
     * The constructor of TimeCard.
     * @param employeeID The id of the employee.
     * @param hoursWorked Total hours worked of the employee.
     */
    public TimeCard(String employeeID, double hoursWorked) {
        this.employeeID = employeeID;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Gets the employee ID.
     * @return the employee ID
     */
    @Override
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Gets the hours worked by the employee.
     * @return the hours worked by the employee
     */
    @Override
    public double getHoursWorked() {
        return hoursWorked;
    }
}
