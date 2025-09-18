package domain;

/**
 *
 * @author Griss
 */
  public abstract class Account {
    
    /*//Atributes
    private String accountNumber;
    private double balance;
    private Person client;

    public Account(String accountNumber
            , double balance
            , Person client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }
    
    //-------------------------
    //Methods for polimorfism
    //-------------------------
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double interestCalculation();

    @Override
    public String toString() {
        String result = "/nBANK account INFORMATION:"
                +"/n---------------------------------"
                +"/nAccount Number: "+this.getAccountNumber()
                +"/n Balance: "+this.getBalance()
                +"/nAccount Owner:"+this.getClient().toString();
                return result;
    }
   
}*/

    private String number;
    protected double balance;
    private Client holder;

    // Constructor
    public Account(String number, double balance, Client holder) {
        this.number = number;
        this.balance = balance;
        this.holder = holder;
    }

    // Métodos abstractos
    public abstract void calculateInterest();

    // Métodos de negocio
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposit of " + amount + " completed. New balance: " + balance);
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawal of " + amount + " completed. New balance: " + balance);
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    // Getters y Setters
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public Client getHolder() { return holder; }
    public void setHolder(Client holder) { this.holder = holder; }

    @Override
    public String toString() {
        return "Account [Number=" + number +
                ", Balance=" + balance +
                ", Holder=" + holder.getName() + "]";
    }
}
