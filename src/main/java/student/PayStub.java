package student;

public class PayStub implements IPayStub {
    private String name;
    private double pay;
    private double netPay;
    private double taxesPaid;
    private double ytdEarned;
    private double ytdPaid;

    public PayStub(String name, double netPay, double taxesPaid, double ytdEarned, double ytdPaid) {
        this.name = name;
        this.pay = pay; //get rid of it?
        this.netPay = netPay;
        this.taxesPaid = taxesPaid;
        this.ytdEarned = ytdEarned;
        this.ytdPaid = ytdPaid;
    }

    @Override
    public double getPay() {
        return netPay;
    }

    @Override
    public double getTaxesPaid() {
        return taxesPaid;
    }

    @Override
    public String toCSV() {
        return String.format("%s,%.2f,%.2f,%.2f,%.2f",
                this.name, this.netPay, this.taxesPaid, this.ytdEarned, this.ytdPaid);
    }
}
