import java.util.Scanner;
public class SafeInput {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
    }

    /**
     * Prompts the user for a non-zero length string
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

   //asks for int
    public static int getInt(Scanner pipe, String prompt) {
        int gotInt = 0;
        boolean validInt = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                gotInt = pipe.nextInt();
                validInt = true;
            } else {
                String trash = pipe.next();
                System.out.println("Invalid input: " + trash);
            }
            pipe.nextLine();
        } while (!validInt);
        return gotInt;
    }

   // asks for double
    public static double getDouble(Scanner pipe, String prompt) {
        double gotDouble = 0;
        boolean validDouble = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                gotDouble = pipe.nextDouble();
                validDouble = true;
            } else {
                String trash = pipe.next();
                System.out.println("Invalid input: " + trash);
            }
            pipe.nextLine();
        } while (!validDouble);
        return gotDouble;
    }
    // asks for low to high integer
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int result = 0;
        boolean validInt = false;
        String trash = "";
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                pipe.nextLine();
                if (result >= low && result <= high) {
                    validInt = true;
                } else {
                    trash = pipe.nextLine();
                    System.out.println("Invalid must enter an int [" + low + " - " + high + "]: " + trash);
                }
            } else {
                trash = pipe.next();
                System.out.println("Invalid input: " + trash);
                pipe.nextLine();
            }
        } while (!validInt);
        return result;
    }

    /**
     * Prompts the user to input a double within a specified range
     * @param low    lower bound of the range
     * @param high   upper bound of the range
     * @return a double within the specified range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double result = 0;
        boolean validDub = false;
        String trash = "";
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                pipe.nextLine();
                if (result >= low && result <= high) {
                    validDub = true;
                } else {
                    trash = pipe.nextLine();
                    System.out.println("Invalid must enter a double [" + low + " - " + high + "]: " + trash);
                }
            } else {
                trash = pipe.next();
                System.out.println("Invalid input: " + trash);
                pipe.nextLine();
            }
        } while (!validDub);
        return result;
    }

    /**
     * Prompts the user for a Yes or No response, returning true for Yes and false for No
     * true for Yes and false for No
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String answer;

        while (true) {
            System.out.print(prompt + " Yes or No? ");
            answer = pipe.nextLine().trim().toLowerCase();

            if (answer.equals("y") || answer.equals("yes")) {
                return true;
            } else if (answer.equals("n") || answer.equals("no")) {
                return false;
            } else {
                System.out.println("Invalid input: " + answer);
            }
        }
    }

    /**
     * Prompts the user to input a string that matches a specified regular expression pattern
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param regEx  regular expression pattern to match
     * @return a string that matches the specified pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String value = "";
        boolean validInput = false;
        do {
            System.out.print(prompt + ": ");
            value = pipe.nextLine();
            if (value.matches(regEx)) {
                validInput = true;
            } else {
                System.out.println("\nInvalid input: " + value);
            }
        } while (!validInput);

        return value;
    }

    public static void prettyHeader(String msg) {
        int totalWidth = 60;

        // top border
        line(totalWidth);

        // msg center
        bannerThing(msg, totalWidth);

        // bottom line
        line(totalWidth);
    }

    private static void line(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


    private static void bannerThing(String message, int totalWidth) {
        int messageWidth = message.length();
        int paddingWidth = (totalWidth - messageWidth - 6) / 2;

        System.out.print("***");
        for (int i = 0; i < paddingWidth; i++) {
            System.out.print(" ");
        }
        System.out.print(message);
        for (int i = 0; i < (messageWidth % 2 == 0 ? paddingWidth : paddingWidth + 1); i++) {
            System.out.print(" ");
        }
        System.out.println("***");
    }

    }


