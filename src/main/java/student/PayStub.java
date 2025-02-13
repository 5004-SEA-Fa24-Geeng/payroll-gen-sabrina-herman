package student;

public class PayStub implements IPayStub {
    private String name;
    private double pay;
    private double taxesPaid;
    private double ytdEarned;
    private double ytdPaid;

    public PayStub(String name, double pay, double taxesPaid, double ytdEarned, double ytdPaid) {
        this.name = name;
        this.pay = pay;
        this.taxesPaid = taxesPaid;
        this.ytdEarned = ytdEarned;
        this.ytdPaid = ytdPaid;
    }

    @Override
    public double getPay() {
        return pay;
    }

    @Override
    public double getTaxesPaid() {
        return taxesPaid;
    }

    @Override
    public String toCSV() {
        return this.name + "," + String.format("%.2f",this.pay) + ","
                + String.format("%.2f",this.taxesPaid) + ","
                + String.format("%.2f",this.ytdEarned) + ","
                + String.format("%.2f",this.ytdPaid);
    }
}
