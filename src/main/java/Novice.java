public class Novice {

    public static void main(String[] args) {
        String firstname = "Hunjoon";
        String lastname = "Rhee";
        int n = 0;
        while(n<5){
            System.out.println(whatIsYourName(firstname, lastname));
            n++;
        }
    }
    public static String whatIsYourName(String firstname, String lastname){
        String name = firstname + " " + lastname;
        return name;
    }
}
