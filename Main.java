public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 3);
        int b = calc.minus.apply(1,3);
        int c = calc.divide.apply(a, b);

        calc.println.accept(c); /*ошибка ArithmeticException: / by zero
        причина: переменная a = 3, переменная b=0, происходит деление на 0
        вариант исправления:
        -добавить условие, проверяющее входные данные на равенство 0 (a == 0 || b == 0 ? 0 : a/b )*/
    }
}
