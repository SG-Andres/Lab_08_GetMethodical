import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        //getNonZeroLenString method
        String nonZeroLenString = SafeInput.getNonZeroLenString (pipe, "enter a string");
        System.out.println("You entered: " + nonZeroLenString);

        //getInt method
        int gotInt = SafeInput.getInt(pipe, "enter an integer");
        System.out.println("You entered: " + gotInt);

        //getDouble method
        double validDouble = SafeInput.getDouble (pipe, "enter a double");
        System.out.println("You entered: " + validDouble);

        //getRangedInt method
        int rangedInt = SafeInput.getRangedInt (pipe, "enter an integer in range", 1, 10);
        System.out.println("You entered: " + rangedInt);

        //getRangedDouble method
        double rangedDouble = SafeInput.getRangedDouble (pipe, "enter a double in range", 1.0, 10.0);
        System.out.println("You entered: " + rangedDouble);

        //getYNConfirm method
        boolean yesNo = SafeInput.getYNConfirm (pipe, "yes or no?");
        System.out.println("You entered: " + (yesNo ? "Yes" : "No"));

        // Testing the getRegExString method
        String regexString = SafeInput.getRegExString (pipe, "matche the pattern", "\\d+"); // Example regex for digits
        System.out.println("You entered: " + regexString);
    }


}
