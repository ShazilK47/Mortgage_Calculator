import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaring constants:

        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        //Taking inputs

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t*** Mortgage Calculator ***\n");
        System.out.print("Enter Amount for Loan (Principal): ");
        int principal = scanner.nextInt();

        System.out.print("Enter Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();

        System.out.print("Enter Period(Years): ");
        byte period = scanner.nextByte();

        //To calculate:
        //Monthly Interest Rate (monthlyInterestRate):
        annualInterestRate /= PERCENT;
        float monthlyInterestRate = annualInterestRate / 12;

        //Number of payments(numberOfPayments):
        int numberOfPayments = period * MONTH_IN_YEAR;

        //Mortgage:
        double mortgage = principal * ((monthlyInterestRate * Math.pow((1+monthlyInterestRate), numberOfPayments))/ (Math.pow((1+monthlyInterestRate), numberOfPayments) - 1));

        String mortgageAmount = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage Amount: " + mortgageAmount);

    }
}