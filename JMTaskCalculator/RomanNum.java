package JMTaskCalculator;

import java.util.InputMismatchException;

public class RomanNum {

    public static boolean value(String roman) {
        String[] romans = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (String s : romans) {
            if (roman.equals(s)) return true;
        }
        return false;
    }

    public static String roman(int roman) {

        String s = "";

        while (roman >= 100) {
            s += "C";
            roman -= 100;
        }
        while (roman >= 90) {
            s += "XC";
            roman -= 90;
        }
        while (roman >= 50) {
            s += "L";
            roman -= 50;
        }
        while (roman >= 40) {
            s += "XL";
            roman -= 40;
        }
        while (roman >= 10) {
            s += "X";
            roman -= 10;
        }
        while (roman >= 9) {
            s += "IX";
            roman -= 9;
        }
        while (roman >= 5) {
            s += "V";
            roman -= 5;
        }
        while (roman >= 4) {
            s += "IV";
            roman -= 4;
        }
        while (roman >= 1) {
            s += "I";
            roman -= 1;
        }
        return s;
    }

    public static int romanToNumber(String roman) {
        try {
            if (roman.equals("I")) return 1;
            else if (roman.equals("II")) return 2;
            else if (roman.equals("III")) return 3;
            else if (roman.equals("IV")) return 4;
            else if (roman.equals("V")) return 5;
            else if (roman.equals("VI")) return 6;
            else if (roman.equals("VII")) return 7;
            else if (roman.equals("VIII")) return 8;
            else if (roman.equals("IX")) return 9;
            else if (roman.equals("X")) return 10;
            else if (roman.equals("O")) return 0;
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неверный формат данных!");
        }
        return -1;
    }

    public static String add(int a, int b) {
        int res = a + b;
        return "Answer: " + roman(res);
    }

    public static String sub(int a, int b) {
        int res = a - b;
        return "Answer: " + roman(res);
    }

    public static String multi(int a, int b) {
        int res = a * b;
        return "Answer: " + roman(res);
    }

    public static String div(int a, int b) {
        int res = a / b;
        return "Answer: " + roman(res);
    }
}
