public class MyString {
    public static void main(String[] args) {
        String myString = "This is a text";
        int lungime = myString.length();
        System.out.println("Lungimea textului este "+lungime);
        String myName = "Pasca Cristina Mihaela";
        int lungimeaNumelui = myName.length();
        System.out.println(lungimeaNumelui);
        System.out.println("Lungimea numelui Pasca Cristina Mihaela este "+lungimeaNumelui);
        System.out.println("Lungimea numelui \""+myName+"\" este" +lungimeaNumelui);
        char aPatraLitera = myName.charAt(4);
        System.out.println(aPatraLitera);
        char primaLitera = myName.charAt(0);
        System.out.println(primaLitera);

        String tara = "Italia";
        int lungime1 = tara.length();
        System.out.println(lungime1);
        System.out.println(tara);

        String myFavouriteMovie = "Clanul";
        System.out.println( "My favourite movie is " +"\"" + myFavouriteMovie + "\"" + '.');


        myFavouriteMovie.toUpperCase();
        myFavouriteMovie.toLowerCase();
        System.out.println(myFavouriteMovie.toUpperCase());
        System.out.println(myFavouriteMovie.toLowerCase());
        System.out.println(myFavouriteMovie.length());

        System.out.println("My favourite movie is " + '"' + myFavouriteMovie + '"' +'.');

        System.out.println("My favourite movie is \"" + myFavouriteMovie + "\"" );















    }
}
