import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        try {
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();

            account.checkAccount(accNo);

            System.out.println("1. View Balance");
            System.out.println("2. Withdraw Amount");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.viewBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    account.withdraw(amount);
                    break;

                default:
                    System.out.println("Invalid option selected.");
            }

        } catch (AccountMismatchException e) {
            System.out.println("Account Error: " + e.getMessage());

        } catch (BankException e) {
            System.out.println("Bank Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter correct details.");
        }

        sc.close();
    }
}
