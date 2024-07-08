import java.util.Scanner;

//At the 10$ store nothing is more than $10.00.  Prompt the user for the price of their item (.50 cents to $10.00 dollars)
// using the getRangedDouble method and continue to input items as long as they indicate that they have more using your getYNConfirm method.
// Display the total cost of the item(s) to 2 decimal places with printf.
    public class CheckOut {
        public static void main(String[] args) {
            Scanner pipe = new Scanner(System.in);
            double totalCost = 0.0;
            boolean itemsYN;

            do {
                double price = SafeInput.getRangedDouble(pipe, "Input the price of your item", 0.50, 10.00);
                totalCost += price;
                itemsYN = !SafeInput.getYNConfirm(pipe, "Is this all you are buying today?");
            } while (itemsYN);

            System.out.printf("The total cost of your items is: $%.2f%n", totalCost);
            pipe.close();
        }
    }