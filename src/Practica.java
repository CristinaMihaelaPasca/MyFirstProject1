public class Practica {
    public static void main(String[] args) {
        System.out.println("Exercitiul 1 - Modul A2");
        int ziua = 27;
        int luna = 11;
        System.out.println(ziua + luna);
        System.out.println("Exercitiul 2 - Modul A2");
        String nume = "Cristina";
        System.out.println(nume + " invata Java");
        System.out.println("Exercitiul 3 - Modul A2");
        int an = 1987;
        String text = "Cristina s-a nascut in anul ";
        System.out.println(text + an);

        System.out.println("Ex. 1 optional - Modul A2");
        String limbaj = "Python";
        String text1 = " este usor sa inveti ";
        System.out.println(text1 + limbaj);

        System.out.println("Ex. 2 optional - Modul A2 ");
        limbaj = "Java";
        System.out.println(text1 + limbaj);

        System.out.println("Ex. 3 optional - Modul A2");
        limbaj = " orice limbaj de programare";
        System.out.println(text1 + limbaj);

        System.out.println("Ex. 4 optional - Modul A2");
        String text2 = "atata timp cat iti dai silinta";
        System.out.println(text1 + limbaj + text2);

        System.out.println("Ex 5 optional - Modul A2");
        System.out.println(text2 + limbaj + text1);

        /*System.out.println("a");
        System.out.println("b");*/


        System.out.println("Ex. 1 - Modul A3");
        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";
        String myOtherText = "1a2b3c";

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        System.out.println(myOtherText);

        System.out.println("Ex. 2 - Modul A3");
        byte var1 = -128;
        int var2 = var1;

        System.out.println(var2);

        System.out.println("Ex. 3 - Modul A3");
        float var3 = 7.588f;
        int var4 = (int) var3;
        System.out.println(var4);

        System.out.println("Ex. 4 - Modul A3");
        String tara = "Romania";
        int lungime = tara.length();
        System.out.println(lungime);

        System.out.println("Ex. 5 - Modul A3");
        double[] numar = {5.8, 6.5, 8.75, 9.325, 10.76};
        System.out.println(numar[1]);
        System.out.println(numar[3]);
        System.out.println(numar.length);

        System.out.println("Ex.1 optional - Modul A3");
        float var5 = 6.46546458f;
        float var6 = 5.343f;
        System.out.println(var5 + var6);
        System.out.println(var5 - var6);
        System.out.println(var6 - var5);
        System.out.println(var5 * var6);

        System.out.println("Ex. 2 optional - Modulul A3");
        String myFavouriteMovie = "Clanul";
        System.out.println("My favouyrite movie is " + myFavouriteMovie);
        System.out.println("My favourite movie is " + '"' + myFavouriteMovie + '"');

        System.out.println("Ex. 3 optional - Modulul A3");
        System.out.println(myFavouriteMovie.toUpperCase());
        System.out.println(myFavouriteMovie.toLowerCase());

        System.out.println("Ex. 4 optional - Modulul A3");
        System.out.println(myFavouriteMovie.length());

        System.out.println("Ex. 5 optional - Modulul A3");
        char[] elemente = {'a', 'b', 'c', 'd'};
        System.out.println(elemente[0]);
        System.out.println(elemente[1]);
        System.out.println(elemente[3]);
        System.out.println(elemente.length);
        for (int i = 0; i < elemente.length; i++) {
            System.out.println(elemente[i]);
        }
        int a = 3;
        int b = 3;
        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        a += 6;
        System.out.println(a);
        int c = 6;
        int d = 1;
        int e = c + d;
        System.out.println(e);
        if (e >= 10) {
            System.out.println("Suma este mai mare decat 10");
        } else System.out.println("Suma este mai mica decat 10");
        if (e % 2 == 0) {
            System.out.println("Suma este nr par");

        }
        System.out.println(c % d);
        c++;
        c++;
        c++;
        System.out.println(c);
        --c;
        --c;
        System.out.println(c);
        for (int i = 0; i < 3; i++) {
            d++;

        }
        System.out.println(d);
        for (int i = 0; i < 2; i++) {
            d++;
        }
        System.out.println(d);
        for (int i = 0; i < 4; i++) {
            d--;
        }
        System.out.println(d);

        boolean cond1 = true;
        boolean cond2 = false;
        System.out.println(d > 5);
        System.out.println(e > 5);
        System.out.println(d > 5 && e < 5);
        System.out.println(d > 5 || e > 5);
        if (5 < 0) {
            System.out.println("5 este mai mare decat 0");
        } else {
            System.out.println("5 este mai mic decat 0");
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.println(j);


        }

    }
}



