package student;

public class SalaryEmployee extends Employee {
    public SalaryEmployee(String name, String id, double payRate, double ytdEarnings,
                          double ytdTaxesPaid, double pretaxDeductions) {
        super(name, id, payRate, ytdEarnings, ytdTaxesPaid, pretaxDeductions);
        setEmployeeType("SALARY");
    }
    //@Override
    //public IPayStub runPayroll(double hoursWorked) {
        //return null;
    //}
    protected double calculateGrossPay(double hoursWorked) {
        return this.getPayRate() / 24;
    }

}
