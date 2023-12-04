public class Algorythms {
    public static void main(String[] args) {
        System.out.println("Ex 1 - declararea sirului");
        int numere[] = {1, -25, 34, -2, 67, 5};
        System.out.println("Ex2 - varianta1");
        for (int i = 0; i < numere.length; i++) {
            System.out.println((numere[i] - 1) + " " + (numere[i] + 1));
        }
        System.out.println("Ex1 - varianta 2");
        int numere1[] = {1, -25, 34, -2, 67, 5};
        for (int i = 0; i < numere1.length; i++) {
            int inainte = numere1[i] - 1;
            int dupa = numere1[i] + 1;
            System.out.println(inainte + " " + dupa);
        }
        System.out.println("Ex3");
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] < 0) {
                System.out.println(numere[i]);
            }


        }
        System.out.println("Ex4");
        String tari[] = {"Anglia", "Romania", "Albania", "Franta", "Elvetia", "China","Korea"};
        for (String t: tari){
            System.out.println(t.charAt(0));
            System.out.println(t.length());
            System.out.println(t.contains("n"));
            System.out.println(t);
        }
        System.out.println("ex. 6");
        for (int i=0; i<tari.length; i++){
            if (tari[i].charAt(0) =='A'){
                System.out.println(tari[i]);

            }
        }
        System.out.println("ex. 6 - varianta 2");
        for (String t:tari){
            if (t.startsWith("A"))
                System.out.println(t);
          /*  System.out.println("ex. 6 - varianta 3");
            if(t.indexOf('A')==0){
                System.out.println(t);
            }*/
            if(t.contains("n")){
                System.out.println(t);
            }
        }
        System.out.println("ex. 8");
        for (String t: tari){
            System.out.println(t);
            System.out.println(t.length());}

            int max=0;
            String taraCuLungimeMaxima = "";
            for (int i=0; i<tari.length; i++){
                if (tari[i].length()>=max){
                    max=tari[i].length();
                    taraCuLungimeMaxima = tari[i];
                }
            }
            System.out.println(max);
            System.out.println(taraCuLungimeMaxima);


        System.out.println("ex 7 si 8");
        String cea_mai_lunga = tari[0];
        String cea_mai_scurta = tari[0];

        for(String c:tari){
            if (c.length()>=cea_mai_lunga.length()){
                cea_mai_lunga=c;

            }
            if (c.length()<=cea_mai_scurta.length()){
                cea_mai_scurta=c;
            }
        }
        System.out.println("cea mai lunga tara este " +cea_mai_lunga);
        System.out.println("cea mai scurta tara este " +cea_mai_scurta);

    }
}
