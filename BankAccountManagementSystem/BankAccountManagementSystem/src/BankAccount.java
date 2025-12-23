public class BankAccount {

    private int accountNumber = 12345;   // existing account
    private double balance = 5000.00;

    public void checkAccount(int enteredAccount) throws AccountMismatchException {
        if (enteredAccount != accountNumber) {
            throw new AccountMismatchException("Account number does not match our records.");
        }
    }

    public void viewBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void withdraw(double amount) throws BankException {
        if (amount <= 0) {
            throw new BankException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new BankException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining Balance: ₹" + balance);
    }
}
