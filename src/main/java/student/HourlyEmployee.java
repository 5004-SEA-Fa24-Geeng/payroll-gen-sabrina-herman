package student;

public class HourlyEmployee extends Employee {
    public HourlyEmployee(String name, String id, double payRate, double ytdEarnings, double ytdTaxesPaid, double pretaxDeductions) {
        super(name, id, payRate, ytdEarnings, ytdTaxesPaid, pretaxDeductions);
    }

    //@Override
    //public IPayStub runPayroll(double hoursWorked) {
        //return null;
    //}
    //calculate gross pay

    @Override
    public String toCSV() {
        return "";
    }
}
