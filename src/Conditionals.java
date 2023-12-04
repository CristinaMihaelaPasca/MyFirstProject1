import org.w3c.dom.ls.LSOutput;

public class Conditionals {
    public static void main(String[] args) {
        if (5 < 0) {
            System.out.println("5 is greater than 0");
        } else System.out.println("5 is not smaller than 0");

int time = 19;
if (time<10){
    System.out.println("Good morning");
}
else if (time<18){
    System.out.println("Good day");
}
else if (time<24){
    System.out.println("Good evening");
}
else System.out.println("only 24 hours in a day!!!");
int day = 1;
switch(day){
    case 1:
        System.out.println("Monday"); break;
    case 2:
        System.out.println("Tuesday"); break;
    case 3:
        System.out.println("Wednesday"); break;
    case 4:
        System.out.println("Thursday"); break;
    case 5:
        System.out.println("Friday"); break;
    case 6:
        System.out.println("Saturday"); break;
    case 7:
        System.out.println("Sunday"); break;
        default:
        System.out.println("Unknown");
}
    }
}
