public class Loops {
    public static void main(String[] args) {
        for (int i=5; i>=0; i--){
            System.out.println(i);
        }
        for (int i=0; i<=10; i+=2){
            System.out.println(i);
        }
        for (int i=0; i<=5; i++){
            System.out.println(i);
        }
        // FOR EACH
        String cars[] = {"BMW","Mazda","Opel","Toyota"};
        for (String car: cars){
            System.out.println(car);
        }
        // WHILE
        int i=0;
        while(i<5){
            System.out.println(i);
            i++;
        }

        int j=0;
        do{
            System.out.println(j);
            j++;
        } while (j<5);

        //BREAK
        for (int k=0; k<10; k++){
            if (k==4) {break;}
            System.out.println(k);
        }
        int k=0;
        while (k<10){
            k++;
            if (k==4) continue;
            System.out.println(k);

        }
    }
}
