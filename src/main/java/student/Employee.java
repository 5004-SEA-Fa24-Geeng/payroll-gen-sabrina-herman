package student;

import java.math.BigDecimal;

public abstract class Employee implements IEmployee {
    private String name;
    private String id;
    private double payRate;
    private String employeeType;
    private double ytdEarnings;
    private double ytdTaxesPaid;
    private double pretaxDeductions;
    public Employee(String name, String id, double payRate,
                    double ytdEarnings, double ytdTaxesPaid, double pretaxDeductions) {
        this.name = name;
        this.id = id;
        this.payRate = payRate;
        this.ytdEarnings = ytdEarnings;
        this.ytdTaxesPaid = ytdTaxesPaid;
        this.pretaxDeductions = pretaxDeductions;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public double getPayRate() {
        return payRate;
    }
    @Override
    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public double getYTDEarnings() {
        return ytdEarnings;
    }

    @Override
    public double getYTDTaxesPaid() {
        return ytdTaxesPaid;
    }

    @Override
    public double getPretaxDeductions() {
        return pretaxDeductions;
    }

    @Override
    public IPayStub runPayroll(double hoursWorked) {
        if (hoursWorked < 0) {
            return null;
        }

        double netPay = this.calculateGrossPay(hoursWorked) - this.pretaxDeductions;
        double taxes = netPay * .2265;
        netPay -= taxes;
        this.ytdEarnings += netPay;
        this.ytdTaxesPaid += taxes;

        return new PayStub(this.name, netPay, taxes, this.ytdEarnings, this.ytdTaxesPaid);

    }

    @Override
    public String toCSV() {
        // make this less ugly later
        return String.format("%s,%s,%s,%.2f,%.2f,%.2f,%.2f",
                this.employeeType, this.name, this.id, this.payRate,
                this.pretaxDeductions, this.ytdEarnings, this.ytdTaxesPaid);
    }
    protected abstract double calculateGrossPay(double hoursWorked);

}
