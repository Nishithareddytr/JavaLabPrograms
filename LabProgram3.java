Create class SavingsAccount. Use a static variable annualInterestRate to store the annual

interest rate for all account holders. Each object of the class contains a private instance variable

savingsBalance indicating the amount the saver currently has on deposit. Provide method

calculateMonthlyInterest to calculate the monthly interest by multiplying the

savingsBalance by annualInterestRate divided by 12—this interest should be added to

savingsBalance. Provide a method modifyInterestRate that sets the

annualInterestRate to a new value.

Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1

and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to

4%, then calculate the monthly interest for each of 12 months and print the new balances for both savers.

Next, set the annualInterestRate to 5%, calculate the next month’s interest and print the new

balances for both savers. Also, provide the UML class diagram of your class

PROGRAM

public class SavingsAccount {
    private static double annualInterestRate = 0;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * annualInterestRate / 12;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
}


public class Main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(0.04);
        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        System.out.println("Saver1: " + saver1.getSavingsBalance());
        System.out.println("Saver2: " + saver2.getSavingsBalance());
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1: " + saver1.getSavingsBalance());
        System.out.println("Saver2: " + saver2.getSavingsBalance());
    }
}


