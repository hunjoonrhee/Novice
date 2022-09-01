import java.util.Scanner;

public class Novice {

    public static void main(String[] args) {
        String firstname = "Hunjoon";
        String lastname = "Rhee";
        int n = 0;
        while(n<5){
            System.out.println(whatIsYourName(firstname, lastname));
            n++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();

        System.out.println(sayHello(name));
    }
    public static String whatIsYourName(String firstname, String lastname){
        String name = firstname + " " + lastname;
        return name;
    }

    public static int square(int number){

        return number*number;
    }

    public static String sayHello(String name){
        String greeting = "Hallo, " + name + ", wie geht es dir?";
        return greeting;
    }
}
