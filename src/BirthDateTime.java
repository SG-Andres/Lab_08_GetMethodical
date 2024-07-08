//Use the getRangedInt method to input the year (1950-2015),
// month (1-12), Day*, hours (1 – 24), Minutes (1-59) of a person’s birth.
//use a switch() conditional selector structure to limit the user to the
// correct number of days for the month they were born in. EX:
// if they were born in Feb [1-29], Oct [1-31].
// HINT: there are only 3 groups here not 12 different ones!
import java.util.Scanner;
public static void main() {
    Scanner pipe = new Scanner(System.in);

    int year = SafeInput.getRangedInt(pipe, "Enter the year of birth", 1950, 2015);
    int month = SafeInput.getRangedInt(pipe, "Enter the month of birth", 1, 12);

    int daysInMonth = getDays(month, year);
    int day = SafeInput.getRangedInt(pipe, "Enter the day of birth", 1, daysInMonth);

    int hour = SafeInput.getRangedInt(pipe, "Enter the hour of birth", 1, 24);
    int minute = SafeInput.getRangedInt(pipe, "Enter the minute of birth", 1, 59);
    pipe.close();
    System.out.println("Birthdate: " + year + "-" + month + "-" + day + " " + hour + ":" + minute);

}


    public static int getDays(int month, int year) {
        int monthDays;

        switch (month) {
            case 2:
                //feb
                monthDays = 29;
                break;

            //april june sept nov
            case 4:
            case 6:
            case 9:
            case 11:
                monthDays = 31;
                break;

            // jan, march, may, july, aug, oct, dec
            default:
                monthDays = 31;
                break;
        }
        return monthDays;

    }








