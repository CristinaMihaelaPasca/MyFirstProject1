import javax.swing.*;

public class Operators {
    public static void main(String[] args) {
        int sum1 = 100 + 50;
        int sum2 = sum1 + 50;
        int sum3 = sum1 + sum2;
        System.out.println("sum1=" + sum1);
        System.out.println("sum2=" + sum2);
        System.out.println("sum3=" + sum3);

        int number1 = 100;
        int number2 = 50;
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 / number2);
        System.out.println(number1 * number2);
        System.out.println(number1 % number2);
        System.out.println(9 % 2); // restul impartirii
        System.out.println(9 / 2); //catul
        System.out.println(++number1);
        System.out.println(--number2);
        System.out.println(number1++);
        System.out.println(number1);
        int number3 = number2;
        number2 = 1;
        System.out.println(number3);
        System.out.println(number2);
        // number2 = number2+2;
        System.out.println(number2);
        number2 += 4; //echivalent number2=number2+4
        number2 -= 2;
        System.out.println(number2);
        number2 *= 2;
        System.out.println(number2);
        System.out.println(number1 > number2); //100.6
        System.out.println(number1 < number2);
        System.out.println(10 > 5);
        System.out.println('A' == 'A');
        System.out.println('A' != 'A');
        System.out.println(true);
        System.out.println(!true);
        System.out.println(number1);
        System.out.println(number2);
        boolean condition = number1 > number2 && number1 > 100;
        System.out.println(condition);

        if (condition) {
            System.out.println("Conditia este adevarata!");
        } else
            System.out.println("Conditia nu este adevarata!");


        System.out.println(10 * 6);
        System.out.println(10 / 5);
        int x = 10;
        System.out.println(++x);
        System.out.println(--x);
        x = x + 5;
        System.out.println(x);
        int variabila1 = 8;
        int variabila2 = 9;
        int variabila3 = variabila1 + variabila2;
        System.out.println(variabila3);
        if (variabila3 >= 10) {
            System.out.println("Suma este mai mare decat 10");
        } else {
            System.out.println("Suma este mai mica decat 10");
        }
        if (variabila3 % 2 == 0) {
            System.out.println("Suma este numar par");
        } else {
            System.out.println("Suma este numar impar");

        }
        if (variabila3 <= 10) {
            System.out.println("Suma este mai mica decat 10");
        } else {
            System.out.println("Suma este mai mare decat 10");
        }
        System.out.println("exercitiul 1");
        int var1 = 6;
        int var2 = 8;
        int var3 = 7;
        int var4 = 15;
        System.out.println(var1 + var2 + var3 + var4);
        System.out.println(var1 * var2 * var3 * var4);
        System.out.println(var4 % var2);
        System.out.println("exercitiul 2");
        var1 = ++var1;
        var1 = ++var1;
        var1 = ++var1;
        System.out.println(var1);
        System.out.println("exercitiul 3");
        var2 = --var2;
        var2 = --var2;
        var2 = --var2;
        var2 = --var2;
        System.out.println(var2);
        System.out.println("exercitiul 4");
        boolean cond1 = true;
        boolean cond2 = false;
        System.out.println(var1+var2+var3+var4>100);
        System.out.println(var1*var2*var3*var4>1000);
        System.out.println("exercitiul 5");
        System.out.println(var1+var2+var3+var4>100 && var1*var2*var3*var4>1000);
        System.out.println(var1+var2+var3+var4>100 || var1*var2*var3*var4>1000);





    }










    }

