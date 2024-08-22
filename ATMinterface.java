import java.util.Scanner;

// Base BankAccount class with basic account functionalities
class BankAccount {
    private double balance;
    public String accountNumber;
    public String accountName;
    private int pin;

    public BankAccount(String accountNumber, String accountName, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
            return false;
        }
    }

    public boolean verifyPin(int inputPin) {
        return this.pin == inputPin;
    }

    public void changePin(int newPin) {
        this.pin = newPin;
        System.out.println("PIN successfully changed.");
    }
}

// SavingAccount class extends BankAccount
class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, String accountName, double balance, int pin) {
        super(accountNumber, accountName, balance, pin);
    }
}

// CurrentAccount class extends BankAccount
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String accountName, double balance, int pin) {
        super(accountNumber, accountName, balance, pin);
    }
}

// ATMinterface class to implement the ATM functionality
public class ATMinterface {

    private BankAccount userAccount;
    private Scanner scanner; 

    public ATMinterface(BankAccount userAccount, Scanner scanner) {
        this.userAccount = userAccount;
        this.scanner = scanner; 
    }

    public void run() {
        System.out.print("Enter your PIN to access your account: ");
        int enteredPin = scanner.nextInt();

        if (!userAccount.verifyPin(enteredPin)) {
            System.out.println("Incorrect PIN. Access denied.");
            return;
        }

        while (true) {
            System.out.println("\nATM Menu");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Change Pin");
            System.out.println("5. Exit");

            // Get choice from user
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    changePin();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, please try again...");
                    break;
            }
        }
    }

    // Check balance
    private void checkBalance() {
        System.out.println("Your balance is: Rs" + userAccount.getBalance());
    }

    // Withdraw money
    private void withdraw() {
        System.out.print("Enter amount to withdraw: Rs");
        double amount = scanner.nextDouble();

        if (userAccount.withdraw(amount)) {
            System.out.println("Withdrawal successful! New balance: Rs" + userAccount.getBalance());
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    // Deposit money
    private void deposit() {
        System.out.print("Enter amount to deposit: Rs");
        double amount = scanner.nextDouble();
        userAccount.deposit(amount);
        System.out.println("Deposit successful! New balance: Rs" + userAccount.getBalance());
    }

    // Change PIN
    private void changePin() {
        System.out.print("Enter your current PIN: ");
        int currentPin = scanner.nextInt();

        if (userAccount.verifyPin(currentPin)) {
            System.out.print("Enter your new PIN: ");
            int newPin = scanner.nextInt();
            userAccount.changePin(newPin);
        } else {
            System.out.println("Incorrect current PIN. Cannot change PIN.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        //  the user to choose an account type
        System.out.println("Choose account type:");
        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        System.out.print("Enter your choice: ");
        int accountType = scanner.nextInt();

        BankAccount userAccount;

        // Create the account based on user's choice
        switch (accountType) {
            case 1:
                userAccount = new SavingAccount("1234567890", "Kamal", 10000.0, 1234);
                break;
            case 2:
                userAccount = new CurrentAccount("0987654321", "Ram", 30000.0, 1234);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                scanner.close();
                return;
        }

        ATMinterface atmMachine = new ATMinterface(userAccount, scanner); // Pass scanner to ATMinterface
        atmMachine.run();

        scanner.close(); // Close scanner 
    }
}
