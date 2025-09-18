package domain;

/**
 *
 * @author Griss
 */
public class SinpeMovil {
    // Método estático para transferencias entre bancos
    public static boolean transfer(Bank bank1, Account acc1, Bank bank2, Account acc2, double amount) {

        // Validar que las cuentas existan en los bancos
        if (!bank1.getAccounts().contains(acc1) || !bank2.getAccounts().contains(acc2)) {
            System.out.println("❌ Error: Accounts not found in banks.");
            return false;
        }

        // Validar saldo suficiente
        if (acc1.getBalance() < amount) {
            System.out.println("❌ Error: Insufficient balance in source account.");
            return false;
        }

        // Retirar de la cuenta origen
        acc1.withdraw(amount);

        // Depositar en la cuenta destino
        acc2.deposit(amount);

        // Mensaje de éxito
        System.out.println("✅ Transfer successful: " + amount +
                " from " + bank1.getBankName() +
                " to " + bank2.getBankName());

        return true;
    }
}
