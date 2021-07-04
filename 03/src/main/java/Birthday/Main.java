package Birthday;

import java.util.Scanner;

/***
 * main class runner
 */
public class Main
{
    static BirthdayCalc bc;
    static Scanner in = new Scanner(System.in);

    /**
     * main runner for BirthdayCalc
     * @param args command line args
     */
    public static void main(String[] args)
    {
        welcome();
        int day = scanLine("First type your day of birth (DD): \n");
        int month = scanLine("Now your month of birth (MM): \n");
        int year = scanLine("And lastly your year (YYYY): \n");
        System.out.println(day+"."+month+"."+year);

        bc = new BirthdayCalc(day, month, year);
        System.out.println("Your age: " + bc.getAge());
        System.out.println("Days until next Birthday: " + bc.getDaysUntilNextBirthday());

        in.close();
    }

    static int scanLine(String message)
    {
        System.out.println(message);
        return in.nextInt();
    }

    static void welcome()
    {
        System.out.println("---- Welcome to Birthday.BirthdayCalc 3000 ----\n");
        System.out.println("""
                 ____  _      _   _         _              _____      _      ____   ___   ___   ___ \s
                |  _ \\(_)    | | | |       | |            / ____|    | |    |___ \\ / _ \\ / _ \\ / _ \\\s
                | |_) |_ _ __| |_| |__   __| | __ _ _   _| |     __ _| | ___  __) | | | | | | | | | |
                |  _ <| | '__| __| '_ \\ / _` |/ _` | | | | |    / _` | |/ __||__ <| | | | | | | | | |
                | |_) | | |  | |_| | | | (_| | (_| | |_| | |___| (_| | | (__ ___) | |_| | |_| | |_| |
                |____/|_|_|   \\__|_| |_|\\__,_|\\__,_|\\__, |\\_____\\__,_|_|\\___|____/ \\___/ \\___/ \\___/\s""");
        System.out.println();
        System.out.println("Please put your birthdate in the following form to retrieve your current age and days until next Birthday!");
    }
}
