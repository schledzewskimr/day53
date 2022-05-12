import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    public static void main(String[] args) {
        greeting();
    }

    private static void greeting() {
        Scanner scanner = new Scanner(System.in);
        String isNewCustomer;
        while(true) {
            System.out.println("WELCOME TO DUMPSTERCORP BANKING");
            System.out.println("ARE YOU A RETURN CUSTOMER? [0] TO EXIT)");
            System.out.println("[1] YES");
            System.out.println("[2] NO");
            isNewCustomer = scanner.nextLine();
            if (isNewCustomer.equalsIgnoreCase("1")) {
                System.out.println("ENTER ACCOUNT NUMBER:");
                for (BankAccount bankAccount : bankAccounts) {
                    System.out.println(bankAccount.getName() + ": " + bankAccount.getAccountNumber());
                }
                int inputBankAccount = scanner.nextInt();
                BankAccount current = bankAccounts.get(inputBankAccount-1);
                mainMenu(current);
            } else if (isNewCustomer.equalsIgnoreCase("2")) {
                System.out.println("CONGRATULATION");
                System.out.println("TO CREATE ACCOUNT, ENTER YOUR NAME:");
                String name = scanner.nextLine();
                System.out.println("ENTER INITIAL BALANCE:");
                double startingBalance = scanner.nextDouble();
                bankAccounts.add(new BankAccount());
                (bankAccounts.get(bankAccounts.size()-1)).setAccountNumber(bankAccounts.size());
                (bankAccounts.get(bankAccounts.size()-1)).setName(name);
                (bankAccounts.get(bankAccounts.size()-1)).setBalance(startingBalance);
                BankAccount currentAccount = bankAccounts.get(bankAccounts.size() - 1);
                mainMenu(currentAccount);
            }else if(isNewCustomer.equalsIgnoreCase("0")) {
                System.out.println("THANKS FOR BANKING WITH DUMPSTERCORP");
                System.exit(0);
            }else{
                System.out.println("INVALID ENTRY");
            }
        }
    }
    private static void mainMenu(BankAccount currentAccount) {
        int menuChoice;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("NAME: " + currentAccount.getName()+ " ||| ACCOUNT NUMBER: " + currentAccount.getAccountNumber());
            System.out.println("[1] CHECK BALANCE");
            System.out.println("[2] WITHDRAW");
            System.out.println("[3] DEPOSIT");
            System.out.println("[4] TRANSFER");
            System.out.println("[0] EXIT");
            menuChoice = scanner.nextInt();
            if (menuChoice ==  1) {
                System.out.println(currentAccount.getBalance());
            }
            if (menuChoice == 2) {
                System.out.println("ENTER AMOUNT TO WITHDRAW");
                double inputWithdrawAmount = scanner.nextDouble();
                currentAccount.withdrawal(inputWithdrawAmount);
            }
            if (menuChoice == 3) {
                System.out.println("ENTER AMOUNT TO DEPOSIT");
                double inputDepositAmount = scanner.nextDouble();
                currentAccount.deposit(inputDepositAmount);
            }
            if (menuChoice == 4) {
                System.out.println("ENTER TARGET ACCOUNT NUMBER");
                int inputAccount = scanner.nextInt();
                int account = inputAccount-1;
                if (account > bankAccounts.size()) {
                    System.out.println("ACCOUNT NOT FOUND");
                } else {
                    System.out.println("ENTER AMOUNT TO TRANSFER");
                    double inputTransfer = scanner.nextDouble();
                    currentAccount.transfer(bankAccounts.get(account), inputTransfer);
                    System.out.println("SENDING FROM: "+ currentAccount.getName() + " NEW BALANCE: $" + currentAccount.getBalance());
                    System.out.println("RECEIVING: "+ (bankAccounts.get(account).getName()+ " NEW BALANCE: $" + (bankAccounts.get(account).getBalance())));
                }

            } else if (menuChoice == 0) {
                System.out.println("HAVE A GOOD DAY");
                greeting();

            }
        }
    }
}
