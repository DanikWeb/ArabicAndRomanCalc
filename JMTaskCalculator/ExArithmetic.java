package JMTaskCalculator;

class MyExceptions extends Exception {
    public static String arithmeticEx() {
        return "НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ!";
    }

    public static String valueEx() {
        return "ERROR: ВЫ ВВЕЛИ РАЗНЫЕ ЗНАЧЕНИЯ!";
    }
}
