package domain;

/**
 *
 * @author Griss
 */
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Account> accounts;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    // Getters
    public String getBankName() {
        return bankName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    // Agregar cuenta
    public void addAccount(Account account) {
        if (!accounts.contains(account)) {
            accounts.add(account);
        } else {
            System.out.println("⚠️ Account already exists in " + bankName);
        }
    }

    // Buscar cuenta por número
    public Account findAccountByNumber(String number) {
        for (Account acc : accounts) {
            if (acc.getNumber().equals(number)) {
                return acc;
            }
        }
        return null; // No encontrada
    }

    // Mostrar todas las cuentas del banco
    public void showAccounts() {
        System.out.println("📌 Accounts in " + bankName + ":");
        for (Account acc : accounts) {
            System.out.println(acc.toString());
        }
    }

    @Override
    public String toString() {
        return "Bank [Name=" + bankName + ", Accounts=" + accounts.size() + "]";
    }
}

