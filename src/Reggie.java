import java.util.Scanner;

    public class Reggie {
        public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String soc = SafeInput.getRegExString(pipe,"What is your Social Security Number?", "^\\d{3}-\\d{2}-\\d{4}$");


            String ucNum = SafeInput.getRegExString(pipe, "What is your UCID number?", "^(M|m)\\d{5}$");

        String choice = SafeInput.getRegExString(pipe, "what is your menu choice? Open, Save, View, or Quit?", "^[OoSsVvQq]$");


    }
    }
