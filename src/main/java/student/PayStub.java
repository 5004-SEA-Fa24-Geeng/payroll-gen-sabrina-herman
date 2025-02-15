package student;

/**
 * A class that represents a pay stub.
 */
public class PayStub implements IPayStub {
    /** The name of the employee. */
    private String name;
    /** The employee's net pay. */
    private double netPay;
    /** The taxes paid by the employee. */
    private double taxesPaid;
    /** How much has been earned by the employee this year. */
    private double ytdEarned;
    /** How much taxes have been paid by the employee this year. */
    private double ytdPaid;

    /**
     * The constructor of PayStub.
     * @param name The name of the employee.
     * @param netPay The employee's net pay.
     * @param taxesPaid The taxes paid by the employee.
     * @param ytdEarned How much has been earned by the employee this year.
     * @param ytdPaid How much taxes have been paid by the employee this year.
     */
    public PayStub(String name, double netPay, double taxesPaid, double ytdEarned, double ytdPaid) {
        this.name = name;
        this.netPay = netPay;
        this.taxesPaid = taxesPaid;
        this.ytdEarned = ytdEarned;
        this.ytdPaid = ytdPaid;
    }

    /**
     * Gets the pay for the current pay period.
     * @return the pay for the current pay period
     */
    @Override
    public double getPay() {
        return netPay;
    }

    /**
     * Gets the taxes paid for the current pay period.
     * @return the taxes paid for the current pay period
     */
    @Override
    public double getTaxesPaid() {
        return taxesPaid;
    }

    /**
     * Converts the PayStub object to a CSV string.
     * Format of the CSV string is: "employee_name,net_pay,taxes,ytd_earnings,ytd_taxes_paid"
     * @return the CSV string
     */
    @Override
    public String toCSV() {
        return String.format("%s,%.2f,%.2f,%.2f,%.2f",
                this.name, this.netPay, this.taxesPaid, this.ytdEarned, this.ytdPaid);
    }
}
