import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Ask for bill amount
        System.out.print("Enter the bill amount: ");
        double bill = input.nextDouble();

        // Step 2: Bonus - allow custom tip percentage
        System.out.print("Enter tip percentage (default is 15): ");
        double tipPercent = input.nextDouble();

        // Step 3: Calculate tip
        double tipAmount = (bill * tipPercent) / 100;

        // Step 4: Calculate total
        double total = bill + tipAmount;

        // Step 5: Print results
        System.out.println("Tip Amount: " + tipAmount);
        System.out.println("Total Amount (Bill + Tip): " + total);

        input.close();
    }
}


