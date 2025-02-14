package student;

public class HourlyEmployee extends Employee {
    public HourlyEmployee(String name, String id, double payRate, double ytdEarnings, double ytdTaxesPaid, double pretaxDeductions) {
        super(name, id, payRate, ytdEarnings, ytdTaxesPaid, pretaxDeductions);
        setEmployeeType("HOURLY");
    }

    //@Override
    //public IPayStub runPayroll(double hoursWorked) {
        //return null;
    //}
    //calculate gross pay
    protected double calculateGrossPay(double hoursWorked) {
        double grossPay;
        if (hoursWorked <= 40) {
            grossPay = this.getPayRate() * hoursWorked;
        } else {
            grossPay = this.getPayRate() * 40 + this.getPayRate() * 1.5 * (hoursWorked - 40);
        }
        return grossPay;
    }
}
