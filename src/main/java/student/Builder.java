package student;

/** 
 * This is a static class (essentially functions) that will help you build objects from CSV strings.
 * These objects are then used in the rest of the program. Often these builders are associated
 * with the objects themselves and the concept of a factory, but we placed
 * them here to keep the code clean (and to help guide you).
 */
public final class Builder {
    
    private Builder() {
    }


     /**
     * Builds an employee object from a CSV string.
     * 
     * You may end up checking the type of employee (hourly or salary) by looking at the first
     * element of the CSV string. Then building an object specific to that type.
     * 
     * @param csv the CSV string
     * @return the employee object
     */
    public static IEmployee buildEmployeeFromCSV(String csv) {
        double payRate;
        double ytdEarnings;
        double ytdTaxes;
        double preTaxDeductions;
        String name;
        String id;

        String[] csvStrings = csv.split(",");

        name = csvStrings[1];
        id = csvStrings[2];

        if (csvStrings.length != 7) {
            throw new IllegalArgumentException("Invalid CSV format");
        }

        try {
            payRate = Double.parseDouble(csvStrings[3]);
            ytdEarnings = Double.parseDouble(csvStrings[5]);
            ytdTaxes = Double.parseDouble(csvStrings[6]);
            preTaxDeductions = Double.parseDouble(csvStrings[4]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid CSV format");
        }

        if (csvStrings[0].equals("HOURLY")) {
            return new HourlyEmployee(name, id, payRate, ytdEarnings, ytdTaxes, preTaxDeductions);
        }

        if (csvStrings[0].equals("SALARY")) {
            return new SalaryEmployee(name, id, payRate, ytdEarnings, ytdTaxes, preTaxDeductions);
        }
        return null;
    }



   /**
     * Converts a TimeCard from a CSV String.
     * 
     * @param csv csv string
     * @return a TimeCard object
     */
    public static ITimeCard buildTimeCardFromCSV(String csv) {
        String[] csvStrings = csv.split(",");
        String id = csvStrings[0];
        double hoursWorked;

        if (csvStrings.length != 2) {
            throw new IllegalArgumentException("Invalid CSV format");
        }

        try {
            hoursWorked = Double.parseDouble(csvStrings[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid CSV format");
        }

        return new TimeCard(id, hoursWorked);
    }
}
