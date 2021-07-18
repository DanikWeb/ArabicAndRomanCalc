package JMTaskCalculator;

public class ArabicNum {

    public static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
