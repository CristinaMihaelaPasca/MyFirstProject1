public class JavaMethods {
    public static void main(String[] args) {
printHello();
printHello();
weLearn();
helloName("Cristina");
helloName("Ioana");
getSum(2, 3);
getSum(10, 5);
getProduct(7, 9);
getSumm(4,6,9);
helloNameAge("Cristina", 36);
printFriends("Cristina", "Ioana");
int result = getSumWithReturn(5, 6);
        System.out.println(result);
        System.out.println(getSumWithReturn(7,9));
        System.out.println(getProductWithReturn(5, 6));
        System.out.println(areMere("Ana "));
        System.out.println(areMere("Cristina "));
        System.out.println(inversulNumarului(6));
        System.out.println(maximNumere(7, 8));
        System.out.println(mediaAritmetica(10L,2L,2L));
        System.out.println(lungimeString("Alexandru"));
        System.out.println(concatenare("Alexandru", "Stefania"));
        System.out.println(inversulString("Stefania si Alexandru"));
        System.out.println(nimic());
        System.out.println(numarBoolean(5));
        System.out.println(lunaCalendaristica("septembrie"));
        System.out.println(numarMaxim(8,3));
        System.out.println(numarMaxim4Numere(5,9,11,11));
        System.out.println(numarCaractere("Stefania"));
        System.out.println(sumaCifrelor(123455));




    }
    private static void printHello(){
        System.out.println("Hello World");

    }
    private static void weLearn(){
        System.out.println("We Learn About Methods");
    }

    private static void helloName(String name){
        System.out.println("Hello " + name);
    }

    private static void getSum(int x, int y){
        System.out.println(x+y);
    }
    private static void getProduct(int x, int y){
        System.out.println(x+y);

    }
    private static void getSumm (int x, int y, int z){
        System.out.println(x+y+z);
    }
    private static void helloNameAge(String name, int age){
        System.out.println(name + " is " + age+ " years old ");
    }
    private static void printFriends(String nume1, String nume2){
        System.out.println(nume1+ " and " + nume2 + " are friends ");}

        private static int getSumWithReturn(int x, int y){
            return x+y;}

    private static int getProductWithReturn(int x, int y){
        return x*y;
    }

        private static String areMere(String nume1){
            return nume1 + "are mere";
        }
        private static int inversulNumarului(int x){
        return -x;
        }
        private static int maximNumere(int x, int y){
        if (x>y) return x;
        else return y;
        }
        private static double mediaAritmetica(double n1, double n2, double n3){
        return (n1+n2+n3)/ 3;
        }
        private static int lungimeString(String lungime){
        return lungime.length();
        }
        private static String concatenare(String nume3, String nume4){
            return (nume3 + " si " + nume4 +" sunt frati ");
        }

        private static String inversulString(String text){
        StringBuilder invers = new StringBuilder(text);
        invers.reverse();
        return invers.toString();
        }


        private static String nimic(){
        return ("In sfarsit ninge");
        }
        private static boolean numarBoolean(int numar1){
        if (numar1 %2==0) return true;
        else return false;
        }
        private static String lunaCalendaristica(String luna){
        if (luna== "martie" || luna== "aprilie" || luna== "mai" ){
            return "primavara";}
            else  if (luna== "iunie" || luna=="iulie"|| luna=="august"){
                return "vara";}
                else  if (luna=="septembrie" || luna=="octombrie" || luna=="noiembrie"){
                    return "toamna";}
                    else if (luna=="decembrie"|| luna=="ianuarie" || luna=="februarie"){
                    return "iarna";}
                    else return "unknown";
        }
        private static int numarMaxim(int x, int y){
        if (x>y){ return x;}
        else if (y>x){ return y;}
        else return x;
    }
    private static int numarMaxim4Numere(int a, int b, int c, int d){
        int maxab = Math.max (a, b);
        int maxcd = Math.max (c, d);
        return Math.max (maxab, maxcd);
    }


private static int numarCaractere(String nume){
        return nume.length();
}

private static int sumaCifrelor(int n){
        int s=0;
        while (n!=0){
            s=s+n%10;
            n/=10;
        }
        return s;
}

    }


