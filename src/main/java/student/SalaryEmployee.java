package student;

public class SalaryEmployee extends Employee {
    public SalaryEmployee(String name, String id, double payRate, double ytdEarnings, double ytdTaxesPaid, double pretaxDeductions) {
        super(name, id, payRate, ytdEarnings, ytdTaxesPaid, pretaxDeductions);
        setEmployeeType("SALARY");
    }
    //@Override
    //public IPayStub runPayroll(double hoursWorked) {
        //return null;
    //}

}
