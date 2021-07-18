package JMTaskCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ввести два числа от 1 до 10 с оператором: '+', '-', '*', '/' (пример: 1 + 2 или IV / III):\nВведите два числа: ");

        String first = scan.next();
        String operator = scan.next();
        String second = scan.next();

        try {

            if (ArabicNum.isDigit(first) && ArabicNum.isDigit(second)) {

                int n1 = Integer.parseInt(first);
                int n2 = Integer.parseInt(second);

                try {

                    if (n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10) {

                        switch (operator) {
                            case "+" -> System.out.println("Answer: " + ArabicNum.add(n1, n2));
                            case "-" -> System.out.println("Answer: " + ArabicNum.sub(n1, n2));
                            case "*" -> System.out.println("Answer: " + ArabicNum.multi(n1, n2));
                            case "/" -> System.out.println("Answer: " + ArabicNum.div(n1, n2));
                            default -> System.out.println("Такого оператора нет: " + " (" + first + " " + operator + " " + second + ")!");
                        }

                    } else System.out.println("Нужно вводить числа от 1 до 10!");

                } catch (ArithmeticException e) {
                    System.err.println(MyExceptions.arithmeticEx());
                    e.printStackTrace();

                }

            } else if (RomanNum.value(first) && RomanNum.value(second)) {

                int n1 = RomanNum.romanToNumber(first);
                int n2 = RomanNum.romanToNumber(second);

                try {

                    switch (operator) {
                        case "+" -> System.out.println(RomanNum.add(n1, n2));
                        case "-" -> System.out.println(RomanNum.sub(n1, n2));
                        case "*" -> System.out.println(RomanNum.multi(n1, n2));
                        case "/" -> System.out.println(RomanNum.div(n1, n2));
                        default -> System.out.println("Такого оператора нет: " + " (" + first + " " + operator + " " + second + ")!");
                    }

                } catch (ArithmeticException e) {
                    System.err.println(MyExceptions.arithmeticEx());
                    e.printStackTrace();

                }

            } else throw new MyExceptions();

        } catch (MyExceptions e) {
            System.out.println("Нужно вводить числа от I до X!");
            System.err.println(MyExceptions.valueEx() + " (" + first + " " + operator + " " + second + ")!");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("ERROR!!!");
            e.printStackTrace();

        }
    }
}
