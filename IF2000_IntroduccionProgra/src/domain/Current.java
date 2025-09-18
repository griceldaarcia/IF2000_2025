package domain;

/**
 *
 * @author Griss
 */

public class Current extends Account {
    private double interestRate;

    // Constructor
    public Current(String number, double balance, Client holder, double interestRate) {
        super(number, balance, holder);
        this.interestRate = interestRate;
    }

    // Cálculo de intereses (saldo * interés / 12)
    @Override
    public void calculateInterest() {
        double interest = (balance * interestRate) / 12;
        balance += interest;
        System.out.println("💰 Interest calculated (Current): " + interest +
                " | New balance: " + balance);
    }

    @Override
    public String toString() {
        return "Current Account [Number=" + getNumber() +
                ", Balance=" + balance +
                ", Holder=" + getHolder().getName() +
                ", InterestRate=" + interestRate + "]";
    }

}
