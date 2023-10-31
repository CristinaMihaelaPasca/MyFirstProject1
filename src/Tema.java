public class Tema {
    public static void main(String[] args) {

        System.out.println("Exercitiul 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Exercitiul 2");
        for (int i = 20; i >= 10; i--) {
            System.out.println(i);
        }
        System.out.println("Exercitiul 3");
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
        System.out.println("Exercitiul 4");
        String[] fructe = {"mar", "capsune", "pere", "banane"};
        for (String fruct : fructe) {
            System.out.println("Imi place sa mananc " + fruct);
        }


        System.out.println("Exercitiul 5");
        int luna = 10;
        switch (luna) {
            case 1:
                System.out.println("Ianuarie");
                break;
            case 2:
                System.out.println("Februarie");
                break;
            case 3:
                System.out.println("Martie");
                break;
            case 4:
                System.out.println("Aprilie");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Iunie");
                break;
            case 7:
                System.out.println("Iulie");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Septembrie");
                break;
            case 10:
                System.out.println("Octombrie");
                break;
            case 11:
                System.out.println("Noiembrie");
                break;
            case 12:
                System.out.println("Decembrie");
                break;

        }
        System.out.println("Exercitiul 1 optional");
        int temperature = 22;
        if (temperature < 18) {
            System.out.println("prea frig");
        } else if (temperature >= 18 && temperature <= 22) {
            System.out.println("ok");
        } else if (temperature > 22) {
            System.out.println("prea cald");

        }
        System.out.println("Exercitiul 2 optional");
        char gender = 'f';
        boolean married = true;
        if (gender == 'm') {
            System.out.println("Domnul");
        }
        if (gender =='f'){
            if (married==true){
                System.out.println("Doamna");
            }
            else {
                System.out.println("Domnisoara");
            }
        }


        System.out.println("Exercitiul 3 optional");
        int x = 23;
        int y = 45;
        if (x > y) {
            System.out.println(x + " este mai mare decat " + y);
        } else if (y > x) {
            System.out.println(y + " este mai mare decat " + x);
        } else if (x == y) {
            System.out.println("sunt egale");
        }
        System.out.println("Exercitiul 4 optional");
        int z = 65;
        if (x>y && x>z){
            System.out.println(x);
        }
        else if (y>x && y>z){
            System.out.println(y);
        }
        else if (z>x && z>y){
            System.out.println(z);
        }
        else {
            System.out.println("Toate sunt egale");
        }

        System.out.println("Exercitiul 5 optional");
        char letter = 'a';
        switch (letter){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println(letter + " este vocala");
                break;
            default:
                System.out.println(letter + "este consoana");
        }
    }
}















