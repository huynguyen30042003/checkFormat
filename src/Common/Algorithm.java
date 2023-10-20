package Common;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Algorithm {
    private static final Scanner in = new Scanner(System.in);

    public String checkInputString() {
        // loop until user input true value
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    public String checkInputPhone() {
        while (true) {
            try {
                System.out.print("Phone number: ");
                String resultCheck = in.nextLine().trim();
                if (!resultCheck.matches("^[0-9]{10}$")) {
                    System.err.println("Phone number must be 10 digits");
                } else {
                    return resultCheck;
                }
            } catch (NumberFormatException ex) {
                System.err.println("Phone number must be number");
            }
        }
    }

    public String checkInputDate() {
        while (true) {
            System.out.print("Date: ");
            String dateCheck = checkInputString();
            String[] s = dateCheck.split("/");
            System.out.println();
            if (checkDate(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]))) {
                return dateCheck;
            } else {
                System.out.println("Date to correct format(dd/mm/yyyy)s");
            }
        }
    }

    public boolean checkDate(int day, int month, int year) {
        int maxday;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    maxday = 29;
                } else {
                    maxday = 28;
                }
            } else {
                maxday = 29;
            }
        } else {
            maxday = 28;
        }
        if (month > 12) {
            return false;
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            maxday = 31;
        } else {
            maxday = 30;
        }
        if (day > maxday) {
            return false;
        } else {
            return true;
        }
    }

    public String checkInputEmail() {
        while (true) {
            System.out.print("Email: ");
            String emailCheck = checkInputString();
            if (!emailCheck.matches("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,4}$")) {
                System.err.println("Email must be correct format");
            } else {
                return emailCheck;
            }

        }
    }
}
